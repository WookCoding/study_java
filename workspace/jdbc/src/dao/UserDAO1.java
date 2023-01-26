package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;

import domain.UserVO1;

public class UserDAO1 {

   public static Long userId;
   public Connection connection; //연결 객체
   public PreparedStatement preparedStatement; //쿼리 관리 객체
   public ResultSet resultSet; //결과 테이블 객체
   
//   아이디 중복검사
   public boolean checkId(String userIdentification) {
      String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
      boolean result = false;
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userIdentification);
         resultSet = preparedStatement.executeQuery();
         
         resultSet.next();
         result = resultSet.getInt(1) == 0;
         
      } catch (SQLException e) {
         System.out.println("checkId(String) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      return result;
   }
   
//   회원가입
   public void insert(UserVO1 UserVO1) {
       String queryForJoin = "INSERT INTO TBL_USER"
                  + "(USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, USER_PHONE, USER_BIRTH, USER_EMAIL, USER_ADDRESS, USER_RECOMMENDER_ID) "
                  + "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?)";
       
//       기존 테이블에서 추천수 컬럼을 추가하여, 회원 정보 조회 시 추천 수도 같이 가져오도록 설계
//       String queryForUpdateRecommendCount = 
//             "UPDATE TBL_USER SET RECOMMEND_COUNT = RECOMMEND_COUNT + 1 WHERE USER_ID = ?";
       
//       만약 추천 수 조회가 잦을 경우, 테이블을 따로 분리하여 서브키를 설정한 뒤 조회
//       테이블이 분리되어서 회원가입 시 TBL_USER에 INSERT 후 TBL_RECOMMEND도 같이 INSERT가 필요하다.
//       이 때 TRIGGER를 사용하여 TBL_USER에 INSERT이벤트 발생 시 TBL_RECOMMEND에도 자동으로 INSERT 되도록 설계
       String queryForUpdateRecommendCount = 
             "UPDATE TBL_RECOMMEND SET RECOMMEND_COUNT = RECOMMEND_COUNT + 1 WHERE USER_ID = ?";
       
       String queryForGetUserId = "SELECT USER_ID FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
       
       connection = DBConnecter.getConnection();
       try {
         preparedStatement = connection.prepareStatement(queryForJoin);
         preparedStatement = connection.prepareStatement(queryForJoin);
         preparedStatement.setString(1, UserVO1.getUserIdentification());
         preparedStatement.setString(2, UserVO1.getUserName());
         preparedStatement.setString(3, encrypt(UserVO1.getUserPassword()));
         preparedStatement.setString(4, UserVO1.getUserPhone());
         preparedStatement.setString(5, UserVO1.getUserBirth());
         preparedStatement.setString(6, UserVO1.getUserEmail());
         preparedStatement.setString(7, UserVO1.getUserAddress());
         preparedStatement.setString(8, UserVO1.getUserRecommenderId());
         preparedStatement.executeUpdate();
         
         if(UserVO1.getUserRecommenderId() != null) {
            preparedStatement = connection.prepareStatement(queryForGetUserId);
            preparedStatement.setString(1, UserVO1.getUserRecommenderId());
            resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()) { // 입력한 추천인 아이디가 존재할 경우
               preparedStatement = connection.prepareStatement(queryForUpdateRecommendCount);
               preparedStatement.setLong(1, resultSet.getLong(1));
               preparedStatement.executeUpdate();
            }
         }

      } catch (SQLException e) {
         System.out.println("insert(UserVO1) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
   }
//   로그인
   public boolean login(String userIdentification, String userPassword) {
      String query = "SELECT USER_ID FROM TBL_USER WHERE USER_IDENTIFICATION = ? AND USER_PASSWORD = ?";
      boolean check = false;
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userIdentification);
         preparedStatement.setString(2, encrypt(userPassword));
         
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            userId = resultSet.getLong(1);
            check = true;
         }
         
      } catch (SQLException e) {
         System.out.println("login(String, String) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      return check;
   }
   
//   회원탈퇴
   public void delete() {
      String query = "DELETE FROM TBL_USER WHERE USER_ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, userId);
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("delete() SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
   }
   
//   아이디 찾기
   public String findIdentification(String userPhone) {
      String query = "SELECT USER_IDENTIFICATION FROM TBL_USER WHERE USER_PHONE = ?";
      String userIdentification = null;
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userPhone);

         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            userIdentification = resultSet.getString(1);
         }
         
      } catch (SQLException e) {
         System.out.println("findIdentification(String) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      
      return userIdentification;
   }
   
//   비밀번호 변경
   public void updateUserPassword(String userPassword) {
      String query = "UPDATE TBL_USER SET USER_PASSWORD = ? WHERE USER_ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, new String(Base64.getEncoder().encode(userPassword.getBytes())));
         preparedStatement.setLong(2, userId);
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("updateUserPassword(String) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
   }
   
//   회원정보 수정
   public void update(UserVO1 UserVO1) {
      String query = "UPDATE TBL_USER SET USER_NICKNAME = ?, USER_GENDER = ?, USER_BIRTH = TO_DATE(?, 'YYYY-MM-DD HH24:MI:SS') WHERE USER_ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, UserVO1.getUserNickname());
         preparedStatement.setString(2, UserVO1.getUserGender());
         preparedStatement.setString(3, UserVO1.getUserBirth());
         preparedStatement.setLong(4, userId);
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("update(UserVO1) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
   }
   
//   회원정보 조회
   public UserVO1 select(/* Long userId */) {
      String query = 
            "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
            + " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
            + "USER_GENDER, USER_RECOMMENDER_ID "
            + "FROM TBL_USER WHERE USER_ID = ?";
      UserVO1 UserVO1 = null;
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, userId);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            UserVO1 = new UserVO1();
            UserVO1.setUserId(resultSet.getLong(1));
            UserVO1.setUserIdentification(resultSet.getString(2));
            UserVO1.setUserName(resultSet.getString(3));
            UserVO1.setUserPassword(resultSet.getString(4));
            UserVO1.setUserPhone(resultSet.getString(5));
            UserVO1.setUserNickname(resultSet.getString(6));
            UserVO1.setUserEmail(resultSet.getString(7));
            UserVO1.setUserAddress(resultSet.getString(8));
            UserVO1.setUserBirth(resultSet.getString(9));
            UserVO1.setUserGender(resultSet.getString(10));
            UserVO1.setUserRecommenderId(resultSet.getString(11));
         }
         
      } catch (SQLException e) {
         System.out.println("select(Long) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      
      return UserVO1;
   }
   
   public UserVO1 select(Long userId) {
      String query = 
            "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
                  + " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
                  + "USER_GENDER, USER_RECOMMENDER_ID "
                  + "FROM TBL_USER WHERE USER_ID = ?";
      UserVO1 UserVO1 = null;
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, userId);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            UserVO1 = new UserVO1();
            UserVO1.setUserId(resultSet.getLong(1));
            UserVO1.setUserIdentification(resultSet.getString(2));
            UserVO1.setUserName(resultSet.getString(3));
            UserVO1.setUserPassword(resultSet.getString(4));
            UserVO1.setUserPhone(resultSet.getString(5));
            UserVO1.setUserNickname(resultSet.getString(6));
            UserVO1.setUserEmail(resultSet.getString(7));
            UserVO1.setUserAddress(resultSet.getString(8));
            UserVO1.setUserBirth(resultSet.getString(9));
            UserVO1.setUserGender(resultSet.getString(10));
            UserVO1.setUserRecommenderId(resultSet.getString(11));
         }
         
      } catch (SQLException e) {
         System.out.println("select(Long) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      
      return UserVO1;
   }
   
   public UserVO1 select(String userIdentification) {
      String query = 
            "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
                  + " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
                  + "USER_GENDER, USER_RECOMMENDER_ID "
                  + "FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
      UserVO1 UserVO1 = null;
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userIdentification);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            UserVO1 = new UserVO1();
            UserVO1.setUserId(resultSet.getLong(1));
            UserVO1.setUserIdentification(resultSet.getString(2));
            UserVO1.setUserName(resultSet.getString(3));
            UserVO1.setUserPassword(resultSet.getString(4));
            UserVO1.setUserPhone(resultSet.getString(5));
            UserVO1.setUserNickname(resultSet.getString(6));
            UserVO1.setUserEmail(resultSet.getString(7));
            UserVO1.setUserAddress(resultSet.getString(8));
            UserVO1.setUserBirth(resultSet.getString(9));
            UserVO1.setUserGender(resultSet.getString(10));
            UserVO1.setUserRecommenderId(resultSet.getString(11));
         }
         
      } catch (SQLException e) {
         System.out.println("select(Long) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      
      return UserVO1;
   }
   
//   추천수
   public Long getCountOfRecommenderId(String userIdentification) {
//      String query = "SELECT RECOMMEND_COUNT FROM TBL_USER WHERE USER_ID = ?";
      String query = "SELECT RECOMMEND_COUNT FROM TBL_RECOMMEND WHERE USER_ID = ?";
      Long recommendCount = 0L;
      Long userId = select(userIdentification).getUserId();
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, userId);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            recommendCount = resultSet.getLong(1);
         }
      } catch (SQLException e) {
         System.out.println("getCountOfRecommenderId(Long) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      return recommendCount;
   }
   
//   나를 추천한 사람
   public ArrayList<UserVO1> selectRecommenders(){
      String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
            + " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
            + "USER_GENDER, USER_RECOMMENDER_ID FROM TBL_USER WHERE USER_RECOMMENDER_ID = ?";
      String userIdentification = select(userId).getUserIdentification();
      UserVO1 UserVO1 = null;
      ArrayList<UserVO1> users = new ArrayList<UserVO1>();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userIdentification);
         
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            UserVO1 = new UserVO1();
            UserVO1.setUserId(resultSet.getLong(1));
            UserVO1.setUserIdentification(resultSet.getString(2));
            UserVO1.setUserName(resultSet.getString(3));
            UserVO1.setUserPassword(resultSet.getString(4));
            UserVO1.setUserPhone(resultSet.getString(5));
            UserVO1.setUserNickname(resultSet.getString(6));
            UserVO1.setUserEmail(resultSet.getString(7));
            UserVO1.setUserAddress(resultSet.getString(8));
            UserVO1.setUserBirth(resultSet.getString(9));
            UserVO1.setUserGender(resultSet.getString(10));
            UserVO1.setUserRecommenderId(resultSet.getString(11));
            users.add(UserVO1);
         }
         
      } catch (SQLException e) {
         System.out.println("selectRecommenders() SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      return users;
   }
   
//   내가 추천한 사람
   public UserVO1 getMyRecommender() {
      String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
            + " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
            + "USER_GENDER, USER_RECOMMENDER_ID FROM TBL_USER WHERE USER_IDENTIFICATION = "
            + "("
            + "SELECT USER_RECOMMENDER_ID FROM TBL_USER WHERE USER_ID = ?"
            + ")";
      UserVO1 UserVO1 = null;
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, userId);
         
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            UserVO1 = new UserVO1();
            UserVO1.setUserId(resultSet.getLong(1));
            UserVO1.setUserIdentification(resultSet.getString(2));
            UserVO1.setUserName(resultSet.getString(3));
            UserVO1.setUserPassword(resultSet.getString(4));
            UserVO1.setUserPhone(resultSet.getString(5));
            UserVO1.setUserNickname(resultSet.getString(6));
            UserVO1.setUserEmail(resultSet.getString(7));
            UserVO1.setUserAddress(resultSet.getString(8));
            UserVO1.setUserBirth(resultSet.getString(9));
            UserVO1.setUserGender(resultSet.getString(10));
            UserVO1.setUserRecommenderId(resultSet.getString(11));
         }
         
      } catch (SQLException e) {
         System.out.println("getMyRecommender() SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      return UserVO1;
   }
   
   public String encrypt(String password) {
      return new String(Base64.getEncoder().encode(password.getBytes()));
   }
   
}





















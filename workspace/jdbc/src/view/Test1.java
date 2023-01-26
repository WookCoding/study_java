package view;

import dao.UserDAO1;
import domain.UserVO1;

public class Test1 {
   public static void main(String[] args) {
      UserDAO1 userDAO = new UserDAO1();
//      if(userDAO.checkId("hds1234")) {
//         System.out.println("사용 가능한 아이디");
//         return;
//      }
//      System.out.println("중복된 아이디");
      
//      System.out.println(userDAO.select(1L));
      
      
//      [실습] 메소드 전체 검증
//      회원가입
      UserVO1 userVO = new UserVO1();
//      userVO.setUserIdentification("lss1234");
//      userVO.setUserName("이순신");
//      userVO.setUserPassword("1234");
//      userVO.setUserAddress("경기도 파주시");
//      userVO.setUserBirth("1545-04-08");
//      userVO.setUserEmail("lss1234@naver.com");
//      userVO.setUserPhone("01099998888");
//      userVO.setUserRecommenderId(null);
//      userVO.setUserIdentification("jbg1234");
//      userVO.setUserName("장보고");
//      userVO.setUserPassword("9999");
//      userVO.setUserAddress("서울특별시 관악구");
//      userVO.setUserBirth("2000-12-04");
//      userVO.setUserEmail("jbg1234@gmail.com");
//      userVO.setUserPhone("01099991234");
//      userVO.setUserRecommenderId("lss1234");
//      userVO.setUserIdentification("phgs1234");
//      userVO.setUserName("박혁거세");
//      userVO.setUserPassword("7890");
//      userVO.setUserAddress("강원도 강릉시");
//      userVO.setUserBirth("2010-12-04");
//      userVO.setUserEmail("phgs1234@gmail.com");
//      userVO.setUserPhone("01032291234");
//      userVO.setUserRecommenderId("lss1234");
//      
//      if(userDAO.checkId(userVO.getUserIdentification())) {
//         userDAO.insert(userVO);
//      }else {
//         System.out.println("중복된 아이디");
//      }
      
//      로그인
//      if(userDAO1.login("lss1234", "1234")) {
//         System.out.println("로그인 성공");
//         System.out.println(UserDAO.userId);
//      }else {
//         System.out.println("로그인 실패");
//      }
      
//      아이디 찾기
//      System.out.println(userDAO.findIdentification("01099991234"));
      
//      비밀번호 변경
//      userDAO.updateUserPassword("3333");
      
//      if(userDAO.login("lss1234", "3333")) {
//         System.out.println("로그인 성공");
//         System.out.println(UserDAO.userId);
//      }else {
//         System.out.println("로그인 실패");
//      }
      
//      회원정보 조회
//      UserVO user = userDAO.select();
      
//      회원정보 수정
//      user.setUserNickname("거북왕");
//      userDAO1.update(user);
      
//      추천 수
//      System.out.println(userDAO.getCountOfRecommenderId("jbg1234"));
      
//      나를 추천한 사람
//      userDAO1.selectRecommenders().stream().map(UserVO::toString).forEach(System.out::println);
      
//      내가 추천한 사람
      
//      if(userDAO.login("jbg1234", "9999")) {
//         System.out.println("로그인 성공");
//         System.out.println(UserDAO.userId);
//      }else {
//         System.out.println("로그인 실패");
//      }
//      
//      UserVO user = userDAO.getMyRecommender();
//      if(user != null) {
//         System.out.println(user);
//         
//      }else {
//         System.out.println("추천한 사람이 없습니다.");
//      }
      
   }
}































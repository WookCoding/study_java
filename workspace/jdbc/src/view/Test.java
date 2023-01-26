package view;

import java.util.ArrayList;

import dao.UserDAO;
import domain.UserVO;

public class Test {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		UserVO userVO = new UserVO();
		ArrayList<String> arData = null;
		
		userVO.setUserIdentification("hds1242");
		userVO.setUserName("홍길동");
		userVO.setUserPassword("12345");
		userVO.setUserPhone("01012111234");
		userVO.setUserNickname("홍");
		userVO.setUserEmail("hds45@naver.com");
		userVO.setUserAddress("경기도 하남");
		userVO.setUserBirth("1999-01-01");
		userVO.setUserGender("M");

//		userVO.setUserRecommenderId();

//		if(userDAO.join(userVO)) {
//			System.out.println("회원가입 성공");
//			return;
//		}
//		System.out.println("회원가입 실패");
		
		
//		if(userDAO.checkId("hds1234")) {
//			System.out.println("사용 가능한 아이디");
//			return;
//		}
//		System.out.println("중복된 아이디");
			
//		System.out.println(userDAO.select(1L));
		
//		System.out.println(userDAO.findID("01012341234"));
		
		
		
		userVO = userDAO.login(userVO.getUserIdentification(), userVO.getUserPassword());
		
//		if(userDAO.changePw(userVO.getUserIdentification(), "12345")) {
//			System.out.println("비밀번호 변경 성공");
//			return;
//		}
//		System.out.println("비밀번호 변경 실패");
		
//		System.out.println(userDAO.recomendCount("hds4242"));
		
//		System.out.println(userDAO.recomendForMe(userVO));

		
//		userVO.setUserPhone("01012341235");
//		userVO.setUserNickname("홍기");
//		userVO.setUserEmail("hds145@naver.com");
//		userVO.setUserAddress("경기도 가평");
		
//		userDAO.updateUser(userVO);
		
//		arData = userDAO.recomendForMe(userVO);
//		for (int i = 0; i < arData.size(); i++) {
//			System.out.println(arData.get(i));
//		}
	
	}
}

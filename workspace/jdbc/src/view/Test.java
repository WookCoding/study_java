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
		userVO.setUserName("ȫ�浿");
		userVO.setUserPassword("12345");
		userVO.setUserPhone("01012111234");
		userVO.setUserNickname("ȫ");
		userVO.setUserEmail("hds45@naver.com");
		userVO.setUserAddress("��⵵ �ϳ�");
		userVO.setUserBirth("1999-01-01");
		userVO.setUserGender("M");

//		userVO.setUserRecommenderId();

//		if(userDAO.join(userVO)) {
//			System.out.println("ȸ������ ����");
//			return;
//		}
//		System.out.println("ȸ������ ����");
		
		
//		if(userDAO.checkId("hds1234")) {
//			System.out.println("��� ������ ���̵�");
//			return;
//		}
//		System.out.println("�ߺ��� ���̵�");
			
//		System.out.println(userDAO.select(1L));
		
//		System.out.println(userDAO.findID("01012341234"));
		
		
		
		userVO = userDAO.login(userVO.getUserIdentification(), userVO.getUserPassword());
		
//		if(userDAO.changePw(userVO.getUserIdentification(), "12345")) {
//			System.out.println("��й�ȣ ���� ����");
//			return;
//		}
//		System.out.println("��й�ȣ ���� ����");
		
//		System.out.println(userDAO.recomendCount("hds4242"));
		
//		System.out.println(userDAO.recomendForMe(userVO));

		
//		userVO.setUserPhone("01012341235");
//		userVO.setUserNickname("ȫ��");
//		userVO.setUserEmail("hds145@naver.com");
//		userVO.setUserAddress("��⵵ ����");
		
//		userDAO.updateUser(userVO);
		
//		arData = userDAO.recomendForMe(userVO);
//		for (int i = 0; i < arData.size(); i++) {
//			System.out.println(arData.get(i));
//		}
	
	}
}

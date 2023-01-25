package domain;

public class UserVO {
	private Long userId;
	private String userIdentification;
	private String userName;
	private String userPassword;
	private String userPhone;
	private String userNickName;
	private String userEmail;
	private String userAddress;
	private String userBirth;
	private String userGender;
	private String userRecommenderId;
	
	public UserVO() {;}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserIdentification() {
		return userIdentification;
	}

	public void setUserIdentification(String userIdentification) {
		this.userIdentification = userIdentification;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserRecommenderId() {
		return userRecommenderId;
	}

	public void setUserRecommenderId(String userRecommenderId) {
		this.userRecommenderId = userRecommenderId;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	
}

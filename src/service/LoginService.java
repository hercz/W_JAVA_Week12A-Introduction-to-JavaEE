package service;

public class LoginService {
	String defUserName = "kacsa";
	String defPassword = "1234";

	public boolean autheticate(String userName, String password) {
		if (password.equals(defPassword) && userName.equals(defUserName)) {
			return true;
		} else {
			return false;
		}
	}

}
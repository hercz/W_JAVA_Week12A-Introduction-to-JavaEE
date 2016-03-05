package service;

public class LoginService {
	public boolean autheticate(String userName, String password) {
		if (password == null) {
			return false;
		} else {
			return true;
		}
	}

}
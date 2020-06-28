package in.happycoding.dao;

public class UserDAO {

	public boolean checkUser(String username, String password) {

		if (username.equals("admin") && password.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}
}

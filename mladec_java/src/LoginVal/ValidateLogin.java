package LoginVal;

public class ValidateLogin {
	
	String name = "User";
	String pass = "1234";
	
	public void checkLogin(String uname, String upass) {
		
		if (uname.equals(name) && upass.equals(pass)) {
			System.out.println("User Logged in Sucessfully !!!");
		} else {
			LoginValidationException le = new LoginValidationException("Invalid Credentials !!!");
			throw(le);
		}
		
	}
	
	

}

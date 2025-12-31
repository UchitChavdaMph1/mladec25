package LoginVal;

import java.util.Scanner;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enert your name : ");
		String name = sc.next();
		
		System.out.print("Enert your password : ");
		String pass = sc.next();
		
		ValidateLogin obj = new ValidateLogin();
		
		try {
			obj.checkLogin(name, pass);
		} catch (LoginValidationException lve) {
			System.out.println("Invalid Credentials !!!!");
		}

	}

}

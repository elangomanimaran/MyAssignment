package week2.day3hw;

public class LoginTestData extends TestData{

	public void enterUsername()
	{
		System.out.println("username");
	}
	public void enterPassword() 
	{
		System.out.println("Password");
	}
	public static void main(String[] args) {
		
		LoginTestData login =new LoginTestData();
		login.navigateToHomePage();
		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
	}
}

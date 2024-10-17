package wee1.day3;

public class Browser {
	public String launchBrowser() 
	{
	String browserName = "chrome";
	return browserName;
	}
 void loadUrl()
{
	System.out.println("Application url loaded successfully");
}
public static void main(String[] args) {
	Browser obj = new Browser();
	System.out.println("The browser "+obj.launchBrowser()+" launched sucessfully");
	obj.loadUrl();
	}

}

package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//*Get the Page title
		String title = driver.getTitle();
		System.out.println(title);
		//*Passing the input user name and password and click login
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement element = driver.findElement(By.className("decorativeSubmit"));
		element.click();
		//*Open the CRM page
		driver.findElement(By.partialLinkText("CRM")).click();
		//*Open the Accounts Tab 
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//*Sending the inputs to the fields by send key
		driver.findElement(By.id("accountName")).sendKeys("Manimaran");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.name("numberEmployees")).sendKeys("5");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//*Verifying the page title
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		if(title1.equals("Account Details | opentaps CRM")) 
		{
			System.out.println("page title verified");
		}
		else
		{
			System.out.println("Page title is wrong");
		}
		driver.close();
	}

}

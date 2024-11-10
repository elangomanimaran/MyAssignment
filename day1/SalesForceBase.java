package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SalesForceBase {
public ChromeDriver driver;
@Parameters({"url", "username", "password"})

@BeforeMethod
public void login(String url, String uname, String pass) {
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.id("Login")).click();
	
}
@AfterMethod
	public void close()
	{
		driver.quit();
	}
}



package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter user name and password to login
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement element = driver.findElement(By.className("decorativeSubmit"));
		element.click();
		//*Open the CRM page
		driver.findElement(By.partialLinkText("CRM")).click();
		//Open the contacts tab
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();

		//Print address of the parent window
		System.out.println(driver.getWindowHandle());
		//create a set and list to handle the windows.
		Set<String> winHandle = driver.getWindowHandles();
		List<String> winChild = new ArrayList<String>(winHandle);
		//Switching to the child window
		driver.switchTo().window(winChild.get(1));
		//Print address of the Child window and title
		System.out.println(driver.getWindowHandle());
		System.out.println(title);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		//Switch back to parent window
		driver.switchTo().window(winChild.get(0));
		System.out.println(driver.findElement(By.xpath("//a[text()='Merge']")).getText());
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		//create a set and list to handle the windows.
		Set<String> winHandle1 = driver.getWindowHandles();
		List<String> winChild1 = new ArrayList<String>(winHandle1);
		//Switching to the second child
		driver.switchTo().window(winChild1.get(1));
		//Print address of the 2 Child window and title
		System.out.println(driver.getWindowHandle());
		System.out.println(title);
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		//Switch back to parent window
		driver.switchTo().window(winChild.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		System.out.println(title);
		

	}

}

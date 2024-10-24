package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
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
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement leadIdElement = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//div/a)[1]"));
		String leadIdValue = leadIdElement.getText();
		System.out.println(leadIdValue);
		//Click the first resulting lead.
		//- Click the "Delete" button.
		leadIdElement.click();
		Thread.sleep(3000);
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(2000);
		//Verify the presence of the message "No records to display" in the Lead List. This 
		//message confirms the successful deletion
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.name("id")).sendKeys(leadIdValue);
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String actualValue=driver.findElement(By.className("x-paging-info")).getText();
		if(actualValue.contains("No records to display"))
			System.out.println("No records found message is  verified");
		else
			System.out.println("Record verification is failed");
		
		driver.close();
	}

}

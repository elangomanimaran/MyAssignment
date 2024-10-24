package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//*Get the Page title
		String title = driver.getTitle();
		System.out.println(title);
		//*Passing the input user name and password and click login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement element = driver.findElement(By.className("decorativeSubmit"));
		element.click();
		//*Open the CRM page
		driver.findElement(By.partialLinkText("CRM")).click();
		//Open the leaads Tab and navigates to create lead
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//Fill the necessary details and click on create account
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestManimaran");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Manimaran");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Elango");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Manimaran");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Test");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("123@gmail.com");
		WebElement statedd = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select dd = new Select(statedd);
		dd.selectByVisibleText("New York");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(3000);
		//click on the edit option, remove description, add important notice and update 
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Description removed");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(3000);
		//Print the page title
		System.out.println(title);
		driver.close();
		
	}

}

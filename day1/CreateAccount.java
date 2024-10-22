package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		//*Selecting the value ByIndex from Drop down
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select sel= new Select(industryDD);
		sel.selectByIndex(3);
		//*Selecting the value ByVisibleText from Drop down
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select sel1= new Select(ownershipDD);
		sel1.selectByVisibleText("S-Corporation");
		//*Selecting the value ByValue from Drop down
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select sel2 = new Select(sourceDD);
		sel2.selectByValue("LEAD_EMPLOYEE");
		//*Selecting the value ByIndex from Drop down
		WebElement mcDD = driver.findElement(By.id("marketingCampaignId"));
		Select sel3 =new Select (mcDD);
		sel3.selectByIndex(6);
		//*Selecting the value ByValue from Drop down
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel4 =new Select(stateDD);
		sel4.selectByValue("TX");
		//*Creating the Account
		driver.findElement(By.className("smallSubmit")).click();
		//*Get the Page title
		String title1 = driver.getTitle();
		System.out.println(title1);
		//* Verify the Account name is as per the name created
		if(driver.getPageSource().contains("Manimaran")){
			System.out.println("The account Name displayed correctly");
		}
		else {
			System.out.println("The account Name displayed is not correct");
		}
		driver.close();

	}
}


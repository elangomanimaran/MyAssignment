package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class SalesForce2 extends SalesForceBase{
	@DataProvider(name="create")
	public String[][] sendMultipleData() {
		String[][] data=new String[2][1];
		data[0][0]="Salesforce Automation by Dillibabu";
		data[1][0]="Salesforce Automation by QA Team";
		return data;
	}
	@Test(dataProvider="create")
	public void entitymenu() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		WebElement legalent = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions action = new Actions(driver);
		action.moveToElement(legalent).perform();
		action.click().perform();
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("(//span[text()='Legal Entities']/following::div//a//span//svg)[1]").click();
		shadow.findElementByXPath("//span[text()='New Legal Entity']").click();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("salesforce");
		driver.findElement(By.xpath("//button[contains(@aria-controls,'dropdown-element')]")).click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[contains(@name,'SaveEdit')]")).click();
		String errorMsg = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
		System.out.println(errorMsg);
		if (errorMsg.contains("Legal Entity Name")) {
			System.out.println("Error message for name displayed");
		} else {
			System.out.println("Error message for name not displayed");
		}

	}

}

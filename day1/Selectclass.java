package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//*Get the Page title
		String title = driver.getTitle();
		System.out.println(title);
		//*Opening the create account page
		WebElement element = driver.findElement(By.linkText("Create new account"));
		element.click();
		driver.findElement(By.name("firstname")).sendKeys("Manimaran");
		driver.findElement(By.name("lastname")).sendKeys("Elango");
		driver.findElement(By.id("password_step_input")).sendKeys("9790923681");
		driver.findElement(By.id("password_step_input")).sendKeys("testLeaf");
		//Select the value ByIndex from DD
		WebElement dayDD = driver.findElement(By.id("day"));
		Select sel1 = new Select(dayDD);
		sel1.selectByIndex(11);
		WebElement monDD = driver.findElement(By.id("month"));
		Select sel2 =new Select(monDD);
		sel2.selectByIndex(6);
		//Select the value ByValue from DD
		WebElement yearDD =driver.findElement(By.id("year"));
		Select sel3 =new Select(yearDD);
		sel3.selectByValue("1993");
		//Click the radio button using xpath
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.close();
	}

}

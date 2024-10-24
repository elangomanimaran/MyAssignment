package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//*Get the Page title
		String title = driver.getTitle();
		if(title.equals("Dashboard")) {
			System.out.println(title);
		}
		else {
			System.out.println("The title is not correct");
		}
		driver.findElement(By.xpath("(//li[@class='ui-menuitem-submenu'])[3]")).click();
		driver.findElement(By.xpath("//a[@class='rotated-icon']")).click();
		WebElement check = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		System.out.println(check.isEnabled());
		System.out.println(check.getLocation());
		System.out.println(check.getRect());
		WebElement check1 = driver.findElement(By.xpath("//span[text()='Save']"));
		System.out.println(check1.getCssValue("background-color"));
		driver.close();
		
	}

}

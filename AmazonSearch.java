package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearch {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println("The page title is "+title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search in the search bar and ope the result
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("oneplus 9 pro");
		searchBox.sendKeys(Keys.ARROW_DOWN);
		searchBox.sendKeys(Keys.ENTER);
		WebElement prizetag = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String prize = prizetag.getText();
		System.out.println(prize);
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement mousehover = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]"));
		Actions action1 = new Actions(driver);
		action1.click(mousehover).perform();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='a-icon-alt'])[1]"))).getText();
		String rating = driver.findElement(By.xpath("(//span[@class='a-icon-alt'])[1]")).getText();
		System.out.println(rating);
		driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span)[1]")).click();
		//create a set and list to handle the windows.
		Set<String> winHandle = driver.getWindowHandles();
		List<String> winChild = new ArrayList<String>(winHandle);
		//Switching to the child window
		driver.switchTo().window(winChild.get(1));
		//Print address of the Child window and title
		System.out.println(driver.getWindowHandle());
		System.out.println(title);
		//driver.getScreenshotAs('Screenshot.png');
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span/input")).click();
		WebElement atlPrize = driver.findElement(By.xpath("//h2[@class='a-size-mini a-color-price a-text-bold']"));
		String prize2 = atlPrize.getText();
		System.out.println(prize2);
		if (prize.equals(prize2)) {
			System.out.println(prize2);
		}
		else {
			System.out.println("Prize Missmatch"+prize2);
		}
		driver.quit();
	}
}



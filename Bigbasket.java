package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println("The page title is "+title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//button[contains(@id,'headlessui-menu-button')])[4]")).click();
		Thread.sleep(3000);
		WebElement action1 = driver.findElement(By.xpath("(//a[contains(text(),'Foodgrains, Oil & Masala')])[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(action1).perform();
		Thread.sleep(3000);
		WebElement action2 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		System.out.println();
		actions.moveToElement(action2).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'Boiled & Steam Rice')])")).click();
		WebElement checkbox = driver.findElement(By.id("i-BBRoyal"));
		actions.scrollToElement(checkbox).perform();
		actions.click(checkbox).perform();
		driver.findElement(By.xpath("//img[contains(@title,'Tamil Ponni Boiled Rice 26 kg Bag')]")).click();
		Set<String> winhandle = driver.getWindowHandles();
		List<String> childwin = new ArrayList<String>(winhandle);
		driver.switchTo().window(childwin.get(1));
		WebElement action3 = driver.findElement(By.xpath("//span[text()='5 kg']"));
		actions.scrollToElement(action3).perform();
		actions.click(action3).perform();
		WebElement prize = driver.findElement(By.xpath("//span[text()='5 kg']/following::div/span/span"));
		System.out.println(prize.getText());
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		driver.quit();
		
	}

}

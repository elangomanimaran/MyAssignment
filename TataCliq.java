package marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Ask Me Later']")).click();
		WebElement brand= driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(brand).perform();
		Thread.sleep(3000);
		WebElement watchacc = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		actions.moveToElement(watchacc).perform();
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		WebElement sortby = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select dd = new Select(sortby);
		dd.selectByVisibleText("New Arrivals");
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilCheckbox']/div)[1]")).click();
		Thread.sleep(3000);
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> prize = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		int prizesize = prize.size();
		System.out.println(prizesize);
		for (WebElement each : prize) {
			String prizelist = each.getText();
			System.out.print("The watch Prizes are "+prizelist+", ");
			wait.until(ExpectedConditions.visibilityOfAllElements(prize));
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		Set<String> winhandle = driver.getWindowHandles();
		List<String> winchild = new ArrayList<String>(winhandle);
		driver.switchTo().window(winchild.get(1));
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		WebElement bagicon = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
		System.out.println("Number of item in the cart is "+bagicon.getText());
		WebElement watchprize = driver.findElement(By.xpath("//h3[contains(text(),'MRP')]"));
		String s1 = watchprize.getText();
		String s3 = s1.replaceAll("[^0-9]", "");
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		WebElement watchprize1 = driver.findElement(By.xpath("//div[@class='CartItemForDesktop__informationTextWithBolder']"));
		String s2 = watchprize1.getText();
		String s4 = s2.substring(1, s2.length()-3);
		if (s3.equalsIgnoreCase(s4))
		{
			System.out.println("The prize"+s2+"is equal in both page");
		}
		else {
			System.out.println("The prize"+s1+" and "+s2+ "are not equal");
		}
		driver.close();
		driver.switchTo().window(winchild.get(0));
		driver.close();
	}

}

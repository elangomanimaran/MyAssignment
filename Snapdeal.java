package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println("The page title is "+title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement action1 = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		Thread.sleep(3000);
		Actions actions =new Actions(driver);
		actions.moveToElement(action1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		WebElement shoescount = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		System.out.println(shoescount.getText());
		WebElement trainingshoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		Thread.sleep(3000);
		actions.scrollToElement(trainingshoes).perform();
		Thread.sleep(3000);
		actions.click(trainingshoes).perform();
		Thread.sleep(3000);
		WebElement dd = driver.findElement(By.xpath("//span[contains(text(),'Sort by:')]/following::div"));
		dd.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();		
		System.out.println("you have selected "+dd.getText());
		WebElement prize1= driver.findElement(By.xpath("(//input[@class='input-filter'])[1]"));
		prize1.clear();
		prize1.sendKeys("500");
		WebElement prize2 = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
		prize2.clear();
		prize2.sendKeys("700");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::label")).click();
		//List<WebElement> filterSelected = (List<WebElement>) driver.findElement(By.xpath("//div[@class='filters']/div[1]"));
		//filterSelected.size();
		WebElement shoe = driver.findElement(By.xpath("//source[@class='product-image']/following-sibling::img"));
		Thread.sleep(3000);
		actions.moveToElement(shoe).perform();
		Thread.sleep(3000);
		WebElement shoe1 =driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"));
		actions.click(shoe1).perform();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'product-price')]/span[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'product-price')]/span[2]")).getText());
		driver.findElement(By.xpath("//div[@class='close close1 marR10']/i")).click();
		driver.close();
	}

}

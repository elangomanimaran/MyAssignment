package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioListInterface {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).getText());
		System.out.println((driver.findElement(By.xpath("//div[contains(@aria-label,'Items Found')]/strong")).getText()));
		List<WebElement> brands=driver.findElements(By.xpath("//div[@class='brand']"));
		int brandcount =brands.size();
		System.out.println(brandcount);
		List<String> brandsName = new ArrayList<String>();
		for(WebElement each:brands)
		{
			String text = each.getText();
			brandsName.add(text);
		}
		System.out.println(brandsName);
		List<WebElement> bags=driver.findElements(By.xpath("//div[@class='nameCls']"));
		int bagscount =bags.size();
		System.out.println(bagscount);
		List<String> bagsName = new ArrayList<String>();
		for(WebElement each:bags)
		{
			String text1 = each.getText();
			bagsName.add(text1);
		}
		System.out.println(bagsName);
		driver.close();
	}

}

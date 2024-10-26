package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonOrder {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println("The page title is "+title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search in the search bar and ope the result
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Bag for Boys");
		searchBox.sendKeys(Keys.ARROW_DOWN);
		searchBox.sendKeys(Keys.ENTER);
		//Print the number of search result
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		System.out.println(result.getText());
		//selecting the brands 
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//span[text()='Skybags']")).click();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//span[text()='Safari']")).click();
		//filter by new arraival
		driver.findElement(By.xpath("//span[@data-csa-interaction-events='click']")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		//Print the details of the first product
		WebElement details = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		System.out.println(details.getText());
		WebElement prize = driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//span[@class='a-price']"));
		System.out.println(prize.getText());
		System.out.println("The page title is "+title);
		driver.close();
		
	}

}

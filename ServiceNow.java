package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow = new Shadow(driver);
		Thread.sleep(3000);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		Thread.sleep(3000);
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		shadow.findElementByXPath("//a[contains(text(),'Mobiles')]").click();
		shadow.findElementByXPath("//strong[contains(text(),'Apple iPhone 13 pro')]").click();
		Thread.sleep(3000);
		shadow.findElementByXPath("//input[@class='cat_item_option radio']/following-sibling::label").click();
		shadow.findElementByXPath("//span[contains(text(),'What was the original phone number')]/following::div/input[2]").sendKeys("1234567890");
		WebElement dd = shadow.findElementByXPath("//span[contains(text(),'Monthly data allowance')]/following::div/select");
		Select selectdd = new Select(dd);
		selectdd.selectByValue("unlimited");
		shadow.findElementByXPath("//label[contains(text(),'Sierra Blue')]").click();
		shadow.findElementByXPath("//label[contains(text(),'512 GB')]").click();
		shadow.findElementByXPath("//button[@id='oi_order_now_button']").click();
		WebElement odrcnf = shadow.findElementByXPath("//span[contains(text(),'Thank you, your request has been submitted')]");
		String ordercnf = odrcnf.getText();
		WebElement odrplcd = shadow.findElementByXPath("//dt[contains(text(),'Order Placed:')]");
		String oderPlaced =odrplcd.getText();
		if(oderPlaced.contains("Order Placed:")) {
			System.out.println(ordercnf+" and your "+oderPlaced);
		}
		else{
			System.out.println("Order not yet placed ");
		}
		
		driver.close();
	}

}

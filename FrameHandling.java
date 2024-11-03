package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().fullscreen();
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert =driver.switchTo().alert();
		alert.accept();
		WebElement text1 = driver.findElement(By.xpath("//p[text()='You pressed OK!']"));
		System.out.println(text1.getText());
		driver.switchTo().defaultContent();
	
		
	}

}

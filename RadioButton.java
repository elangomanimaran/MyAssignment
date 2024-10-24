package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		//*Get the Page title
		String title = driver.getTitle();
		System.out.println(title);
		WebElement radio = driver.findElement(By.xpath("//label[text()='Chrome']//preceding-sibling::div/div[2]"));
		radio.click();
		boolean ra = radio.isEnabled();
		if(ra==true) {
			System.out.println("The radio button"+radio.getText()+" is selected");
		}
		else {
			System.out.println("The radio button is not selected");
		}
		WebElement ageButton = driver.findElement(By.xpath("//label[text()='21-40 Years']//preceding-sibling::div/div[2]"));
		boolean sel = ageButton.isEnabled();
		if(sel==true)
		{
			System.out.println("The age is selected by default already");
		}
		else
		{
			ageButton.click();
		}
		driver.close();
	}

}

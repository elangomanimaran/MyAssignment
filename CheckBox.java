package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		//*Get the Page title
		String title = driver.getTitle();
		System.out.println("Web page title : "+title);
		//Clicking the Basic Check-box 
		WebElement basic = driver.findElement(By.xpath("//span[text()='Basic']"));
		basic.click();
		//Clicking the Notification check box and verify its state
		WebElement Notification = driver.findElement(By.xpath("//span[text()='Ajax']"));
		Notification.click();
		boolean checkNotification = Notification.isEnabled();
		if (checkNotification==true) {
			System.out.println("Notification box is checked");
		}
		else
		{
			System.out.println("Notification box is not checked");
		}
		//Clicking the Choose your favorite language checkbox

		WebElement language[]= {driver.findElement(By.xpath("(//label[text()='Java']//preceding-sibling::div/div)[2]")),driver.findElement(By.xpath("(//label[text()='Python']//preceding-sibling::div/div)[2]")),driver.findElement(By.xpath("(//label[text()='Javascript']//preceding-sibling::div/div)[2]")),driver.findElement(By.xpath("(//label[text()='C-Sharp']//preceding-sibling::div/div)[2]")),driver.findElement(By.xpath("(//label[text()='Others']//preceding-sibling::div/div)[2]"))};

		language[4].click();
		boolean langCkeck = language[4].isSelected();

		for(int i=0; i<language.length-1; i++)
		{
			if(langCkeck==true)
			{
				System.out.println("Selected language is "+language[i].getText());
			}
			else
			{
				System.out.println("Language is not selected");
			}
		}
		//Clicking the Tri state check-box and verifying the Check-box is clicked
		WebElement TriState  = driver.findElement(By.xpath("(//h5 [text()='Tri State Checkbox']/following-sibling::div/div/div/div)[2]"));
		TriState.click();
		boolean triCheck = TriState.isEnabled();
		if(triCheck ==true) {
			System.out.println("Tri state button Selection is selected");
		}
		else {
			System.out.println("Tri state button Selection is not selected");
		}
		//clicking the check-box
		WebElement toggleSwitch =driver.findElement(By.xpath("(//h5[text()='Toggle Switch']/following :: div/div)[2]"));
		toggleSwitch.click();
		boolean togglecheck = toggleSwitch.isEnabled();
		if(togglecheck==true) {
			System.out.println("The switch is enabled");
		}
		else {
			System.out.println("The switch is disabled"); 
		}
		WebElement disabledBox =driver.findElement(By.xpath("(//h5[text()='Verify if check box is disabled']/following :: div/div)[2]"));
		System.out.println("Disable box selection is "+disabledBox.isEnabled());

		//Select Multiple options from the "select Multiple" Check-box
		WebElement enbDD = driver.findElement(By.xpath("//h5[text()='Select Multiple']/following-sibling::div/ul"));
		enbDD.click();
		WebElement multSel[]= {driver.findElement(By.xpath("//label[text()='Miami']/preceding-sibling::div/div[2]")), driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div/div[2]")), driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div/div[2]")), driver.findElement(By.xpath("//label[text()='Istanbul']/preceding-sibling::div/div[2]")), driver.findElement(By.xpath("//label[text()='Berlin']/preceding-sibling::div/div[2]")), driver.findElement(By.xpath("//label[text()='Barcelona']/preceding-sibling::div/div[2]")), driver.findElement(By.xpath("//label[text()='Rome']/preceding-sibling::div/div[2]")), driver.findElement(By.xpath("//label[text()='Brasilia']/preceding-sibling::div/div[2]")), driver.findElement(By.xpath("//label[text()='Amsterdam']/preceding-sibling::div/div[2]"))};
		multSel[0].click();
		multSel[2].click();
		multSel[5].click();
		enbDD.click();
		driver.close();
	}

}

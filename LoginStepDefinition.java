package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.sukgu.Shadow;

public class LoginStepDefinition {
	public ChromeDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	    
	driver = new ChromeDriver();
	
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}

	@Given("open the url")
	public void open_the_url() {
		driver.get("https://login.salesforce.com\r\n");
		String title = driver.getTitle();
		System.out.println(title);
	   
	}

	@Given("enter the user name")
	public void enter_the_user_name() {
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
	}

	@Given("enter the password")
	public void enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("Sales@123");
	}

	@Given("click login")
	public void click_login() {
		driver.findElement(By.id("Login")).click();
	    
	}

	@Given("click on togglemenu")
	public void click_on_togglemenu() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@Given("click view all option")
	public void click_view_all_option() {
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	}

	@Given("click sales option")
	public void click_sales_option() {
		WebElement ele = driver.findElement(By.xpath("//p[text()='Sales']"));
		Actions act=new Actions(driver);
		act.scrollToElement(ele).perform();
		ele.click();
	}

	@Given("click on accounts tab")
	public void click_on_accounts_tab() {
		WebElement accountsTab = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click()",accountsTab);
	}

	@Given("click on new account")
	public void click_on_new_account() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@Given("Enter account name")
	public void enter_account_name() {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("Testaccount");
	}

	@Given("select owenership as public")
	public void select_owenership_as_public() {
		WebElement el3 = driver.findElement(By.xpath("//label[text()='Ownership']/following::div[1]//button"));
		el3.click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@When("click save button")
	public void click_save_button() {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	@Then("verify account name")
	public void verify_account_name() {
		String text = driver.findElement(By.xpath("//slot[@name='primaryField']//lightning-formatted-text")).getText();
	    if(text.equalsIgnoreCase("Testaccount")) {
	    	System.out.println("Account created successfully: "+text);	
	    }else {
	    	System.out.println("Account not created");
	    }
	    driver.close();
	}	
	
}

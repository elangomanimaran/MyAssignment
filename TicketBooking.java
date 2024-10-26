package marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketBooking {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.pvrcinemas.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//*Get the Page title
		String title = driver.getTitle();
		System.out.println("Web page title : "+title);
		//Select city
		WebElement cityselected = driver.findElement(By.xpath("(//span[@class='cities-placed']//img)[2]"));
		cityselected.click();
		driver.findElement(By.xpath("//input [@placeholder='Search for city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li [text()='Chennai']")).click();
		//select cinema option and the following option on the Quick book tab
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX National,Virugambakkam Chennai')]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Tomorrow')])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='BLACK'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'10:30 PM')]")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		//Waiting for the page to load and print the page title
		Thread.sleep(3000);
		System.out.println("Web page title : "+title);
		//Accepting the terms and condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//check the available seat
		WebElement seat = driver.findElement(By.xpath("//span[@id='SL.SILVER|D:10']"));
		System.out.println("Available seat number is "+seat.getText());
		Thread.sleep(3000);
		seat.click();
		//Select the available seat
		WebElement selectedSeat = driver.findElement(By.xpath("//div[@class='seat-number']/p"));
		Thread.sleep(3000);
		System.out.println("The selected seat is "+selectedSeat.getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText());
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		System.out.println("Web page title : "+title);
		driver.close();
	}

}

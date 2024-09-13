package week4Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
	public static void main(String[] args)  {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement Button = driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[1]"));
		driver.executeScript("arguments[0].click()", Button);
		driver.findElement(By.xpath("//span[text()='New Opportunity']")).click();
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow'])[4]//input")).sendKeys("75000");
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']//input")).sendKeys("13/09/2024");
		driver.findElement(By.xpath("//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']//button[2]")).click();
		
		//driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Yeswanth");
		//driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Raj");
		//driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("TestLeaf");
		//driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();

	}

}

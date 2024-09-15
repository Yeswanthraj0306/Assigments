package week4Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Subtraction;

public class CreateSalesForce {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click()", sales);
		
		WebElement Button = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()", Button);
		
		WebElement element = driver.findElement(By.xpath("//div[text()='New']"));
		driver.executeScript("arguments[0].click()", element);
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Yeswanth Raj");
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("15/09/2024");
		WebElement element2 = driver.findElement(By.xpath("//span[text()='--None--']"));
		driver.executeScript("arguments[0].click()", element2);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	}

}

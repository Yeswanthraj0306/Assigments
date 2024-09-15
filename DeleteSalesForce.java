package week4Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteSalesForce {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@id='Login']")).click();

		driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		
		WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click()", sales);
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"))
				.sendKeys("Salesforce Automation by Yeswanth Raj");
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(
				By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button']"));
		driver.executeScript("arguments[0].click();", element2);
		Thread.sleep(600);

		WebElement element3 = driver.findElement(By.xpath("//a[@title='Delete']/div"));
		driver.executeScript("arguments[0].click();", element3);

		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		Thread.sleep(1000);

		WebElement Opportunity = driver.findElement(By.xpath("//a[text()='Salesforce Automation by Yeswanth Raj']"));
		String verification = Opportunity.getText();
		if (verification.equals("Salesforce Automation by Yeswanth Raj")) {
			System.out.println("Opportunity is Found");
		} else {
			System.out.println("Opportunity is deleted");
		}
	}

}

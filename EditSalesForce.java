package week4Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditSalesForce {
	public static void main(String[] args) throws InterruptedException {
		
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
		
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Salesforce Automation by Yeswanth Raj");
		Thread.sleep(3000);
		
		WebElement down=driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button']"));
		driver.executeScript("arguments[0].click();",down);
		Thread.sleep(1000);
		
		WebElement element1=driver.findElement(By.xpath("//a[@title='Edit']/div"));
		driver.executeScript("arguments[0].click();",element1);
		
		WebElement element2 =driver.findElement(By.xpath("//input[@name='CloseDate']"));
		element2.clear();
		element2.sendKeys("15/09/2024");
		
		WebElement element3 = driver.findElement(By.xpath("//button[@aria-label='Stage']"));
		driver.executeScript("arguments[0].click();",element3);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Perception Analysis']")).click();
		Thread.sleep(2000);
		
		WebElement element4=driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status']"));
		driver.executeScript("arguments[0].click();",element4);
		
		WebElement element5 = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='In progress']"));
		driver.executeScript("arguments[0].click();",element5);
		WebElement element6=driver.findElement(By.xpath("//textarea[@part='textarea']"));
		element6.clear();
		element6.sendKeys("SalesForce");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		 
	   WebElement check=driver.findElement(By.xpath("//span[text()='Perception Analysis']"));
	   
	   String verify=check.getText();
	   
	  if(verify.contains("Perception Analysis"))
	  {
		  System.out.println("Stage is verified");
	  }
	  else
	  {
		  System.out.println("Stage is not verified");
	  }

	}

}

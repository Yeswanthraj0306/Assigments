package week4Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("Democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Fi')]")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[2]//span")).click();
		driver.findElement(By.xpath("//div[@id='ext-gen278']//input")).sendKeys("9344989832");
		driver.findElement(By.xpath("//div[@class='x-panel-footer x-panel-footer-noborder']//button")).click();
		driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=13881'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]//a[4]")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a")).click();
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input")).sendKeys("13881");
		driver.findElement(By.xpath("//div[@class='x-panel-footer x-panel-footer-noborder']//button")).click();
		
		
		
		
		

	}

}

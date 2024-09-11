package week4Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leafground {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		WebElement tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select source =new Select(tool);
		source.selectByVisibleText("Selenium");
		driver.findElement(By.xpath("//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right ui-state-hover']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		WebElement course = driver.findElement(By.xpath("//input[@name='j_idt87:auto-complete_input']"));
		course.sendKeys("aw");
		driver.findElement(By.xpath("//span[text()='AW']")).click();
		course.click();
		course.sendKeys("se");
		driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[4]")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		
		
		

		
	}

}

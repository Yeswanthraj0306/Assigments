package week4Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		// Load the URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		// Click on Create New Account Button

		driver.findElement(By.xpath("//div[@class='_5dbb']//input")).sendKeys("Yeswa");
		driver.findElement(By.xpath("(//div[@class='_5dbb'])[2]//input")).sendKeys("Raj");
		
		driver.findElement(By.xpath("(//div[@class='_5dbb'])[3]//input")).sendKeys("9344989835");
		driver.findElement(By.xpath("(//div[@class='mbm _br- _a4y'])//input")).sendKeys("Classlea03)");
		
		driver.findElement(By.xpath("//div[@id='birthday_wrapper']//select[1]")).click();
		driver.findElement(By.xpath("//select[@name='birthday_day']//option[3]")).click();
		driver.findElement(By.xpath("//div[@id='birthday_wrapper']//select[2]")).click();
		driver.findElement(By.xpath("//option[text()='Jun']")).click();
		driver.findElement(By.xpath("//div[@id='birthday_wrapper']//select[3]")).click();
		driver.findElement(By.xpath("//option[text()='2004']")).click();
		driver.findElement(By.xpath("//span[@class='_5k_3']//span[1]")).click();

	}

}

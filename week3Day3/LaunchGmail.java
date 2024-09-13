package week3Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGmail {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.findElement(By.id("identifierId")).sendKeys("9344989835");
		
	}

}

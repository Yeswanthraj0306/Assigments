package week3Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yeswanth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj.S");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9344989832");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yeswaraj0306@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Madambakkam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600126");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		if (title.contains("Lead")) {
			System.out.println("verified");
		} else {
			System.out.println("not verified");
		}

	}

}

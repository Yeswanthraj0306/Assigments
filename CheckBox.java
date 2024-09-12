package week4Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']//div[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']/div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[3]//div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']//div[2]")).click();
		
		boolean checkboxDisabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']//div[2]"))
				.isSelected();
		System.out.println("check box is disabled:" + checkboxDisabled);
		if (checkboxDisabled == false) {
			System.out.println("The checkbox is disabled");
		} else {
			System.out.println("The checkbox is enabled");
		}

		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		WebElement city = driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-filter-container']/input"));

		city.sendKeys("Berlin");
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
	
		

	}

}

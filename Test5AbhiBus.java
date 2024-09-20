package week5Days5Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5AbhiBus {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//div[@class=' col'])[2]/input")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='station-body col']")).click();

		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='station-body col']")).click();

		driver.findElement(By.xpath("//div[@class='input-suffix col auto']/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='search-button']")).click();
		Thread.sleep(1000);
		WebElement Busname = driver.findElement(By.xpath("//div[@class='operator-info col s12 m5 l5']/h5[1]"));
		String Bus = Busname.getText();
		System.out.println("The selected bus name is " + Bus);

		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();

		WebElement seat = driver.findElement(By.xpath("(//div[@style='text-align: center;'])[3]//small"));
		String seatavailable = seat.getText();
		System.out.println("The Availableseats " + seatavailable);

		driver.findElement(By.xpath("(//div[@class='row '])[2]/button")).click();
		driver.findElement(By.xpath("(//button[@class='seat sleeper'])[3]")).click();

		driver.findElement(By.xpath("//a[@class='btn bus-info-btn text tertiary sm inactive button'][1]")).click();
		driver.findElement(By.xpath("(//div[@class='label'])[1]/p[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='label'])[1]/p[1]")).click();

		WebElement seatname = driver.findElement(By.xpath("(//button[@class='seat sleeper'])[3]"));
		String seatnames = seatname.getText();
		System.out.println("The SeatName " + seatnames);

		WebElement cost = driver.findElement(By.xpath("//div[@class='seat-fare col auto']"));
		String rupees = cost.getText();
		System.out.println("The cost of Fares " + rupees);

		String title = driver.getTitle();
		if (title.contains("Bus")) {
			System.out.println("verified");
		} else {
			System.out.println("not verified");
		}
		driver.close();
	}
}

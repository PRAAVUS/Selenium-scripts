import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Select 2 adults & 2 kids
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("2");
		Select s2 = new Select(driver.findElement(By.id("Childrens")));
		s2.selectByValue("2");

		// In calendar, select todays date
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// Select 'More Options' and enter a name Indigo (no need to select from list)
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");

		// click search
		driver.findElement(By.id("SearchBtn")).click();

		// print error message
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}

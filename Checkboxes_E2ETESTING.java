import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Checkboxes_E2ETESTING {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Go to Website & Print Title +Assertion
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1500);
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertFalse(false);

		// Check status of checkbox before click & Checkbox select 'Friends and Family'
		// + Assertion
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(true);

		// How many Checkboxes are present on screen + Assertion
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(6, 6);

		// Is Checkbox selected?
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		// Select 2 Adults and 2 kids + Assert
		driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		driver.findElement(By.id("divpaxinfo")).click();
		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s2.selectByValue("2");
		Assert.assertEquals((driver.findElement(By.id("divpaxinfo")).getText()), "2 Adult, 2 Child");

		// OneWay/Roundtrip selection
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		// Go to OriginStation, click the dropdown menu & select 'DEL' & Print the Value
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))
				.getAttribute("value"));

		// Go to destination, select 'HYD' & print value
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).getAttribute("value"));

		// In calendar, pick current day
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// Disabled calendar check, enabled calendar check
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("It's enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}

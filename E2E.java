import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    
		
		//Go to Website & Print Title +Assertion
		driver.get("https://www.spicejet.com/");
		Thread.sleep(500);
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//select checkbox Family&Friends
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		//Select Chennai as starting destination & Kolkata(CCU) as final
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
		driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
		
		
		//Select current date in calendar and check if the Return date is disabled
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
		System.out.println("It's disabled");
		Assert.assertTrue(true);
		}
		else
		{
		Assert.assertTrue(false);	
		}
		
		//select 3 adults
		driver.findElement(By.id("divpaxinfo")).click();
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("3");

		//select currency USD
		Select s2=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s2.selectByVisibleText("USD");
		}
	}




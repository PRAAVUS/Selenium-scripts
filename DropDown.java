import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalfj\\eclipse\\java-2020-09\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//driver.findElement(By.id("divpaxinfo")).click();
		//Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		//Thread.sleep(1000);
		//s.selectByValue("4");
		
		
		//Select s2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		//s2.selectByValue("3");
		//Thread.sleep(500);
		
		
		//Select s3=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		//s3.selectByIndex(1);
		//driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		

		
		
		
		
		
		
		
		
		
		

	}

}

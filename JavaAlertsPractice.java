import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertsPractice {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kalfj\\eclipse\\java-2020-09\\eclipse\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(500);
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String text="Jan";
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.id("alertbtn")).click();		
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();			
				
				
				
				
	}

}

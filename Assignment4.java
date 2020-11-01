import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com");	
		
		//select  "multiple windows"
		driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) ul:nth-child(4) li:nth-child(33) > a:nth-child(1)")).click();
		
		//Select "Click Here"
		driver.findElement(By.cssSelector("body:nth-child(2) div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example > a:nth-child(2)")).click();
		
		//Capture the "New Window" text
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid= it.next();
		String childid= it.next();
		driver.switchTo().window(childid);
		System.out.println("Capture the New Window text");
		System.out.println(driver.getTitle());

		//Switch back to previous window 
		System.out.println("Switch back to previous window ");
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		//Capture the "Opening a new window" text
		System.out.println("Capture 'Opening a new window' text");
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	}
}

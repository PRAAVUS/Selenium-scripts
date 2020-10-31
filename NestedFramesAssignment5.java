import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesAssignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalfj\\eclipse\\java-2020-09\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com");	
		driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) ul:nth-child(4) li:nth-child(34) > a:nth-child(1)")).click();
		
		//Print the "Middle" Text from the middle frame
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		
	}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("#u_0_k")).click();
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("my own xpath");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		
		

	}

}

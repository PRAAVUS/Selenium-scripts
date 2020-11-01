import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowserFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("u_0_k")).click();
		
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();;
		
		
		//driver.findElement(By.linkText("Forgot Password?")).click();
		//driver.findElement(By.id("pass")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[3]/a")).click();
		

	}

}

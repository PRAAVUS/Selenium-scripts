import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlexpathtry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("introAgreeButton")).click();
		
		
	
		
	
		//driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("AAA");
		
		

		
	}

}

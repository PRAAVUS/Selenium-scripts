import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 username']")).sendKeys("1wrwrerg4wrgw1");
		driver.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 password']")).sendKeys("564564h5e45h");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#password")).clear();
		driver.findElement(By.cssSelector("#password")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("// input[@class='button r4 wide primary']")).click();

		
		
		//xpath= // tagname[@attribute='value']
				
		//Css== tagname[attribute='value']
		//input[class='input r4 wide mb16 mt8 username']

	}

}

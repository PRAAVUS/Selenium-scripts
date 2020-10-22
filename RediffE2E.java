import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffE2E {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalfj\\eclipse\\java-2020-09\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//*[@id=\'signin_info\']/a[1]")).click();
		//driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\'login1\']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456");;
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();

	}

}

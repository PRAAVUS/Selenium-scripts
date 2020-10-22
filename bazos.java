import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bazos {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalfj\\eclipse\\java-2020-09\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bazos.cz");
		
		
		//Samsung Galaxy Buds Live
		driver.findElement(By.id("hledat")).sendKeys("Samsung Galaxy Buds Live");
		Thread.sleep(1500);
		driver.findElement(By.name("Submit")).click();


	
}
}
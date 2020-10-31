import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalfj\\eclipse\\java-2020-09\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Find the number of links on page
		System.out.println("Number of Links: "+driver.findElements(By.tagName("a")).size());
		
		//Find the number of links in footer section
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		System.out.println("Number of Links in footer: "+footerdriver.findElements(By.tagName("a")).size());
	}}


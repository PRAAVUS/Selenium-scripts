import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Find the number of links on page
		System.out.println("Number of Links: "+driver.findElements(By.tagName("a")).size());
		
		//Find the number of links in footer section
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		System.out.println("Number of Links in footer: "+footerdriver.findElements(By.tagName("a")).size());
		
		//Find the number of links in the first column "Discount Coupon
		WebElement discountcoupon= footerdriver.findElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]"));
		System.out.println("Number of Links in discountcoupons: "+discountcoupon.findElements(By.tagName("a")).size());
		
		//Open all links in the footer section, switch to them and get their title
		for(int i=0;i<footerdriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinktab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
		}
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
		
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
	}}		
		
	


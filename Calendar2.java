import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/");
		driver.findElement(By.id("ez-accept-all")).click();
		driver.findElement(By.xpath("//a[contains(text(),'continue to Path2usa')]")).click();
		
		//First select airports John F. Kennedy to Chicago
		driver.findElement(By.cssSelector("#travel_from")).sendKeys("John F. Kennedy");
		driver.findElement(By.cssSelector("#travel_to")).sendKeys("Chicago");
		driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
		
		//Pick year January 2021
		driver.findElement(By.xpath("//th[contains(text(),'January 2021')]")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'][class='datepicker-switch']")).getText().contains("January"))
				{
			driver.findElement(By.cssSelector("[class='datepicker-days']th[class='next']")).click();
				}
		
		//Pick day 23
		driver.findElement(By.cssSelector("#travel_date")).click();
		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab Common attribute //Put it into a list and iterate
		int count= driver.findElements(By.className("day")).size();
		for (int i=0; i<count;i++)
		{
			String text= driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
			
			
			
		
	}}

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();    
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement> options =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	for(WebElement option : options)
			{
		if(option.getText().equalsIgnoreCase("India"))
		{
			option.click();
			break;
		}
			}
	
	
	
	
	
	}
}


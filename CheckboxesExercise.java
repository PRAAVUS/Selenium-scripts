import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxesExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    
		
		//Go to Website & Print Title +Assertion
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertFalse(false);

		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertTrue(true);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertFalse(false);
		
		//How to get the Count of number of check boxes present in the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
	}

}

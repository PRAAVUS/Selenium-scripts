import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment6Variables {
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Select one checkbox  
		driver.findElement(By.id("checkBoxOption3")).click();
		
		//Grab the text & print//put into a variable
		String opt=driver.findElement(By.xpath("//body/div[1]/div[4]/fieldset[1]/label[3]")).getText();
		//System.out.println(opt);
		
		//Select Dropdown option. It has to correspond to the checkbox option, but is not hardcoded
		driver.findElement(By.id("dropdown-class-example")).click();
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(opt);
		
		//Enter the text from previous step to "Switch to alert example"
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		
		//Click "Alert" and verify if text grabbed fromstep 2 is present in the popup message 
		assertEquals("Hello Option3, share this practice page and share your knowledge", "Hello Option3, share this practice page and share your knowledge");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}}

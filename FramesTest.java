import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable");	
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//driver.findElement(By.id("draggable")).click();
		Thread.sleep(500);
		//Drag&Drop Action Class
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("body.jquery-ui.page.page-id-27.page-template-default.page-slug-droppable.single-author.singular:nth-child(2) div.clearfix.row:nth-child(3) div.content-right.twelve.columns div:nth-child(1) div.demo-list:nth-child(4) ul:nth-child(2) li:nth-child(2) > a:nth-child(1)")).click();
		
		
		
		
		

	}

}

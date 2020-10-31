import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalfj\\eclipse\\java-2020-09\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup");	
		driver.findElement(By.cssSelector("body.EIlDfe:nth-child(2) div.uc81Ff.wKBl8c.bbRbR.RELBvb:nth-child(1) div.LJtPoc.qmmlRd footer.RwBngc ul.Bgzgmd li:nth-child(2) > a:nth-child(1)")).click();
		
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		String parentid= it.next();
		String childid= it.next();
		
		driver.switchTo().window(childid);
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		
		
		
	}

}

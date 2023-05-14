package actionsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActionMethod
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
	    WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ' ]"));
	    
	    WebElement target=driver.findElement(By.id("bank"));
	    		//driver.findElement(By.xpath("(//div[@id='shoppingCart4']/descendant::li[1]"));
	    Thread.sleep(2000);
	     
		Actions act = new Actions(driver);
		    
		act.dragAndDrop(src, target).perform();
		
		
    }

}

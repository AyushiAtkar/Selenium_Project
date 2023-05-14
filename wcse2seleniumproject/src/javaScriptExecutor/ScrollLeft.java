package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollLeft
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://dashboards.handmadeinteractive.com/jasonlove/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//Scroll Left
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(-5000,0)");
	}
}

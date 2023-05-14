package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DisabledWebElement
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/disabledwebelement.html");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('i1').value=('admin');");
		
	}

}

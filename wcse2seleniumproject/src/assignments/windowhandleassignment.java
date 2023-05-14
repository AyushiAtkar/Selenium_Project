package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowhandleassignment
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		Thread.sleep(2000);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http:omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		
		 
		driver.quit();//How to close all the browsers?
		
		driver.close();//How to close parent browser?
		
		
		//How to close all the browsers without using quit() method?
        Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			driver.switchTo().window(wh).close();
			Thread.sleep(2000);
		}
		
		
		//How to close only child browser?
		
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.linkText("Open a popup window")).click();
		
        Set<String> allHandle = driver.getWindowHandles();
		
		for(String wh:allHandle)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh).close();
			}
			else
			{
				
			}
			
		}
		
		  
		
		
		
	}
}

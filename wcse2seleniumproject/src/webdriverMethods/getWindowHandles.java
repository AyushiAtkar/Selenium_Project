package webdriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getWindowHandles 
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
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			System.out.println("Address of all windows:"+wh);
		}
		
	}

}

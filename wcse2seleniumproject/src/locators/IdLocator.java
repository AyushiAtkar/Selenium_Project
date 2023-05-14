package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocator 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/usernameTB.html");
		driver.findElement(By.id("i1")).sendKeys("atkarashay");
		Thread.sleep(4000);
		
     }

	
}


package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.instagram.com/");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		Thread.sleep(2000);	
		driver.close();
		
	}

}

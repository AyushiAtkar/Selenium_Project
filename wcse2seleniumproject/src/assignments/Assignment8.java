package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/auth");
		driver.findElement(By.id("mobile")).sendKeys("1234567890");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}


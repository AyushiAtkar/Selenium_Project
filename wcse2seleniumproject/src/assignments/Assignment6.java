package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zoom.us/signin#/login");
		driver.findElement(By.tagName("input")).sendKeys("atkarayushi11@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.close();
	}

}

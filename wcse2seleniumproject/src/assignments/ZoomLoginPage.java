package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomLoginPage
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zoom.us/signin#/login");
		driver.findElement(By.id("email")).sendKeys("atkarayushi11@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234567890");
		driver.findElement(By.id("js_btn_login")).click();
		Thread.sleep(2000);
		driver.close();	
	}

}

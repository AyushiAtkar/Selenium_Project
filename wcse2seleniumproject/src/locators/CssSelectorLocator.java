package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Ayushi");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
		Thread.sleep(2000);
		driver.quit();
		//driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("ayushi");
	}
}

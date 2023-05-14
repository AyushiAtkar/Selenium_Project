package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/usernameTB.html");
		driver.findElement(By.tagName("input")).sendKeys("atkarayushi");
		Thread.sleep(4000);
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/singleselectdropdown.html");
	    driver.findElement(By.tagName("input")).click();
		Thread.sleep(4000);
     }

}
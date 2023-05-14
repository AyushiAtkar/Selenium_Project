package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/registration/");
		driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("Ayushi");
		driver.findElement(By.xpath("//input[contains(@id,'id_email')]")).sendKeys("atkarayushi11@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'id_cell_phone')]")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		
	}

}

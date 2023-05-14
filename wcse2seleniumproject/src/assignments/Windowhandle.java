package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowhandle
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");//handling connection failed exception  
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver(options);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[.='✕']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Starlight, 128 GB)']")).click();
	    

	}
}

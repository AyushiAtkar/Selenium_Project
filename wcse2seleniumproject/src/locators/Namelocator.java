package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Namelocator 
{
	public static void main(String[] args) throws InterruptedException
	{	
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");//handling connection failed exception  
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver(options);
	    
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/CheckBox.html");
	    Thread.sleep(2000);
	    driver.findElement(By.name("n1")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("n3")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("i4")).click();
	    Thread.sleep(2000);
	    driver.close();
	}

}

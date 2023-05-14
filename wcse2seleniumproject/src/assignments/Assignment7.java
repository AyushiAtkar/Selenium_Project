package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment7
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		driver.findElement(By.id("id_userLoginId")).sendKeys("atkarayushi11@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}

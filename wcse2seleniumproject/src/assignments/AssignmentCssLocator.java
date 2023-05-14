package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCssLocator
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toppr.com/login/");
		driver.findElement(By.cssSelector("span[class='-zo6y _2iZlT']"));
		driver.findElement(By.cssSelector("input[id='countryPhone']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("button[class='_3UUnG button-smallHeight button button-shadow']")).click();
		Thread.sleep(2000);
		driver.close();
		
	
	}

}

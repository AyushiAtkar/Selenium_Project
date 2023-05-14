package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartAssignment 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		 Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptops");
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='HP']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Operating System')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 10']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='3★ & above']")).click();
	    Thread.sleep(4000);
	    String PriceofLaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[3]")).getText();
	    System.out.println( PriceofLaptop);
	    driver.quit();
	    
	}
}

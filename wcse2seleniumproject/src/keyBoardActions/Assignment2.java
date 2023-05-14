package keyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		WebElement target = driver.findElement(By.xpath("//h4[.='Selenium WebDriver']"));
		Robot robot=new Robot();
		Thread.sleep(2000);
		 Actions act = new Actions(driver);
		    //to perform right click
		    act.contextClick(target).perform();
		    
		
		for(int i=0;i<10;i++)
		{
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			
		}
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		act.doubleClick();
	}

}

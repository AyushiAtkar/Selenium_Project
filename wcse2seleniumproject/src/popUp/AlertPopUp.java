package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopUp
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/AlertPopup.html");
		
		//GENERATE THE ALERT POPUP
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click me!']")).click();
		
		//Switch the control to the alert popup
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
	
		
		//1} Accept the alert popup
		Thread.sleep(2000);
	    al.accept();
		//2} Dismiss the alert popup
	    al.dismiss();
	    //3} get text of the alert popup
	    System.out.println(al.getText());
	    //4} Pass the characters to alert popup
	    al.sendKeys("qwerty");
	}
}

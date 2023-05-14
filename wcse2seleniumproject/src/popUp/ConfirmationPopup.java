package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopup
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/ConfirmationPopup.html");
		
		// GENERATING CONFIRMATION POPUP
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).click();
		
		//switch the controls to confirmation popup
		
		Alert al = driver.switchTo().alert();
		
		//accept the popup
		Thread.sleep(2000);
	    al.accept();
		
		//dismiss the popup
		al.dismiss();
		
		//get text of popup
		System.out.println(al.getText());
	}
}

package handledropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/singleselectdropdown.html");
	    WebElement dropdownElement = driver.findElement(By.name("menu"));
	    Select sel=new Select(dropdownElement);
	    sel.selectByIndex(5);
		
	}


}

package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/singleselectdropdown.html");
	    WebElement dropdownElement =driver.findElement(By.id("i1"));
	    Select sel= new Select(dropdownElement);
	    //OPERATIONAL METHOD
	    System.out.println(sel.isMultiple());
	    driver.navigate().to("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/multiselectdropdown.html");
	    WebElement dropdownElement1 =driver.findElement(By.id("i1"));
	    
	    Select sel1 = new Select(dropdownElement1);
	    System.out.println(sel1.isMultiple());
	    
	    
	    
	     
	}
}

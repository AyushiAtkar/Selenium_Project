package handledropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleTextMethod
{
	public static void main(String[] args) throws InterruptedException
	{
		
	

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/multiselectdropdown.html");
    WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='menu']"));
    Select sel=new Select(dropdownElement);
    Thread.sleep(2000);
    sel.selectByVisibleText("vadapav");
    Thread.sleep(2000);
    sel.deselectByVisibleText("vadapav");
	}

}

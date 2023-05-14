package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod
{
	public static void main(String[] args)
  {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement userNameTB = driver.findElement(By.name("username"));
	userNameTB.sendKeys("Admin");
	WebElement passwordTB = driver.findElement(By.name("password"));
	passwordTB.sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
  }
}

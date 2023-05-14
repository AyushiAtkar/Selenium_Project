package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		Thread.sleep(2000);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		//Switch the control to frame
		WebElement FrameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(FrameElement);
		WebElement chatBox = driver.findElement(By.name("fc_widget"));
		chatBox.click();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("qwerty");
		//Thread.sleep(2000);
		//driver.findElement(By.id("chat-fc-email")).sendKeys("asdfg@gmail");
		//Thread.sleep(2000);
		//driver.findElement(By.id("chat-fc-phone")).sendKeys("1111234567");
		//Thread.sleep(2000);
		driver.close(); 
		
	}

}

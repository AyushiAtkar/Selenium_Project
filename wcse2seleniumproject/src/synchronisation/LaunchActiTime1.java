package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;

public class LaunchActiTime1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=5fswtcr3jnus9");
		String loginPageActualTitle = driver.getTitle();
		if(loginPageActualTitle.equals("actiTIME - Login"))
		{
			System.out.println("Test is passed login page is verified!!");
			
		}
		else
		{
			System.out.println("Test is failed login page is not verified!!");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String HomePageActualTitle = driver.getTitle();
		if(HomePageActualTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Test is passed Home page is verified!!");
			
		}
		else
		{
			System.out.println("Test is failed Home page is not verified!!");
		}
		
		
	}

}

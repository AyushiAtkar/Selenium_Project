package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActitimeInvalidTestCase
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://desktop-5eha9rm/login.do");
		
		FLib flib = new FLib();
		int rc = flib.rowCount("./data/ActitimeExcel.xlsx", "invalidcreds");
		

		

		for(int i=1;i<=rc;i++)
		{
		String invalidUsername = flib.readExcelData("./data/ActitimeExcel.xlsx","invalidcreds",i, 0);
		String invalidPassword = flib.readExcelData("./data/ActitimeExcel.xlsx","invalidcreds",i, 1);
		
		driver.findElement(By.name("username")).sendKeys(invalidUsername);
		driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
		}
		driver.close();
	    
		
		
	}

}

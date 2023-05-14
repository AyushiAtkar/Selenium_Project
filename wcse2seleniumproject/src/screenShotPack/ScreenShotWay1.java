package screenShotPack;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//Way 1 create browser specific classes no need to upcast
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssWay1.jpg");
		
		Files.copy(src, dest);
		
		
	}
}

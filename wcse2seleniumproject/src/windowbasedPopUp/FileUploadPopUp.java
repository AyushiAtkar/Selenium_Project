package windowbasedPopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=4tuo7mn6dbdus");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
	    WebElement target=driver.findElement(By.partialLinkText("Logo & Color Scheme"));
	    
	    Actions act=new Actions(driver);
	    act.moveToElement(target).perform();
	    target.click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.id("uploadNewLogoOption")).click();
	    
	    WebElement target2=driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	    
	    //Double click action
	    //File uploadPopup
	    act.doubleClick(target2).perform();
	    Thread.sleep(2000);
	    
	    //Handle fileuploadPopup
	    
	    File path = new File("./autoit/FileUploadPopup.exe");
	    String apath = path.getAbsolutePath();
	    
	    
	    Runtime.getRuntime().exec(apath);
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec(apath);
		
		
		
	}
	
}

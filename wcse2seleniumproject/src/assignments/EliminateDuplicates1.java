package assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates1
{
	public static void main(String[] args) 
	{
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/multiselectdropdown.html");
	WebElement dropdownElement = driver.findElement(By.id("i1"));
	
	Select sel= new Select(dropdownElement);
	HashSet<String> hs = new HashSet<String>();
	
	//get the list of webelement
	
	List<WebElement> allOps = sel.getOptions();
	
	//Read the list and get the text
	
	for(int i=0;i<allOps.size();i++)
	{
		WebElement option = allOps.get(i);
		String text = option.getText();
		//add the text to set so that duplicates wont be accepted
		//
		hs.add(text);
	}
	//read the set
	for(String value:hs)
	{
		System.out.println(value);
	}
    }
}

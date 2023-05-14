package operationalMethods;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/WebElement/multiselectdropdown.html");
		WebElement dropdownElement = driver.findElement(By.id("i1"));
		Select sel=new Select(dropdownElement);
		for(int i=2;i<5;i++)
		{
			sel.selectByIndex(i);
		}
		WebElement option = sel.getFirstSelectedOption();
		System.out.println(option.getText());
	}
}

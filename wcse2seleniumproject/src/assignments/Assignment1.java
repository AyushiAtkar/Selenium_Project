package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("LAUNCH EDGE");
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		//MAXIMIZE BROWSER
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//SETSIZE  OF BROWSER
		Dimension targetSize=new Dimension(300,400);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(4000);
		//SETPOSITION OF BROWSER
		Point targetPosition=new Point(400,600);
		driver.manage().window().setPosition(targetPosition);
		Thread.sleep(4000);
		driver.close();
		
	}

}

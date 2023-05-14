package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser
{
	public static void main(String[] args)
	{
		System.out.println("LAUNCH FIREFOX");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		new FirefoxDriver();
		//session not created exception
	}

}

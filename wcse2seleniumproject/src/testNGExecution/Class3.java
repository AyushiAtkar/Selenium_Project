package testNGExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Class3 extends BaseTest
{
  @Test
  public void search3()
  {
	  driver.switchTo().activeElement().sendKeys("Automation",Keys.ENTER);
  }
}

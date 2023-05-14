package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test(invocationCount = 50)
  public void ft() 
  {
	  Reporter.log("FTC is Executing",true);
  }
}

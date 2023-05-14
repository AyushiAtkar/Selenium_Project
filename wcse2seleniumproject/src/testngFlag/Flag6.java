package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6              //enabled flag
{
  @Test(enabled = true)
  public void login()
  {
	  Reporter.log("Login Method",true);
  }
  @Test(enabled = false)
  public void logout()
  {
	  Reporter.log("Logout Method",true);
  }
}

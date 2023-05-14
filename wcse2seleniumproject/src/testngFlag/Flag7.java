package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7
{
  @Test
  public void login() 
  {
	  //int res=5/0;
	  Reporter.log("Login Method!!",true);
  }
  
  @Test(dependsOnMethods = "login",alwaysRun = true)
  public void createUser()
  {
	  Reporter.log("Create user method!!",true);
  }
  
  @Test
  public void logout()
  {
	  Reporter.log("Logout Method!!",true);
  }
}

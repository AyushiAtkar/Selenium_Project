package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void login()
  {
	  Reporter.log("Logged in!!",true);  
  }
  @Test(dependsOnMethods = "login")            
  public void createUser()
  {
	  Reporter.log("User Created",true);
  }
  @Test(dependsOnMethods = "createUser")
  public void logout()
  {
	  Reporter.log("Logged Out",true);
  }
}

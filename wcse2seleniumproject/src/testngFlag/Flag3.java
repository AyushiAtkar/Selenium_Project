package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3
{
  @Test(priority = 3)                   //Priority Flag
  public void login()
  {
	  Reporter.log("Logged in!!",true);  //if priority is not declared it will execute in alphabetical order
  }
  @Test(priority = 2)                       //if priority is not declared by default it will be 0 
  public void createUser()
  {
	  Reporter.log("User Created",true);
  }
  @Test(priority = 1)
  public void logOut()
  {
	  Reporter.log("Logged Out",true);
  }
}

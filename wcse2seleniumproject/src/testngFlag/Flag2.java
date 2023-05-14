package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 //Description Flag
{
  @Test(description = "This is used to search for Database!!!")
  public void search1()
  {
	  Reporter.log("SQL",true);
  }
  @Test(description = "This is Functional test case!!")
  public void search2()
  {
	  Reporter.log("Login Page",true);
  }
}

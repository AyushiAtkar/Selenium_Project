package assertionTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assert1 {
  @Test
  public void validLogin() 
  {
	  Reporter.log("Launch the Browser",true);
	  Reporter.log("Launch the web app by using url",true);
	  
	  SoftAssert sa = new SoftAssert();//SOFT ASSERT
	  sa.assertEquals(false, true);
	  Reporter.log("Login page will be displayed",true);
	  Reporter.log("Perform the login Operation",true);
	  
	  
	  Assert.assertEquals(true, false);//HARD ASSERT
	  Reporter.log("Home page will be displayed",true);
	  Reporter.log("Logout",true);
  }
}

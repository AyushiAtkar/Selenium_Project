package testNGAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAnnotation {
  @Test
  public void f() 
  {
	  Reporter.log("Test Case 1",true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("Before method",true);
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("After method",true);      //we are using annotation to control the flow of method
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("Before class",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("After class",true);
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("Before Test",true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("After Test",true);
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("BEFORE SUITE",true);
  }

  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("AFTER SUITE",true);
  }
  @Test
  public void g()
  {
	  Reporter.log("Test Case 2",true);
  }
  @Test 
  public void h()
  {
	  Reporter.log("Test Case 3",true);
  }
}

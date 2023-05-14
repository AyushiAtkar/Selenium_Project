package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {          //throws ArithmeticException
  @Test
  public void m0() {
	  int a=6;
	  int b=0;
	  int res=a/b;
	  Reporter.log("output is",+res,true);
  }
  @Test
  public void m1()
  {
	  Reporter.log("arithmetic operation",true);
  }
  @Test
  public void m2()
  {
	  Reporter.log("division",true);
  }
}

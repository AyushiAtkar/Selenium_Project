package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void m1() {
	  Reporter.log("method name is m1",true);
  }
  @Test
  public void m2()
  {
	  Reporter.log("method name is m2",true);
  }
  @Test
  public void m3()
  {
	  Reporter.log("method name is m3",true);
  }
}

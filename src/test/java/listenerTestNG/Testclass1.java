package listenerTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ITestListenerClass.class)
public class Testclass1 {
  @Test
  public void method1() {
	  System.out.println("inside method1");
  }
  @Test
  public void method2() {
	  System.out.println("inside method2");
	  Assert.assertTrue(false);
  }
  @Test(timeOut=1000)
  public void method3() throws Exception {
	  Thread.sleep(2000);
	  System.out.println("inside method3");
  }
  @Test(dependsOnMethods="method3")
  public void method4() {
	  System.out.println("inside method4");
  }
}

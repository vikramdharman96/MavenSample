package testNG;

import org.testng.annotations.Test;

public class Testclass1 {
  @Test
  public void method1() {
	  System.out.println("Testclass1 >> testMethod1 >>"+Thread.currentThread().getId());
  }
  @Test
  public void method2() {
	  System.out.println("Testclass1 >> testMethod2 >>"+Thread.currentThread().getId());
  }
  @Test
  public void method3() {
	  System.out.println("Testclass1 >> testMethod2 >>"+Thread.currentThread().getId());
  }
  @Test
  public void method4() {
	  System.out.println("Testclass1 >> testMethod4 >>"+Thread.currentThread().getId());
  }
}

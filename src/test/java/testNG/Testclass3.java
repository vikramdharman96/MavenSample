package testNG;

import org.testng.annotations.Test;

public class Testclass3 {
  @Test
  public void method9() {
	  System.out.println("Testclass3 >> testMethod5 >>"+Thread.currentThread().getId());
  }
  @Test
  public void method10() {
	  System.out.println("Testclass3 >> testMethod6 >>"+Thread.currentThread().getId());
  }
  @Test
  public void method11() {
	  System.out.println("Testclass3 >> testMethod7 >>"+Thread.currentThread().getId());
  }
}

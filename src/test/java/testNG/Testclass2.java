package testNG;

import org.testng.annotations.Test;

public class Testclass2 {
  @Test
  public void method5() {
	  System.out.println("Testclass2 >> testMethod5 >>"+Thread.currentThread().getId());
  }
  @Test
  public void method6() {
	  System.out.println("Testclass2 >> testMethod6 >>"+Thread.currentThread().getId());
  }
  @Test
  public void method7() {
	  System.out.println("Testclass2 >> testMethod7 >>"+Thread.currentThread().getId());
  }
  @Test
  public void method8() {
	  System.out.println("Testclass2 >> testMethod8 >>"+Thread.currentThread().getId());
  }
}

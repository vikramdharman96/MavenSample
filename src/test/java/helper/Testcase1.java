package helper;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase1 extends BaseClass {
	
		@Test
		public void login() {
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("Vikram");
		driver.findElement(By.id("pass")).sendKeys("ram");
		driver.findElement(By.id("loginbutton")).click();
		}
}


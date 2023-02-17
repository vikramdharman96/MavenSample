package screenshotTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper.BaseClass;

public class TestClass extends BaseClass{
	@Test(testName="TestGoogle")
	public void TestGoogle() throws InterruptedException {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Vikram", Keys.ENTER);
		String expectedtitle="Vikra - Google Search";
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedtitle,"Title is Mismatched");
		Thread.sleep(5000);
	}
	@Test(testName="TestFaceBook")
	public void TestFaceBook() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Vikram");
		Thread.sleep(5000);
		
		SoftAssert softassert=new SoftAssert();
		//TitleAssertion
		String expectedtitle ="Facebook – log in or sign up";
		String actualtitle = driver.getTitle();
		softassert.assertEquals(actualtitle, expectedtitle, "Title is Mismatched");
		
		//UrlAssertion
		String expectedUrl ="https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		softassert.assertEquals(actualUrl, expectedUrl,"Url is Mismatched");
		
		//TextAssertion
		String actualText = driver.findElement(By.id("email")).getAttribute("value");
		String expectedText ="";
		softassert.assertEquals(actualText, expectedText,"Username Text is mismatched");
		
		softassert.assertAll();
	}
	@Test(testName="TestOrangeHrm")
	public void TestOrangeHrm() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
		
	}

}

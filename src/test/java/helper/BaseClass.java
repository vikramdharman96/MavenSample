package helper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static String screenshotsSubFolderName;
	
	@BeforeMethod
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();	
		driver.manage().window().maximize();	 
	}
	
	@AfterMethod
	public static void close() {
		driver.quit();
	}
	
	public void captureScreenshot(String filename) {
		if (screenshotsSubFolderName==null) {
			LocalDateTime myDateTime = LocalDateTime.now();
			
			DateTimeFormatter myFormatDateTime = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			screenshotsSubFolderName = myDateTime.format(myFormatDateTime);
		}
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desfile=new File("./Screenshots/"+screenshotsSubFolderName+"/"+filename);
		
		try {
			FileUtils.copyFile(source, desfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Screenshot Successfull");
	}
	
	
	
	
	

}

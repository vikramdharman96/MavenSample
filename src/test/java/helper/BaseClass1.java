package helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	WebDriver driver;
	Properties prop=new Properties();
	FileReader fl;
	
	public void setup() throws IOException {
		if (driver==null) {
			FileReader fr=new FileReader("C:\\Users\\susmitha\\eclipse-workspace\\MavenSample\\src\\test\\resources\\config.properties");
			prop.load(fr);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(prop.getProperty("testurl"));			
		} else {

		}
	}

}

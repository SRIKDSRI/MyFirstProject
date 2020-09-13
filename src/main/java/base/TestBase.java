package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public Properties p;
	
	public WebDriver initializeDriver() throws IOException {
		p = new Properties();
		  FileInputStream f=new FileInputStream("D:\\SELENIUM\\End2EndProject\\src\\main\\java\\resources\\Properties.properties");
			p.load(f);
			String browsername = System.getProperty("browser");
			//String browsername = p.getProperty("browser");
			if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}else {
				System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
	}
	
	
		
	}


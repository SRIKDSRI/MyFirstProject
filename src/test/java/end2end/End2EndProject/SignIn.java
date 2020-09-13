package end2end.End2EndProject;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import objectrepository.HomePage;
import objectrepository.LandingPage;
import objectrepository.LoginPage;

public class SignIn extends TestBase {
	
	public static Logger log = LogManager.getLogger("SignIn");
	
	@Test(dataProvider="loginUsers")
	public void loginValidation(String username, String password) throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
		//log.info("Invoking url for login validation test cases");
		
		WebDriverWait w = new WebDriverWait(driver, 30);
		LandingPage lp = new LandingPage(driver);
		w.until(ExpectedConditions.elementToBeClickable(lp.loginOption())).click();
		log.info("Waited till the login button becomes clickable");
		
		LoginPage lnp = new LoginPage(driver);
		
		lnp.username().sendKeys(username);
		lnp.password().sendKeys(password);
		lnp.submit().click();
		log.info("Entered the credentials and clicked on submit button successfully");
		driver.quit();
		
		log.info("Driver is closed");
		}

	
	@DataProvider
	public String[][] loginUsers(){
		String data[][]= {{"srikanth1@gmail.com","number1"},{"srikanth2@gmail.com","number2"}};
		
		return data;
		
		
	}
}

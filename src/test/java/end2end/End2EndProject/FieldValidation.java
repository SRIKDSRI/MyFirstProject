package end2end.End2EndProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.TestBase;
import objectrepository.LandingPage;
import objectrepository.LoginPage;

public class FieldValidation extends TestBase {

	public static Logger log = LogManager.getLogger("FieldValidation");
	@Test
	public void displayofNavigationBar() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
		log.info("Invoking url for field validation test cases");
		WebDriverWait w = new WebDriverWait(driver, 30);
		LandingPage lp = new LandingPage(driver);
		
		Assert.assertTrue(lp.navigationBar().isDisplayed());
		log.info("navigation bar is checked and it is present");

		driver.quit();
		}
	
  @Test
  public void registerSpelling() throws IOException {

	  driver = initializeDriver();
		driver.get(p.getProperty("url"));
		
		LandingPage lp = new LandingPage(driver);
		
		Assert.assertEquals(lp.registerButton().getText(),"Register");
		log.info("register spelling also has been checked");
		System.out.println(System.getProperties());
		driver.quit();
		}
  
}

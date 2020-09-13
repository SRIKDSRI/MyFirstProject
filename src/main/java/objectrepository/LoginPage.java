package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver = driver;
	}
	
	By username = By.id("user_email");
	By password = By.id("user_password");
	By submit = By.cssSelector("input.btn.btn-primary.btn-md.login-button");
	
	
	public WebElement password() {
		
		return driver.findElement(password);
	}
	
public WebElement username() {
		
		return driver.findElement(username);
	}

public WebElement submit() {
	
	return driver.findElement(submit);
}
}

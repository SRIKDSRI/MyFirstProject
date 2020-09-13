package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		}
	
	By login = By.xpath("//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a/span");
	
	By navigationbar = By.cssSelector("ul.nav.navbar-nav.navbar-right>li");
	
	By registerbutton = By.xpath("//span[text()='Register']");
	
	public WebElement loginOption() {
		
		return driver.findElement(login);
	}
	
public WebElement registerButton() {
		
		return driver.findElement(registerbutton);
	}
	
public WebElement navigationBar() {
		
		return driver.findElement(navigationbar);
	}

}

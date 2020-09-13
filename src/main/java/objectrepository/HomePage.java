package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver = driver;
	}
	
	By coursesearch = By.id("search-courses");
	By searchbutton = By.cssSelector("i.fa.fa-search");
	
	
	public WebElement courseSearch() {
		
		return driver.findElement(coursesearch);
	}

public WebElement searchButton() {
		
		return driver.findElement(searchbutton);
	}


}

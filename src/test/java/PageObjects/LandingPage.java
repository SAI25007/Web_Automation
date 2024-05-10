package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	// Create a Constructor
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By Search = By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By Productname = By.xpath("//h4[@class='product-name']");
	
	public void serchItem(String name) {
		driver.findElement(Search).sendKeys(name);
	}
	public String findProduct() {
		return driver.findElement(Productname).getText();
	}

}

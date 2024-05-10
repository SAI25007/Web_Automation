package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
	
	public WebDriver driver;
	public LandingPage landingPage;
	public OffersPage offersPage;
	
	//Constructor to use the Web Driver
	
	public PageObjectsManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		
		landingPage = new LandingPage(driver);
		return landingPage;
		
	}
	
	public OffersPage getOffersPage() {
		offersPage = new OffersPage();
		return offersPage;
	}

}

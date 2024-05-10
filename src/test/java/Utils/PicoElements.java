package Utils;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectsManager;

public class PicoElements {
	public WebDriver driver;
	public String One;
	public String Two;
	public PageObjectsManager pageObjectManager;

	public void PicoElements(){
		
		pageObjectManager = new PageObjectsManager(driver);
	}
}

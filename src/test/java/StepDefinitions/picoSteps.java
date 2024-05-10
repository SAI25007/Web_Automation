package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.PicoElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class picoSteps {
//	public WebDriver driver;
//	String One;
//	String Two;
	PicoElements picoElements;
	
	//Constructor to use utils class variables
	public picoSteps(PicoElements picoElements) {
		this.picoElements = picoElements;
	}
	@Given("Enter into website")
	public void enter_into_website() {
		 System.setProperty("WebDriver.chrome.driver","C:\\Users\\2000078054\\eclipse-workspace\\WebAutomation\\drivers\\chromedriver.exe");
		 picoElements.driver = new ChromeDriver();
		 picoElements.driver.get("https://www.orangehrm.com/");
		 picoElements.driver.findElement(By.cssSelector("button[id='CybotCookiebotDialogBodyButtonDecline']")).click();
		 picoElements.One = picoElements.driver.findElement(By.cssSelector("div[class='homepage-slider-content'] h1")).getText();
	}
	

}

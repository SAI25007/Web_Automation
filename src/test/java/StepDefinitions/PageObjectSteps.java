package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageObjectSteps {
	
	 WebDriver driver = new ChromeDriver();	
	 String product;
	 
	@Given("User loged into the greenKart WebSite")
	public void user_loged_into_the_green_kart_web_site() {
		 System.setProperty("WebDriver.chrome.driver","C:\\Users\\2000078054\\eclipse-workspace\\WebAutomation\\drivers\\chromedriver.exe");
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	@When("^User Entered vegies (.+) in search box$")
	public void user_entered_vegies_name_in_search_box(String shortname) throws InterruptedException {
	 LandingPage landingpage = new LandingPage(driver);
	 landingpage.serchItem(shortname);
	 Thread.sleep(2000);
	 product = landingpage.findProduct().split("-")[0].trim();
//	 driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(shortname);   
//	 driver.findElement(By.xpath("//h4[@class='product-name']")).getText();   
	 System.out.println(product);
	}
	
	@Then("Results has been displayed")
	public void results_has_been_displayed() {
		System.out.println("Page objects is completed");
	    
	}

}

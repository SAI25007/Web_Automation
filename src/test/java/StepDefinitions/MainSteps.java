package StepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MainSteps {
	
	
	@Given("user is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\2000078054\\eclipse-workspace\\WebAutomation\\drivers\\chromedriver.exe");
		
		//driver is the object of WebDriver class integrated with chromeDriver methods
//		WebDriver driver = new ChromeDriver();
		
		//through object we can perform actions
	    System.out.println("User landed on the netbanking page");
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("User loged in the page");
	}
	
	@When("Enter user details")
	public void enter_user_details(List<String> data) {
	    // driver.findelement(Sendkeys(data.get(0))) [use it for Selenium ]
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
	
	
//	@When("user login into application")
//	public void user_login_into_application() {
//	    // Write code here that turns the phrase above into concrete actions
//        driver.get("https://rahulshettyacademy.com");
//		
//		//Where this command prints the title of the page in the console 
//	    System.out.println(driver.getTitle());
//		
//		//To get the current URL of the WebSite
//	    System.out.println(driver.getCurrentUrl());
//		
//		System.out.println("user login into application");
//	}
	
	//Using String 
	
	
//	@When("user login into application with username {string} and password {string}")
//	public void user_login_into_application_with_username_and_password(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println(username +" username and password is " + password);
//	}
	
	
	// Regex Pattern using any dataTypes and start function name with ^ and end with $ [Allows any kind of data]
	
	@When("^user login into application with username (.+) and password (.+)$")
	public void user_login_into_application_with_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(username +" username and password is " + password);
	}
	
	
	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page is displayed");
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
		WebDriver driver = new ChromeDriver();
	    // Write code here that turns the phrase above into concrete actions
		//To close the browser (We use close command to only close the originally opened tab)
		driver.close();
		System.out.println("cards are displayed");
	}
}

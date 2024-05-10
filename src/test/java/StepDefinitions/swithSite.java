package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class swithSite {
	WebDriver driver = new ChromeDriver();
	
	@Given("Enter into greenKart webSite")
	public void enter_into_green_kart_web_site() {
		 System.setProperty("WebDriver.chrome.driver","C:\\Users\\2000078054\\eclipse-workspace\\WebAutomation\\drivers\\chromedriver.exe");
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	@When("Click on TopDeals")
	public void click_on_top_deals() {
	    driver.findElement(By.linkText("Top Deals")).click();
	}
	
	//Function created for switching website
	public void Switchfunction() {
		 Set<String>S1 = driver.getWindowHandles();
		   Iterator<String>I1 =S1.iterator();
		   String ParentWindow = I1.next();
		   String ChildWindow = I1.next();
		   driver.switchTo().window(ChildWindow);
	}
	
	@Then("Switch the webSite")
	public void switch_the_web_site() {
	   Switchfunction();
	   driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Tom");
	   System.out.println("Switch function works");
	}
	@Then("Verify the dweals present")
	public void verify_the_dweals_present() {
	    System.out.println("Verified");
	}

}

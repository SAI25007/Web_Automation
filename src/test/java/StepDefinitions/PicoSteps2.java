package StepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utils.PicoElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PicoSteps2 {
	PicoElements picoElements;
	
	public PicoSteps2(PicoElements picoElements) {
		this.picoElements = picoElements;
	}
	
	@When("Grab to elements from the site")
	public void grab_to_elements_from_the_site() {
//	    driver.findElement(By.linkText("Categories")).click();
		picoElements.Two = picoElements.driver.findElement(By.xpath("//p[contains(text(),'Supercharge your HR team & empower your people with powerful HR software')]")).getText();
	    
	   }
	@Then("Store it in the variables")
	public void store_it_in_the_variables() {
		 System.out.println(picoElements.One);
		 System.out.println(picoElements.Two);
		    
		
	}
	@Then("Verify all variables")
	public void verify_all_variables() {
	    Assert.assertEquals(picoElements.One,"Peace of mind is just a few clicks away!");
	}

}

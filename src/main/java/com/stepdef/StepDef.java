package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.generic.DriverManager;
import com.pagefactory.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	WebDriver driver;
	DriverManager dm;
	MasterPageFactory mpf;
	
	@Given("Open the browser")
	public void open_the_browser() {
		
		DriverManager dm = new DriverManager(); //object DriverManager class
		driver = dm.getChromeDriver(driver); //method from DriverManager class
	    
	}

	@Given("pass the Parabank URL {string}")
	public void pass_the_parabank_url(String URL) {
		
		driver.navigate().to(URL);
		//typing in the address from .feature file

	}

	@When("Enter the username {string}")
	public void enter_the_username(String username) {
	   
	    mpf = new MasterPageFactory(driver);
	    mpf.getUsername().sendKeys(username);
	    
		
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
	   
		mpf = new MasterPageFactory(driver);
	    mpf.getPassword().sendKeys(password);

	}

	@When("Click on login button")
	public void click_on_login_button() {
	   
	    mpf.getLoginbtn().click();
	}

	@Then("Validate login is successful")
	public void validate_login_is_successful() {
	   
	    Assert.assertTrue(mpf.getLogoutbtn().isDisplayed(), "Login successful");
	    
	    if (mpf.getLogoutbtn().isDisplayed()) {
	    	System.out.println("Login successful");
	    }else {
	    	System.out.println("Login failed");
	    }
	}
	
	@Given("Quit all browser")
	public void tearDown() {
		driver.quit();
	}
	
	@Then("Validate error message is displayed")
	public void validate_error_message() {
		   
	    Assert.assertTrue(mpf.getError().isDisplayed(), "Error message is displayed");
	    
	    if (mpf.getError().isDisplayed()) {
	    	System.out.println("Error message is displayed");
	    }else {
	    	System.out.println("No message");
	    }
	}
	
	@When("Click on Logout button")
	public void click_logout() {
		mpf.getLogoutbtn().click();
		
	}
	
	@Then("Validate logout is successful")
	public void validate_logout() {
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(mpf.getLoginbtn().isDisplayed(), "Logout successful");
		
	
	}
	
	@Given("pass the Parabank URL")
	public void pass_parabank_url(String URL) {
		driver.navigate().to(URL);
	}
	
	@When("Enter the username")
	public void enter_username(String username) {
		   
		mpf = new MasterPageFactory(driver);
		mpf.getUsername().sendKeys(username);
	}
	
	@When("Enter the password")
	public void enter_password(String password) {
		   
		mpf = new MasterPageFactory(driver);
	    mpf.getPassword().sendKeys(password);
	}
	

}

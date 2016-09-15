package com.steps;

import com.hana.core.BasicTest;
import com.hana.luncher.DriverLuncher;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TimeTestSteps extends BasicTest {
	//public WebDriver driver;
	@Before
	public void setup(){
	driver =DriverLuncher.luncher();
		
	}
	@After
	public void teardown(){
		driver.close();
	}
	@Given("^Calculate the page load time$")
	public void calculate_the_page_load_time() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^User click on IR login button$")
	public void user_click_on_IR_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Calculate landing Page load time$")
	public void calculate_landing_Page_load_time() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^User click on Virtual office button$")
	public void user_click_on_Virtual_office_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Calculate the Login Page load time$")
	public void calculate_the_Login_Page_load_time() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\" and click on login$")
	public void user_enter_and_and_click_on_login(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User calculate load time for qnet ltd page after closing the popup$")
	public void user_calculate_load_time_for_qnet_ltd_page_after_closing_the_popup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User click on shop button$")
	public void user_click_on_shop_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User calculate the time for product page loading$")
	public void user_calculate_the_time_for_product_page_loading() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User create a report$")
	public void user_create_a_report() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Check report$")
	public void check_report() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}

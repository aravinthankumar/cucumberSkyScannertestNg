package org.stepdefinitation;

import org.baseclass.BaseClass;
import org.pojo.Flight;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flights extends BaseClass{
	Flight f;



	@Given("The user should be skyscanner page")
	public void the_user_should_be_skyscanner_page() throws InterruptedException {
		chromeLounch();
        implicitwait();
        thread();

        urlLounch("https://www.skyscanner.com.sg/");
thread();
	}
	@When("The user has to click one way button")
	public void the_user_has_to_click_one_way_button() throws InterruptedException {
		 f = new Flight(); 
		 thread();
		click(f.getOneWay());
	}

	@When("The user should be enter {string} and {string}")
	public void the_user_should_be_enter_and(String from, String to) {
	    
		sendkeys(f.getFrom(), from);
		sendkeys(f.getTo(), to);
	}

	@When("The user should be provide depart and return")
	public void the_user_should_be_provide_depart_and_return() {
	   click(f.getDepart());
	   click(f.getDepartDate());
	   
	   click(f.getReturn());
	   click(f.getReturnDate());
	}

	@When("The user has to click cabin class and increase adult count")
	public void the_user_has_to_click_cabin_class_and_increase_adult_count() {
	    click(f.getCabinClass());
	    click(f.getAdult());

	    click(f.getAdult());

	}

	@Then("The user has to click  direct flight only")
	public void the_user_has_to_click_direct_flight_only() {
	  //  Assert.assertTrue(false);
		click(f.getDriectOnly());
	}
	




}

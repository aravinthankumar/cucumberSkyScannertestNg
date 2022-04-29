package org.stepdefinitation;

import org.baseclass.BaseClass;
import org.pojo.Hotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hotels extends BaseClass {
	Hotel h;
	@Given("The user should be skyscanners page")
	public void the_user_should_be_skyscanners_page() {

		h = new Hotel();
		chromeLounch();
        implicitwait();

        urlLounch("https://www.skyscanner.com.sg/");
        click(h.getClickHotels());

	}
	
	@When("The user has to click one Hotels button")
	public void the_user_has_to_click_one_Hotels_button() throws InterruptedException {
click(h.getClickHotels());
	    thread();
	}

	@When("The user should be enter {string} and")
	public void the_user_should_be_enter_and(String loc) {
	    sendkeys(h.getStayLocation(), loc);

	}

	@When("The user should be provide checkin and checkout")
	public void the_user_should_be_provide_checkin_and_checkout() throws InterruptedException {
		click(h.getCheckin());
		click(h.getCheckinDate());
		
		click(h.getCheckout());
		click(h.getCheckoutDate());
		thread();
	}

	@When("The user has to click rooms and increase adult count")
	public void the_user_has_to_click_rooms_and_increase_adult_count() {
		click(h.getGuestsRooms());
	    click(h.getAdultIncr());
	}

	@When("The user has to click {int}stars")
	public void the_user_has_to_click_stars(Integer int1) {
		click(h.getFoueStar());

	}

	@Then("The user has to search hotels")
	public void the_user_has_to_search_hotels() {
		// Assert.assertTrue(false);
			click(h.getSearchHotel());
	}
}

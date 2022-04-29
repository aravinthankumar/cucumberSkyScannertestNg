package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel extends BaseClass{
	public Hotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="destination-autosuggest")
	private WebElement stayLocation;
	
	@FindBy(id="skhot")
	private WebElement clickHotels;
	
	@FindBy(id="checkin")
	private WebElement checkin;
	
	@FindBy(xpath="//button[@aria-label='Friday, 6 May 2022']")
	private WebElement checkinDate;
	
	@FindBy(id="checkout")
	private WebElement checkout;
	
	@FindBy(xpath="//button[@aria-label='Thursday, 26 May 2022']")
	private WebElement checkoutDate;
	
	@FindBy(id="guests-rooms")
	private WebElement guestsRooms;
	
	@FindBy(xpath="(//button[@aria-controls='adults'])[2]")
	private WebElement adultIncr;
	
	
	@FindBy(name="Filters_Stars_label_stars4")
	private WebElement foueStar;
	
	@FindBy(xpath="//button[text()='Search hotels']")
	private WebElement searchHotel;

	public WebElement getStayLocation() {
		return stayLocation;
	}

	public void setStayLocation(WebElement stayLocation) {
		this.stayLocation = stayLocation;
	}

	public WebElement getClickHotels() {
		return clickHotels;
	}

	public void setClickHotels(WebElement clickHotels) {
		this.clickHotels = clickHotels;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public void setCheckin(WebElement checkin) {
		this.checkin = checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	public WebElement getGuestsRooms() {
		return guestsRooms;
	}

	public void setGuestsRooms(WebElement guestsRooms) {
		this.guestsRooms = guestsRooms;
	}

	public WebElement getFoueStar() {
		return foueStar;
	}

	public void setFoueStar(WebElement foueStar) {
		this.foueStar = foueStar;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public void setSearchHotel(WebElement searchHotel) {
		this.searchHotel = searchHotel;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(WebElement checkinDate) {
		this.checkinDate = checkinDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(WebElement checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public WebElement getAdultIncr() {
		return adultIncr;
	}

	public void setAdultIncr(WebElement adultIncr) {
		this.adultIncr = adultIncr;
	}
	
	
	
	

}

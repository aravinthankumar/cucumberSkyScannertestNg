package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight extends BaseClass {
	public Flight() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="fsc-trip-type-selector-one-way")
	private WebElement oneWay;
	
	@FindBy(name="fsc-origin-search")
	private WebElement from;

	@FindBy(name="fsc-destination-search")
	private WebElement to;
	
	@FindBy(xpath="(//span[@class='DateInput_DateInput--text__MzMyY'])[1]")
	private WebElement depart;
	
	@FindBy(xpath="(//button[@class='BpkCalendarDate_bpk-calendar-date__MTdlO'])[3]")
	private WebElement departDate;
	
	public WebElement getDepartDate() {
		return departDate;
	}

	public void setDepartDate(WebElement departDate) {
		this.departDate = departDate;
	}

	public WebElement getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(WebElement returnDate) {
		ReturnDate = returnDate;
	}

	@FindBy(xpath="(//span[@class='DateInput_DateInput--text__MzMyY'])[2]")
	private WebElement Return;
	
	@FindBy(xpath="//span[text()='31']")
	private WebElement ReturnDate;
	
	@FindBy(xpath="(//span[@class='CabinClassTravellersSelector_CabinClassTravellersSelector__triggertext__ZTM1N'])[1]")
	private WebElement cabinClass;
	
	@FindBy(xpath="(//button[@title='Increase number of adults'])")
	private WebElement adult;
	
	@FindBy(name="directOnly")
	private WebElement driectOnly;

	public WebElement getOneWay() {
		return oneWay;
	}

	public void setOneWay(WebElement oneWay) {
		this.oneWay = oneWay;
	}

	public WebElement getFrom() {
		return from;
	}

	public void setFrom(WebElement from) {
		this.from = from;
	}

	public WebElement getTo() {
		return to;
	}

	public void setTo(WebElement to) {
		this.to = to;
	}

	public WebElement getDepart() {
		return depart;
	}

	public void setDepart(WebElement depart) {
		this.depart = depart;
	}

	

	public WebElement getReturn() {
		return Return;
	}

	public void setReturn(WebElement return1) {
		Return = return1;
	}

	public WebElement getCabinClass() {
		return cabinClass;
	}

	public void setCabinClass(WebElement cabinClass) {
		this.cabinClass = cabinClass;
	}

	public WebElement getAdult() {
		return adult;
	}

	public void setAdult(WebElement adult) {
		this.adult = adult;
	}

	public WebElement getDriectOnly() {
		return driectOnly;
	}

	public void setDriectOnly(WebElement driectOnly) {
		this.driectOnly = driectOnly;
	}
	
	

}
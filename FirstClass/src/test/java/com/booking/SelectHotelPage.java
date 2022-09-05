package com.booking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	@FindBy(id = "location")
	private WebElement dDnlocation;

	@FindBy(id = "radiobutton_0")
	private WebElement btnRadiobutton;
	
	
	@FindBy(id = "continue")
	private WebElement btncontinue;
	
	
	public void SelectHotel() {
	
	
}
}

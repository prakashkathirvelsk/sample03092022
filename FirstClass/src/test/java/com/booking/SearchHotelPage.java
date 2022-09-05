package com.booking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {

	@FindBy(id = "location")
	private WebElement dDnlocation;

	@FindBy(id = "username_show")
	private WebElement textWelcomeMsg;

	@FindBy(id = "hotels")
	private WebElement dDnHotels;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnRoomNo;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildRoom;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getTextWelcomeMsg() {
		return textWelcomeMsg;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}


	public void SearchHotels(String location, String Hotels, String RoomType, String RoomNo, String CheckInDate,
			String CheckOutDate, String AdultRoom, String Childroom) {
		selectOptionByText(getdDnlocation(), location);
		selectOptionByText(getdDnHotels(), Hotels);
		selectOptionByText(getdDnRoomType(), RoomType);
		selectOptionByText(getdDnRoomNo(), RoomNo);
		elementSendkeys(getTxtCheckInDate(), CheckInDate);
		elementSendkeys(getTxtCheckOutDate(), CheckOutDate);
		selectOptionByText(getdDnAdultRoom(), AdultRoom);
		selectOptionByText(getdDnChildRoom(), Childroom);
		elementClick(getBtnSubmit());

	}

}

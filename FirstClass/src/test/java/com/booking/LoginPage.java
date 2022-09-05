package com.booking;

import org.apache.xmlbeans.impl.inst2xsd.util.Element;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	public  void LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")

	private WebElement txtUserName;

	@FindBy(id = "password")

	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getUserName() {
		return txtUserName;
	}

	public WebElement gettxtPassword() {
		return txtPassword;
	}

	public WebElement getbtnLogin() {
		return btnLogin;
	}

	public void input(String UserName, String Password) {
		
		elementSendkeys(getUserName(), UserName);
		elementSendkeys(gettxtPassword(), Password);
		elementClick(getbtnLogin());
	}

}

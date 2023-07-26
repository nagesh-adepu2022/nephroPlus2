package com.nephroPlus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// UserName
	@FindBy(id = "edit-name")
	WebElement txtUserName;

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	// Password
	@FindBy(id = "edit-pass")
	WebElement txtPassword;

	public void setPassword(String pword) {
		txtPassword.sendKeys(pword);
	}

	// Submit
	@FindBy(id = "edit-submit")
	WebElement txtSubmit;

	public void ClickOnSubmit() {
		txtSubmit.click();
	}

}

package com.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.utils.CommonMethods;

public class LoginPageElements extends CommonMethods {
	@FindBy(id="tUsername")
	public WebElement Username;
	
	@FindBy(id="tPassword")
	public WebElement password;
	
	@FindBy(id="bLogin")
	public WebElement login;
	
	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}

}

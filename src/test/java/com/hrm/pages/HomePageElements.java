package com.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.utils.CommonMethods;

public class HomePageElements extends CommonMethods {
	
	@FindBy(id= "Header1_imgSchoolLogo")
	public WebElement logo;
	
	@FindBy(xpath = "//a[normalize-space()='Students']")
	public WebElement students;
	
	public HomePageElements() {
		PageFactory.initElements(driver, this);
	}

}

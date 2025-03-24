package com.hrm.testbase;

import com.hrm.pages.HomePageElements;
import com.hrm.pages.LoginPageElements;

public class PageInitializer extends BaseClass {
	
	public static LoginPageElements loginPage;
	public static HomePageElements homePage;
	
	public static void initialize() {
		loginPage = new LoginPageElements();
		homePage = new HomePageElements();
		
	}

}

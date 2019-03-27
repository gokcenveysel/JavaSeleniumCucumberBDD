package com.qa.stepDefinitions;

import com.qa.pages.BeinSportPage;
import com.qa.pages.HomePage;
import com.qa.pages.OneMonthByOneWeekPage;
import com.qa.pages.PackagePage;
import com.qa.pages.RegisterPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase {
	
	HomePage homePage;
	PackagePage packagePage;
	OneMonthByOneWeekPage oneMonthByOneWeekPage; 
	RegisterPage registerPage;
	BeinSportPage beinsportPage;

	@Given("user open browser")
	public void user_open_browser() throws Throwable {
		TestBase.initialization();
	}

	@Then("user click subscribe button")
	public void user_click_subscribe_button() throws Throwable {
		homePage = new HomePage();
		packagePage =homePage.subscribeHomePage();
	}

	@Then("user on Package Page")
	public void user_on_Package_Page() throws Throwable {
		packagePage = new PackagePage();
		oneMonthByOneWeekPage = packagePage.subscribe();
	}
	
	@Then("user click Package subscribe button")
	public void user_click_Package_subscribe_button() throws Throwable {
		oneMonthByOneWeekPage = new OneMonthByOneWeekPage();
		registerPage =oneMonthByOneWeekPage.subscribe();
	}
	
	@Then("user enter fname and lname and email and password and create an account")
	public void user_enter_fname_and_lname_and_email_and_password() throws Throwable {
		registerPage = new RegisterPage();
		beinsportPage = registerPage.create(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"), prop.getProperty("password"));
	}




	
}

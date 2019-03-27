package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class OneMonthByOneWeekPage extends TestBase  {
	@FindBy(xpath="/html/body/div[5]/div[5]/div/div[2]/div[2]/div[2]/a")
	WebElement oneMonthByOneWeekBtn;


	public OneMonthByOneWeekPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public RegisterPage subscribe()
	{
		oneMonthByOneWeekBtn.click();
		
		return new RegisterPage();
	}

}

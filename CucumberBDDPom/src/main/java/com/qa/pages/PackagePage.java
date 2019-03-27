package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class PackagePage extends TestBase 
{
	@FindBy(xpath="/html/body/div[5]/div[1]/div[4]")
	WebElement oneMonthBtn;

	public PackagePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public OneMonthByOneWeekPage subscribe()
	{
		oneMonthBtn.click();
		
		return new OneMonthByOneWeekPage();
	}
}

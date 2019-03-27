package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'                        SUBSCRIBE')]")
	WebElement subscribeHomePageBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public PackagePage subscribeHomePage()
	{
		subscribeHomePageBtn.click();
		return new PackagePage();
	}

}

package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class RegisterPage extends TestBase {
	
	@FindBy(xpath="//*[@id='form-register']/div/div[2]/div[3]/input")
	WebElement firstnameIput;
	
	@FindBy(xpath="//*[@id='form-register']/div/div[2]/div[4]/input")
	WebElement lastnameIput;

	@FindBy(xpath="//*[@id='form-register']/div/div[2]/div[5]/input")
	WebElement emailIput;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement passwordIput;
	
	@FindBy(xpath="//*[@id='form-register']/div/div[2]/div[11]/input")
	WebElement registerBtn;
	
	@FindBy(xpath="//*[@id='form-register']/div/div[2]/div[8]/div[1]/label")
	WebElement checkBox;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public BeinSportPage create(String fname, String lname , String email, String pass)
	{
		firstnameIput.sendKeys(fname);
		lastnameIput.sendKeys(lname);
		emailIput.sendKeys(email);
		passwordIput.sendKeys(lname);
		checkBox.click();
		registerBtn.click();
		
		return new BeinSportPage();
	}

}

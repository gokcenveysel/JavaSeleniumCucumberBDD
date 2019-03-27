package com.qa.pages;

import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class BeinSportPage extends TestBase {
	
	public BeinSportPage()
	{
		PageFactory.initElements(driver,this);
	}

}

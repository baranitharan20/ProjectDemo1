package org.testpojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testbase.BaseClass;

public class pojoclass  extends BaseClass {

	

	public pojoclass() {
        PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id = "email")
	WebElement txtusername;

	@FindBy(id = "pass")
	WebElement txtpassword;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}
	
	
	
	
}

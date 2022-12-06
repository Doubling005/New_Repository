package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Testbase.TestBase;

public class Login_Functionality extends TestBase {
	
	public Login_Functionality() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	private WebElement username_txt;
	
	@FindBy(xpath="")
	private WebElement password_txt;
	
	@FindBy(xpath="")
	private WebElement login_btn;


	public void enterusername() {
		username_txt.sendKeys("abc");
	}
	
	public void enterpassword() {
		password_txt.sendKeys("kar");
	}
	
	public void clickonloginbutton() {
		login_btn.click();
	}

}

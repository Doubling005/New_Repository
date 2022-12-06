package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Testbase.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	private WebElement username_txt;
	
	@FindBy(xpath="")
	private WebElement password_txt;
	
	@FindBy(xpath="")
	private WebElement login_btn;
	
	public void enterusername() {
		username_txt.sendKeys("xyz");
	}
	
	public void enterpassword() {
		password_txt.sendKeys("");
	}
	public void clicklogin() {
		login_btn.click();
	}
	

}

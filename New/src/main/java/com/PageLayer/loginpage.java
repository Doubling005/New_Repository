package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.Testbase.TestBase;

public class loginpage  extends TestBase{

	public loginpage() {
		 PageFactory.initElements(driver,this);
	}
	
	private By username=By.xpath("");
	private By password=By.xpath("");
	private By login_btn=By.xpath("");
	
	public void username(String username1) {
		
		driver.findElement(username).sendKeys(username1);
		
	}
}

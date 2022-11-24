package com.TestLayer;

import org.testng.annotations.Test;

import com.Testbase.TestBase;

public class LoginPageTest extends TestBase{
	
	@Test
	public void loginFunctionality() {
		a.enterusername();
		a.enterpassword();
		a.clicklogin();
	}

}

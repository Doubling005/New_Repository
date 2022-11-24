package com.testLayer;

import org.testng.annotations.Test;

import com.Testbase.TestBase;

public class Testlogin extends TestBase {

	@Test
	public void scenario1() {
		obj.enterusername();
		obj.enterpassword();
		obj.clickonloginbutton();
	}
	
}

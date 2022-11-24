package com.TestLayer;

import org.testng.annotations.Test;

import com.PageLayer.loginpage;

public class Testclass {
	loginpage l = new loginpage();
	
	@Test
	public void verifylogin() {
		l.username(null);
	}
}

package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class App_Test {
	@Test
	public void logintest1()
	{
		App_login myapp = new App_login();
		Assert.assertEquals(0, myapp.userLogin("abcd", "abc@123"));
	}
	
	@Test
	public void logintest2()
	{
		App_login myapp = new App_login();
		Assert.assertEquals(1,myapp.userLogin("abc", "abc@123"));
	}
	

}

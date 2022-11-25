package com.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.testbase.TestBase;

public class LoginPageTest extends TestBase{
		
	
	@Test
	public void verifyLoginFunctionaliyvalidcerd() throws InterruptedException
	{
		String expected_url = "https://apps.dalalstreet.ai/dashboard";
		Thread.sleep(2000);
		String act_url =driver.getCurrentUrl();
		System.out.println(act_url);
		Assert.assertEquals(act_url, expected_url);
		logger.info("Login Testcase passed");
	}
	//@Test(enabled=false)
//	public void verifyLoginFunctionaliyINvalidcerd() throws InterruptedException
//	{
//		String expected_url = "https://apps.dalalstreet.ai/dashboard";
//		LoginPage login = new LoginPage();
//		login.enterEmailID("pratikshamoolya9@gmail.com");
//		login.enterPassword("Test@12");
//		login.ClickOnloginbutton();
//		Thread.sleep(2000);
//		String act_url =login.getCrentUrl();
//		System.out.println(act_url);
//		Assert.assertEquals(act_url, expected_url);
//	}
	

}

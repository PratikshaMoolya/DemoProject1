package com.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//------------------obj---------------
	
	@FindBy(xpath="(//input[@name='email'])")
	private WebElement email_txt;
	
	@FindBy(xpath="(//input[@name='password'])")
	private WebElement password_txt;
	
	@FindBy(xpath="(//button[@type='submit'])")
	private WebElement login_btn;
	//-------------------Action Class-----------------
	public void enterEmailID(String email)
	{
		email_txt.sendKeys(email);
	}

	public void enterPassword(String password)
	{
		password_txt.sendKeys(password);
	}
	public void ClickOnloginbutton()
	{
		login_btn.click();
	}
	
	public String getCrentUrl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
}

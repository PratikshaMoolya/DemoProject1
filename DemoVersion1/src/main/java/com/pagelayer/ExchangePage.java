package com.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;

public class ExchangePage extends TestBase {
	
	public ExchangePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	private By buy_btn1 = By.xpath("//a[contains(text(),'Buy')]");
	private By quantity_txt = By.xpath("//input[@name='input-Qunatity']");
	private By buy_btn2 = By.xpath("//button[contains(text(),'Buy')]");
	private By status_txt =By.xpath("//div[contains(text(),'Order Created successfully')]");
	
	public void clickOnBuyButton1()
	{
		driver.findElement(buy_btn1).click();
	}
	public void enterOnQuantityofShare(String count)
	{
		driver.findElement(quantity_txt).click();
		driver.findElement(quantity_txt).sendKeys(count);
	}

	public void clickOnBuyButton2()
	{
		JavascriptExecutor e =((JavascriptExecutor)driver);
		e.executeScript("scroll(0,600)");
		driver.findElement(buy_btn2).click();
	}

	public String getstatus()
	{
		String status =driver.findElement(status_txt).getText();
		return status;
	}

}

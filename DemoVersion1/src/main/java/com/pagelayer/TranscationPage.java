package com.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;

public class TranscationPage extends TestBase {
	
	public TranscationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------obj----------------------
	//private By data = By.xpath("//table[@class='table table align-middle table-nowrap']/tbody/tr[1]/td[2]");
	
	
	//---------------Action-----------------------
	
	public void  getTranscationDetails()
	{
		for(int i=1;i<9;i++)
		{
			for(int j=1;j<9;j++)
			{
				String f = driver.findElement(By.xpath("//table[@class='table table align-middle table-nowrap']/tbody/tr["+i+"]/td["+j+"]")).getText();
			   System.out.print(f+" ");
			}
			System.out.println();
		}
	}

}

package com.utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	static String path = "D:\\Eclipseprogram\\Dalalstreet\\Screenshots\\";
	public static void takeScreenshot(String filename) 
	{
		try
		{
			TakesScreenshot w = (TakesScreenshot)driver;
			File src = w.getScreenshotAs(OutputType.FILE);
			
			File des = new File(path+filename+".png");
			FileHandler.copy(src ,des);
		}
		catch(Exception e)
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
			
		}
	}
	
	
	}

	


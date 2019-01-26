package com.advance.orbit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest 
{
	WebDriver orbitDriver = new ChromeDriver();
	
	public void getUrl()
	{
		//this method will call in Test.java file
		orbitDriver.get("https://www.phptravels.net/");
		System.out.println("Title of the Page is : "+orbitDriver.getTitle());
	}
	
	public void quit()
	{
		orbitDriver.quit();
	}
}

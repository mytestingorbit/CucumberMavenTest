package com.advance.orbit.stepdefinition;

import com.advance.orbit.pages.SampleTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Test extends SampleTest

{
	@Given("^User is on application home page$")
	public void OpenPage() 
	{
		getUrl();
	}

	@Then("^User close the browser$")
	public void TearDown()
	{
		quit();
	}
}

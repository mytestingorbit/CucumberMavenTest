package com.advance.orbit.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features ="src/test/resources/Features",
		glue="com.advance.orbit.stepdefinition",
		format = {"json:target/cucumber.json",
		"html:target/site/cucumber-pretty"},
		monochrome =true
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}

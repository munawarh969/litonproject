package com.usa.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "C:\\Users\\Munawar Hossain\\eclipse-workspace\\FBProject\\Feature\\Login.feature",tags = "@Login",
		plugin = {"pretty", "html:target/cucumber-reports/cucumber.json",
		"json:target/cucumber.json"},
		dryRun = false,
		monochrome  = true,
		strict = true,
		glue = "com.usa.stepdefinition1"
		)

public class LoginTest extends AbstractTestNGCucumberTests{

}

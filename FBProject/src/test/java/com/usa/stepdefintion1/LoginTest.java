package com.usa.stepdefintion1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.usa.PageFactoy.PageFactoryClass;
import com.usa.Parent.Parent;
import com.usa.Utility.ListenerClass;
import com.usa.Utility.Utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@Listeners(ListenerClass.class)
public class LoginTest extends Parent {

	PageFactoryClass liton;

	@Given("^open the browser$")
	public void open_the_browser() {
		Hello();
		yerr();
	}

	@Given("^navigate to \"([^\"]*)\"$")
	

	@When("^enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_username_and_password(String Username, String Password)  {
		Utility.Explicitwait(liton.GetUsername()).sendKeys(Username);
		Utility.Explicitwait(liton.GetPassword()).sendKeys(Password);
	}

	@When("^click sign in button$")
	public void click_sign_in_button()  {

		Utility.Explicitwait(liton.GetSubmitbtn()).click();
	}

	@Then("^user should be landed in homepage$")
	public void user_should_be_landed_in_homepage() {

		String actual = 	Utility.Explicitwait(liton.Getpagesource()).getText();
		String expected = "Facebook";
		
		if (expected.equalsIgnoreCase(actual)) {
			System.out.println(actual);
			System.out.println("My expected page title matches with the Actual");
			
			Assert.assertTrue(true);
		}

		else {
			System.out.println("Expected did not Match Actual");
			Assert.assertTrue(true);
		}
	}

}

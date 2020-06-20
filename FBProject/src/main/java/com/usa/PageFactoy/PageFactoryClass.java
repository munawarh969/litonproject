package com.usa.PageFactoy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.Parent.Parent;
import com.usa.Utility.Utility;

public class PageFactoryClass extends Parent {

	public PageFactoryClass() {

		PageFactory.initElements(driver, this);

	}
	
	

	@FindBy(id = "email")
	private WebElement Username;

	public WebElement GetUsername() {
		return Username;
	}

	@FindBy(id = "pass")
	private WebElement Password;

	public WebElement GetPassword() {
		return Password;
	}

	@FindBy(id = "u_0_2")
	private WebElement LogIn;

	public WebElement GetSubmitbtn() {
		return LogIn;
	}

	@FindBy(xpath = "//*[@class=\"_1vp5\"]")
	private WebElement pagesource;

	public WebElement Getpagesource() {
		return pagesource;
	}
	

	
}

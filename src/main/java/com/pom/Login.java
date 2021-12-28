package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public static WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(name = "pass")
	private WebElement pass;

	@FindBy(name = "login")
	private WebElement log;

	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

	}

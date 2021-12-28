package com.pom_insta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instapom {
	

	public static WebDriver driver;

	@FindBy(xpath = "//span[@class='_7UhW9   xLCgt       qyrsm      gtFbE      se6yk        ']")
	private WebElement signup;
	
	@FindBy(name = "emailOrPhone" )
	private WebElement mail;
	
	@FindBy(name = "fullName" )
	private WebElement fname;
	
	@FindBy(name = "username" )
	private WebElement uname;
	
	@FindBy(name = "password" )
	private WebElement p_word;
	
	@FindBy(xpath = "(//button[@class='sqdOP  L3NKy   y3zKF     '])[2]" )
	private WebElement c1;
	
	@FindBy(xpath = "(//select[@class='h144Z  '])[1]")
	private WebElement month;

	@FindBy(xpath = "(//select[@class='h144Z  '])[2]")
	private WebElement date;
	
	@FindBy(xpath = "(//select[@class='h144Z  '])[3]")
	private WebElement year;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement signup1;
	
	public WebElement getSignup1() {
		return signup1;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getYear() {
		return year;
	}
	
	public WebElement getMonth() {
		return month;
	}

	public Instapom(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver3, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getSignup() {
		return signup;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getP_word() {
		return p_word;
	}

	public WebElement getC1() {
		return c1;
	}

	

	

}

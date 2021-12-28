package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base_class.Base_Class;
import com.pom.Login;

public class Information extends Base_Class {

	public static void main(String[] args) {
		browserlaunch("chrome");
		urllaunch("https://www.facebook.com/");
		maxwindow();
		
		Login l = new Login (driver);
		
		inputvalues(l.getEmail(), "mani.c.s.valar@gmail.com");
		inputvalues(l.getPass(), "12345");
		clickOnElement(l.getLog());
	}

}

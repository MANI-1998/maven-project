package com.facebook;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.base_class.Base_Class;
import com.pom_insta.Instapom;

public class Instap extends Base_Class {
	public static void main(String[] args) throws InterruptedException, IOException {
		browserlaunch("chrome");
		urllaunch("https://www.instagram.com/accounts/login/");
		maxwindow();
		sleep(3000);
		Instapom ip = new Instapom(driver);
		clickOnElement(ip.getSignup());
		sleep(3000);
		inputvalues(ip.getMail(), "919943039388");
		inputvalues(ip.getFname(), "MANIKANDAN");
		inputvalues(ip.getUname(), "MANI_1998_07");
		inputvalues(ip.getP_word(), "QWERTY12345");
		clickOnElement(ip.getC1());
		sleep(3000);
		dropdown(ip.getMonth(), "index", "6");
		dropdown1(ip.getMonth(), "opt");
		dropdown(ip.getDate(), "value", "25");
		dropdown1(ip.getDate(), "first selected");
		dropdown(ip.getYear(), "value", "1998");
		dropdown1(ip.getYear(), "opt");
		clickOnElement(ip.getSignup1());
	}
}

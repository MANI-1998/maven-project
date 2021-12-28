package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.base_class.Base_Class;

public class Act extends Base_Class {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\S.R\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
//
//		ChromeOptions ch = new ChromeOptions();
//
//		ch.addArguments("incognito");
//
//		WebDriver driver = new ChromeDriver(ch);
//
//		driver.get("http://automationpractice.com/index.php");
//
//		driver.manage().window().maximize();
		
		browserlaunch("chrome");
		
		urllaunch("http://automationpractice.com/index.php");

		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		mouse("move", dress);

		// Actions ac = new Actions(driver);

		// ac.moveToElement(dress).build().perform();

		WebElement summerdress = driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));
		mouse("click", summerdress);
		// ac.click(summerdress).build().perform();

	}

}

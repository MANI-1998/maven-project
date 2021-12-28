package com.MiniProject;

import java.io.IOException;
import com.base_class.Base_Class;

import com.pom_mini.Mini_Pom;

public class Mini_Project extends Base_Class {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		browserlaunch("chrome");
		maxwindow();
		urllaunch("http://automationpractice.com/index.php");
		Mini_Pom mp = new Mini_Pom (driver);
		mouse("move", mp.getSignin());
		mouse("click", mp.getSignin());
		sleep(3000);
		scrollinto(mp.getScroll_1());
		inputvalues(mp.getMail(), "mani.c.s.valar@gmail.com");
		inputvalues(mp.getPassword(), "123456qwerty");
		clickOnElement(mp.getLogin());
		mouse("move", mp.getTshirt());
		mouse("click", mp.getTshirt());
		scrollinto(mp.getCentre_page());
		sleep(2000);
		mouse("move", mp.getQv());
		mouse("click", mp.getQv());
		sleep(2000);
		frame(mp.getFrame_1());
		sleep(2000);
		erase(mp.getC1());
		inputvalues(mp.getQuantity(),"5");
		dropdown(mp.getSize(), "value", "3");
		clickOnElement(mp.getColour());
		sleep(2000);
		clickOnElement(mp.getSub());
		sleep(3000);
		frame2("default");
		sleep(2000);
		mouse("move", mp.getPtc());
		mouse("click", mp.getPtc());
		sleep(2000);
		scrollinto(mp.getSummary_page());
		clickOnElement(mp.getPc1());
		sleep(2000);
		scrollinto(mp.getAddress_page());
		clickOnElement(mp.getPc2());
		scrollinto(mp.getShipping_page());
		clickOnElement(mp.getPc3());
		clickOnElement(mp.getPc4());
		scrollinto(mp.getPayment_page());
		clickOnElement(mp.getPc5());
		scrollinto(mp.getCheck_payment());
		clickOnElement(mp.getPc6());
		scrollinto(mp.getOrder_confirm());
		sc("C:\\Users\\S.R\\eclipse-workspace\\MavenProject\\Screenshot\\snap-1.png");
		
	}
}

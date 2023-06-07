package org.Manipal.testCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseConfigurations;
import pageObjects.HomePage;
import pageObjects.MenuPage;
import pageObjects.MobilePage;

public class TestCase1 extends BaseConfigurations {
	
//	HomePage homeObj = new HomePage();
//	MenuPage menuObj = new MenuPage();
//	MobilePage mobileObj = new MobilePage();
	
	
	public HomePage homeObj;
	public MenuPage menuObj;
	public MobilePage mobileObj;
	WebDriver driver;
	
	@BeforeClass
	public void initialSetup() {
		driver = getDriver();
		homeObj = new HomePage(driver);
		menuObj = new MenuPage(driver);
		mobileObj = new MobilePage(driver);
	}
	
	@Test
	public void scenario1() {
		homeObj.verifyHomeLaunchSuccess();
		menuObj.menuNavigation();
		mobileObj.verifyMobileHeader();
		
	}

}

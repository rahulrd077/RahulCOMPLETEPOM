package com.Xyphias.QA.RahulCompletePOM;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestUtil.Util;

public class HomePageTest extends TestBase{
	ContactsPage contactspage;
	LoginPage logpage;
	
	 Util testutil ;
	
	 HomePage Homepage;
	
	public HomePageTest() {
		//
		super();
	}
	
	
	@BeforeMethod
	
	public void HomePageInit() {
		 contactspage = new ContactsPage();
		initialization();
		
	 logpage = new LoginPage();
		
		 testutil = new Util();
		
		Homepage = logpage.LoginToHomePage(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	
	public void HomePageTitleTest() {
		
		
		
		String hometitle = Homepage.verifyHomePageTitle();
		
		Assert.assertEquals(hometitle, "CRMPRO", "HomePageTitle Not Matched");
	}
	
	@Test(priority=2)
	
	public void VerifyUserNameLabelTest() {
		
		//driver.switchTo().frame("mainpanel");
	testutil.switchframes();
		boolean usernamelabel = Homepage.UserNameLabel();
		
		Assert.assertTrue(usernamelabel,"Not visible HomePageUserNameLabel");
	}
	
	@Test(priority = 3)
	
	public void verifycontactlinkTest() {
		
		testutil.switchframes();
		
		contactspage = Homepage.clickonContactsLink();
	}
	
	// 
	
	
	@AfterMethod
	
	public void TearDown()
	{
		
		driver.quit();
	}
}

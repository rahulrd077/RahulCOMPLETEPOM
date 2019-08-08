package com.Xyphias.QA.RahulCompletePOM;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginPageTest extends TestBase{
	public static ExtentHtmlReporter htmlreporter;
	
	public static ExtentReports extent;
	public static  LoginPage login=null;
	
	public static HomePage Home;
	

	public LoginPageTest(){
		
		super();
		
		
	}
	
	@BeforeMethod
	
	public void init() {

		 htmlreporter = new ExtentHtmlReporter ("Extentreport.html");
		
	 extent = new ExtentReports();
		
		
		extent.attachReporter(htmlreporter);
		
		
		initialization();
		
		 login= new LoginPage();
		
	}
	
	@Test(priority = 1)
	
	public void ValidateLoginPageTitleTest() {
		
		ExtentTest test1 = extent.createTest("First test"," Check the title");
		test1.log(Status.INFO,"the use of log");
		test1.info("information details");
		test1.pass("Passed test");
		  String CRMtitle=  login.ValidateLoginPageTitle();
		  
		
		  
		  Assert.assertEquals(CRMtitle, " CRMPRO - CRM software for customer relationship management, sales, and support.","Wrong Title");
		  
			extent.flush();
	}
	
	
	@Test(enabled = false)
	
	public void VerifyLogoTest() {
		
		     boolean logo =   login.VerifyLogo();
		     
		     Assert.assertTrue(logo,"Logo is wrong");
	}
	
	@Test(enabled = false)
	
	public void LoginTest() {
		
		Home = login.LoginToHomePage(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	
	@AfterMethod
	
	public void tearDown() {
	
		driver.quit();
	}

}

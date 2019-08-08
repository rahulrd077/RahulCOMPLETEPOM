package com.Xyphias.QA.RahulCompletePOM;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestUtil.Util;

public class ContactsPageTest extends TestBase{
	
	
	
public static String sheetName = "HelloSheet";
	
	public static Util testutil;
	
	Util testUtil;
	
	public static ContactsPage con;
	
	public static HomePage home;
	
	LoginPage login;
	
	
	
	public ContactsPageTest(){
		
		super();
	}
	
@BeforeMethod

public void initiate() {
	
	initialization();
	
	con = new ContactsPage();
	
	login = new LoginPage();
	
	
	
	testUtil = new Util();
	
	home = login.LoginToHomePage(prop.getProperty("username"), prop.getProperty("password"));
	testUtil.switchframes();
                 con = home.clickonContactsLink();
}

         @Test(enabled = false)
         
         public void contactslabeltest() {
        	 
        	
        	 
        	 
        	 Assert.assertTrue(con.contactslabel(), " wrong contacts field please check");
         }
         
         @Test(enabled = false)
         
         public void singleselectnametest() {
        	 
      con.selectname();
     
       home.clickonContactsLink();
         }
         
         @DataProvider
       	
       	public Object [][] TestDatatesting() {
       		
       		Object data[][] = testUtil.getTestData1(sheetName);
       		
       		return data;
       	}
         
         
         
         
         
         
         
         
         
        
         @Test(priority=1 ,dataProvider="TestDatatesting")
         
      public void validateNewContactTest(String title, String FirstName, String MiddleName, String LastName ,String CompanyName) {
    	  
    	  home.newContactsLink();
    	  
    	 // con.newContacthere("Mr.", "Rahul", "Kumar", "Das","TorryHarris");
    	  
    	  con.newContacthere(title,FirstName , MiddleName, LastName, CompanyName);
      }
      
      
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
         
         @AfterMethod(enabled = false)
         
         public void teardown() {
        	 
        	 driver.quit();
         }
}

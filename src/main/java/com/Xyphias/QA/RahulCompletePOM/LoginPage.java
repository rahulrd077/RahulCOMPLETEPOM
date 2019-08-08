package com.Xyphias.QA.RahulCompletePOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@placeholder='Username']")
	
	WebElement UserName;
	
@FindBy(xpath="//input[@placeholder='Password']")
	
	WebElement Password;

@FindBy(xpath="//input[@type='submit']")

WebElement Submit;

@FindBy(xpath="//a[@class='navbar-brand']//img[@class='img-responsive']")

WebElement CRMLOGO;

//@FindBy(xpath="")

//WebElement SignUP;


  public LoginPage() {
	  
	  PageFactory.initElements(driver, this);
  }
  
  
  public HomePage LoginToHomePage(String usr, String pwd) {
	  
	  this.UserName.sendKeys(usr);
	  this.Password.sendKeys(pwd);
	  
	  this.Submit.click();
	  
	  return new HomePage();
	  
  }
  
  public String ValidateLoginPageTitle() {
	  
	  return driver.getTitle();
  }
  
   public boolean VerifyLogo() {
	   
	   return this.CRMLOGO.isDisplayed();
   }

}

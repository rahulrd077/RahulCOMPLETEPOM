package com.Xyphias.QA.RahulCompletePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage extends TestBase {
	
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	
	WebElement ContactsLabel;
	
	
@FindBy(xpath=" //tr//tr[4]//td[1]//input[1] ")
 	
	WebElement slct;                                         

@FindBy(xpath="//td[contains(text(),'Contacts')]")

WebElement ContctsLabel;

@FindBy(xpath="//td[contains(text(),'Contacts')]")

WebElement ConactsLabel;

@FindBy(xpath="//input[@id='first_name']")

WebElement FirstName;

@FindBy(id ="middle_initial")

WebElement MiddleName;

@FindBy(id ="surname")

WebElement LastName;

@FindBy(css="input[value*='Save']")

WebElement savecontactfield;


@FindBy(xpath ="//input[@name='client_lookup']")

WebElement Companyname;


public  ContactsPage() {
	PageFactory.initElements(driver,this);
	
}

public boolean contactslabel() {
	
	return this.ContactsLabel.isDisplayed();
}

////a[text()='VickyRam Das']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']


public void selectname() {
	
	this.slct.click();
}


  public void newContacthere(String title, String firstNames, String MiddleNames, String lastnames, String Companynames) {
	  
	  Select select = new Select(driver.findElement(By.xpath("//select[@name='title']")));
	  
	  select.selectByVisibleText(title);
	  
	  this.FirstName.sendKeys(firstNames);
	  
	  this.MiddleName.sendKeys(MiddleNames);
	  
	  this.LastName.sendKeys(lastnames);
	  
	  this.Companyname.sendKeys(Companynames);
	  
	  this.savecontactfield.click();
	  
  }
}





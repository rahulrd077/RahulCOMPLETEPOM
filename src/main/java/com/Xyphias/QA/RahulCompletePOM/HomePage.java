package com.Xyphias.QA.RahulCompletePOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="//td[contains(text(),'User: Rahul Das')]")
	
	WebElement user;
	
	
	@FindBy (xpath="//a[contains(text(),'Contacts')]")
	
	WebElement Contactslink;
	
@FindBy (xpath="//a[contains(text(),'Deals')]")
	
	WebElement Dealslink;

	
@FindBy (xpath="//ul[@class='mlddm']//a[contains(text(),'Companies')]")
	
	WebElement Companieslink;
	
@FindBy (xpath="//body/table/tbody/tr/td[@class='headertable']/div[@class='noprint']/div[@id='navmenu']/ul[@class='mlddm']/li[12]/a[1]")
	
	WebElement Campaignslink;

@FindBy(xpath="//a[contains(text(),'New Contact')]")

WebElement newContactslink;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyHomePageTitle() {
		
		return driver.getTitle();
	}

	
	
	public ContactsPage clickonContactsLink() {
		
		this.Contactslink.click();
		
		return new ContactsPage();
	}
	
	public boolean UserNameLabel() {
		
		return this.user.isDisplayed();
	}
	
	
	public void newContactsLink(){
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Contactslink).build().perform();
		
		//Thread.sleep(3000);
		
		this.newContactslink.click();
		
	}
}

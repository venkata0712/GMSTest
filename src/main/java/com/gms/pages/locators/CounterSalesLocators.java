package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CounterSalesLocators {

	@FindBy(xpath = "//button[text()='Create Invoice']")
	public WebElement createCSBtn;
	@FindBy(xpath = "//button[text()='Sales History']")
	public WebElement salesHistryBtn;
	@FindBy(xpath = "//button[text()='Cancelled Sales']")
	public WebElement cancelledSalesBtn;
	
	@FindBy(xpath = "//input[@type='search']")
	public WebElement searchBox ;
	@FindBy(xpath = "//table[@id='counterSalesDataTable']/tbody/tr[1]/td/button[contains(@onclick, 'editInfo')]")
	public WebElement editInfoBtn;
	@FindBy(xpath = "//table[@id='counterSalesDataTable']/tbody/tr[1]/td/button[contains(@onclick, 'redirectToSelId')]")
	public WebElement editSalesBtn;
	@FindBy(xpath = "//table[@id='counterSalesDataTable']/tbody/tr[1]/td/button[contains(@onclick, 'openDiscountModel')]")
	public WebElement discBtn;
	@FindBy(xpath = "//table[@id='counterSalesDataTable']/tbody/tr[1]/td/button[contains(@onclick, 'printInvoice') ]")
	public WebElement invoiceBtn;
	@FindBy(xpath = "//table[@id='counterSalesDataTable']/tbody/tr[1]/td/button[contains(@onclick, 'showPaymentDetails')]")
	public WebElement paymentBtn;
	@FindBy(xpath = "//table[@id='counterSalesDataTable']/tbody/tr[1]/td/button[contains(@onclick, 'deleteRecord') and (@class = 'custom_button_danger')]")
	public WebElement deleteBtn;
	@FindBy(xpath = "//table[@id='counterSalesDataTable']/tbody/tr[1]/td/button[contains(@onclick, 'deleteRecord') and (@class = 'custom_button_success')]")
	public WebElement doneBtn	;
	
	//Create Counter Sales Locators
	@FindBy(id = "HideBusinessFormDiv")
	public WebElement hideBussBtn;
	@FindBy(id = "ShowBusinessFormDiv")
	public WebElement showBussBtn;
	@FindBy(id = "select2-contact_no_counter-container")
	public WebElement contactNoCont;
	@FindBy(xpath = "//span[@class = 'select2-search select2-search--dropdown']/input")
	public WebElement inputBox;
	@FindBy(id = "select2-contact_no_counter-results")
	public WebElement contactNoRes;
	@FindBy(id = "email_id_counter")
	public WebElement emailId;
	@FindBy(id = "contact_name_counter")
	public WebElement contName;
	@FindBy(id = "address_counter")
	public WebElement address;
	
	@FindBy(xpath = "//div[@id='showhideSalesDiv']/table/tbody/tr[2]/td[1]") 
	public WebElement partNameCont;
	@FindBy(xpath = "//input[@type='search']") 
	public WebElement inputSearchBox;	 

	
	String respath1 = "//ul[@id='select2-partsName_";
	String respath2 = "-results']";
	
	 
	
	
}

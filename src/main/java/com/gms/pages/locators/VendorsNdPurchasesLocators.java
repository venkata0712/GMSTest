package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VendorsNdPurchasesLocators {
	
	@FindBy(xpath = "//button[contains(@onclick, 'newItem') and contains(@onclick, 'dnVendorsInfo')]" )
	public WebElement newBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'editItem') and contains(@onclick, 'dnVendorsInfo')]" )
	public WebElement editBtn;	
	@FindBy(xpath = "//button[contains(@onclick, 'viewDetails') and contains(@onclick, 'dnVendorsInfo')]" )
	public WebElement viewBtn;	
	@FindBy(xpath = "//button[contains(@onclick, 'deleteItem') and contains(@onclick, 'dnVendorsInfo')]" )
	public WebElement delBtn;
	
	@FindBy(id = "searchTextVendorsInfo")
	public WebElement searchBox;
	@FindBy(id = "searchClearButton")
	public WebElement refreshBtn;
	@FindBy(xpath = "//button[@id = 'searchClearButton']/following-sibling::button[text()='Search ']")
	public WebElement searchBtn;
	@FindBy(id = "searchVendorName")
	public WebElement searchVendorName;
	@FindBy(id = "searchEmailId")
	public WebElement searchVendorEmail;
	@FindBy(id = "searchVendorMobile")
	public WebElement searchVenMobile;
	@FindBy(id = "searchCity")
	public WebElement searchCity;
	
	@FindBy(id = "vndrName")
	public WebElement vendorNameInput;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='email_id']")
	public WebElement emailIdInput;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='vendor_mobile']")
	public WebElement vendorMobileInput;	
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='vendor_gstin']")
	public WebElement vendorGSTINinput;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='contact_person1']")
	public WebElement contactPerson1Input ;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='contact_number2']")
	public WebElement contactNumber2Input ;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='date_of_birth']")
	public WebElement dobInput;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='address']")
	public WebElement adressInput;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='city']")
	public WebElement cityInput;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='state']")
	public WebElement stateInput;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='bank_name']")
	public WebElement banknameInput;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='bank_branch_name']")
	public WebElement bankBrInput;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='bank_account_number']")
	public WebElement bankAcInput ;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='accountholder_name']")
	public WebElement bankAcHolderInput;
	@FindBy(xpath = "//div[@id='dlgVendorsInfo']//form[@id='formVendorsInfo']//input[@name='ifsc_code']")
	public WebElement ifscInput;
		
	@FindBy(xpath = "//button[contains(@onclick, 'saveItem') and contains(@onclick, 'VendorsInfo')]")
	public WebElement saveBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'saveItem') and contains(@onclick, 'VendorsInfo')]/parent::div/following-sibling::div/button")
	public WebElement closeBtn;
		
	@FindBy(xpath = "//div[text()='Record not created.']")
	public WebElement alreadyExistMsg;
	@FindBy(xpath ="//div[text()='Record not created.']/parent::div/parent::div/following-sibling::div/button")
	public WebElement okBtnAlreadyExist;	
	@FindBy(xpath = "//div[text()='Record added successfully.']")
	public WebElement recSavedSuccMsg;
	@FindBy(xpath = "//div[text()='Record added successfully.']/parent::div/parent::div/following-sibling::div/button")
	public WebElement okBtnRecCreated;

}

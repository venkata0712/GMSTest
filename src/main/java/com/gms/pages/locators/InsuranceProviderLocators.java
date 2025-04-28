package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsuranceProviderLocators {
	
	@FindBy(xpath = "//button[contains(text(), 'New') and contains(@onclick, 'dnInsuranceProviderInfo') ]" )
	public WebElement newBtn;
	@FindBy(xpath = "//button[contains(text(), 'Edit') and contains(@onclick, 'dnInsuranceProviderInfo') ]" )
	public WebElement editBtn;	
	@FindBy(xpath = "//button[contains(text(), 'View') and contains(@onclick, 'dnInsuranceProviderInfo') ]" )
	public WebElement viewBtn;	
	@FindBy(xpath = "//button[contains(text(), 'Delete') and contains(@onclick, 'dnInsuranceProviderInfo') ]" )
	public WebElement delBtn;
	
	@FindBy(id = "searchTextInsuranceProviderInfo")
	public WebElement searchBox;
	@FindBy(id = "searchClearButton")
	public WebElement refreshBtn;
	@FindBy(xpath = "//*[@id='toolBarInsuranceProviderInfo']/div/div/button[text()='Search ']")
	public WebElement searchBtn;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchInsuranceProviderName']")
	public WebElement searchInsProvider;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchInsuranceProviderId']")
	public WebElement searchGSTNo;
		
	@FindBy(xpath = "//label[@for='insurance_provider_name']/following-sibling::input[@name='insurance_provider_name']")
	public WebElement insProviderInput;
	@FindBy(xpath = "//label[@for='gst_number']/following-sibling::input[@name='gst_number']")
	public WebElement gstNumInput;
	@FindBy(id = "Insc_contact_number")
	public WebElement insContNoInput;
	@FindBy(id = "Insc_email_id")
	public WebElement insEmailInput;		
	@FindBy(xpath = "//input[@id='Insc_email_id']//parent::div/parent::div/parent::div/following-sibling::div/div/div/input[@name='address']")
	public WebElement addressInput;
	
	@FindBy(xpath = "//button[contains(@onclick, 'InsuranceProviderInfo') and text()='Save']")
	public WebElement saveBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'InsuranceProviderInfo') and text()='Save']//parent::div/following-sibling::div/button")
	public WebElement closeBtn;
		
	@FindBy(xpath = "//div[text()='The entered insurance provider name already exists in the records.']")
	public WebElement alreadyExistMsg;
	@FindBy(xpath ="//div[text()='The entered insurance provider name already exists in the records.']/parent::div/parent::div/following-sibling::div/button")
	public WebElement okBtnAlreadyExist;	
	@FindBy(xpath = "//div[text()='Insurance Provider Name Added Successfully.']")
	public WebElement recSavedSuccMsg;
	@FindBy(xpath = "//div[text()='Insurance Provider Name Added Successfully.']/parent::div/parent::div/following-sibling::div/button")
	public WebElement okBtnRecCreated;
	
}

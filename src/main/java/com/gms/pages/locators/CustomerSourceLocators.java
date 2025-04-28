package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerSourceLocators {
	
	@FindBy(xpath = "//button[contains(text(), 'New') and contains(@onclick, 'dnCompanyInfo') ]" )
	public WebElement newBtn;
	@FindBy(xpath = "//button[contains(text(), 'Edit') and contains(@onclick, 'dnCompanyInfo') ]" )
	public WebElement editBtn;	
	@FindBy(xpath = "//button[contains(text(), 'View') and contains(@onclick, 'dnCompanyInfo') ]" )
	public WebElement viewBtn;	
	@FindBy(xpath = "//button[contains(text(), 'Delete') and contains(@onclick, 'dnCompanyInfo') ]" )
	public WebElement delBtn;
	
	@FindBy(id = "searchTextCompanyInfo")
	public WebElement searchBox;
	@FindBy(id = "searchClearButton")
	public WebElement refreshBtn;
	@FindBy(xpath = "//*[@id='toolBarCompanyInfo']/div/div/button[text()='Search ']")
	public WebElement searchBtn;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchCompanyName']")
	public WebElement searchCatName;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchEmailId']")
	public WebElement searchEmail;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchVendorMobile']")
	public WebElement searchContactNo;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchContactPerson1']")
	public WebElement searchContPerson1;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchContactNumber2']")
	public WebElement searchContPerson2;
	
	@FindBy(xpath = "//label[@for='company_name']/following-sibling::input[@name='company_name']")
	public WebElement compNameInput;
	@FindBy(xpath = "//label[@for='gst_number']/following-sibling::input[@name='gst_number']")
	public WebElement gstNumInput;
	@FindBy(xpath = "//input[@id='vendor_mobile']//parent::div/span/input[@type='text']")
	public WebElement contNoInput;
	@FindBy(xpath = "//input[@id='contact_person1']//parent::div/span/input[@type='text']")
	public WebElement contPerInput;		
	@FindBy(xpath = "//input[@textboxname='contact_number2']//parent::div/parent::div/parent::div/following-sibling::div/div/div/input[@name='address']")
	public WebElement addressInput;
	
	@FindBy(xpath = "//button[contains(@onclick, 'saveCompanyInfo') and text()='Save']")
	public WebElement saveBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'saveCompanyInfo') and text()='Save']//parent::div/following-sibling::div/button")
	public WebElement closeBtn;
		
	@FindBy(xpath = "//div[text()='The combination of category name and category code are already exist.']")
	public WebElement alreadyExistMsg;
	@FindBy(xpath ="//div[text()='The combination of category name and category code are already exist.']/parent::div/parent::div/following-sibling::div/button")
	public WebElement okBtnAlreadyExist;	
	@FindBy(xpath = "//div[text()='Record added successfully.']")
	public WebElement recSavedSuccMsg;
	@FindBy(xpath = "//div[text()='Record added successfully.']/parent::div/parent::div/following-sibling::div/button")
	public WebElement okBtnRecCreated;
	
	@FindBy(xpath ="//*[@id='mainBody']/div[33]/div[2]/div/div/div/div/div/div/div/div[4]/button")
	public WebElement okBtnAlreadyExist1;	
}

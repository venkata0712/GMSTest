package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoiceCatLocators {

	
	@FindBy(xpath = "//button[contains(text(), 'New') and contains(@onclick, 'dnCategoryInfo') ]" )
	public WebElement newBtnInvCat;
	@FindBy(xpath = "//button[contains(text(), 'Edit') and contains(@onclick, 'dnCategoryInfo') ]" )
	public WebElement editBtnInvCat;	
	@FindBy(xpath = "//button[contains(text(), 'View') and contains(@onclick, 'dnCategoryInfo') ]" )
	public WebElement viewBtnInvCat;	
	@FindBy(xpath = "//button[contains(text(), 'Delete') and contains(@onclick, 'dnCategoryInfo') ]" )
	public WebElement delBtnInvCat;
	
	@FindBy(id = "searchTextCategoryInfo")
	public WebElement searchBox;
	@FindBy(id = "searchClearButton")
	public WebElement refreshBtn;
	@FindBy(xpath = "//*[@id='toolBarCategoryInfo']/div/div/button[text()='Search ']")
	public WebElement searchBtn;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchCatCode']")
	public WebElement searchCatName;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchCatSubCode']")
	public WebElement searchCatCode;
	
	@FindBy(xpath = "//input[@name='cat_code' and @placeholder = 'Enter Category Name']")
	public WebElement catNameInput;
	@FindBy(id = "cat_sub_code")
	public WebElement catCodeSelect;
	
	@FindBy(xpath = "//button[contains(@onclick, 'saveItem') and contains(@onclick, 'CategoryInfo')]")
	public WebElement saveBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'saveItem') and contains(@onclick, 'CategoryInfo')]/parent::div/following-sibling::div/button")
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

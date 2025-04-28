package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandwiseConsumableLocators {
	
	@FindBy(xpath = "//button[contains(text(), 'New') and contains(@onclick, 'dnConsumablesInfo') ]" )
	public WebElement newBtn;
	@FindBy(xpath = "//button[contains(text(), 'Edit') and contains(@onclick, 'dnConsumablesInfo') ]" )
	public WebElement editBtn;	
	@FindBy(xpath = "//button[contains(text(), 'View') and contains(@onclick, 'dnConsumablesInfo') ]" )
	public WebElement viewBtn;	
	@FindBy(xpath = "//button[contains(text(), 'Delete') and contains(@onclick, 'dnConsumablesInfo') ]" )
	public WebElement delBtn;
	
	@FindBy(id = "searchTextConsumablesInfo")
	public WebElement searchBox;
	@FindBy(id = "searchClearButton")
	public WebElement refreshBtn;
	@FindBy(xpath = "//*[@id='searchClearButton']/following-sibling::button[@aria-expanded='false']")
	public WebElement searchBtn;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchConsumableName']")
	public WebElement searchBrandName;
	
	@FindBy(id = "spareBrandName")
	public WebElement spareBrInput;
		
	@FindBy(xpath = "//button[contains(@onclick, 'saveItem') and contains(@onclick, 'SpareBrandsInfo')]")
	public WebElement saveBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'saveItem') and contains(@onclick, 'SpareBrandsInfo')]/parent::div/following-sibling::div/button")
	public WebElement closeBtn;
		
	@FindBy(xpath = "//div[text()='Consumables Brand Name Already Exist.']")
	public WebElement alreadyExistMsg;
	@FindBy(xpath ="//div[text()='Consumables Brand Name Already Exist.']/parent::div/parent::div/following-sibling::div/button")
	public WebElement okBtnAlreadyExist;	
	@FindBy(xpath = "//div[text()='Consumables Brand Name Added Successfully.']")
	public WebElement recSavedSuccMsg;
	@FindBy(xpath = "//div[text()='Consumables Brand Name Added Successfully.']/parent::div/parent::div/following-sibling::div/button")
	public WebElement okBtnRecCreated;
	
}

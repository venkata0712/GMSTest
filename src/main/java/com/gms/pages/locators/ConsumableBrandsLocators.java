package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsumableBrandsLocators {
	
	@FindBy(xpath = "//button[contains(text(), 'New') and contains(@onclick, 'dnSpareBrandsInfo') ]" )
	public WebElement newBtn;
	@FindBy(xpath = "//button[contains(text(), 'Edit') and contains(@onclick, 'dnSpareBrandsInfo') ]" )
	public WebElement editBtn;	
	@FindBy(xpath = "//button[contains(text(), 'View') and contains(@onclick, 'dnSpareBrandsInfo') ]" )
	public WebElement viewBtn;	
	@FindBy(xpath = "//button[contains(text(), 'Delete') and contains(@onclick, 'dnSpareBrandsInfo') ]" )
	public WebElement delBtn;
	
	@FindBy(id = "searchTextSpareBrandsInfo")
	public WebElement searchBox;
	@FindBy(id = "searchClearButton")
	public WebElement refreshBtn;
	@FindBy(xpath = "//*[@id='toolBarSpareBrandsInfo']/div/div/button[text()='Search ']")
	public WebElement searchBtn;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchSpareBrandName']")
	public WebElement searchBrandName;	
			
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
	
	@FindBy(id = "spareBrandName")
	public WebElement spBrandName;	
}

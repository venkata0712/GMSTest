package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SparesMasterLocators {
	
	@FindBy(xpath = "//button[contains(@onclick, 'SparesMaster') and contains(text(), 'New')]")
	public WebElement sparesMasterNew;
	@FindBy(xpath = "//button[contains(@onclick, 'SparesMaster') and contains(text(), 'Edit')]")
	public WebElement sparesMasterEdit;
	@FindBy(xpath = "//button[contains(@onclick, 'SparesMaster') and contains(text(), 'Delete')]")
	public WebElement sparesMasterDelete;
	@FindBy(xpath = "//button[contains(@onclick, 'SparesMaster') and contains(text(), 'View')]")
	public WebElement sparesMasterView;
	@FindBy(id = "searchTextSparesMaster")
	public WebElement searchBox;
	@FindBy(id = "searchClearButton")
	public WebElement refreshBtn;
	@FindBy(xpath = "//button[@aria-expanded='true' and text()='Search ']")
	public WebElement searchBtn;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchPartsName']")
	public WebElement searchPartsName;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchCategoryCode']")
	public WebElement searchCatCode;
	
	@FindBy(id = "masterPartsName")
	public WebElement partNameInput;
	@FindBy(id = "select2-category_code-container")
	public WebElement catCodeContainer;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	public WebElement inputSearchBox;
	@FindBy(xpath = "//button[contains(@onclick, 'SparesMaster')and text()='Save']")
	public WebElement saveBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'SparesMaster')and text()='Clear']")
	public WebElement clearBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'SparesMaster')and text()='Clear']//parent::div//following-sibling::div/button")
	public WebElement closeBtn;
	
	@FindBy(id = "category_code")
	public WebElement catCodeSel;
	
	
	

}

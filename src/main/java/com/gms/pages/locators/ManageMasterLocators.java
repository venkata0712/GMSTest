package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageMasterLocators {
	
	//Locators for Manage Spares Masters
	@FindBy(xpath = "//dIV[@class = 'col-md-6 no-padd']/button[contains(@onclick, 'newItem') and contains(@onclick, 'SparesMaster')]" )
	public WebElement newBtnSpares;
	@FindBy(xpath = "//dIV[@class = 'col-md-6 no-padd']/button[contains(@onclick, 'editItem') and contains(@onclick, 'SparesMaster')]" )
	public WebElement editBtnSpares;	
	@FindBy(xpath = "//dIV[@class = 'col-md-6 no-padd']/button[contains(@onclick, 'viewDetails') and contains(@onclick, 'SparesMaster')]" )
	public WebElement viewBtnSpares;	
	@FindBy(xpath = "//dIV[@class = 'col-md-6 no-padd']/button[contains(@onclick, 'deleteItem') and contains(@onclick, 'SparesMaster')]" )
	public WebElement delBtnSpares;
	
	@FindBy(id = "searchTextSparesMaster")
	public WebElement searchBox;
	@FindBy(id = "searchClearButton")
	public WebElement refreshBtn;
	@FindBy(xpath = "//button[@aria-expanded='false' and text()='Search '][1]")
	public WebElement searchBtn;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchPartsName']")
	public WebElement searchPartsName;
	@FindBy(xpath = "//div[@class='input-group-btn open']//a[@id='searchCategoryCode']")
	public WebElement searchCatCode;
	
	
	@FindBy(id = "masterPartsName")
	public WebElement spareNameInput;
	@FindBy(id = "select2-category_code-container")
	public WebElement catCodeCont;
	@FindBy(xpath = "//input[@class= 'select2-search__field']")
	public WebElement catCodeInput;
	@FindBy(id = "select2-category_code-results")
	public WebElement catCodeResSel;
	
	@FindBy(xpath = "//button[contains(@onclick, 'saveItem') and contains(@onclick, 'SparesMaster')]")
	public WebElement saveSparesBtn;
	@FindBy(xpath = "//button[text()='Clear']")
	public WebElement clearBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'saveItem') and contains(@onclick, 'SparesMaster')]/parent::div/following-sibling::div[2]")
	public WebElement closeSparesBtn;
	
	@FindBy(xpath = "//div[text()='The spare entered is already stored.']")
	public WebElement alreadyExistMsg;
	@FindBy(xpath ="//div[text()='The spare entered is already stored.']/parent::div/parent::div/following-sibling::div/button")
	public WebElement okBtnAlreadyExist;	
	@FindBy(xpath = "//div[text()='Record created successfully.']")
	public WebElement recSavedSuccMsg;
	@FindBy(xpath = "//div[text()='Record created successfully.']/parent::div/parent::div/following-sibling::div/button")
	public WebElement okBtnRecCreated;
	
	@FindBy(xpath = "//div[@class = 'datagrid-view2']/div[@class='datagrid-body']/table[@class = 'datagrid-btable']/tbody")
	public WebElement table;	
	@FindBy(xpath = "//table[@class = 'datagrid-btable']/tbody/tr[contains(@id, 'datagrid-row-r3-2')]")
	public WebElement tablerows;
	@FindBy(xpath = "//table[@class = 'datagrid-btable']/tbody/tr[contains(@id, 'datagrid-row-r3-2')]/td[")
	public String gettext1;
	@FindBy(xpath = "]/div")
	public String gettext2;
	
	@FindBy(xpath = "//div[@class = 'datagrid-view2']/div[@class='datagrid-body']/table[@class = 'datagrid-btable']/tbody/tr[contains(@id, 'datagrid-row-r3-")
	public String rowpath1;
	@FindBy(xpath = "')]/td[1]/div")
	public String rowpath2;
	@FindBy(xpath = "')]/td[2]/div")
	public String rowpath3;
	
	
	
	
	
	
	
	
}

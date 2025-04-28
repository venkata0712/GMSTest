package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarutiLocators {
	
	public String url1 = "https://www.marutisuzuki.com/service";
	
	
	@FindBy(xpath = "//li[@id='main-header-5']/div/a[@href='/service']")
	public WebElement servicetab;
	
	@FindBy(xpath = "//a[text()=' Search ']")
	public WebElement searchBtn;
	@FindBy(id = "select-dealer-locator")
	public WebElement dealerSel;
	@FindBy(id = "dealer-state")
	public WebElement dealerStateSel;
	
	public String dealerOption = "Maruti Authorized Service Station";
	
	

}

package com.gms.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.gms.base.Page;
import com.gms.pages.locators.HomePageLocators;

public class InsuranceDetPopPage extends Page {
	
	public HomePageLocators homePage = new HomePageLocators();
	
	public InsuranceDetPopPage() {
		
		this.homePage = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.homePage);	
	}
	
	public void clickInsDetBtn() {		
		try {
			click(homePage.insuranceDetBtn);
		} catch (Exception e) {
			click(homePage.insuranceDetBtn);
			//System.out.println(e);
		}
	}

	
	public void submitInsDetails() throws InterruptedException {
		
		Thread.sleep(1000);
		
		int n = 0;
		String sheetname = "InsuranceDetails";
//		int rowcount = excel.getRowCount(sheetname);
		
		type(homePage.insClaimNo, excel.getCellData(sheetname, 1, 0));
		
		
		}
}

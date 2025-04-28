package com.gms.pages.actions;


import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gms.base.Page;
import com.gms.pages.locators.CustomerSourceLocators;


public class ManageCustomerSourcePage extends Page {
	
	CustomerSourceLocators custSourceLoc = new CustomerSourceLocators();
	
	public ManageCustomerSourcePage() {
		this.custSourceLoc = new CustomerSourceLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.custSourceLoc);
		
	}
	
	public void addCustomerSource() throws InterruptedException {

		Thread.sleep(2000);

		int n = 0;
		String sheetname = "CustomerSource";

		int rowcount = excel.getRowCount(sheetname);

		for (n = 0; n < rowcount - 2; n++) {

			click(custSourceLoc.newBtn);

			type(custSourceLoc.compNameInput, excel.getCellData(sheetname, 0, n + 2));
			type(custSourceLoc.gstNumInput, excel.getCellData(sheetname, 1, n + 2));
			type(custSourceLoc.contNoInput, excel.getCellData(sheetname, 3, n + 2));
			type(custSourceLoc.contPerInput, excel.getCellData(sheetname, 4, n + 2));
			type(custSourceLoc.addressInput, excel.getCellData(sheetname, 6, n + 2));			
			
			click(custSourceLoc.saveBtn);

			Thread.sleep(2000);

			try {
				if (custSourceLoc.recSavedSuccMsg.isDisplayed() && custSourceLoc.recSavedSuccMsg.isEnabled()) {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.visibilityOf(custSourceLoc.okBtnRecCreated));
					click(custSourceLoc.okBtnRecCreated);
				} else {
					click(custSourceLoc.okBtnAlreadyExist);
					click(custSourceLoc.closeBtn);
				}
			} catch (Exception e) {
				click(custSourceLoc.okBtnAlreadyExist);
				click(custSourceLoc.closeBtn);
			}

		}

	}

}

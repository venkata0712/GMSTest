package com.gms.pages.actions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gms.base.Page;
import com.gms.pages.locators.InsuranceProviderLocators;

public class ManageInsuranceProvider extends Page {
	
	InsuranceProviderLocators insProviderLoc = new InsuranceProviderLocators();
	
	public ManageInsuranceProvider()  {
		
		this.insProviderLoc = new InsuranceProviderLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.insProviderLoc);
	}
	
	
	public void addNewInsProvider() throws InterruptedException {
		
		Thread.sleep(2000);

		int n = 0;
		String sheetname = "InsuranceProvider";

		int rowcount = excel.getRowCount(sheetname);

		for (n = 0; n < rowcount - 1; n++) {

			click(insProviderLoc.newBtn);

			type(insProviderLoc.insProviderInput, excel.getCellData(sheetname, 0, n + 2));
			type(insProviderLoc.gstNumInput, excel.getCellData(sheetname, 1, n + 2));
			type(insProviderLoc.insContNoInput, excel.getCellData(sheetname, 2, n + 2));
			type(insProviderLoc.insEmailInput, excel.getCellData(sheetname, 3, n + 2));
			type(insProviderLoc.addressInput, excel.getCellData(sheetname, 4, n + 2));			
			
			click(insProviderLoc.saveBtn);

			Thread.sleep(2000);

			try {
				if (insProviderLoc.recSavedSuccMsg.isDisplayed() && insProviderLoc.recSavedSuccMsg.isEnabled()) {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.visibilityOf(insProviderLoc.okBtnRecCreated));
					click(insProviderLoc.okBtnRecCreated);
				} else {
					click(insProviderLoc.okBtnAlreadyExist);
					click(insProviderLoc.closeBtn);
				}
			} catch (Exception e) {
				click(insProviderLoc.okBtnAlreadyExist);
				click(insProviderLoc.closeBtn);
			}

		}

	}

}

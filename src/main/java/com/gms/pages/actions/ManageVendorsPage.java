package com.gms.pages.actions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gms.base.Page;
import com.gms.pages.locators.VendorsNdPurchasesLocators;

public class ManageVendorsPage extends Page {

	VendorsNdPurchasesLocators vendorsLoc = new VendorsNdPurchasesLocators();

	public ManageVendorsPage() {
		this.vendorsLoc = new VendorsNdPurchasesLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.vendorsLoc);
	}

	public void addNewVendor() throws InterruptedException {

		Thread.sleep(2000);

		int n = 0;
		String sheetname = "VendorsInfo";

		int rowcount = excel.getRowCount(sheetname);

		for (n = 0; n < rowcount - 1; n++) {

			click(vendorsLoc.newBtn);
			
			type(vendorsLoc.vendorNameInput, excel.getCellData(sheetname, 0, n + 2));
			
			if (!excel.getCellData(sheetname, 1, n+2).isBlank()) {
				type(vendorsLoc.emailIdInput, excel.getCellData(sheetname, 1, n + 2));
			}
			if (!excel.getCellData(sheetname, 2, n+2).isBlank()) {
				type(vendorsLoc.vendorMobileInput, excel.getCellData(sheetname, 2, n + 2).toString());
			}
						
			type(vendorsLoc.vendorGSTINinput, excel.getCellData(sheetname, 3, n + 2));
			
			if (!excel.getCellData(sheetname, 4, n+2).isBlank()) {
				type(vendorsLoc.contactPerson1Input, excel.getCellData(sheetname, 4, n + 2));
			}
			if (!excel.getCellData(sheetname, 5, n+2).isBlank()) {
				type(vendorsLoc.contactNumber2Input, excel.getCellData(sheetname, 5, n + 2));
			}
			if (!excel.getCellData(sheetname, 6, n+2).isBlank()) {
				type(vendorsLoc.dobInput, excel.getCellData(sheetname, 6, n + 2));
			}
			if (!excel.getCellData(sheetname, 7, n+2).isBlank()) {
				type(vendorsLoc.adressInput, excel.getCellData(sheetname, 7, n + 2));
			}
			if (!excel.getCellData(sheetname, 8, n+2).isBlank()) {
				type(vendorsLoc.cityInput, excel.getCellData(sheetname, 8, n + 2));
			}
			if (!excel.getCellData(sheetname, 9, n+2).isBlank()) {
				type(vendorsLoc.stateInput, excel.getCellData(sheetname, 9, n + 2));
			}
			if (!excel.getCellData(sheetname, 10, n+2).isBlank()) {
				type(vendorsLoc.banknameInput, excel.getCellData(sheetname, 10, n + 2));
			}
			if (!excel.getCellData(sheetname, 11, n+2).isBlank()) {
				type(vendorsLoc.bankBrInput, excel.getCellData(sheetname, 11, n + 2));
			}
			if (!excel.getCellData(sheetname, 12, n+2).isBlank()) {
				type(vendorsLoc.bankAcInput, excel.getCellData(sheetname, 12, n + 2));
			}
			if (!excel.getCellData(sheetname, 13, n+2).isBlank()) {
				type(vendorsLoc.bankAcHolderInput, excel.getCellData(sheetname, 13, n + 2));
			}
			if (!excel.getCellData(sheetname, 14, n+2).isBlank()) {
				type(vendorsLoc.ifscInput, excel.getCellData(sheetname, 14, n + 2));
			}
						
			scrolltoview(vendorsLoc.saveBtn);
			
			try {
				if (vendorsLoc.saveBtn.isDisplayed() && vendorsLoc.saveBtn.isEnabled()) {
					click(vendorsLoc.saveBtn);
				} else {
					click(vendorsLoc.closeBtn);
				}

			} catch (Exception e) {

				System.out.println("Error Message :" + e);

			}
			
			try {
				if (vendorsLoc.recSavedSuccMsg.isDisplayed() && vendorsLoc.recSavedSuccMsg.isEnabled()) {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.visibilityOf(vendorsLoc.okBtnRecCreated));
					click(vendorsLoc.okBtnRecCreated);
				} else {
					click(vendorsLoc.okBtnAlreadyExist);
					click(vendorsLoc.closeBtn);
				}
			} catch (Exception e) {
				click(vendorsLoc.okBtnAlreadyExist);
				click(vendorsLoc.closeBtn);
			}
		}
	}

}

package com.gms.pages.actions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gms.base.Page;
import com.gms.pages.locators.InvoiceCatLocators;

public class ManageInvoiceCatPage extends Page {

	InvoiceCatLocators invCatLoc = new InvoiceCatLocators();

	public ManageInvoiceCatPage() {

		this.invCatLoc = new InvoiceCatLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.invCatLoc);
	}

	public void addNewBtn() {

		click(invCatLoc.newBtnInvCat);

	}

	public void addInvCat() throws InterruptedException {

		Thread.sleep(2000);

		int n = 0;
		String sheetname = "InvoicingCategory";

		int rowcount = excel.getRowCount(sheetname);

		for (n = 0; n < rowcount - 1; n++) {

			click(invCatLoc.newBtnInvCat);

			type(invCatLoc.catNameInput, excel.getCellData(sheetname, 0, n + 2));
			Select dropCatCode = new Select(invCatLoc.catCodeSelect);
			dropCatCode.selectByValue(excel.getCellData(sheetname, 1, n + 2));
			click(invCatLoc.saveBtn);
			
			Thread.sleep(2000);
//			click(invCatLoc.okBtnAlreadyExist);
//			Thread.sleep(2000);
//			click(invCatLoc.closeBtn);

			try {
				if (invCatLoc.recSavedSuccMsg.isDisplayed()&& invCatLoc.recSavedSuccMsg.isEnabled()) {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.visibilityOf(invCatLoc.okBtnRecCreated));
					click(invCatLoc.okBtnRecCreated);
				} else {
					click(invCatLoc.okBtnAlreadyExist);
					click(invCatLoc.closeBtn);
				}
			} catch (Exception e) {
				click(invCatLoc.okBtnAlreadyExist);
				click(invCatLoc.closeBtn);
			}

		}

	}
}

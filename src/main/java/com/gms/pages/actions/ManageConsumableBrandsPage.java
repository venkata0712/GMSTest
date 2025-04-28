package com.gms.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import com.gms.base.Page;
import com.gms.pages.locators.ConsumableBrandsLocators;

public class ManageConsumableBrandsPage extends Page {

	ConsumableBrandsLocators consBrandLoc = new ConsumableBrandsLocators();

	public ManageConsumableBrandsPage() {
		this.consBrandLoc = new ConsumableBrandsLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.consBrandLoc);
	}

	public void addConsumableBrands() throws InterruptedException {

		//Thread.sleep(2000);
		int n = 0;
		String sheetname = "ConsumableBrands";

		int rowcount = excel.getRowCount(sheetname);

		for (n = 0; n < rowcount - 1; n++) {

			click(consBrandLoc.newBtn);
			type(consBrandLoc.spBrandName, excel.getCellData(sheetname, 0, n + 2));			
			click(consBrandLoc.saveBtn);

			//Thread.sleep(2000);
			try {
				if (consBrandLoc.recSavedSuccMsg.isDisplayed() && consBrandLoc.recSavedSuccMsg.isEnabled()) {
					click(consBrandLoc.okBtnRecCreated);
				} else {
					click(consBrandLoc.okBtnAlreadyExist);
					click(consBrandLoc.closeBtn);
				}
			} catch (Exception e) {
				click(consBrandLoc.okBtnAlreadyExist);
				click(consBrandLoc.closeBtn);
			}
		}
	}
}

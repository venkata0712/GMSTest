package com.gms.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import com.gms.base.Page;
import com.gms.pages.locators.HomePageLocators;

public class PaymentPage extends Page{
	
	public HomePageLocators homePage = new HomePageLocators();
	
	public PaymentPage() {
		
		this.homePage = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.homePage);		
	}

	public void clickPaymentBtn() {
		
		try {
			click(homePage.paymentBtn);
		} catch (Exception e) {
			click(homePage.paymentBtn);
			//System.out.println(e);
		}
	}
	
	public void submitPayDet() throws InterruptedException {
		Thread.sleep(2000);
		
		scrolltoview(homePage.editpaymentBtn);
		click(homePage.editpaymentBtn);
		
		Thread.sleep(2000);
		
		int n = 0;
		String sheetname = "PaymentDetails";
		int rowcount = excel.getRowCount(sheetname);

		for (n = 1; n < rowcount; n++) {
			
			Thread.sleep(1000);
			homePage.cardamtedit.clear();
			homePage.cardremarksedit.clear();
			type(homePage.cardamtedit, excel.getCellData(sheetname, 0, n + 1));
			type(homePage.cardremarksedit, excel.getCellData(sheetname, 1, n + 1));
			type(homePage.cashamtedit, excel.getCellData(sheetname, 2, n + 1));
			type(homePage.cashremarksedit, excel.getCellData(sheetname, 3, n + 1));
			type(homePage.chqamtedit, excel.getCellData(sheetname, 4, n + 1));
			type(homePage.chqremarksedit, excel.getCellData(sheetname, 5, n + 1));
			type(homePage.othamtedit, excel.getCellData(sheetname, 6, n + 1));
			type(homePage.othremarksedit, excel.getCellData(sheetname, 7, n + 1));			
		
		}		
		Thread.sleep(2000);
		scrolltoview(homePage.editpaymentBtn);
		click(homePage.savePaymentBtn);
		
	}
	
}

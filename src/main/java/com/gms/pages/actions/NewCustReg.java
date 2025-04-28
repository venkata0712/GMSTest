package com.gms.pages.actions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gms.base.Page;
import com.gms.pages.locators.CustRegLocators;

public class NewCustReg extends Page {

	public CustRegLocators custReg;

	public NewCustReg() {

		this.custReg = new CustRegLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.custReg);
	}

	public void custReg(String vehNumber, String vehName, String vehCategory, String kilometers, String custName,
			String email, String mobile, String address1, String technician, String supervisor, String chasisNo,
			String engineNo, String doreg, String mfgyear) throws InterruptedException {


		wait.until(ExpectedConditions.visibilityOf(custReg.vehNoContainer));
		scrolltoview(custReg.submitBtn);

		click(custReg.vehNoContainer);
		assertTrue(custReg.vehNoContainer.isDisplayed(), "Vehicle Number field is visible");

		type(custReg.inputBox, vehNumber);
		getElement(custReg.vehNoResults, "tagName", "li", 0);

		Thread.sleep(2000);

		try {
			if (custReg.vehNameConta.getText().trim().equalsIgnoreCase("Select vehicle name")){

				click(custReg.vehTypeContainer);
				type(custReg.inputBox, vehName);
				getElement(custReg.vehTypeResults, "tagName", "li", 0);

				click(custReg.vehCatContainer);
				type(custReg.inputBox, vehCategory);
				getElement(custReg.vehCatResults, "tagName", "li", 0);

				clear(custReg.custName);
				type(custReg.custName, custName);

				clear(custReg.custemail);
				type(custReg.custemail, email);
				clear(custReg.custMobile);
				type(custReg.custMobile, mobile);
				clear(custReg.custAddr);
				type(custReg.custAddr, address1);

				clear(custReg.chasisNbr);
				type(custReg.chasisNbr, chasisNo);
				clear(custReg.engNbr);
				type(custReg.engNbr, engineNo);
				clear(custReg.regDate);
				type(custReg.regDate, doreg);
				clear(custReg.mfgYear);
				type(custReg.mfgYear, mfgyear);

			}
		} catch (Exception e) {

			System.out.println(e);
			System.out.println("Vehicle Name Container");
		}

		clear(custReg.kmDriven);
		type(custReg.kmDriven, kilometers);

		try {
			if (custReg.nbrPlateColConta.isDisplayed()) {

				click(custReg.nbrPlateColConta);
				type(custReg.inputBox, "White");
				getElement(custReg.nbrPlateColorResults, "tagName", "li", 0);

			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Number Plate Container");
		}

		Thread.sleep(1000);
//
//
//		click(custReg.techNameContainer);
//		type(custReg.inputBox, technician);
//		getElement(custReg.techNameResults, "tagName", "li", 0);
//
//		click(custReg.supNameContainer);
//		type(custReg.inputBox, supervisor);
//		getElement(custReg.supNameResults, "tagName", "li", 0);

		Thread.sleep(1000);
		click(custReg.submitBtn);

		Thread.sleep(2000);
		if (custReg.custemail == null) {			
			click(custReg.cancelEstBtn);
		} else {
			click(custReg.closePopEstBtn1);
		}

	}

}

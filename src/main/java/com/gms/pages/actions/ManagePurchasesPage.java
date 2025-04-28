package com.gms.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.gms.base.Page;
import com.gms.pages.locators.ManagePurchasesLocators;

public class ManagePurchasesPage extends Page {

	public ManagePurchasesLocators managePurchases = new ManagePurchasesLocators();
	
	
	
	@FindBy(xpath = "//*[@id='vehicleBrandData']/parent::div//input")
	public WebElement vehBrInput;
	@FindBy(id = "select2-vehicleBrandData-results")
	public WebElement vehBrRes;

	public ManagePurchasesPage() {
		this.managePurchases = new ManagePurchasesLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.managePurchases);
	}

	public void clickManagePurBtn() throws InterruptedException {
		click(managePurchases.managePurBtn);
	}

	public void clickDetailedBtn() throws InterruptedException {
		click(managePurchases.detailedBtn);
	}
	
	public void clickStandardBtn() {
		click(managePurchases.standardBtn);
	}

	public void submitInvDetails(String invNo, String invDate, String vendorName, String taxType, String tabSub, String discType, String profType) throws InterruptedException {
		
		Thread.sleep(2000);
		type(managePurchases.invNoInput, invNo);
		Thread.sleep(1000);
		type(managePurchases.invDateInput, invDate);
		Thread.sleep(1000);
		click(managePurchases.vendorContainer);
		type(managePurchases.inputBox, vendorName);		
//		for (char c : vendorName.toCharArray()) {
//			managePurchases.inputBox.sendKeys(Character.toString(c));
//		    Thread.sleep(200); // Optional delay between each keystroke
//		}	
		getElement(managePurchases.vendorList, "tagName", "li", 0);

		click(managePurchases.taxTypeContainer);
		type(managePurchases.inputBox, taxType);
		Thread.sleep(500);
		getElement(managePurchases.taxTypeList, "tagName", "li", 0);
		Thread.sleep(3000);

		click(managePurchases.okBtn);
		Thread.sleep(3000);

		click(managePurchases.taxSubContainer);
		type(managePurchases.inputBox, tabSub);
		Thread.sleep(500);
		getElement(managePurchases.taxSubList, "tagName", "li", 0);

		click(managePurchases.discTypeContainer);
		type(managePurchases.inputBox, discType);
		Thread.sleep(500);
		getElement(managePurchases.discTypeList, "tagName", "li", 0);

		click(managePurchases.profTypeContainer);
		type(managePurchases.inputBox, profType);
		Thread.sleep(500);
		getElement(managePurchases.profTypeList, "tagName", "li", 0);
		
	}

	public void clickByVehicle() {
		
		click(managePurchases.byVehicle);
	}

	public void clickByItem() {
		
		click(managePurchases.byItem);
	}
	
	/*
	 * public void selVehBrand(String vehBr1, String vehBr2) throws
	 * InterruptedException { Thread.sleep(5000);
	 * System.out.println("This is for testing");
	 * 
	 * // click(managePurchases.vehBrand); //
	 * driver.findElement(By.xpath(audipath)).click();; //
	 * click(managePurchases.vehBrand); //
	 * driver.findElement(By.xpath(bmwPath)).click(); Thread.sleep(2000);
	 * click(vehBrandInput); type(vehBrandInput, vehBr1); //
	 * driver.findElement(By.xpath(vehBrpath1+vehBr1+vehBrpath2)).click();
	 * System.out.println(driver.findElement(By.xpath(vehBrpath1+vehBr1+vehBrpath2))
	 * .getText()); getElement(vehBrandRes, "tagName", "li", 0); Thread.sleep(2000);
	 * System.out.println("This is for testing2"); click(managePurchases.vehBrand);
	 * type(managePurchases.vehBrand, vehBr2);
	 * System.out.println(driver.findElement(By.xpath(vehBrpath1+vehBr2+vehBrpath2))
	 * .getText()); //
	 * driver.findElement(By.xpath(vehBrpath1+vehBr2+vehBrpath2)).click();
	 * getElement(vehBrandRes, "tagName", "li", 0); Thread.sleep(2000);
	 * System.out.println("This is for testing3"); // click(vehBrandInput); //
	 * type(vehBrandInput, vehBr1); //
	 * driver.findElement(By.xpath(vehBrpath1+vehBr1+vehBrpath2)).click();; //
	 * Thread.sleep(2000); // click(vehBrandInput); // type(vehBrandInput, vehBr2);
	 * // driver.findElement(By.xpath(vehBrpath1+vehBr2+vehBrpath2)).click();
	 * 
	 * 
	 * 
	 * }
	 */

	
	
}

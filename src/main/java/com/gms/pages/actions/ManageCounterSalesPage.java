package com.gms.pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.gms.base.Page;
import com.gms.pages.locators.CounterSalesLocators;

public class ManageCounterSalesPage extends Page {

	CounterSalesLocators CSlocators = new CounterSalesLocators();

	public ManageCounterSalesPage() {
		this.CSlocators = new CounterSalesLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.CSlocators);
	}

	public void clickCreteInvoiceBtn() throws InterruptedException {

		Thread.sleep(1000);
		click(CSlocators.createCSBtn);
	}

	public void clickSalesHisBtn() throws InterruptedException {

		Thread.sleep(500);
		click(CSlocators.salesHistryBtn);
	}

	public void clickCancelledSalesBtn() throws InterruptedException {

		Thread.sleep(500);
		click(CSlocators.cancelledSalesBtn);
	}

	public void addCounterSale() throws InterruptedException {

		Thread.sleep(1000);
		click(CSlocators.contactNoCont);
		type(CSlocators.inputBox, "7878787878");

		List<WebElement> contNoResults = CSlocators.contactNoRes.findElements(By.tagName("li"));

		int countres = contNoResults.size();

		if (countres > 0) {
			
			try {
			contNoResults.get(0).click();
			
			}
			catch (Exception e) {
				contNoResults.get(0).click();
				//System.out.println(e);
			}
		}
		
		Actions actions = new Actions(driver);       
        actions.sendKeys(CSlocators.contactNoCont, Keys.TAB).perform();
				
		type(CSlocators.emailId, "test@testmail.com"); 			
		type(CSlocators.contName, "VenkatTest");
		type(CSlocators.address, "Madhapur, Hyderabad");
		
	
		Thread.sleep(2000);

		String sheetname = "SparesData";
		int rowcount = excel.getRowCount(sheetname);
		
		
		String sparePath = "partsName_";
		String spareResPath1 = "//a[contains(text(),'";
		String spareResPath2 = "')]";

		String qtyPath = "qty_";
		String selPricePath1 = "//div[@id='selectSpiChildPrice_";
		String selPricePath2 = "']/preceding-sibling::button";
		String selPriceTab1 = "//div[@id='selectSpiChildPrice_";
		String selPriceTab2 = "']/table/tbody/tr";
		String selPriceRes1 = "//div[@id='selectSpiChildPrice_";
		String selPriceRes2 = "']/table/tbody/tr[1]/td[2]";
		String amtPath = "amt_";
		String hsnPath = "taxValue_";
		String clsSpInputPath1 = "//*[@id='loadDataSpares']/div[";
		String clsSpInputPath2 = "]/div/div[7]/span";
				

		for (int n = 1; n <= rowcount; n++) {
			
			
			
			driver.findElement(By.id(sparePath + n)).click();
			CSlocators.inputSearchBox.sendKeys(excel.getCellData(sheetname, 0, n));
			driver.findElement(By.xpath(spareResPath1 + (excel.getCellData(sheetname, 0, n+1)) + spareResPath2)).click();
			driver.findElement(By.id(qtyPath + n)).sendKeys(excel.getCellData(sheetname, 1, n));
			driver.findElement(By.xpath(selPricePath1 + n + selPricePath2)).click();

			WebElement SelPriceTab = driver.findElement(By.xpath(selPriceTab1 + n + selPriceTab2));

			if (SelPriceTab.isEnabled()) {

				driver.findElement(By.xpath(selPriceRes1 + n + selPriceRes2)).click();

			} else {

				driver.findElement(By.id(amtPath + n)).sendKeys(excel.getCellData(sheetname, 2, n));
			}
/*
			click(home.addToListSpBtn);
			if (n == rowcount) {
				driver.findElement(By.xpath(clsSpInputPath1 + (rowcount + 1) + clsSpInputPath2)).click();
			}*/

		
		

	}

}}
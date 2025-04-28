package com.gms.pages.actions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gms.base.Page;
import com.gms.pages.locators.HomePageLocators;

public class SparesEstimationPage extends Page {

	HomePageLocators home = new HomePageLocators();

	public SparesEstimationPage() {

		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}

	
	public void clickSparesTab() throws InterruptedException {
		
		Thread.sleep(2000);
		click(home.sparesTab);
		Thread.sleep(2000);
		if (home.insClaimpop.isDisplayed()) {
			click(home.insClaimNo);
			click(home.insClaimSave);
		}
	}

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
	String clsSpInputPath1 = "//*[@id='formSpareEstimation']/div[2]/div[";
	String clsSpInputPath2 = "]/div/div[6]/span[@id='remove_field']";
	String okBtnSp = "//button[text() = 'ok']";

	public void spareDataEntry() throws EncryptedDocumentException, IOException, InterruptedException {
		
		Thread.sleep(2000);
		String sheetname = "SparesData";
		int rowcount = excel.getRowCount(sheetname);
		
		System.out.println("Spares: "+rowcount);

		for (int n = 1; n < rowcount; n++) {
			Thread.sleep(500);
			driver.findElement(By.id(sparePath + n)).sendKeys(excel.getCellData(sheetname, 0, n+1));
			Thread.sleep(1000);
			driver.findElement(
					By.xpath(spareResPath1 + (excel.getCellData(sheetname, 0, n+1)) + spareResPath2))
					.click();
			driver.findElement(By.id(qtyPath + n)).clear();
			driver.findElement(By.id(qtyPath + n)).sendKeys(excel.getCellData(sheetname, 1, n+1));
			driver.findElement(By.xpath(selPricePath1 + n + selPricePath2)).click();

			WebElement SelPriceTab = driver.findElement(By.xpath(selPriceTab1 + n + selPriceTab2));

			if (SelPriceTab.isEnabled()) {

				driver.findElement(By.xpath(selPriceRes1 + n + selPriceRes2)).click();

			} else {

				driver.findElement(By.id(amtPath + n)).sendKeys(excel.getCellData(sheetname, 2, n=1));
			}
			scrolltoview(home.addToListSpBtn);
			click(home.addToListSpBtn);
			
			if ((n+1) == (rowcount)) {
				driver.findElement(By.xpath(clsSpInputPath1 + (rowcount) + clsSpInputPath2)).click();
			}
		}
//		Thread.sleep(1000);
		scrolltoview(home.saveSpBtn);
		click(home.saveSpBtn);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(okBtnSp))).click();
		
		
		Thread.sleep(2000);
		try {
			//click(home.closeSpBtn);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(okBtnSp))).click();
		} catch (Exception e) {
			//click(home.closeSpBtn);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(okBtnSp))).click();
			e.printStackTrace();
		}
	

	}

}

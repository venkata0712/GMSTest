package com.gms.pages.actions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gms.base.Page;
import com.gms.pages.locators.ManagePurchasesLocators;

public class PartsEntryPage extends Page {

	ManagePurchasesLocators managePurchases = new ManagePurchasesLocators();
	String vehPath0 = "//*[@id='select2-vehicleBrandData";
	String vehPath1 = "-results']/li[contains(text(),'";
	String vehPath2 = "')]";

	String selectPath = "select2-";
	String typePath = "type";
	String containerPath = "-container";
	String resultsPath = "-results";

	String selVehBrandPath = "vehicleBrandData";
	String vehBrandPath = "vehicleBrandData";
	String audipath = "//li[text()='Audi']";
	String bmwPath = "//li[text()='BMW']";

	String catPath = "category_code";
	String partNoPath = "partNo";
	String batchPath = "batchNo";
	String sparePath = "spareNameDt";
	String sparePath1 = "genericSpareNameDt";
	String brandPath = "proBrandName";
	String hsnPath = "hsnNo";
	String qtyPath = "qtyIn";
	String ratePath = "purchasePrice";
	String discPath = "margin";
	String marginPath = "product_margin_value";
	String locatorPath = "locator";
	String delBtPath1 = "//*[@class = 'divBox bc|";
	String delBtPath2 = "']/button";
	String partNoResPath = "suggestionDiv";
	String okBtnxpath = "//*[@id='mainBody']/div[32]/div[2]/div/div/div/div/div/div/div/div[4]/button";
	
	String procatxpath1 = "//li[@class='select2-results__option' and text()='";
	String procatxpath2 = "']";

	@FindBy(xpath = "//input[@placeholder = 'Select Vehicle Brand']")
	public WebElement vehBranInput;

	public PartsEntryPage() {

		this.managePurchases = new ManagePurchasesLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.managePurchases);
	}

	public void partsEntryByVehicle() throws IOException, InterruptedException {

		int n = 0;
		String sheetname = "PartsByVehTest";
		//int rowcount = excel.getRowCount(sheetname);
		int rowcount = 4;

		for (n = 0; n < rowcount-1; n++) {

			WebElement prodTypeContainer = driver.findElement(By.id(selectPath + typePath + n + containerPath));
			scrolltoview(prodTypeContainer);
			click(prodTypeContainer);
			type(managePurchases.inputBox, excel.getCellData(sheetname, 0, n+2));
			WebElement proTypeRes = driver.findElement(By.id(selectPath + typePath + n + resultsPath));
			Thread.sleep(500);
			getElement(proTypeRes, "tagName", "li", 0);
			
			WebElement prodCatContainer = driver.findElement(By.id(selectPath + catPath + n + containerPath));
			Thread.sleep(1000);			
			try {
				click(prodCatContainer);
			} catch (Exception e) {
				click(prodCatContainer);
				System.out.println(e);
			}			
			
			type(managePurchases.inputBox, excel.getCellData(sheetname, 1, n+2));
			WebElement proCatRes = driver.findElement(By.id(selectPath + catPath + n + resultsPath));
			Thread.sleep(500);
			getElement(proCatRes, "tagName", "li", 0);

			WebElement partNo = driver.findElement(By.id(partNoPath + n));
			//type(partNo, excel.getCellData(sheetname, 2, n+2));			
			String text1 = excel.getCellData(sheetname, 2, n+2);			
			for (char c : text1.toCharArray()) {
			    partNo.sendKeys(Character.toString(c));
			    Thread.sleep(200); // Optional delay between each keystroke
			}	

			Thread.sleep(2000);
			WebElement partNoResults = driver.findElement(By.id(partNoResPath + n));
			//wait.until(ExpectedConditions.visibilityOf(partNoResults));
			
			try {
				if (partNoResults.isDisplayed()) {
					Thread.sleep(1000);
					getElement(partNoResults, "tagName", "li", 0);
				} else {
					WebElement spareContainer = driver.findElement(By.id(selectPath + sparePath + n + containerPath));
					click(spareContainer);
					type(managePurchases.inputBox, excel.getCellData(sheetname, 3, n+2));
					WebElement spareRes = driver.findElement(By.id(selectPath + sparePath + n + resultsPath));
					Thread.sleep(500);
					getElement(spareRes, "tagName", "li", 0);

					WebElement brandContainer = driver.findElement(By.id(selectPath + brandPath + n + containerPath));
					click(brandContainer);
					//type(managePurchases.inputBox, excel.getCellData(sheetname, 4, n+2));
					for (char c : excel.getCellData(sheetname, 4, n+2).toCharArray()) {
						managePurchases.inputBox.sendKeys(Character.toString(c));
					    Thread.sleep(200); // Optional delay between each keystroke
					}						
					WebElement brandRes = driver.findElement(By.id(selectPath + brandPath + n + resultsPath));
					Thread.sleep(500);
					getElement(brandRes, "tagName", "li", 0);

					WebElement hsnContainer = driver.findElement(By.id(selectPath + hsnPath + n + containerPath));
					click(hsnContainer);
					type(managePurchases.inputBox, excel.getCellData(sheetname, 5, n+2));
					WebElement hsnRes = driver.findElement(By.id(selectPath + hsnPath + n + resultsPath));
					Thread.sleep(500);
					getElement(hsnRes, "tagName", "li", 0);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			Thread.sleep(500);
			WebElement qty = driver.findElement(By.id(qtyPath + n));
			clear(qty);
			type(qty, excel.getCellData(sheetname, 6, n+2));

			WebElement rate = driver.findElement(By.id(ratePath + n));
			clear(rate);
			type(rate, excel.getCellData(sheetname, 7, n+2));
			WebElement discount = driver.findElement(By.id(discPath + n));
			clear(discount);
			type(discount, excel.getCellData(sheetname, 8, n+2));
			WebElement profit = driver.findElement(By.id(marginPath + n));
			clear(profit);
			type(profit, excel.getCellData(sheetname, 9, n+2));

//			WebElement locator = driver.findElement(By.id(locatorPath+n));
//			type(locator, excel.getCellData(sheetname, 10, n+2));
			Thread.sleep(500);
			scrolltoview(managePurchases.addMoreBtn);
			click(managePurchases.addMoreBtn);

		}
		Thread.sleep(500);
		WebElement delBtn = driver.findElement(By.xpath(delBtPath1 + (rowcount-1) + delBtPath2));
		click(delBtn);
		Thread.sleep(500);
		scrolltoview(managePurchases.savenUpdateBtn);
		click(managePurchases.savenUpdateBtn);		
		WebElement okBtnSave = driver.findElement(By.xpath(okBtnxpath));
		click(okBtnSave);
//		Thread.sleep(500);
//		WebElement okBtn = driver.findElement(By.xpath("//button[text()='ok']"));
//		click(okBtn);
	}

	public void partsEntryByItem() throws IOException, InterruptedException {

		int n = 0;
		String sheetname = "PartsByItemTest";
		int rowcount = excel.getRowCount(sheetname);
		
		System.out.println("Row Count : "+ rowcount);

		for (n = 0; n < (rowcount-1); n++) {

			String xpath1 = selectPath + typePath + n + resultsPath;
			WebElement prodTypeContainer = driver.findElement(By.id(selectPath + typePath + n + containerPath));
			scrolltoview(prodTypeContainer);
			click(prodTypeContainer);
			type(managePurchases.inputBox, excel.getCellData(sheetname, 0, n+2));
			WebElement proTypeRes = driver.findElement(By.id(selectPath + typePath + n + resultsPath));
			Thread.sleep(500);
			getElement(proTypeRes, "tagName", "li", 0);

			WebElement prodCatContainer = driver.findElement(By.id(selectPath + catPath + n + containerPath));
						
			Thread.sleep(1000);			
			
			try {
				click(prodCatContainer);
			} catch (Exception e) {
				scrolltoview(prodCatContainer);
				click(prodCatContainer);
			}
			
		
			System.out.println("Test: " + excel.getCellData(sheetname, 1, n+2));
			type(managePurchases.inputBox, excel.getCellData(sheetname, 1, n+2));
			WebElement proCatRes = driver.findElement(By.id(selectPath + catPath + n + resultsPath));
			Thread.sleep(500);
			getElement(proCatRes, "tagName", "li", 0);

			WebElement partNo = driver.findElement(By.id(partNoPath + n));
			String text1 = excel.getCellData(sheetname, 2, n+2);
			
			for (char c : text1.toCharArray()) {
			    partNo.sendKeys(Character.toString(c));
			    Thread.sleep(200); // Optional delay between each keystroke
			}							

			WebElement partNoResults = driver.findElement(By.id(partNoResPath + n));
			//wait.until(ExpectedConditions.visibilityOf(partNoResults));
			
			try {
				if (partNoResults.isDisplayed()) {
					Thread.sleep(1000);
					getElement(partNoResults, "tagName", "li", 0);//					
				} else {
					Thread.sleep(500);
					WebElement spareContainer = driver.findElement(By.id(selectPath + sparePath + n + containerPath));
					click(spareContainer);
					Thread.sleep(500);
					type(managePurchases.inputBox, excel.getCellData(sheetname, 4, n+2));
					WebElement spareRes = driver.findElement(By.id(selectPath + sparePath + n + resultsPath));
					Thread.sleep(500);
					getElement(spareRes, "tagName", "li", 0);

					WebElement brandContainer = driver.findElement(By.id(selectPath + brandPath + n + containerPath));
					click(brandContainer);
					Thread.sleep(500);
					type(managePurchases.inputBox, excel.getCellData(sheetname, 5, n+2));
					WebElement brandRes = driver.findElement(By.id(selectPath + brandPath + n + resultsPath));
					Thread.sleep(500);
					getElement(brandRes, "tagName", "li", 0);

					Thread.sleep(500);
					String vehicle1 = excel.getCellData(sheetname, 6, n+2);
					String vehicle2 = excel.getCellData(sheetname, 7, n+2);
					WebElement vehicleSel = driver.findElement(By
							.xpath("//*[@id='spareVehicleDiv" + n + "']/div/div[1]/span[1]/span[1]/span/ul/li/input"));
					
					type(vehicleSel, vehicle1);
					System.out.println(vehPath0 + n + vehPath1 + vehicle1 + vehPath2);
					Thread.sleep(2000);
					driver.findElement(By.xpath(vehPath0 + n + vehPath1 + vehicle1 + vehPath2)).click();
					type(vehicleSel, vehicle2);
					System.out.println(vehPath0 + n + vehPath1 + vehicle2 + vehPath2);
					Thread.sleep(500);
					driver.findElement(By.xpath(vehPath0 + n + vehPath1 + vehicle2 + vehPath2)).click();

					WebElement hsnContainer = driver.findElement(By.id(selectPath + hsnPath + n + containerPath));
					click(hsnContainer);
					Thread.sleep(500);
					type(managePurchases.inputBox, excel.getCellData(sheetname, 10, n+2));
					WebElement hsnRes = driver.findElement(By.id(selectPath + hsnPath + n + resultsPath));
					Thread.sleep(500);
					getElement(hsnRes, "tagName", "li", 0);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			Thread.sleep(500);
			WebElement qty = driver.findElement(By.id(qtyPath + n));
			clear(qty);
			type(qty, excel.getCellData(sheetname, 11, n+2));

			WebElement rate = driver.findElement(By.id(ratePath + n));
			clear(rate);
			type(rate, excel.getCellData(sheetname, 12, n+2));
			WebElement discount = driver.findElement(By.id(discPath + n));
			clear(discount);
			type(discount, excel.getCellData(sheetname, 13, n+2));
			WebElement profit = driver.findElement(By.id(marginPath + n));
			clear(profit);
			type(profit, excel.getCellData(sheetname, 14, n+2));

			WebElement locator = driver.findElement(By.id(locatorPath + n));
			clear(locator);
			type(locator, excel.getCellData(sheetname, 15, n+2));
			Thread.sleep(500);
			WebElement addMoreBtn = driver
					.findElement(By.xpath("//*[@id='managePurchaseSpareFrm']/div[3]/div/div[1]/button"));
			scrolltoview(addMoreBtn);
			click(addMoreBtn);

		}
		Thread.sleep(500);
		WebElement delBtn = driver.findElement(By.xpath(delBtPath1 + (rowcount-1) + delBtPath2));
		click(delBtn);
		Thread.sleep(1000);
		WebElement saveBtn = driver.findElement(By.id("miscsaveFormID"));
		scrolltoview(saveBtn);
		//click(saveBtn);
		
		WebElement okBtnSave = driver.findElement(By.xpath(okBtnxpath));
		click(okBtnSave);
		
//		WebElement okBtn = driver.findElement(By.xpath("//button[text()='ok']"));
//		click(okBtn);
	}

	public void selVehBrand() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(2000);		
		String sheetname = "PartsByVehTest";
		
		WebElement vehBrandContainer = driver
				.findElement(By.xpath("//*[@id='displayVehicleInput']/div[1]/span[1]/span[1]/span/ul"));
		WebElement vehBrandInput = driver.findElement(By.xpath("//input[@placeholder='Select Vehicle Model']"));
		vehBrandContainer.click();
		vehBrandInput.sendKeys(excel.getCellData(sheetname, 12, 2));
		
		WebElement vehBrandRes = driver.findElement(By.id("select2-vehicleBrandData-results"));
		getElement(vehBrandRes, "tagName", "li", 0);
		
		Thread.sleep(2000);
		vehBrandInput.click();
		vehBrandInput.sendKeys(excel.getCellData(sheetname, 13, 2));
		getElement(vehBrandRes, "tagName", "li", 0);
		
	}
	
	public void genericPartsbyItem() throws InterruptedException {
		
		int n = 0;
		String sheetname = "GenericSpares";
		int rowcount = excel.getRowCount(sheetname);
		
		//System.out.println("Row Count : "+ rowcount);

		for (n = 0; n < (rowcount-1); n++) {

			String xpath1 = selectPath + typePath + n + resultsPath;
			WebElement prodTypeContainer = driver.findElement(By.id(selectPath + typePath + n + containerPath));
			scrolltoview(prodTypeContainer);
			click(prodTypeContainer);
			type(managePurchases.inputBox, excel.getCellData(sheetname, 0, n+2));
			WebElement proTypeRes = driver.findElement(By.id(selectPath + typePath + n + resultsPath));
			Thread.sleep(500);
			getElement(proTypeRes, "tagName", "li", 0);

			WebElement prodCatContainer = driver.findElement(By.id(selectPath + catPath + n + containerPath));
						
			Thread.sleep(1000);			
			
			try {
				click(prodCatContainer);
			} catch (Exception e) {
				scrolltoview(prodCatContainer);
				click(prodCatContainer);
			}
			
		
			//System.out.println("Test: " + excel.getCellData(sheetname, 1, n+2));
			type(managePurchases.inputBox, excel.getCellData(sheetname, 1, n+2));
			WebElement proCatRes = driver.findElement(By.id(selectPath + catPath + n + resultsPath));
			
			try {
				Thread.sleep(1000);
				getElement(proCatRes, "tagName", "li", 0);
			}
			catch(Exception e) {
				Thread.sleep(1000);
				getElement(proCatRes, "tagName", "li", 0);
			}

//			String procatpath = procatxpath1+excel.getCellData(sheetname, 1, n+2)+procatxpath2;
//			
//			
//			try {
//				Thread.sleep(1000);
//				getElement(proCatRes, "xpath", procatpath, 0);
//			}
//			catch(Exception e) {
//				Thread.sleep(1000);
//				getElement(proCatRes, "xpath", procatpath, 0);
//			}

			WebElement partNo = driver.findElement(By.id(partNoPath + n));
			String text1 = excel.getCellData(sheetname, 2, n+2);
			
			for (char c : text1.toCharArray()) {
			    partNo.sendKeys(Character.toString(c));
			    Thread.sleep(200); // Optional delay between each keystroke
			}							

			WebElement partNoResults = driver.findElement(By.id(partNoResPath + n));
			//wait.until(ExpectedConditions.visibilityOf(partNoResults));
			
			try {
				if (partNoResults.isDisplayed()) {
					Thread.sleep(1000);
					getElement(partNoResults, "tagName", "li", 0);//					
				} else {
					Thread.sleep(500);
					System.out.println(selectPath + sparePath + n + containerPath);
					WebElement spareContainer = driver.findElement(By.id(selectPath + sparePath1 + n + containerPath));
					click(spareContainer);
					Thread.sleep(500);
					type(managePurchases.inputBox, excel.getCellData(sheetname, 3, n+2));
					WebElement spareRes = driver.findElement(By.id(selectPath + sparePath1 + n + resultsPath));
					Thread.sleep(500);
					//getElement(spareRes, "tagName", "li", 0);
					String spareNamepath = procatxpath1+excel.getCellData(sheetname, 3, n+2)+procatxpath2;
					System.out.println(spareNamepath);
					getElement(spareRes, "xpath", spareNamepath, 0);

					WebElement brandContainer = driver.findElement(By.id(selectPath + brandPath + n + containerPath));
					click(brandContainer);
					Thread.sleep(500);
					type(managePurchases.inputBox, excel.getCellData(sheetname, 4, n+2));
					WebElement brandRes = driver.findElement(By.id(selectPath + brandPath + n + resultsPath));
					Thread.sleep(500);
					getElement(brandRes, "tagName", "li", 0);

					WebElement hsnContainer = driver.findElement(By.id(selectPath + hsnPath + n + containerPath));
					click(hsnContainer);
					Thread.sleep(500);
					type(managePurchases.inputBox, excel.getCellData(sheetname, 5, n+2));
					WebElement hsnRes = driver.findElement(By.id(selectPath + hsnPath + n + resultsPath));
					Thread.sleep(500);
					getElement(hsnRes, "tagName", "li", 0);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			Thread.sleep(500);
			WebElement qty = driver.findElement(By.id(qtyPath + n));
			clear(qty);
			type(qty, excel.getCellData(sheetname, 6, n+2));

			WebElement rate = driver.findElement(By.id(ratePath + n));
			clear(rate);
			type(rate, excel.getCellData(sheetname, 7, n+2));
			WebElement discount = driver.findElement(By.id(discPath + n));
			clear(discount);
			type(discount, excel.getCellData(sheetname, 8, n+2));
			WebElement profit = driver.findElement(By.id(marginPath + n));
			clear(profit);
			type(profit, excel.getCellData(sheetname, 9, n+2));

			WebElement locator = driver.findElement(By.id(locatorPath + n));
			clear(locator);
			type(locator, excel.getCellData(sheetname, 10, n+2));
			Thread.sleep(500);
			WebElement addMoreBtn = driver
					.findElement(By.xpath("//*[@id='managePurchaseSpareFrm']/div[3]/div/div[1]/button"));
			scrolltoview(addMoreBtn);
			click(addMoreBtn);

		}
		Thread.sleep(500);
		WebElement delBtn = driver.findElement(By.xpath(delBtPath1 + (rowcount-1) + delBtPath2));
		click(delBtn);
		Thread.sleep(1000);
		WebElement saveBtn = driver.findElement(By.id("miscsaveFormID"));
		scrolltoview(saveBtn);
		click(saveBtn);
		
		WebElement okBtnSave = driver.findElement(By.xpath(okBtnxpath));
		click(okBtnSave);
		
		WebElement okBtn = driver.findElement(By.xpath("//button[text()='ok']"));
		click(okBtn);
		
	}

}

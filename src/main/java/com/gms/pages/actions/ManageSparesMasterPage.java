package com.gms.pages.actions;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

import com.gms.base.Page;
import com.gms.pages.locators.ManageMasterLocators;

public class ManageSparesMasterPage extends Page {

	ManageMasterLocators managemasters = new ManageMasterLocators();

	public ManageSparesMasterPage() {

		this.managemasters = new ManageMasterLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.managemasters);
	}

	public void addNewBtn() {

		click(managemasters.newBtnSpares);

	}

	public void searchSpares() throws InterruptedException {

		Thread.sleep(2000);

		int n = 0;
		String sheetname = "SparesMaster";
		//int rowcount = excel.getRowCount(sheetname);
		Thread.sleep(500);
		click(managemasters.searchBox);
		type(managemasters.searchBox, excel.getCellData(sheetname, 0, n + 2));
		click(managemasters.searchBtn);
		click(managemasters.searchPartsName);

		List<WebElement> elements = managemasters.tablerows.findElements(By.tagName("tr"));

		int total_rows = elements.size();

		if (total_rows > 0) {

			for (int i = 1; i <= total_rows; i++) {

				WebElement tdElement = driver
						.findElement(By.xpath(managemasters.gettext1 + i + managemasters.gettext2));
				String tdText = tdElement.getText();
				System.out.println(tdText);				
			}
		} else {

			System.out.println("No rows found");
		}

	}

	public void addNewSpare() throws InterruptedException {
		
		Thread.sleep(2000);


		int n = 0;
		String sheetname = "SparesMaster";

		int rowcount = excel.getRowCount(sheetname);

		for (n = 0; n < 1; n++) {
			
			//click(managemasters.newBtnSpares);

			type(managemasters.spareNameInput, excel.getCellData(sheetname, 0, n + 2));
			click(managemasters.catCodeCont);
			type(managemasters.catCodeInput, excel.getCellData(sheetname, 1, n + 2));
			getElement(managemasters.catCodeResSel, "tagName", "li", 0);
			click(managemasters.saveSparesBtn);

			Thread.sleep(1000);
//
//			try {
//				if (managemasters.okBtnAlreadyExist.isDisplayed() && managemasters.okBtnAlreadyExist.isEnabled()) {
//					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//					wait.until(ExpectedConditions.visibilityOf(managemasters.okBtnAlreadyExist));
//					click(managemasters.okBtnAlreadyExist);
//					click(managemasters.closeSparesBtn);
//				} else {
//					click(managemasters.okBtnRecCreated);
//				}
//
//			} catch (Exception e) {
//				click(managemasters.okBtnRecCreated);
//			}	

			
			wait.until(ExpectedConditions.elementToBeClickable(managemasters.okBtnRecCreated));
			assertTrue(managemasters.okBtnRecCreated.isDisplayed(), "Wrong alert displayed");

			try {
				if(managemasters.okBtnRecCreated.isDisplayed()) {
					click(managemasters.okBtnRecCreated);
				}}
			catch (Exception e) {
				click(managemasters.okBtnRecCreated);
				System.out.println(e);
			}
		}
	}
	
	public void addexistingSpare() throws InterruptedException {
		
		Thread.sleep(2000);
		SoftAssert softAssert = new SoftAssert();

		int n = 0;
		String sheetname = "SparesMaster";

		int rowcount = excel.getRowCount(sheetname);

		for (n = 1; n < 2; n++) {

			//wait.until(ExpectedConditions.elementToBeClickable(managemasters.newBtnSpares));
			//click(managemasters.newBtnSpares);

			type(managemasters.spareNameInput, excel.getCellData(sheetname, 0, n + 2));
			click(managemasters.catCodeCont);
			type(managemasters.catCodeInput, excel.getCellData(sheetname, 1, n + 2));
			getElement(managemasters.catCodeResSel, "tagName", "li", 0);
			click(managemasters.saveSparesBtn);

			Thread.sleep(1000);		
			softAssert.assertTrue(managemasters.alreadyExistMsg.isDisplayed(), "Wrong alert displayed");

			try {
				if(managemasters.okBtnRecCreated.isDisplayed()) {
					click(managemasters.okBtnAlreadyExist);
					click(managemasters.closeSparesBtn);
				}}
			catch (Exception e) {
				click(managemasters.okBtnAlreadyExist);
				click(managemasters.closeSparesBtn);
				System.out.println(e);
			}
			softAssert.assertTrue(!managemasters.spareNameInput.isDisplayed(), "Add New Spare popup is not closed.");
		}
	}
}


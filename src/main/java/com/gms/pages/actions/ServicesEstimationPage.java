package com.gms.pages.actions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gms.base.Page;
import com.gms.pages.locators.HomePageLocators;

public class ServicesEstimationPage extends Page {

	HomePageLocators home = new HomePageLocators();
	

	public ServicesEstimationPage() {

		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}


	public void clickServicesTab() throws InterruptedException {
		
		Thread.sleep(2000);
		click(home.servicesTab);	
					
		Thread.sleep(2000);
		if (home.insClaimpop.isDisplayed()) {
			click(home.insClaimNo);
			click(home.insClaimSave);
		}
	}

	String servicePath = "serviceCode_";
	String serviceResPath1 = "//a[text()='";
	String serviceResPath2 = "']";

	String qtyPath = "qtys_";
	String amtPath = "amts_";

	String hsnPath = "serviceTaxValue_";

	String clsSrInputPath1 = "//*[@id=\"loadDataServices\"]/div[";
	String clsSrInputPath2 = "]/div/div[6]/span";
	String okBtnSr = "//button[text()='ok']";

	public void serviceDataEntry() throws EncryptedDocumentException, IOException, InterruptedException {
		
	
		String sheetname = "ServicesData";
		int rowcount = excel.getRowCount(sheetname);
		System.out.println("Services: "+rowcount);

		for (int n = 1; n < rowcount; n++) {
			Thread.sleep(500);
			driver.findElement(By.id(servicePath + n)).sendKeys(excel.getCellData(sheetname, 0, n+1));
			Thread.sleep(1000);
			driver.findElement(
					By.xpath(serviceResPath1 + (excel.getCellData(sheetname, 0, n+1)) + serviceResPath2))
					.click();

//			driver.findElement(By.id(qtyPath + n)).clear();
//			Thread.sleep(500);
//			driver.findElement(By.id(qtyPath + n)).sendKeys(excel.getCellData(sheetname, 1, n+1));
//
//			String abc = driver.findElement(By.id(amtPath + n)).getAttribute("Value");
//			System.out.println(abc);
//
//			WebElement jcSparesHSNSpan2b = driver.findElement(By.id(hsnPath + n));
//			List<WebElement> jcSpareshsnInput2b = jcSparesHSNSpan2b.findElements(By.tagName("option"));
//			String jcsparesHSN2b = jcSpareshsnInput2b.get(0).getText();
//			System.out.println(jcsparesHSN2b);
//
//			if (jcsparesHSN2b.equals("Select Value")) {
//				driver.findElement(By.id(hsnPath + n)).click();
//				driver.findElement(By.xpath("//option[contains(.,'GST On Services')]")).click();
//			}

			// to click on add item button
			scrolltoview(home.addToListSrBtn);
			click(home.addToListSrBtn);

			if ((n+1) == rowcount) {
				driver.findElement(By.xpath(clsSrInputPath1 + (rowcount) + clsSrInputPath2)).click();
			}

		}

		scrolltoview(home.saveSrBtn);
		click(home.saveSrBtn);
		
		Thread.sleep(2000);
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(okBtnSr))).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(okBtnSr))).click();
			e.printStackTrace();
		}
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(home.closeSrBtn)).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(home.closeSrBtn)).click();
			e.printStackTrace();
		}
		

	}

}

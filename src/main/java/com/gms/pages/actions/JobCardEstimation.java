package com.gms.pages.actions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.gms.base.Page;
import com.gms.pages.locators.HomePageLocators;

public class JobCardEstimation extends Page {

	public HomePageLocators home;
	
	public JobCardEstimation() {
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}

	public void clickEstimateBtn() throws InterruptedException {
		click(home.estimationBtn);
	}

	public void clickJobCardTab() throws InterruptedException {		
		click(home.jobcardTab);
	}

	String jcCompPath1 = "jobCard_";
	String clsCompInputPath1 = "//*[@id=\"formJobCard\"]/div[3]/div[";
	String clsCompInputPath2 = "]/div/div[2]/div[4]/span[@id='remove_fieldJob']";

	public void jobCardDataEntry() throws InterruptedException, EncryptedDocumentException, IOException {
		
		String sheetname = "JobCardData";
		int rowcount = excel.getRowCount(sheetname);

		for (int n = 1; n < (rowcount+1); n++) {
			
			driver.findElement(By.id(jcCompPath1+n)).sendKeys(excel.getCellData(sheetname, 0, n+1));					
			if(n==rowcount) {
				driver.findElement(By.xpath(clsCompInputPath1+(rowcount)+clsCompInputPath2)).click();
			}
			else {
				scrolltoview(home.addToListJcBtn);
				click(home.addToListJcBtn);
			}
		}
		Thread.sleep(2000);
		scrolltoview(home.saveJcBtn);
		click(home.saveJcBtn);
//		Thread.sleep(2000);
//		click(home.closeJcBtn);
		
	}

}

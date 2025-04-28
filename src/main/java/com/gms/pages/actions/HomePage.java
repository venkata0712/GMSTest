package com.gms.pages.actions;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gms.base.Page;
import com.gms.pages.locators.HomePageLocators;

public class HomePage extends Page {
	public HomePageLocators homepage;

	public HomePage() {
		this.homepage = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.homepage);
	}

	public void clickNewCustRegTab() throws InterruptedException {
		Thread.sleep(1000);
		click(homepage.newCustRegTab);
		//assertTrue(homepage.newCustRegTab.isDisplayed(), "New Customer Registration tab is displayed.");
	}

	public void clickMenuTab() throws InterruptedException {
		Thread.sleep(5000);
		click(homepage.menuButton);

	}

	public void clickIMmenu() {
		click(homepage.imMenu);
	}

	public void searchJc(String vehnum) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("searchServicetable")).clear();
		driver.findElement(By.id("searchServicetable")).sendKeys(vehnum, Keys.ENTER);
	}

	public void clickEstimationBtn() throws InterruptedException {
		Thread.sleep(1000);
		try {			
			wait.until(ExpectedConditions.elementToBeClickable(homepage.estimationBtn)).click();
		} catch (Exception e) {			
			wait.until(ExpectedConditions.elementToBeClickable(homepage.estimationBtn)).click();
			e.printStackTrace();
		}
		
		assertTrue(homepage.jobcardTab.isDisplayed(), "Estimation button click failed");		
	}

	public void clickManageSpares() throws InterruptedException {
		Thread.sleep(1000);
		click(homepage.sparesMasterMenu);
	}

	public void clickManageInvCat() throws InterruptedException {
		Thread.sleep(1000);
		click(homepage.invCategoryInfoMenu);
	}

	public void clickManageConsumableBrands() throws InterruptedException {
		Thread.sleep(1000);
		click(homepage.consumableBrandsMenu);
	}

	public void clickManageBrandwiseConsumables() throws InterruptedException {
		Thread.sleep(500);
		click(homepage.brandwiseConsumalesMenu);
	}

	public void clickManageCustomerSource() throws InterruptedException {
		Thread.sleep(500);
		click(homepage.custSourceMenu);
	}

	public void clickInsuranceProvider() throws InterruptedException {
		Thread.sleep(500);
		click(homepage.insProviderMenu);
	}
	
	public void clickManageVendorsNdPurchasesMenu() throws InterruptedException {
		Thread.sleep(500);
		click(homepage.vendorNPurchasesMenu);
	}
	
	public void clickManageCounterSalesMenu() throws InterruptedException {		
		Thread.sleep(1000);
		click(homepage.counterSalesMenu);
	}

}

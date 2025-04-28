package com.gms.pages.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.gms.base.Page;
import com.gms.pages.locators.GenerateInvoiceLocators;

public class GenerateInvPage extends Page {

	public GenerateInvoiceLocators genInvLocators = new GenerateInvoiceLocators();

	public GenerateInvPage() {		
		this.genInvLocators = new GenerateInvoiceLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.genInvLocators);		
	}

	public void clickInvoiceBtn() throws InterruptedException {	
		Thread.sleep(5000);
				
		try {
			click(genInvLocators.invBtnRed);
		
		} catch (Exception e) {
			click(genInvLocators.invBtnRed);
			System.out.println(e);
		}
	}

	public void generateProfromaInvoice() throws InterruptedException {		

		Thread.sleep(1000);
		try {
			click(genInvLocators.proformaInvBtn); 
			click(genInvLocators.closePrintInvBtn1);
			}
		catch (Exception e) {			
			Assert.fail("Generate Standard Invoice Test Failed");
		}				
	}
	
	public void generateTaxInvoice() throws InterruptedException {		
		
		Thread.sleep(5000);
		try {
			Select taxType = new Select(genInvLocators.taxTypeSel);
			taxType.selectByVisibleText("SGST/UGST");
			click(genInvLocators.taxInvBtn); 
			click(genInvLocators.closePrintInvBtn1);
			}
		catch (Exception e) {	
			System.out.println(e);
			Assert.fail("Generate Tax Invoice Test Failed");
		}
	}
	
	public void changeInvoice() throws InterruptedException {
		Thread.sleep(2000);
		try {
			click(genInvLocators.viewMoreBtn);
			Thread.sleep(1000);
			click(genInvLocators.changeInvBtn);
			Thread.sleep(1000);
			click(genInvLocators.yesChangeInvBtn);
			Thread.sleep(1000);
			
			Select reasonType = new Select(genInvLocators.selRevertBlank);
			Thread.sleep(1000);
			reasonType.selectByIndex(1);
			type(genInvLocators.reasonInputArea, "Testing Purpose");
			Thread.sleep(1000);
			click(genInvLocators.changeInvReasonSubmitBtn);			
			Thread.sleep(1000);
//			Alert alert = driver.switchTo().alert();
//			Thread.sleep(1000);
//			alert.accept();
//			Thread.sleep(1000);
//			alert.accept();
			
			try {
			    wait.until(ExpectedConditions.alertIsPresent());
			    Alert alert = driver.switchTo().alert();
			    alert.accept(); // Click OK
			    System.out.println("Alert handled: " + alert.getText());
			} catch (NoAlertPresentException e) {
			    System.out.println("No alert present.");
			}
			
			try {
			    wait.until(ExpectedConditions.alertIsPresent());
			    Alert alert = driver.switchTo().alert();
			    alert.accept(); // Click OK
			    System.out.println("Alert handled: " + alert.getText());
			} catch (NoAlertPresentException e) {
			    System.out.println("No alert present.");
			}
			
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}

}

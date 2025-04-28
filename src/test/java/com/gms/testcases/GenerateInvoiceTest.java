package com.gms.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.gms.pages.actions.GenerateInvPage;
import com.gms.pages.actions.HomePage;

public class GenerateInvoiceTest {
	

	@Test(priority = 1)
	public void clickInvoiceBtnTest() throws InterruptedException, EncryptedDocumentException, IOException {

		Thread.sleep(1000);
		HomePage home = new HomePage();
		home.searchJc("AP28DN9658");	
		Thread.sleep(2000);
		GenerateInvPage generateInvoice = new GenerateInvPage();
		generateInvoice.clickInvoiceBtn();		
	}
	
	@Test(priority = 2)
	public void generateProformatInvTest() throws InterruptedException {
		
		Thread.sleep(1000);
		GenerateInvPage generateInvoice = new GenerateInvPage();
		generateInvoice.generateProfromaInvoice();
	}
	
	@Test(priority = 3)
	public void changeInvoiceTest() throws InterruptedException {
		
		Thread.sleep(1000);
		GenerateInvPage generateInvoice = new GenerateInvPage();
		generateInvoice.changeInvoice();
	}
	
	@Test(priority = 4)
	public void generateTaxInvoiceTest() throws InterruptedException {
		
		Thread.sleep(1000);
		GenerateInvPage generateInvoice = new GenerateInvPage();
		generateInvoice.clickInvoiceBtn();	
		generateInvoice.generateTaxInvoice();
	}
	
	
}

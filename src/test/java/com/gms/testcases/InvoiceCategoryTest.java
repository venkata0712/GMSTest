package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.ManageInvoiceCatPage;

public class InvoiceCategoryTest {
	
	@Test
	public void addNewInvCatTest() throws InterruptedException {
		
		HomePage home = new HomePage();
		home.clickMenuTab();
		home.clickManageInvCat();		
		ManageInvoiceCatPage invCatPage = new ManageInvoiceCatPage();
		invCatPage.addInvCat();
		
	}

}

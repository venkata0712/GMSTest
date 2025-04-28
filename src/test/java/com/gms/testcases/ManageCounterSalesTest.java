package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.ManageCounterSalesPage;

public class ManageCounterSalesTest {
	
	
	@Test
	public void counterSalesTest() throws InterruptedException {
	
	ManageCounterSalesPage countSalesPage = new ManageCounterSalesPage();
	
	HomePage home = new HomePage();
	home.clickMenuTab();
	home.clickManageCounterSalesMenu();
	
	countSalesPage.clickCreteInvoiceBtn();
	countSalesPage.addCounterSale();
	
	
	
	}
}

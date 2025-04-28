package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.ManageVendorsPage;

public class ManageVendorsTest {
	
	@Test
	public void addNewVendorTest() throws InterruptedException {
		
		HomePage home = new HomePage();
		home.clickMenuTab();
		home.clickManageVendorsNdPurchasesMenu();
		
		ManageVendorsPage manageVendors = new ManageVendorsPage();
		manageVendors.addNewVendor();
		
	}
	
	
}

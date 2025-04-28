package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.ManageCustomerSourcePage;

public class CustomerSourceTest {
	
	@Test
	public void addNewCustSource() throws InterruptedException {
		
		HomePage home = new HomePage();
		home.clickMenuTab();
		home.clickManageCustomerSource();
		
		ManageCustomerSourcePage custSourPage = new ManageCustomerSourcePage();
		custSourPage.addCustomerSource();
		
		
	}
	

	
	
	

}

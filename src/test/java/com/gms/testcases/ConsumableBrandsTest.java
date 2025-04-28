package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.base.Page;
import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.LoginPage;
import com.gms.pages.actions.ManageConsumableBrandsPage;

public class ConsumableBrandsTest {
	
	@Test
	public void addNewConsBrandTest() throws InterruptedException {
		
//		Page.initConfiguration();
//		LoginPage login = new LoginPage();
//		login.doLogin("ramp", "welcome@123");
		
		HomePage home = new HomePage();
		home.clickMenuTab();
		home.clickManageConsumableBrands();
		ManageConsumableBrandsPage consBrandPage = new ManageConsumableBrandsPage();
		consBrandPage.addConsumableBrands();
		
	}

}

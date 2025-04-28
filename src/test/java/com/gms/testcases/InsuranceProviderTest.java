package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.ManageInsuranceProvider;

public class InsuranceProviderTest {
	
	@Test
	public void addInsuranceProvider() throws InterruptedException {
		
		HomePage home = new HomePage();
		home.clickMenuTab();
		home.clickInsuranceProvider();
		
		ManageInsuranceProvider insProvider = new ManageInsuranceProvider();
		insProvider.addNewInsProvider();
		
	}

}

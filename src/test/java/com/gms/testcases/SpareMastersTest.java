package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.ManageSparesMasterPage;

public class SpareMastersTest {
	
	
	@Test(priority = 1)
	public void clickSpareMasterMenu() throws InterruptedException {
		HomePage home = new HomePage();
		home.clickMenuTab();
		home.clickManageSpares();	
	}

	@Test(priority = 2)
	public void addNewSparesTest() throws InterruptedException {	
		ManageSparesMasterPage manSpareMaster = new ManageSparesMasterPage();
		//manSpareMaster.searchSpares();
		manSpareMaster.addNewBtn();
		manSpareMaster.addNewSpare();
	}

	@Test(priority = 3)
	public void addexistSparesTest() throws InterruptedException  {	
		ManageSparesMasterPage manSpareMaster = new ManageSparesMasterPage();
		manSpareMaster.addNewBtn();
		manSpareMaster.addexistingSpare();
	}

}

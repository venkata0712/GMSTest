package com.gms.rough;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.gms.base.Page;
import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.LoginPage;
import com.gms.pages.actions.ManagePurchasesPage;
import com.gms.pages.actions.NewCustReg;
import com.gms.pages.actions.PartsEntryPage;
import com.gms.utilities.Utilities;

public class PartsEntryByVeh extends Page {
	
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void partsEntryB(Hashtable<String, String> data) throws InterruptedException, IOException {

		Page.initConfiguration();
		LoginPage login = new LoginPage();
		login.doLogin(data.get("username"), data.get("password"));

		HomePage home = new HomePage();
		home.clickMenuTab();
		home.clickIMmenu();
		
		ManagePurchasesPage manPur = new ManagePurchasesPage();
		manPur.clickManagePurBtn();
		manPur.clickStandardBtn();
		manPur.clickByVehicle();
		
		PartsEntryPage partsEntry = new PartsEntryPage();
		partsEntry.partsEntryByVehicle();
		
		
		
		
	}


}

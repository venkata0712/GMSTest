package com.gms.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.ManagePurchasesPage;
import com.gms.utilities.Utilities;

public class ManagePurchasesDetTest {

	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void managePurchasesDetTest(Hashtable<String, String> data) throws InterruptedException {
		
//		if(data.get("runmode").equalsIgnoreCase("N")){
//			
//			throw new SkipException("Skipping the test as the Run mode is NO");
//		
//		}


		HomePage home = new HomePage();
		home.clickMenuTab();
		home.clickIMmenu();
		ManagePurchasesPage manPur = new ManagePurchasesPage();
		manPur.clickManagePurBtn();
		
		manPur.clickDetailedBtn();
		manPur.submitInvDetails(data.get("invNo"), data.get("invDate"), data.get("vendorName"), data.get("taxType"),
				data.get("taxSub"), data.get("discType"), data.get("profType"));
		
		manPur.clickByVehicle();

				
	}
	
}

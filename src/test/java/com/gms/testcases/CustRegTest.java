package com.gms.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.NewCustReg;
import com.gms.utilities.Utilities;

public class CustRegTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void custRegTest(Hashtable<String, String> data) throws InterruptedException {

			
		String runmode = (String) data.get("runMode");
		
		System.out.println("Runmode value: " + data.get("runMode"));
		System.out.println("Complete data: " + data);
		
		Thread.sleep(1000);
		
		if ("N".equalsIgnoreCase(runmode)) {
			throw new SkipException("Skipping the test as the Run mode is NO");
		}
		 

		HomePage home = new HomePage();
		home.clickNewCustRegTab();

		/*
		 * CustRegPage custReg = new CustRegPage(); custReg.custReg(data.get("vehNo"),
		 * data.get("vehName"), data.get("vehCat"), data.get("kmDriven"),
		 * data.get("custName"), data.get("emailId"), data.get("monNum"),
		 * data.get("custAddr"), data.get("technician"));
		 */
		NewCustReg newCust = new NewCustReg();
		newCust.custReg(data.get("vehNo"), data.get("vehName"), data.get("vehCat"), data.get("kmDriven"),
				data.get("custName"), data.get("emailId"), data.get("mobNum"), data.get("custAddr"),
				data.get("technician"), data.get("supervisor"), data.get("chasisNo"), data.get("engineNo"),
				data.get("doreg"), data.get("mfgYear"));
		
		//home.searchJc(data.get("vehNo"));
	}
	
}

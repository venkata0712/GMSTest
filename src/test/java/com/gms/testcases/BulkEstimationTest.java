package com.gms.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.JobCardEstimation;
import com.gms.pages.actions.ServicesEstimationPage;
import com.gms.pages.actions.SparesEstimationPage;
import com.gms.utilities.Utilities;

public class BulkEstimationTest {
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void custRegTest(Hashtable<String, String> data) throws InterruptedException, EncryptedDocumentException, IOException {

			
		String runmode = (String) data.get("runMode");
		
		System.out.println("Runmode value: " + data.get("runMode"));
		System.out.println("Complete data: " + data);
		
		Thread.sleep(1000);
		
		if ("N".equalsIgnoreCase(runmode)) {
			throw new SkipException("Skipping the test as the Run mode is NO");
		}
		 

		HomePage home = new HomePage();
		home.searchJc(data.get("vehNo"));		
		home.clickEstimationBtn();
		
//		JobCardEstimation jobCard = new JobCardEstimation();		
//		jobCard.clickJobCardTab();
//		jobCard.jobCardDataEntry();
//		
//		SparesEstimationPage spares = new SparesEstimationPage();
//		spares.clickSparesTab();
//		spares.spareDataEntry();
		
		ServicesEstimationPage services = new ServicesEstimationPage();
		services.clickServicesTab();
		services.serviceDataEntry();		
		
	}

}

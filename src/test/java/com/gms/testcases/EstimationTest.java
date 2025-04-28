package com.gms.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.JobCardEstimation;
import com.gms.pages.actions.ServicesEstimationPage;
import com.gms.pages.actions.SparesEstimationPage;

public class EstimationTest {

	
	@Test(priority = 1)
	public void EstimationBtnTest() throws InterruptedException, EncryptedDocumentException, IOException {
		
		HomePage home = new HomePage();
		home.searchJc("TEST5637");		
		home.clickEstimationBtn();
	}
	
	
	@Test(priority = 2)
	public void jobCardTest() throws InterruptedException, EncryptedDocumentException, IOException {		
		JobCardEstimation jobCard = new JobCardEstimation();		
		jobCard.clickJobCardTab();
		jobCard.jobCardDataEntry();

	}

	@Test(priority = 3)
	public void sparesEntryTest() throws EncryptedDocumentException, IOException, InterruptedException {

		SparesEstimationPage spares = new SparesEstimationPage();
		spares.clickSparesTab();
		spares.spareDataEntry();
	}

	@Test(priority = 4)
	public void servicesEntryTest() throws EncryptedDocumentException, IOException, InterruptedException {

		
		ServicesEstimationPage services = new ServicesEstimationPage();
		services.clickServicesTab();
		services.serviceDataEntry();
	}

}

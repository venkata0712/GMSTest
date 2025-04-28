package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.InsuranceDetPopPage;

public class InsuranceDetailsTest {
	
	
	
	@Test(priority = 1)
	public void clickInsDetBtnTest() throws InterruptedException {
		
		HomePage home = new HomePage();
		home.searchJc("TEST5637");		
		InsuranceDetPopPage insDetails = new InsuranceDetPopPage();
		insDetails.clickInsDetBtn();
		
	}
	
	@Test(priority = 2)
	public void submitInsDetTest() throws InterruptedException {
		
		InsuranceDetPopPage insDetails = new InsuranceDetPopPage();
		insDetails.submitInsDetails();
		
	}
	
	
	

}

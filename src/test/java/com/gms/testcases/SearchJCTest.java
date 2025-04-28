package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.base.Page;
import com.gms.pages.actions.HomePage;

public class SearchJCTest extends Page {
	
	
	@Test
	public void searchJCtest() throws InterruptedException {		
		HomePage home = new HomePage();			
		home.searchJc("AP28DN9658");		
		//home.clickEstimationBtn();		
	}
	
}

package com.gms.testcases;

import org.testng.annotations.Test;
import com.gms.pages.actions.DiscountPage;
import com.gms.pages.actions.HomePage;

public class DiscountTest {
	
	@Test(priority = 1)
	public void clickDiscountBtnTest() throws InterruptedException {
		
		HomePage home = new HomePage();
		home.searchJc("AP28DN9658");		
		DiscountPage discount = new DiscountPage();
		discount.clickDiscountBtn();
		
	}
	
	@Test(priority = 2)
	public void submitOverAllDiscTest() throws InterruptedException {
		
		DiscountPage discount = new DiscountPage();
		discount.overallDiscTest();
		
	}
	
	@Test(priority = 3)
	public void submitLineitemDiscTest() throws InterruptedException {		
		HomePage home = new HomePage();
		home.searchJc("AP28DN9658");		
		DiscountPage discount = new DiscountPage();
		discount.clickDiscountBtn();
		discount.lineitemDiscTest();
	}
	

}

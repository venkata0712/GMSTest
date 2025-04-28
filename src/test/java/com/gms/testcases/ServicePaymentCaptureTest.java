package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.pages.actions.HomePage;
import com.gms.pages.actions.PaymentPage;

public class ServicePaymentCaptureTest {
	
	
	@Test(priority = 1)
	public void clickPaymentBtnTest() throws InterruptedException {
		
		HomePage home = new HomePage();
		home.searchJc("AP28DN9658");
		
		PaymentPage paymentCapture = new PaymentPage();
		paymentCapture.clickPaymentBtn();
		
		
	}
	
		
	@Test(priority = 2)
	public void paymentCaputeTest() throws InterruptedException {
				
		PaymentPage paymentCapture = new PaymentPage();
		paymentCapture.clickPaymentBtn();
		paymentCapture.submitPayDet();	
		
	}

}

package com.gms.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.gms.base.Page;
import com.gms.pages.actions.LoginPage;
import com.gms.utilities.Utilities;


public class LoginTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException {
		
		Page.initConfiguration();
		Thread.sleep(2000);
		LoginPage login = new LoginPage();
		login.doLogin(data.get("username"), data.get("password"));
	
	}
}

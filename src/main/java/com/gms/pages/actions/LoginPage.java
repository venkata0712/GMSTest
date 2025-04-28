package com.gms.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gms.base.Page;
import com.gms.pages.locators.LoginPageLocators;

public class LoginPage extends Page {

	public LoginPageLocators loginPage;

	public LoginPage() {

		this.loginPage = new LoginPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.loginPage);

	}

	public void doLogin(String username, String password) throws InterruptedException {

		type(loginPage.userName, username);
		type(loginPage.password, password);
		//click(loginPage.captchBox);
		Thread.sleep(10000);
		click(loginPage.submitBtn);
				
//		WebElement slideCloseBtn = driver.findElement(By.xpath("//button[@type = 'button' and @onclick = 'gotoHome();']"));
//		wait.until(ExpectedConditions.elementToBeClickable(slideCloseBtn));
//		click(slideCloseBtn);
		
	}
}

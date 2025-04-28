package com.gms.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gms.base.Page;
import com.gms.pages.locators.HomePageLocators;

public class ReadyTestPage extends Page{

	private HomePageLocators homepage;

	public ReadyTestPage() {

		this.homepage = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.homepage);
	}


	public void clickReadBtn() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(homepage.readyBtn));
			click(homepage.readyBtn);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(homepage.readyBtn));
			click(homepage.readyBtn);
		}
		click(homepage.yesnoSmsBtn);
		click(homepage.ynsmsOkBtn);
	}

}

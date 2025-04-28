package com.gms.pages.actions;

import static org.testng.Assert.assertSame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.gms.base.Page;
import com.gms.pages.locators.HomePageLocators;

public class DiscountPage extends Page {
	
public HomePageLocators homePage = new HomePageLocators();
	
	public DiscountPage() {		
		this.homePage = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.homePage);		
	}

	public void clickDiscountBtn() {		
		try {
			click(homePage.discBtn);
		} catch (Exception e) {
			click(homePage.discBtn);
			//System.out.println(e);
		}
	}
	
	public void overallDiscTest() throws InterruptedException {		
		
		//Thread.sleep(2000);
		try {
		Select discVal = new Select(homePage.overallDisType);
		discVal.selectByVisibleText("%");
		homePage.overDisValue.clear();
		type(homePage.overDisValue, "10");
		click(homePage.saveOverallDis); }
		catch (Exception e) {			
			click(homePage.closediscpop);
			Assert.fail("Test Failed");
		}
	}

	public void lineitemDiscTest() throws InterruptedException {
		Thread.sleep(2000);
		List <WebElement> rows = homePage.disctable.findElements(By.tagName("tr"));
		String part1 = "//*[@id='showDiscountLineItems']/table/tbody/tr[";
		String part2 = "]/td[4]/Select";
		String part3 =  "]/td[5]/input";

		for (int j = 3; j <= (rows.size()); j++) 
		{
			
			String path5 = ".//*[@id='showDiscountLineItems']/table/tbody/tr[";
			String path6 = "]/td[1]";
			String path7 = path5+j+path6;
			String text = driver.findElement(By.xpath(path7)).getText().toString();
			
			System.out.println("Text String: "+ text);

			if(text.equals("SERVICES"))
			{
				j = j+1;
			}

			String path1 = part1+j+part2;
			String path2 = part1+j+part3;
			
			Select discVal = new Select(driver.findElement(By.xpath(path1)));
			discVal.selectByVisibleText("%");
			driver.findElement(By.xpath(path2)).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath(path2)).sendKeys("10");

		}
		
		scrolltoview(homePage.savelineItemDiscBtn);
		click(homePage.savelineItemDiscBtn);
	}
		
}

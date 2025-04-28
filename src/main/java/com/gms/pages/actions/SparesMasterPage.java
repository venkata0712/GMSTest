package com.gms.pages.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.gms.base.Page;
import com.gms.pages.locators.SparesMasterLocators;

public class SparesMasterPage extends Page {

	public SparesMasterLocators sparesMaster;
	
	
	public SparesMasterPage() {
		
		this.sparesMaster = new SparesMasterLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.sparesMaster);
		
	}
	
	
	public void clickNewBtn() {
	
		click(sparesMaster.sparesMasterNew);
	}
	
	
	public void addNewRecord() throws EncryptedDocumentException, IOException {
		
		
		int n = 0;
		
		FileInputStream inputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + excelpath));
		XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(inputStream);
		XSSFSheet sheet = workbook.getSheet("ManageSparesMaster");

		int rowcount = sheet.getLastRowNum();
		
//		int rowcount1 = excel.getRowCount(sheetname);
		

		for (n = 0; n < rowcount; n++) {

			
		click(sparesMaster.sparesMasterNew);
		type(sparesMaster.partNameInput, "");
		click(sparesMaster.catCodeContainer);
		
		Select catcodeSel = new Select(sparesMaster.catCodeSel);
		catcodeSel.selectByIndex(1);
		}
		
		
		
		
	}
		
	
	
	
}

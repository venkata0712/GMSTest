package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GenerateInvoiceLocators {

	@FindBy(xpath = "//div[@class='tbmain'][1]//a[contains(@onclick, 'generateInvoice')]")
	public WebElement invoiceBtnGreen;
	@FindBy(xpath = "//div[@class='tbmain'][1]//a[contains(@onclick, 'openBillTypeCustomer')]")
	public WebElement invBtnRed;
	
	@FindBy(xpath = "//div[@class='tbmain'][1]//a[contains(@onclick, 'ViewMoreMenu')]")
	public WebElement viewMoreBtn;

	//Generate invoice functionality
	@FindBy(id = "taxTypeVal")
	public WebElement taxTypeSel;
	@FindBy(id = "btnStandardInvoice")
	public WebElement proformaInvBtn;
	@FindBy(id = "btnDetailedInvoice")
	public WebElement taxInvBtn;
	@FindBy(id = "buttonCloseInvoice")
	public WebElement closeGenInvPop;
	@FindBy(xpath = "//*[@id='modalJobCardBill']//button[contains(@onclick, 'printContents')]")
	public WebElement printStdInvBtn;	
	@FindBy(id = "downloadPdfButton")
	public WebElement downloadInvBtn;
	@FindBy(xpath = "//*[@id='modalPrintOrder']//button[contains(@onclick, 'emailInvoice')]")
	public WebElement shareInvBtn ;
	@FindBy(xpath = "//*[@id='modalPrintOrder']//button[contains(@onclick, 'showHide')]")
	public WebElement closePrintInvBtn;

	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'makeInvoiceBlank')]")
	public WebElement changeInvBtn;
	@FindBy(xpath = "//button[text() = 'Yes']")
	public WebElement yesChangeInvBtn;
	@FindBy(xpath = "//button[text() = 'Cancel']")
	public WebElement cancelChangeInvBtn;	
	@FindBy(xpath = "//select[@id='emptySelectedInvoice']")
	public WebElement selRevertBlank;
	@FindBy(id = "emptyTextareaInvoice")
	public WebElement reasonInputArea ;
	@FindBy(xpath = "//div[@class='jconfirm-buttons']/button[text()='Submit']")
	public WebElement changeInvReasonSubmitBtn;
	@FindBy(xpath = "//button[@id='closeWithReload']")
	public WebElement closePrintInvBtn1 ;



}

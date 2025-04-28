package com.gms.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(id = "customerReg")
	public WebElement newCustRegTab;
	@FindBy(id = "dashBoard")
	public WebElement offnProTab;
	@FindBy(id = "shortCuts")
	public WebElement shortcutsTab;
	@FindBy(id = "//input[@type='search']")
	public WebElement searchBox;


	@FindBy(id = "about")
	public WebElement bussIntiButton;
	@FindBy(id = "menu")
	public WebElement menuButton;
	@FindBy(xpath = "//li[@id = 'menuTooltipId']/following-sibling::li")
	public WebElement welcome;
	@FindBy(id = "menuTooltipId")
	public WebElement notification;


	//Locators for all the menu items in System Configuration Module
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Brandwise Consumables')]")
	public WebElement brandwiseConsumalesMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Consumable Brands')]")
	public WebElement consumableBrandsMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Customer Source')]")
	public WebElement custSourceMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Insurance Provider')]")
	public WebElement insProviderMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Insurance Status Info')]")
	public WebElement insStatusInfoMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Invoicing Category Info')]")
	public WebElement invCategoryInfoMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Message Templates')]")
	public WebElement messageTempMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Spares Master')]")
	public WebElement sparesMasterMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Tax Rates / HSN Code')]")
	public WebElement manageHSNmenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Terms n Conditions')]")
	public WebElement manageTermsMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Vehicle Category')]")
	public WebElement vehCategoryMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Vehicle Checklists')]")
	public WebElement vehCehcklistsMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Vehicle Models')]")
	public WebElement vehModelsMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Vendors & Purchases')]")
	public WebElement vendorNPurchasesMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Workshop Info')]")
	public WebElement workshopInfoMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'View Logs')]")
	public WebElement viewLogsMenu;

	//Locators for all the menu items in Manage Workshop Menu
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Workshop Salvages')]")
	public WebElement workshopSlavagesMenu;
	@FindBy(xpath = "//li[@class = 'menu_list']/a[text()='Inventory Management']")
	public WebElement imMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Counter Sales')]")
	public WebElement counterSalesMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Day Book')]")
	public WebElement dayBookMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Manage Services')]")
	public WebElement manageServicesMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'Offers & Promotions')]")
	public WebElement offersnPromotionsMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'View Deleted Records')]")
	public WebElement viewDelRecMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'View Service History')]")
	public WebElement viewServiceHisMenu;
	@FindBy(xpath = "//li[@class='menu_list']//a[contains(text(),'View Technician Productivity')]")
	public WebElement viewTechProdMenu;


	// Locators for all the button in the table first row.
	@FindBy(xpath = "//div[@class='tbmain'][1]//a[contains(@onclick, 'serviceEstimation')]")
	public WebElement estimationBtn;
	@FindBy(xpath = "//div[@class='tbmain'][1]//a[contains(@onclick, 'readyAlertModal')]")
	public WebElement readyBtn;
	@FindBy(xpath = "//div[@class='tbmain'][1]//a[contains(@onclick, 'openVehicleHistory')]")
	public WebElement vehHistoryBtn;
	@FindBy(xpath = "//div[@class='tbmain'][1]//a[contains(@onclick, 'openEditModal') and contains(@onclick, 'paymentDetails')]")
	public WebElement paymentBtn;
	@FindBy(xpath = "//div[@class='tbmain'][1]//a[contains(@onclick, 'openEditModal') and contains(@onclick, 'discount')]")
	public WebElement discBtn;


	@FindBy(xpath = "//div[@class='tbmain'][1]//a[contains(@onclick, 'ViewMoreMenu')]")
	public WebElement viewMoreBtn;


	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'editProfile')]")
	public WebElement editProfileBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'editVehicleRcDetails')]")
	public WebElement editRCDetBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'InsuranceDetails')]")
	public WebElement insuranceDetBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'saveInsuranceEstimation')]")
	public WebElement insuranceEstBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'salvage')]")
	public WebElement salvageInfoBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'feedback')]")
	public WebElement feedbackFormBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'uploadImages')]")
	public WebElement uploadImgBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'smsRemindersStatus')]")
	public WebElement smsRemindBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'deleteCustomerRecord')]")
	public WebElement deleteRecBtn;	
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'gatepass')]")
	public WebElement gatepassBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'checkBillType')]")
	public WebElement doneBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'makeInvoiceBlank')]")
	public WebElement changeInvBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'updateDueDate')]")
	public WebElement custSourceBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'manageTechnicianTime')]")
	public WebElement manTechBtn;
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'showCouponDetails')]")
	public WebElement couponBtn;	
	@FindBy(xpath = "//div[@class='sidenav side_active']//a[contains(@onclick, 'openNextServiceDueDateModal')]")
	public WebElement serviceDueDtBtn;

	//Locators for all the elements in Estimation window
	@FindBy(xpath = "//li/a[text()='Complaints']")
	public WebElement jobcardTab;	
	@FindBy(id = "liIdSP")
	public WebElement sparesTab;
	@FindBy(xpath = "//li/a[text()='Services']")
	public WebElement servicesTab;
	@FindBy(xpath = "//li/a[text()='Rejected']")
	public WebElement rejectedTab;
	@FindBy(id = "liOffers")
	public WebElement offersTab;

	@FindBy(xpath = "//*[@id='manage_content']//a[contains(@onclick, 'manageTechnicianTime')]")
	public WebElement manageTechBtn;
	@FindBy(xpath = "//*[@id='manage_content']//a[contains(@onclick, 'checkVehicleCategory')]")
	public WebElement DVIBtn;
	//	@FindBy(xpath = "//*[@id='estimationTab']/div/a[contains(@onclick, 'showCartList')]")
	//	public WebElement cartBtn;
	@FindBy(xpath = "//*[@id='manage_content']//a[contains(@data-target, '#selStockAlert')]")
	public WebElement addSparesBtn;
	@FindBy(xpath = "//*[@id='manage_content']//a[contains(@onclick, 'Services')]")
	public WebElement addServicesBtn;
	@FindBy(xpath = "//*[@id='manage_content']//a[contains(@onclick, 'displayPackageMaster')]")
	public WebElement packagesBtn;


	//Locators for all the fields at JobCard Tab
	@FindBy(id = "add_job_card")
	public WebElement addToListJcBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'saveJobCard')]")
	public WebElement saveJcBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'saveJobCard')]/following-sibling::button[text()='Close']")
	public WebElement closeJcBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'sendJobCardSms')]")
	public WebElement sendJcSmsBtn;
	@FindBy(xpath = "//div[text()='Are you sure you want to sms?']")
	public WebElement jcSmsAlertMsg;
	@FindBy(xpath = "//button[text()='confirm']")
	public WebElement confirmSmsBtn;
	@FindBy(xpath = "//button[text()='cancel']")
	public WebElement cancelSmsBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'viewJobCard')]")
	public WebElement viewJcBtn;


	//Locators for all the fields at Spares Tab
	@FindBy(id = "add_field_button")
	public WebElement addToListSpBtn;
	@FindBy(id = "saveEstimate")
	public WebElement saveSpBtn;
	@FindBy(xpath = "//button[@id='saveEstimate']/following-sibling::button[text()='Close']")
	public WebElement closeSpBtn;


	//Locators for all the fileds in Services Tab
	@FindBy(id = "add_field_buttonService")
	public WebElement addToListSrBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'saveServiceEstimate')]")
	public WebElement saveSrBtn;
	@FindBy(xpath = "//button[contains(@onclick, 'saveServiceEstimate')]/following-sibling::button")
	public WebElement closeSrBtn;

	@FindBy(xpath = "//*[@id='showColMd4']/div[2]/button[text()=' Print Estimate Bill']")
	public WebElement printEstBtn;
	@FindBy(xpath = "//*[@id=\"generateInvoiceDivSpare2\"]/button[text()='Push to Insurance Est']")
	public WebElement pushInsuranceEstBtn;

	@FindBy(xpath = "//button[text()='Standard Estimates']")
	public WebElement stdEstBtn;
	@FindBy(xpath = "//button[text()='Detailed Estimates']")
	public WebElement detEstBtn;
	@FindBy(xpath = "//*[@id=\"modalBillType\"]/div/div/div[3]/button")
	public WebElement closeEstPopBtn;

	@FindBy(id = "insuranceClaim")
	public WebElement insClaimpop;
	@FindBy(id = "insurance_claimEditId1")
	public WebElement insClaimYes;
	@FindBy(id = "insurance_claimEditId2")
	public WebElement insClaimNo;
	@FindBy(id = "insurance_claimEditId3")
	public WebElement insClaimLater;
	@FindBy(id = "saveInsuranceDetails")
	public WebElement insClaimSave;

	//Ready functionality locators
	@FindBy(xpath = "//button[text()='Enable Store Management']")
	public WebElement enableStoreBtn;
	@FindBy(xpath = "//button[text()='YES/SMS']")
	public WebElement yesSMSBtn ;
	@FindBy(xpath = "//button[text()='YES/No SMS']")
	public WebElement yesnoSmsBtn;
	@FindBy(xpath = "//button[text()='YES/No SMS']/parent::div/following-sibling::div/button[text()='Close']")
	public WebElement closeReadyPopBtn;
	@FindBy(id = "displayMainContentTableDIv")
	public WebElement ynsmsOkBtn;

	//Payment popup locators
	@FindBy(id = "tobepaidbycustomer")
	public WebElement tobepaidcust;
	@FindBy(id = "totalpaidbyCustomer")
	public WebElement totpaidcust;
	@FindBy(id = "totalDueFrmCustomer")
	public WebElement totduecust;
	@FindBy(xpath = "//input[@value='Paid By Card']/parent::div/following-sibling::div/input[@id='bank_amount_edit']")
	public WebElement cardamtedit;
	@FindBy(xpath = "//input[@value='Paid By Card']/parent::div/following-sibling::div/input[@id='remarks_bank[]']")
	public WebElement cardremarksedit;
	@FindBy(xpath = "//input[@value='Paid By Cash']/parent::div/following-sibling::div/input[@id='bank_amount_edit']")
	public WebElement cashamtedit;
	@FindBy(xpath = "//input[@value='Paid By Cash']/parent::div/following-sibling::div/input[@id='remarks_bank[]']")
	public WebElement cashremarksedit;
	@FindBy(xpath = "//input[@value='Paid By Cheque']/parent::div/following-sibling::div/input[@id='bank_amount_edit']")
	public WebElement chqamtedit;
	@FindBy(xpath = "//input[@value='Paid By Cheque']/parent::div/following-sibling::div/input[@id='remarks_bank[]']")
	public WebElement chqremarksedit;
	@FindBy(xpath = "//input[@value='Paid By Other']/parent::div/following-sibling::div/input[@id='bank_amount_edit']")
	public WebElement othamtedit;
	@FindBy(xpath = "//input[@value='Paid By Other']/parent::div/following-sibling::div/input[@id='remarks_bank[]']")
	public WebElement othremarksedit;
	@FindBy(id = "editPaymentDetailsButton")
	public WebElement editpaymentBtn;
	@FindBy(id = "savePaymentDetailsButtonPmt")
	public WebElement savePaymentBtn;
	@FindBy(xpath = "//a[text()='Close']")
	public WebElement closePaymentPop;
	
	
	//Discount popup locators	
	@FindBy(id = "taxtype22222")
	public WebElement overallDisType;
	@FindBy(id = "taxaamt22222")
	public WebElement overDisValue;
	@FindBy(xpath = "//input[@onclick = 'saveDiscountAmountVal();']")
	public WebElement saveOverallDis;
	@FindBy(xpath = "//*[@id='showDiscountLineItems']/table")
	public WebElement disctable;
	@FindBy(xpath = "//button[@onclick = 'saveLineItemDiscountVal()']")
	public WebElement savelineItemDiscBtn;
	@FindBy(xpath = "//form[@id='lineItemDiscountValForm']//button[text()='Close']")
	public WebElement closediscpop;
		

	//Insurance Details popup locators	
	@FindBy(id = "vehInsurance_policy_no_edit")
	public WebElement insCompName;
	@FindBy(id = "insurance_claimEditCust")
	public WebElement claimSel;
	@FindBy(xpath = "//li[text()='Yes']")
	public WebElement claimYes;
	@FindBy(id = "vehinsuranceClaimType")
	public WebElement  claimTypeSel;
	@FindBy(xpath = "//li[text()='CASHLESS']")
	public WebElement typeCashless;
	@FindBy(xpath = "//li[text()='REIMBURSE']")
	public WebElement typeReimburse;
	@FindBy(id = "vehInsuranceProviderNameEdit")
	public WebElement insProSel;
	@FindBy(id = "veh_insurance_start_date")
	public WebElement insStartDt;
	@FindBy(id = "vehInsuranceExpDateEdit")
	public WebElement insExpDt;
	@FindBy(id = "insClaimCharges")
	public WebElement policyExcessValue;
	@FindBy(id = "saveInsuranceDetailsButton")
	public WebElement saveInsDetailsBtn;
//	@FindBy(id = "")
//	public WebElement ;
//	@FindBy(xpath = "")
//	public WebElement ;
//	@FindBy(xpath = "")
//	public WebElement ;
	
	
	
}

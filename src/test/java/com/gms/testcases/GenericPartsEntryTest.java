package com.gms.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.gms.pages.actions.ManagePurchasesPage;
import com.gms.pages.actions.PartsEntryPage;

public class GenericPartsEntryTest {
	
	@Test
	public void generalpartsEntry() throws IOException, InterruptedException {
		
		ManagePurchasesPage manPur = new ManagePurchasesPage();
		manPur.clickByItem();		
		PartsEntryPage partsEntry = new PartsEntryPage();
		partsEntry.genericPartsbyItem();
	}

}

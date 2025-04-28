package com.gms.testcases;


import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.gms.pages.actions.ManagePurchasesPage;
import com.gms.pages.actions.PartsEntryPage;
import com.gms.utilities.Utilities;

public class PartsByVehTest {

	@Test
	public void partsEntry() throws IOException, InterruptedException {
		
		PartsEntryPage partsEntry = new PartsEntryPage();
		partsEntry.selVehBrand();
		partsEntry.partsEntryByVehicle();
	}

}

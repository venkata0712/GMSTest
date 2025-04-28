package com.gms.testcases;

import org.testng.annotations.Test;

import com.gms.pages.actions.ReadyTestPage;

public class ReadyTest {

	@Test
	public void clickReadyBtnTest() {

		ReadyTestPage readyPage = new ReadyTestPage();
		readyPage.clickReadBtn();
	}

}

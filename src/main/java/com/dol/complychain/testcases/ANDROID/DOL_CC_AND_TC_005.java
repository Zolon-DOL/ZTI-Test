package com.dol.complychain.testcases.ANDROID;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_AND_TC_005 extends BaseTest {

	@Test
	public void Search_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Search in English", "Verify Search Functionality in English");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(MOBILEDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.Search_EN();
	}

	@Test
	public void Search_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Search in Español", "Verify Search Functionality in Español");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(MOBILEDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.Search_ES();
	}

	@Test
	public void Search_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Search in Français", "Verify Search Functionality in Français");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(MOBILEDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.Search_FR();
	}

}

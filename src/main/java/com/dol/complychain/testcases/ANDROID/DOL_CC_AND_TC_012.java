package com.dol.complychain.testcases.ANDROID;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_AND_TC_012 extends BaseTest {

	@Test
	public void ProgressBar_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Progress Bar in English",
				"Verify Progress Bar Functionality in English");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.ProgressBar_EN();
	}

	@Test
	public void ProgressBar_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Progress Bar in Español",
				"Verify Progress Bar Functionality in Español");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.ProgressBar_ES();
	}

	@Test
	public void ProgressBar_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Progress Bar in Français",
				"Verify Progress Bar Functionality in Français");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.ProgressBar_FR();
	}

}

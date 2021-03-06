package com.dol.complychain.testcases.IOS;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_IOS_TC_012 extends BaseTest {

	@Test
	public void ProgressBar_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Progress Bar in English",
				"Verify Progress Bar Functionality in English");
		EXTENT_LOCAL.set(test);
		IosPages page = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		page.ProgressBar_EN();
	}

	@Test
	public void ProgressBar_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Progress Bar in Español",
				"Verify Progress Bar Functionality in Español");
		EXTENT_LOCAL.set(test);
		IosPages page = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		page.ProgressBar_ES();
	}

	@Test
	public void ProgressBar_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Progress Bar in Français",
				"Verify Progress Bar Functionality in Français");
		EXTENT_LOCAL.set(test);
		IosPages page = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		page.ProgressBar_FR();
	}

}

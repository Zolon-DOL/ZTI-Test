package com.dol.complychain.testcases.ANDROID;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_AND_TC_008 extends BaseTest {

	@Test
	public void About_English() throws Exception {
		ExtentTest test = extent.createTest("Verify About Page in English",
				"Verify About Page Functionality in English");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.About_EN();
	}

	@Test
	public void About_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify About Page in Español",
				"Verify About Page Functionality in Español");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.About_ES();
	}

	@Test
	public void About_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify About Page in Français",
				"Verify About Page Functionality in Français");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.About_FR();
	}

}

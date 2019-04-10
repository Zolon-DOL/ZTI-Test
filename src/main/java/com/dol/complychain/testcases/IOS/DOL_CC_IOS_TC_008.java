package com.dol.complychain.testcases.IOS;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_IOS_TC_008 extends BaseTest {

	@Test
	public void About_English() throws Exception {
		ExtentTest test = extent.createTest("Verify About Page in English",
				"Verify About Page Functionality in English");
		EXTENT_LOCAL.set(test);
		IosPages Page = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		Page.About_EN();
	}

	@Test
	public void About_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify About Page in Español",
				"Verify About Page Functionality in Español");
		EXTENT_LOCAL.set(test);
		IosPages Page = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		Page.About_ES();
	}

	@Test
	public void About_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify About Page in Français",
				"Verify About Page Functionality in Français");
		EXTENT_LOCAL.set(test);
		IosPages Page = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		Page.About_FR();
	}

}

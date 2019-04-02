package com.dol.complychain.testcases.IOS;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_IOS_TC_007 extends BaseTest {

	@Test
	public void Share_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Share in English",
				"Verify Share Functionality in English");
		EXTENT_LOCAL.set(test);
		IosPages iosPage = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		iosPage.Share_EN();
	}

	@Test
	public void Share_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Share in Español",
				"Verify Share Functionality in Español");
		EXTENT_LOCAL.set(test);
		IosPages iosPage = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		iosPage.Share_ES();
	}

	@Test
	public void Share_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Share in Français",
				"Verify Share Functionality in Français");
		EXTENT_LOCAL.set(test);
		IosPages iosPage = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		iosPage.Share_FR();
	}

}

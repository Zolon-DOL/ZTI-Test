package com.dol.complychain.testcases.WEB;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_WEB_TC_003 extends BaseTest {

	@Test
	public void MenuVerification_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps in English", "Verify Step Items in English");
		EXTENT_LOCAL.set(test);
		WebPages homePage = new WebPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		homePage.StepsVerification_EN();
	}

	@Test
	public void MenuVerification_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps in Español", "Verify Step Items in Español");
		EXTENT_LOCAL.set(test);
		WebPages homePage = new WebPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		homePage.StepsVerification_ES();
	}

	@Test
	public void MenuVerification_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps in Français", "Verify Step Items in Français");
		EXTENT_LOCAL.set(test);
		WebPages homePage = new WebPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		homePage.StepsVerification_FR();
	}

}

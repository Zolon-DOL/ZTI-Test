package com.dol.complychain.testcases.WEB;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_WEB_TC_002 extends BaseTest {

	@Test
	public void MenuVerification_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Menu in English",
				"Verify Menu - Topics and Language Items in English");
		EXTENT_LOCAL.set(test);
		WebPages homePage = new WebPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		homePage.MenuVerification_EN();
	}

	@Test
	public void MenuVerification_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Menu in Español",
				"Verify Menu - Topics and Language Items in Español");
		EXTENT_LOCAL.set(test);
		WebPages homePage = new WebPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		homePage.MenuVerification_ES();
	}

	@Test
	public void MenuVerification_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Menu in Français",
				"Verify Menu - Topics and Language Items in Français");
		EXTENT_LOCAL.set(test);
		WebPages homePage = new WebPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		homePage.MenuVerification_FR();
	}

}

package com.dol.complychain.testcases.ANDROID;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_AND_TC_002 extends BaseTest {

	@Test
	public void MenuVerification_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Menu in English",
				"Verify Menu - Topics and Language Items in English");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(MOBILEDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.MenuVerification_EN();
	}

	@Test
	public void MenuVerification_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Menu in Español",
				"Verify Menu - Topics and Language Items in Español");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(MOBILEDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.MenuVerification_ES();
	}

	@Test
	public void MenuVerification_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Menu in Français",
				"Verify Menu - Topics and Language Items in Français");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(MOBILEDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.MenuVerification_FR();
	}

}

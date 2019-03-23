package com.dol.complychain.testcases.ANDROID;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_AND_TC_003 extends BaseTest {

	@Test
	public void StepsVerification_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps in English", "Verify Step Items in English");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(MOBILEDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.StepsVerification_EN();
	}

	@Test
	public void StepsVerification_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps in Español", "Verify Step Items in Español");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(MOBILEDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.StepsVerification_ES();
	}

	@Test
	public void StepsVerification_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps in Français", "Verify Step Items in Français");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(MOBILEDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.StepsVerification_FR();
	}

}

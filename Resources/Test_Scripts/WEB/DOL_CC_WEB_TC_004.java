package com.dol.complychain.testcases.WEB;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_WEB_TC_004 extends BaseTest {

	@Test
	public void LanguagesVerification() throws Exception {
		ExtentTest test = extent.createTest("Verify Language", "Verify if the correct language is selected and displayed");
		EXTENT_LOCAL.set(test);
		WebPages homePage = new WebPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		homePage.LanguageVerification();
	}
}

package com.dol.complychain.testcases.WEB;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_WEB_TC_003 extends BaseTest {

	@Test
	public void StepsVerification_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps in English", "Verify Step Items in English");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.StepsVerification_EN();
	}

	@Test
	public void StepsVerification_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps in Español", "Verify Step Items in Español");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.StepsVerification_ES();
	}

	@Test
	public void StepsVerification_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps in Français", "Verify Step Items in Français");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.StepsVerification_FR();
	}

}

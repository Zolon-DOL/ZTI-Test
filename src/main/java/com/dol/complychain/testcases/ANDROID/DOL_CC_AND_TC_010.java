package com.dol.complychain.testcases.ANDROID;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_AND_TC_010 extends BaseTest {

	@Test
	public void Whydevelop_English() throws Exception {
		ExtentTest test = extent.createTest("Why Develop Social Compliance System in English",
				"Verify Why Develop Social Compliance System Page Functionality in English");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.WhyDevelop_EN();
	}

	@Test
	public void Whydevelop_Español() throws Exception {
		ExtentTest test = extent.createTest("Why Develop Social Compliance System in Español",
				"Verify Why Develop Social Compliance System Page Functionality in Español");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.WhyDevelop_ES();
	}

	@Test
	public void Whydevelop_Français() throws Exception {
		ExtentTest test = extent.createTest("Why Develop Social Compliance System in Français",
				"Why Develop Social Compliance System Page Functionality in Français");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.WhyDevelop_FR();
	}

}

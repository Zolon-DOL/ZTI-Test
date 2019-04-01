package com.dol.complychain.testcases.ANDROID;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_AND_TC_011 extends BaseTest {

	@Test
	public void Basics_English() throws Exception {
		ExtentTest test = extent.createTest("Basics of Social Compliance System in English",
				"Verify Basics of Social Compliance System Page Functionality in English");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.Basics_EN();
	}

	@Test
	public void Basics_Español() throws Exception {
		ExtentTest test = extent.createTest("Basics of Social Compliance System in Español",
				"Verify Basics of Social Compliance System Page Functionality in Español");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.Basics_ES();
	}

	@Test
	public void Basics_Français() throws Exception {
		ExtentTest test = extent.createTest("Basics of Social Compliance System in Français",
				"Basics of Social Compliance System Page Functionality in Français");
		EXTENT_LOCAL.set(test);
		AndroidPages androidPage = new AndroidPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		androidPage.Basics_FR();
	}

}

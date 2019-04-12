package com.dol.complychain.testcases.IOS;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_IOS_TC_011 extends BaseTest {

	@Test
	public void Basics_English() throws Exception {
		ExtentTest test = extent.createTest("Basics of Social Compliance System in English",
				"Verify Basics of Social Compliance System Page Functionality in English");
		EXTENT_LOCAL.set(test);
		IosPages Page = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		Page.Basics_EN();
	}

	@Test
	public void Basics_Español() throws Exception {
		ExtentTest test = extent.createTest("Basics of Social Compliance System in Español",
				"Verify Basics of Social Compliance System Page Functionality in Español");
		EXTENT_LOCAL.set(test);
		IosPages Page = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		Page.Basics_ES();
	}

	@Test
	public void Basics_Français() throws Exception {
		ExtentTest test = extent.createTest("Basics of Social Compliance System in Français",
				"Basics of Social Compliance System Page Functionality in Français");
		EXTENT_LOCAL.set(test);
		IosPages Page = new IosPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		Page.Basics_FR();
	}

}

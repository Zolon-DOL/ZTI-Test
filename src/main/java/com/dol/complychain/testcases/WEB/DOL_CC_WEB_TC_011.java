package com.dol.complychain.testcases.WEB;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_WEB_TC_011 extends BaseTest {

	@Test
	public void Basics_English() throws Exception {
		ExtentTest test = extent.createTest("Basics of Social Compliance System in English",
				"Verify Basics of Social Compliance System Page Functionality in English");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Basics_EN();
	}

	@Test
	public void Basics_Español() throws Exception {
		ExtentTest test = extent.createTest("Basics of Social Compliance System in Español",
				"Verify Basics of Social Compliance System Page Functionality in Español");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Basics_ES();
	}

	@Test
	public void Basics_Français() throws Exception {
		ExtentTest test = extent.createTest("Basics of Social Compliance System in Français",
				"Basics of Social Compliance System Page Functionality in Français");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Basics_FR();
	}

}

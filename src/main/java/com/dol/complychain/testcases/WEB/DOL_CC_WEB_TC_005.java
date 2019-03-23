package com.dol.complychain.testcases.WEB;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_WEB_TC_005 extends BaseTest {

	@Test
	public void Search_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Search in English", "Verify Search Functionality in English");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Search_EN();
	}

	@Test
	public void Search_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Search in Español", "Verify Search Functionality in Español");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Search_ES();
	}

	@Test
	public void Search_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Search in Français", "Verify Search Functionality in Français");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Search_FR();
	}

}

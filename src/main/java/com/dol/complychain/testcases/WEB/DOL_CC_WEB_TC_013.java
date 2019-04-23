package com.dol.complychain.testcases.WEB;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_WEB_TC_013 extends BaseTest {

	@Test
	public void Bookmarks_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Bookmarks in English",
				"Verify Bookmarks Functionality in English");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Bookmarks_EN();
	}

	@Test
	public void Bookmarks_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Bookmarks in Español",
				"Verify Bookmarks Functionality in Español");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Bookmarks_ES();
	}

	@Test
	public void Bookmarks_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Bookmarks in Français",
				"Verify Bookmarks Functionality in Français");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Bookmarks_FR();
	}

}

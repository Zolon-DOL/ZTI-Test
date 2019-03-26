package com.dol.complychain.testcases.WEB;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_WEB_TC_009 extends BaseTest {

	@Test
	public void Childforcedlabor_English() throws Exception {
		ExtentTest test = extent.createTest("Child Labor and Forced Labor in English",
				"Verify Child Labor and Forced Labor Page Functionality in English");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Childforcedlabor_EN();
	}

	@Test
	public void Childforcedlabor_Español() throws Exception {
		ExtentTest test = extent.createTest("Child Labor and Forced Labor in Español",
				"Verify Child Labor and Forced Labor Page Functionality in Español");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Childforcedlabor_ES();
	}

	@Test
	public void Childforcedlabor_Français() throws Exception {
		ExtentTest test = extent.createTest("Child Labor and Forced Labor in Français",
				"Verify Child Labor and Forced Labor Page Functionality in Français");
		EXTENT_LOCAL.set(test);
		WebPages webPage = new WebPages(WEBDRIVER.get(), EXTENT_LOCAL.get());
		webPage.Childforcedlabor_FR();
	}

}

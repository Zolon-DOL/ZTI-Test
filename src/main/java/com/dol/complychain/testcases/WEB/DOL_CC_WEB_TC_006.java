package com.dol.complychain.testcases.WEB;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_WEB_TC_006 extends BaseTest {

	@Test
	public void StepsAccordion_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps Accordion in English", "Verify Steps Accordion Functionality in English");
		EXTENT_LOCAL.set(test);
		WebPages homePage = new WebPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		homePage.StepsAccordion_EN();
	}

	@Test
	public void StepsAccordion_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps Accordion in Español", "Verify Steps Accordion Functionality in Español");
		EXTENT_LOCAL.set(test);
		WebPages homePage = new WebPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		homePage.StepsAccordion_ES();
	}

	@Test
	public void StepsAccordion_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Steps Accordion in Français", "Verify Steps Accordion Functionality in Français");
		EXTENT_LOCAL.set(test);
		WebPages homePage = new WebPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		homePage.StepsAccordion_FR();
	}

}

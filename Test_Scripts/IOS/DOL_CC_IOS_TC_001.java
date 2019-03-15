package com.dol.complychain.testcases.IOS;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;

public class DOL_CC_IOS_TC_001 extends BaseTest {

	@Test
	public void HomePageVerification_English() throws Exception {
		ExtentTest test = extent.createTest("Verify Home Page in English",
				"Verify Home Page - Logo, Header, Home Page, Menu, Bottom bar Items in English");
		EXTENT_LOCAL.set(test);
		IosPages iosPages = new IosPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		iosPages.HomePageVerification_EN();
	}

	@Test
	public void HomePageVerification_Español() throws Exception {
		ExtentTest test = extent.createTest("Verify Home Page in Español",
				"Verify Home Page - Logo, Header, Home Menu, Bottom bar Items in Español");
		EXTENT_LOCAL.set(test);
		IosPages iosPages = new IosPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		iosPages.HomePageVerification_ES();
	}

	@Test
	public void HomePageVerification_Français() throws Exception {
		ExtentTest test = extent.createTest("Verify Home Page in Français",
				"Verify Home Page - Logo, Header, Home Menu, Bottom bar Items in Français");
		EXTENT_LOCAL.set(test);
		IosPages iosPages = new IosPages(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		iosPages.HomePageVerification_FR();
	}

}

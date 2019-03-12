package com.dol.complychain.testcases.ANDROID;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;


public class AndroidTest1 extends BaseTest {

	@Test
	public void androidTest1() throws Exception {
		ExtentTest test = extent.createTest("Submit Contact Details", "Enter Contact Details");
		EXTENT_LOCAL.set(test);
		ContactDetails contactDetails = new ContactDetails(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		contactDetails.Submit_Contactus();
	}

	
}

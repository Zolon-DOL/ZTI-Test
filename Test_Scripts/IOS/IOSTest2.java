package com.dol.complychain.testcases.IOS;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.pages.*;


public class IOSTest2 extends BaseTest {

	@Test
	public void iOSTest2() throws Exception {
		ExtentTest test = extent.createTest("Send Payment", "Send $10 to India");
		EXTENT_LOCAL.set(test);
		MakePayment makePayment = new MakePayment(DRIVER_LOCAL.get(), EXTENT_LOCAL.get());
		makePayment.sendTenDollars();
	}

	
}

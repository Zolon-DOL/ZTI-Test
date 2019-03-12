package com.dol.complychain.testcases.ANDROID;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class AndroidTestTest {

	AndroidDriver<MobileElement> driver = null;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("reportDirectory", "reports");
		dc.setCapability("reportFormat", "xml");
		dc.setCapability("testName", "Android Test");
		dc.setCapability(MobileCapabilityType.UDID, "85b65151454a4f54");
		dc.setCapability("accessKey",
				"eyJ4cC51Ijo0OTE2ODk3LCJ4cC5wIjo0OTE2ODk2LCJ4cC5tIjoiTVRVMU1EZ3hPRGd5TWpreE1RIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4NjYxNzg4MjQsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.2yZX_RwJxq-Q1m05fPU_7BqwvYh140InBslDUQImz7I");
		// dc.setCapability("appPackage", "in.smartappcart.contactmanager");
		// dc.setCapability("appActivity", "in.smartappcart.contactmanager.Sactivity");
		dc.setCapability(MobileCapabilityType.APP, "cloud:" + "in.smartappcart.contactmanager/.Sactivity");
		driver = new AndroidDriver<MobileElement>(new URL("https://cloud.seetest.io:443/wd/hub"), dc);
		System.out.println(((AppiumDriver<MobileElement>) driver).getCapabilities().getCapability("platformVersion"));
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@Test
	public void test1() {
		driver.findElement(By.xpath("//*[@text='Contact Us']")).click();
		driver.findElement(By.xpath("//*[@id='crname']")).sendKeys("Vasudev");
		driver.findElement(By.xpath("//*[@id='crcontact']")).sendKeys("7132321895");
		driver.findElement(By.xpath("//*[@id='cremail']")).sendKeys("Vasudev@gmail.com");
	}

	
}

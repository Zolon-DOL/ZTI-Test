package com.dol.complychain.testcases.IOS;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOSTest {

	public static void main(String[] args) throws Exception {

		IOSDriver<MobileElement> driver = null;

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("reportDirectory", "reports");
		dc.setCapability("reportFormat", "xml");
		dc.setCapability("testName", "IOS Test");
		dc.setCapability(MobileCapabilityType.UDID, "bb5f832e3ee56f952af3f8ae1983b4de9e4b0951");
		dc.setCapability("accessKey",
				"eyJ4cC51Ijo0OTE2ODk3LCJ4cC5wIjo0OTE2ODk2LCJ4cC5tIjoiTVRVMU1EZ3hPRGd5TWpreE1RIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4NjYxNzg4MjQsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.2yZX_RwJxq-Q1m05fPU_7BqwvYh140InBslDUQImz7I");
		dc.setCapability(MobileCapabilityType.APP, "cloud:" + "com.experitest.ExperiBank");
		dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
		driver = new IOSDriver<MobileElement>(new URL("https://cloud.seetest.io:443/wd/hub"), dc);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@text='Username']")).sendKeys("company");
		driver.findElement(By.xpath("//*[@text='Password']")).sendKeys("company");
		driver.findElement(By.xpath("//*[@text='loginButton']")).click();

		driver.findElement(By.xpath("//*[@text='makePaymentButton']")).click();

		driver.findElement(By.xpath("//*[@text='Phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@text='Name']")).sendKeys("Vasu");
		driver.findElement(By.xpath("//*[@text='Amount']")).sendKeys("10");
		driver.findElement(By.xpath("//*[@text='Country']")).sendKeys("India");
		driver.findElement(By.xpath("//*[@text='sendPaymentButton']")).click();
		
		driver.findElement(By.xpath("//*[@text='Yes']")).click();
		
		driver.findElement(By.xpath("//*[@text='logoutButton']")).click();

		
		driver.quit();

	}

}

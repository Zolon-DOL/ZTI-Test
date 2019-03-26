package com.dol.complychain.basepage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.dol.complychain.basetest.BaseTest;
import com.dol.complychain.util.PropUtils;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage extends BaseTest {

	public WebDriver driver;
	public ExtentTest test;

	public BasePage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public void actionClick(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(locator));
		Actions act = new Actions(driver);
		act.click(locator).build().perform();
	}

	public void verifyText(WebElement locator, String text) {
		Assert.assertEquals(locator.getText().trim(), text);
	}

	public void verifyAttribute(WebElement locator, String Attribute, String text) {
		Assert.assertEquals(locator.getAttribute(Attribute).trim(), text);
	}

	public void verifyTitle(String text) {
		Assert.assertEquals(driver.getTitle(), text);
	}

	public void verifyCurrentURL(String text) {
		Assert.assertEquals(driver.getCurrentUrl(), text);
	}

	public void switchToFrameID(String frameID) throws IOException {
		try {
			driver.switchTo().frame(driver.findElement(By.id(frameID)));
			Assert.assertTrue(true);
		} catch (Exception e) {
			logFail("Unable to Switch to Frame" + e.getMessage());
		}
	}

	public void switchToDefault() {
		driver.switchTo().defaultContent();
	}

	public void logInfo(String msg) {
		EXTENT_LOCAL.get().info(MarkupHelper.createLabel(msg, ExtentColor.BLUE));
	}

	public void logFail(String msg) {
		EXTENT_LOCAL.get().fail(MarkupHelper.createLabel(msg, ExtentColor.RED));
		Assert.assertFalse(true, msg);
	}

	public void logPass(String msg) throws Exception {
		EXTENT_LOCAL.get().pass(MarkupHelper.createLabel(msg, ExtentColor.GREEN));
		EXTENT_LOCAL.get().info("", MediaEntityBuilder.createScreenCaptureFromPath(capture()).build());
	}

	public void logSkip(String msg) {
		throw new SkipException("No Test Data Available to Test");
	}

	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void waitForElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(WEBDRIVER.get(), 10);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (StaleElementReferenceException e) {
			// simply retry finding the element in the refreshed DOM
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	}

	public static void waitTillElementFound(WebElement ElementTobeFound, int seconds) {
		WebDriverWait wait = new WebDriverWait(MOBILEDRIVER.get(), seconds);
		try {
			wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));
		} catch (StaleElementReferenceException e) {
			// simply retry finding the element in the refreshed DOM
			wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));
		}
	}

	public String todaysDate(String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();
		// System.out.println(dateFormat.format(date));
		String mydate = dateFormat.format(date);
		return mydate;
	}

	public String futureDate(String format, int days) {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR, +days);
		Date future = cal.getTime();
		String futureDate = new SimpleDateFormat(format).format(future);
		// System.out.println(futureDate);
		return futureDate;
	}

	public String pastDate(String format, int days) {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR, -days);
		Date past = cal.getTime();
		String pastdate = new SimpleDateFormat(format).format(past);
		// System.out.println(pastdate);
		return pastdate;
	}

	public void scrolldown() {
		Dimension size = MOBILEDRIVER.get().manage().window().getSize();
		int x = size.getWidth() / 2;
		int start = (int) (size.getHeight() * 0.60);
		int end = (int) (size.getHeight() * 0.10);
		// driver.swipe(x, start, x, end, 2000); - is deprecated

		TouchAction touchAction = new TouchAction((PerformsTouchActions) MOBILEDRIVER.get());
		touchAction.press(PointOption.point(x, start)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(x, end)).release().perform();

	}

	public static void highlight(WebElement element) {
		JavascriptExecutor js;
		if (PropUtils.getPropValue(configProp, "platform").equalsIgnoreCase("WEB")) {
			js = (JavascriptExecutor) WEBDRIVER.get();
		} else {
			js = (JavascriptExecutor) MOBILEDRIVER.get();
		}

		try {
			js.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');", element);
			Thread.sleep(1000);
			js.executeScript("arguments[0].style.border=''", element, "");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.dol.complychain.basetest;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.dol.complychain.util.Constants;
import com.dol.complychain.util.PropUtils;
import com.dol.complychain.util.ReportUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected static ThreadLocal<WebDriver> DRIVER_LOCAL = new ThreadLocal<WebDriver>();
	protected static ThreadLocal<ExtentTest> EXTENT_LOCAL = new ThreadLocal<ExtentTest>();

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static InternetExplorerDriverService IEService;
	public static GeckoDriverService FFService;
	public static ChromeDriverService GCService;
	public static String logfolder = null;
	public static File configFile = PropUtils.getPropFile(Constants.CONFIG_DIR, Constants.CONFIG_FILE_NAME);
	public static File testconfigFile = PropUtils.getPropFile(Constants.CONFIG_DIR, Constants.TEST_CONFIG_FILE_NAME);
	public static Properties configProp = PropUtils.getProps(configFile);
	public static Properties testconfigProp = PropUtils.getProps(testconfigFile);
	public static String resultFile;
	public static String indexFile;
	public static String reportsFolder;
	public static String instancereportsFolder;
	public static String ssFolder;

	@BeforeSuite(alwaysRun = true)
	public static void initializeReport() throws Exception {

		if (System.getProperty("pomPlatform") != null) {

			System.out.println("POM Environment is: " + System.getProperty("pomEnvironment"));
			System.out.println("POM Platform  is: " + System.getProperty("pomPlatform"));

			PropUtils.setProps(configProp, "environment", System.getProperty("pomEnvironment"));
			PropUtils.setProps(configProp, "platform", System.getProperty("pomPlatform"));
		}

		if (PropUtils.getPropValue(configProp, "environment").equalsIgnoreCase("TEST")) {
			PropUtils.setProps(configProp, "appURL", testconfigProp.getProperty("appURL"));
		}

		ReportUtils.createResultsFolder(Constants.REPORTS_DIR);
		Date currentdate = new Date();
		reportsFolder = Constants.REPORTS_DIR + new SimpleDateFormat("MMMMM_dd_yyyy").format(currentdate);
		ReportUtils.createResultsFolder(reportsFolder);
		System.out.println("reportsFolder" + reportsFolder);

		instancereportsFolder = reportsFolder + Constants.FILE_SEPARATOR
				+ new SimpleDateFormat("MMMMM_dd_yyyy_hh-mm").format(currentdate);
		ReportUtils.createResultsFolder(instancereportsFolder);
		System.out.println("instancereportsFolder" + instancereportsFolder);

		ssFolder = instancereportsFolder + Constants.FILE_SEPARATOR + "screenshots";
		ReportUtils.createResultsFolder(ssFolder);
		FileUtils.cleanDirectory(new File(ssFolder));
		ReportUtils.createResultsFolder("./screenshots");
		FileUtils.cleanDirectory(new File("./screenshots"));
		System.out.println("ssFolder" + ssFolder);

		resultFile = instancereportsFolder + Constants.FILE_SEPARATOR
				+ PropUtils.getPropValue(configProp, "projectName") + "_"
				+ new SimpleDateFormat("MMM-dd-yyyy_hh-mm").format(currentdate) + "_" + "AutomationResults.html";
		System.out.println("resultFile" + resultFile);

		// indexFile = Constants.REPORTS_DIR + Constants.FILE_SEPARATOR + "index.html";
		indexFile = "./index.html";
		System.out.println("indexFile" + indexFile);

		// Configuring Extent Reports
		if (extent == null) {
			htmlReporter = new ExtentHtmlReporter(resultFile);
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("Project Name", PropUtils.getPropValue(configProp, "projectName").toUpperCase());
			extent.setSystemInfo("User Name", System.getProperty("user.name").trim().toUpperCase());
			extent.setSystemInfo("Automation Tool", "SELENIUM/JAVA");
			extent.setSystemInfo("Java Version", System.getProperty("java.version").trim().toUpperCase());
			extent.setSystemInfo("Operating System", System.getProperty("os.name").trim().toUpperCase());
			extent.setSystemInfo("Host Name", InetAddress.getLocalHost().getHostName().trim().toUpperCase());
			extent.setSystemInfo("IP Address", InetAddress.getLocalHost().getHostAddress().trim().toUpperCase());
			extent.setSystemInfo("Environment", PropUtils.getPropValue(configProp, "environment").trim().toUpperCase());

			htmlReporter.config().setDocumentTitle(PropUtils.getPropValue(configProp, "projectName")
					+ " " +  PropUtils.getPropValue(configProp, "platform") + " Automation Testing Report");
			htmlReporter.config().setReportName(PropUtils.getPropValue(configProp, "platform") + " Automation Testing");
			htmlReporter.config().setTheme(Theme.STANDARD);
		}
	}

	@BeforeMethod(alwaysRun = true)
	public void initializeDriver() throws Exception {
		String platform = PropUtils.getPropValue(configProp, "platform").toUpperCase().trim();
		WebDriver driver = null;
		DesiredCapabilities dc = new DesiredCapabilities();
		switch (platform) {
		case "ANDROID":
			System.out.println("Platform - " + platform);
			dc.setCapability("reportDirectory", "reports");
			dc.setCapability("reportFormat", "xml");
			dc.setCapability("testName", "Android Test");
			dc.setCapability(MobileCapabilityType.UDID, PropUtils.getPropValue(configProp, "AndroidUDID"));
			dc.setCapability("accessKey",PropUtils.getPropValue(configProp, "accessKey"));
			// dc.setCapability("appPackage", "in.smartappcart.contactmanager");
			// dc.setCapability("appActivity", "in.smartappcart.contactmanager.Sactivity");
			dc.setCapability(MobileCapabilityType.APP, "cloud:" + PropUtils.getPropValue(configProp, "AndroidBundleId"));
			driver = new AndroidDriver<MobileElement>(new URL(PropUtils.getPropValue(configProp, "server")), dc);
			DRIVER_LOCAL.set(driver);
			break;
		case "IOS":
			System.out.println("Platform - " + platform);
			dc.setCapability("reportDirectory", "reports");
			dc.setCapability("reportFormat", "xml");
			dc.setCapability("testName", "IOS Test");
			dc.setCapability(MobileCapabilityType.UDID, PropUtils.getPropValue(configProp, "IOSUDID"));
			dc.setCapability("accessKey",PropUtils.getPropValue(configProp, "accessKey"));
			dc.setCapability(MobileCapabilityType.APP, "cloud:" + PropUtils.getPropValue(configProp, "IOSBundleId"));
			dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, PropUtils.getPropValue(configProp, "IOSBundleId"));
			dc.setCapability("autoWebview", "false");
			driver = new IOSDriver<MobileElement>(new URL(PropUtils.getPropValue(configProp, "server")), dc);
			DRIVER_LOCAL.set(driver);
			break;
		case "WEB":
			System.out.println("Platform - " + platform);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("chrome.switches", "--disable-extensions");
			options.addArguments("chrome.switches", "test-type");
			options.addArguments("chrome.switches", "start-maximized");
			options.addArguments("chrome.switches", "no-sandbox");
			options.setExperimentalOption("useAutomationExtension", false);
			WebDriverManager.chromedriver().setup();
			logfolder = Constants.LOG_DIR + "GCDriveLogs_" + new SimpleDateFormat("MMMMM_dd_yyyy").format(new Date());
			File logsfolder = new File(logfolder);
			if (!logsfolder.exists()) {
				logsfolder.mkdir();
			}
			File logsFile = new File(logfolder + Constants.FILE_SEPARATOR + "ChromeDriver_"
					+ new SimpleDateFormat("dd_HH_mm").format(new Date()) + "_Logs.log");
			if (logsFile.exists()) {
				logsFile.delete();
			}
			GCService = new ChromeDriverService.Builder().usingAnyFreePort().withLogFile(logsFile).build();
			try {
				GCService.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			driver = new ChromeDriver(GCService, options);

			DRIVER_LOCAL.set(driver);
			DRIVER_LOCAL.get().manage().window().maximize();
			DRIVER_LOCAL.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			DRIVER_LOCAL.get().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			DRIVER_LOCAL.get().get(PropUtils.getPropValue(configProp, "appURL"));
			break;
		default:
			System.out.println("Platform Mismatch - Only WEB, IOS and ANDROID are allowed");
		}

	}

	@AfterMethod(alwaysRun = true)
	public void quitbrowser(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = capture();
			EXTENT_LOCAL.get().fail(MarkupHelper
					.createLabel(result.getName() + " Test case FAILED due to below issues:", ExtentColor.RED));
			EXTENT_LOCAL.get().fail(result.getThrowable());
			EXTENT_LOCAL.get().fail("Screenshot below: " + EXTENT_LOCAL.get().addScreenCaptureFromPath(screenShotPath));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			EXTENT_LOCAL.get()
					.pass(MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} else if (result.getStatus() == ITestResult.SKIP) {
			EXTENT_LOCAL.get()
					.skip(MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.BLUE));
			EXTENT_LOCAL.get().skip(result.getThrowable());
		}
		DRIVER_LOCAL.get().quit();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() throws Exception {

		// Flush the Reports
		extent.flush();

		// Creating the Reports Index
		ReportUtils.createIndexFile();

		// Copy Screenshots folder
		FileUtils.copyDirectory(new File("./screenshots"), new File(ssFolder));
	}

	/******************************************************************************************
	 * Name: capture | Description: Take Screenshot
	 ******************************************************************************************/
	public String capture() throws IOException {

		TakesScreenshot takesScreenshot = (TakesScreenshot) DRIVER_LOCAL.get();
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String timestamp = getCurrentDateTime();
		String dest = "./screenshots/" + timestamp + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		return dest;
	}

	/******************************************************************************************
	 * Name: getCurrentDateTime | Description: Captures current Date and Time
	 ******************************************************************************************/
	public static String getCurrentDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("MMddHHmmssms");
		Date date = new Date();
		return sdf.format(date);
	}

}

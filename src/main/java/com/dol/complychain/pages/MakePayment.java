package com.dol.complychain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basepage.BasePage;
import com.dol.complychain.repo.Locator;
import com.dol.complychain.util.PropUtils;

public class MakePayment extends BasePage {

	@FindBy(how = How.XPATH, using = Locator.IOS_USERNAME)
	public WebElement username;

	@FindBy(how = How.XPATH, using = Locator.IOS_PASSWORD)
	public WebElement password;

	@FindBy(how = How.XPATH, using = Locator.IOS_LOGINBUTTON)
	public WebElement login;

	@FindBy(how = How.XPATH, using = Locator.IOS_MAKEPAYMENT)
	public WebElement makepayment;

	@FindBy(how = How.XPATH, using = Locator.IOS_PHONENO)
	public WebElement phoneno;

	@FindBy(how = How.XPATH, using = Locator.IOS_NAME)
	public WebElement name;

	@FindBy(how = How.XPATH, using = Locator.IOS_AMOUNT)
	public WebElement amount;

	@FindBy(how = How.XPATH, using = Locator.IOS_COUNTRY)
	public WebElement country;

	@FindBy(how = How.XPATH, using = Locator.IOS_SENDPAYMENT)
	public WebElement sendpayment;

	@FindBy(how = How.XPATH, using = Locator.IOS_CONFIRMYES)
	public WebElement confirmyes;

	@FindBy(how = How.XPATH, using = Locator.IOS_LOGOUT)
	public WebElement logout;

	public MakePayment(WebDriver driver, ExtentTest test) {
		super(DRIVER_LOCAL.get(), test);
	}

	public void sendTenDollars() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Generating Fake Test Data
		String FirstName = "Test";
		String PhoneNumber = "7894561230";

		// Enter User Name
		if (username.isDisplayed()) {
			username.clear();
			username.sendKeys("company");
			logPass("User Name company is Entered");
		} else {
			logFail("User Name Field is Not Displayed");
		}

		// Enter Password
		if (password.isDisplayed()) {
			password.clear();
			password.sendKeys("company");
			logPass("password company is Entered");
		} else {
			logFail("Password Field is Not Displayed");
		}

		// Click On Login
		if (login.isDisplayed()) {
			login.click();
			logPass("Clicked on Login");
		} else {
			logFail("Login button is Not Displayed");
		}

		// Click on Make Payment
		if (makepayment.isDisplayed()) {
			makepayment.click();
			logPass("Clicked on Make Payment");
		} else {
			logFail("Make Payment is not Displayed");
		}

		// Enter phone Number
		if (phoneno.isDisplayed()) {
			phoneno.clear();
			phoneno.sendKeys(PhoneNumber);
			logPass("Phone Number : " + PhoneNumber + " is Entered");
		} else {
			logFail("Phone Number Field is not Displayed");
		}

		// Enter Name
		if (name.isDisplayed()) {
			name.clear();
			name.sendKeys(FirstName);
			logPass("Name : " + FirstName + " is Entered");
		} else {
			logFail("Name Field is not Displayed");
		}

		// Enter Amount
		if (amount.isDisplayed()) {
			amount.clear();
			amount.sendKeys("10");
			logPass("Amount $10 is Entered");
		} else {
			logFail("Amount Field is not Displayed");
		}

		// Enter Country
		if (country.isDisplayed()) {
			country.clear();
			country.sendKeys("India");
			logPass("Country India is Entered");
		} else {
			logFail("Country Field is not Displayed");
		}

		// Click on Send Payment
		if (sendpayment.isDisplayed()) {
			sendpayment.click();
			logPass("Clicked on Send Payment");
		} else {
			logFail("Send Payment is not Displayed");
		}

		// Click on Yes
		if (confirmyes.isDisplayed()) {
			confirmyes.click();
			logPass("Clicked on Yes");
		} else {
			logFail("Yes is not Displayed");
		}

		// Click on Logout
		if (logout.isDisplayed()) {
			logout.click();
			logPass("Clicked on Logout");
		} else {
			logFail("Logout is not Displayed");
		}

	}

}

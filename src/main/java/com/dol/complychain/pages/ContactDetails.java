package com.dol.complychain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basepage.BasePage;
import com.dol.complychain.repo.Locator;

public class ContactDetails extends BasePage {

	@FindBy(how = How.XPATH, using = Locator.AND_CONTACTUS)
	public WebElement contactus;

	@FindBy(how = How.XPATH, using = Locator.AND_NAME)
	public WebElement name;

	@FindBy(how = How.XPATH, using = Locator.AND_NUMBER)
	public WebElement number;

	@FindBy(how = How.XPATH, using = Locator.AND_EMAIL)
	public WebElement email;

	public ContactDetails(WebDriver driver, ExtentTest test) {
		super(DRIVER_LOCAL.get(), test);
	}

	public void Submit_Contactus() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Generating Fake Test Data
		String FirstName = "VTest";
		String PhoneNumber ="789456123";
		String EMail = "test@test.com";

		// Click on Contact Us
		if (contactus.isDisplayed()) {
			contactus.click();
			logPass("Clicked on Contact Us");
		} else {
			logFail("Contact Us is not Displayed");
		}
		// Enter Name
		if (name.isDisplayed()) {
			name.clear();
			name.sendKeys(FirstName);
			logPass("Name : " + FirstName + " is Entered");
		} else {
			logFail("Name Field is not Displayed");
		}

		// Enter Contact Number
		if (number.isDisplayed()) {
			number.clear();
			number.sendKeys(PhoneNumber);
			logPass("Contact Number : " + PhoneNumber + " is Entered");
		} else {
			logFail("Contact Number Field is not Displayed");
		}
		// Enter Email Address
		if (email.isDisplayed()) {
			email.clear();
			email.sendKeys(EMail);
			logPass("Email Address : " + EMail + " is Entered");
		} else {
			logFail("Email Address Field is not Displayed");
		}

	}

}

package com.dol.complychain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.dol.complychain.basepage.BasePage;
import com.dol.complychain.repo.Locator;

public class IosPages extends BasePage {

	@FindBy(how = How.XPATH, using = Locator.I_COMPLYCHAIN_LOGO_IMG)
	public WebElement ComplyChainLogo;

	@FindBy(how = How.XPATH, using = Locator.I_ILAB)
	public WebElement ILAB;

	@FindBy(how = How.XPATH, using = Locator.I_EN_MENU)
	public WebElement enmenu;

	@FindBy(how = How.XPATH, using = Locator.I_ES_MENU)
	public WebElement esmenu;

	@FindBy(how = How.XPATH, using = Locator.I_FR_MENU)
	public WebElement frmenu;

	@FindBy(how = How.XPATH, using = Locator.I_EN_MENUCLOSE)
	public WebElement enmenuclose;

	@FindBy(how = How.XPATH, using = Locator.I_ES_MENUCLOSE)
	public WebElement esmenuclose;

	@FindBy(how = How.XPATH, using = Locator.I_FR_MENUCLOSE)
	public WebElement frmenuclose;

	@FindBy(how = How.ID, using = Locator.I_ENGLISH_BUTTON)
	public WebElement english;

	@FindBy(how = How.ID, using = Locator.I_SPANISH_BUTTON)
	public WebElement spanish;

	@FindBy(how = How.ID, using = Locator.I_FRENCH_BUTTON)
	public WebElement french;

	@FindBy(how = How.XPATH, using = Locator.I_EN_WHAT_ARE)
	public WebElement enwhatare;

	@FindBy(how = How.XPATH, using = Locator.I_EN_WHY_DEVOLOP)
	public WebElement enwhydevelop;

	@FindBy(how = How.XPATH, using = Locator.I_EN_BASICS)
	public WebElement enbasics;

	@FindBy(how = How.XPATH, using = Locator.I_EN_STEPS_DROPDOWN)
	public WebElement enstepsdropdown;

	@FindBy(how = How.XPATH, using = Locator.I_ES_WHAT_ARE)
	public WebElement eswhatare;

	@FindBy(how = How.XPATH, using = Locator.I_ES_WHY_DEVOLOP)
	public WebElement eswhydevelop;

	@FindBy(how = How.XPATH, using = Locator.I_ES_BASICS)
	public WebElement esbasics;

	@FindBy(how = How.XPATH, using = Locator.I_ES_STEPS_DROPDOWN)
	public WebElement esstepsdropdown;

	@FindBy(how = How.XPATH, using = Locator.I_FR_WHAT_ARE)
	public WebElement frwhatare;

	@FindBy(how = How.XPATH, using = Locator.I_FR_WHY_DEVOLOP)
	public WebElement frwhydevelop;

	@FindBy(how = How.XPATH, using = Locator.I_FR_BASICS)
	public WebElement frbasics;

	@FindBy(how = How.XPATH, using = Locator.I_FR_STEPS_DROPDOWN)
	public WebElement frstepsdropdown;

	@FindBy(how = How.XPATH, using = Locator.I_HOMEPAGE_HEADER)
	public WebElement homepageHeader;

	@FindBy(how = How.XPATH, using = Locator.I_EN_BOOKMARKS)
	public WebElement enbookmarks;

	@FindBy(how = How.XPATH, using = Locator.I_EN_SEARCH)
	public WebElement ensearch;

	@FindBy(how = How.XPATH, using = Locator.I_EN_SHARE)
	public WebElement enshare;

	@FindBy(how = How.XPATH, using = Locator.I_EN_ABOUT)
	public WebElement enabout;

	@FindBy(how = How.XPATH, using = Locator.I_ES_BOOKMARKS)
	public WebElement esbookmarks;

	@FindBy(how = How.XPATH, using = Locator.I_ES_SEARCH)
	public WebElement essearch;

	@FindBy(how = How.XPATH, using = Locator.I_ES_SHARE)
	public WebElement esshare;

	@FindBy(how = How.XPATH, using = Locator.I_ES_ABOUT)
	public WebElement esabout;

	@FindBy(how = How.XPATH, using = Locator.I_FR_BOOKMARKS)
	public WebElement frbookmarks;

	@FindBy(how = How.XPATH, using = Locator.I_FR_SEARCH)
	public WebElement frsearch;

	@FindBy(how = How.XPATH, using = Locator.I_FR_SHARE)
	public WebElement frshare;

	@FindBy(how = How.XPATH, using = Locator.I_FR_ABOUT)
	public WebElement frabout;

	@FindBy(how = How.XPATH, using = Locator.I_EN_STEP1)
	public WebElement enstep1;

	@FindBy(how = How.XPATH, using = Locator.I_EN_STEP2)
	public WebElement enstep2;

	@FindBy(how = How.XPATH, using = Locator.I_EN_STEP3)
	public WebElement enstep3;

	@FindBy(how = How.XPATH, using = Locator.I_EN_STEP4)
	public WebElement enstep4;

	@FindBy(how = How.XPATH, using = Locator.I_EN_STEP5)
	public WebElement enstep5;

	@FindBy(how = How.XPATH, using = Locator.I_EN_STEP6)
	public WebElement enstep6;

	@FindBy(how = How.XPATH, using = Locator.I_EN_STEP7)
	public WebElement enstep7;

	@FindBy(how = How.XPATH, using = Locator.I_EN_STEP8)
	public WebElement enstep8;

	@FindBy(how = How.XPATH, using = Locator.I_ES_STEP1)
	public WebElement esstep1;

	@FindBy(how = How.XPATH, using = Locator.I_ES_STEP2)
	public WebElement esstep2;

	@FindBy(how = How.XPATH, using = Locator.I_ES_STEP3)
	public WebElement esstep3;

	@FindBy(how = How.XPATH, using = Locator.I_ES_STEP4)
	public WebElement esstep4;

	@FindBy(how = How.XPATH, using = Locator.I_ES_STEP5)
	public WebElement esstep5;

	@FindBy(how = How.XPATH, using = Locator.I_ES_STEP6)
	public WebElement esstep6;

	@FindBy(how = How.XPATH, using = Locator.I_ES_STEP7)
	public WebElement esstep7;

	@FindBy(how = How.XPATH, using = Locator.I_ES_STEP8)
	public WebElement esstep8;

	@FindBy(how = How.XPATH, using = Locator.I_FR_STEP1)
	public WebElement frstep1;

	@FindBy(how = How.XPATH, using = Locator.I_FR_STEP2)
	public WebElement frstep2;

	@FindBy(how = How.XPATH, using = Locator.I_FR_STEP3)
	public WebElement frstep3;

	@FindBy(how = How.XPATH, using = Locator.I_FR_STEP4)
	public WebElement frstep4;

	@FindBy(how = How.XPATH, using = Locator.I_FR_STEP5)
	public WebElement frstep5;

	@FindBy(how = How.XPATH, using = Locator.I_FR_STEP6)
	public WebElement frstep6;

	@FindBy(how = How.XPATH, using = Locator.I_FR_STEP7)
	public WebElement frstep7;

	@FindBy(how = How.XPATH, using = Locator.I_FR_STEP8)
	public WebElement frstep8;

	@FindBy(how = How.XPATH, using = Locator.I_EN_HOME_WHY_DEVOLOP)
	public WebElement enhomewhydevelop;

	@FindBy(how = How.XPATH, using = Locator.I_EN_HOME_BASICS)
	public WebElement enhomebasics;

	@FindBy(how = How.XPATH, using = Locator.I_EN_HOME_STEP1)
	public WebElement enhomestep1;

	@FindBy(how = How.XPATH, using = Locator.I_EN_HOME_STEP2)
	public WebElement enhomestep2;

	@FindBy(how = How.XPATH, using = Locator.I_EN_HOME_STEP3)
	public WebElement enhomestep3;

	@FindBy(how = How.XPATH, using = Locator.I_EN_HOME_STEP4)
	public WebElement enhomestep4;

	@FindBy(how = How.XPATH, using = Locator.I_EN_HOME_STEP5)
	public WebElement enhomestep5;

	@FindBy(how = How.XPATH, using = Locator.I_EN_HOME_STEP6)
	public WebElement enhomestep6;

	@FindBy(how = How.XPATH, using = Locator.I_EN_HOME_STEP7)
	public WebElement enhomestep7;

	@FindBy(how = How.XPATH, using = Locator.I_EN_HOME_STEP8)
	public WebElement enhomestep8;

	@FindBy(how = How.XPATH, using = Locator.I_ES_HOME_WHY_DEVOLOP)
	public WebElement eshomewhydevelop;

	@FindBy(how = How.XPATH, using = Locator.I_ES_HOME_BASICS)
	public WebElement eshomebasics;

	@FindBy(how = How.XPATH, using = Locator.I_ES_HOME_STEP1)
	public WebElement eshomestep1;

	@FindBy(how = How.XPATH, using = Locator.I_ES_HOME_STEP2)
	public WebElement eshomestep2;

	@FindBy(how = How.XPATH, using = Locator.I_ES_HOME_STEP3)
	public WebElement eshomestep3;

	@FindBy(how = How.XPATH, using = Locator.I_ES_HOME_STEP4)
	public WebElement eshomestep4;

	@FindBy(how = How.XPATH, using = Locator.I_ES_HOME_STEP5)
	public WebElement eshomestep5;

	@FindBy(how = How.XPATH, using = Locator.I_ES_HOME_STEP6)
	public WebElement eshomestep6;

	@FindBy(how = How.XPATH, using = Locator.I_ES_HOME_STEP7)
	public WebElement eshomestep7;

	@FindBy(how = How.XPATH, using = Locator.I_ES_HOME_STEP8)
	public WebElement eshomestep8;

	@FindBy(how = How.XPATH, using = Locator.I_FR_HOME_WHY_DEVOLOP)
	public WebElement frhomewhydevelop;

	@FindBy(how = How.XPATH, using = Locator.I_FR_HOME_BASICS)
	public WebElement frhomebasics;

	@FindBy(how = How.XPATH, using = Locator.I_FR_HOME_STEP1)
	public WebElement frhomestep1;

	@FindBy(how = How.XPATH, using = Locator.I_FR_HOME_STEP2)
	public WebElement frhomestep2;

	@FindBy(how = How.XPATH, using = Locator.I_FR_HOME_STEP3)
	public WebElement frhomestep3;

	@FindBy(how = How.XPATH, using = Locator.I_FR_HOME_STEP4)
	public WebElement frhomestep4;

	@FindBy(how = How.XPATH, using = Locator.I_FR_HOME_STEP5)
	public WebElement frhomestep5;

	@FindBy(how = How.XPATH, using = Locator.I_FR_HOME_STEP6)
	public WebElement frhomestep6;

	@FindBy(how = How.XPATH, using = Locator.I_FR_HOME_STEP7)
	public WebElement frhomestep7;

	@FindBy(how = How.XPATH, using = Locator.I_FR_HOME_STEP8)
	public WebElement frhomestep8;

	public IosPages(WebDriver driver, ExtentTest test) {
		super(DRIVER_LOCAL.get(), test);
	}

	public void HomePageVerification_EN() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Landing Page
		if (english.isDisplayed()) {
			logPass("DOL Comply Chain Landing Page is Displayed");
			english.click();
		} else {
			logFail("DOL Comply Chain Landing Page is not Displayed");
		}

		// Comply Chain Logo
		if (ComplyChainLogo.isDisplayed()) {
			logPass("Comply Chain Logo is Displayed");
		} else {
			logFail("Comply Chain Logo is Not Displayed");
		}

		// Header ILAB
		if (ILAB.isDisplayed()) {
			logPass("ILAB is displayed");
		} else {
			logFail("ILAB is Not Displayed");
		}

		// Home Page Content Validation

		if (enhomewhydevelop.isDisplayed()) {
			logPass("Home Page - Why Develop a Social Compliance System? is displayed");
			if (enhomewhydevelop.getText().trim().equalsIgnoreCase("Why Develop a Social Compliance System?")) {
				logPass("Home Page - Why Develop a Social Compliance System? link Verified");
			} else {
				logFail("Home Page - Why Develop a Social Compliance System? Verification Failed");
			}
		} else {
			logFail("Home Page - Why Develop a Social Compliance System? link is not displayed");

		}

		if (enhomebasics.isDisplayed()) {
			logPass("Home Page - Basics of a Social Compliance System is displayed");
			if (enhomebasics.getText().trim().equalsIgnoreCase("Basics of a Social Compliance System")) {
				logPass("Home Page - Basics of a Social Compliance System link Verified");
			} else {
				logFail("Home Page - Basics of a Social Compliance System Verification Failed");
			}
		} else {
			logFail("Home Page - Basics of a Social Compliance System link is not displayed");
		}

		if (enhomestep1.isDisplayed()) {
			logPass("Home Page - Step 1: Engage Stakeholders and Partners is displayed");
			if (enhomestep1.getText().trim().equalsIgnoreCase("Step 1: Engage Stakeholders and Partners")) {
				logPass("Home Page - Step 1: Engage Stakeholders and Partners link Verified");
			} else {
				logFail("Home Page - Step 1: Engage Stakeholders and Partners Verification Failed");
			}
		} else {
			logFail("Home Page - Step 1: Engage Stakeholders and Partners link is not displayed");
		}

		if (enhomestep2.isDisplayed()) {
			logPass("Home Page - Step 2: Assess Risks And Impacts is displayed");
			if (enhomestep2.getText().trim().equalsIgnoreCase("Step 2: Assess Risks And Impacts")) {
				logPass("Home Page - Step 2: Assess Risks And Impacts link Verified");
			} else {
				logFail("Home Page - Step 2: Assess Risks And Impacts Verification Failed");
			}
		} else {
			logFail("Home Page - Step 2: Assess Risks And Impacts link is not displayed");
		}

		if (enhomestep3.isDisplayed()) {
			logPass("Home Page - Step 3: Develop a Code of Conduct is displayed");
			if (enhomestep3.getText().trim().equalsIgnoreCase("Step 3: Develop a Code of Conduct")) {
				logPass("Home Page - Step 3: Develop a Code of Conduct link Verified");
			} else {
				logFail("Home Page - Step 3: Develop a Code of Conduct Verification Failed");
			}
		} else {
			logFail("Home Page - Step 3: Develop a Code of Conduct link is not displayed");
		}

		if (enhomestep4.isDisplayed()) {
			logPass("Home Page - Step 4: Communicate and Train across your Supply Chain is displayed");
			if (enhomestep4.getText().trim()
					.equalsIgnoreCase("Step 4: Communicate and Train across your Supply Chain")) {
				logPass("Home Page - Step 4: Communicate and Train across your Supply Chain link Verified");
			} else {
				logFail("Home Page - Step 4: Communicate and Train across your Supply Chain Verification Failed");
			}
		} else {
			logFail("Home Page - Step 4: Communicate and Train across your Supply Chain link is not displayed");
		}

		if (enhomestep5.isDisplayed()) {
			logPass("Home Page - Step 5: Monitor Compliance is displayed");
			if (enhomestep5.getText().trim().equalsIgnoreCase("Step 5: Monitor Compliance")) {
				logPass("Home Page - Step 5: Monitor Compliance link Verified");
			} else {
				logFail("Home Page - Step 5: Monitor Compliance Verification Failed");
			}
		} else {
			logFail("Home Page - Step 5: Monitor Compliance link is not displayed");
		}

		if (enhomestep6.isDisplayed()) {
			logPass("Home Page - Step 6: Remediate Violations is displayed");
			if (enhomestep6.getText().trim().equalsIgnoreCase("Step 6: Remediate Violations")) {
				logPass("Home Page - Step 6: Remediate Violations Verified");
			} else {
				logFail("Home Page - Step 6: Remediate Violations Verification Failed");
			}
		} else {
			logFail("Home Page - Step 6: Remediate Violations link is not displayed");
		}

		if (enhomestep7.isDisplayed()) {
			logPass("Home Page - Step 7: Independent Review is displayed");
			if (enhomestep7.getText().trim().equalsIgnoreCase("Step 7: Independent Review")) {
				logPass("Home Page - Step 7: Independent Review Verified");
			} else {
				logFail("Home Page - Step 7: Independent Review Verification Failed");
			}
		} else {
			logFail("Home Page - Step 7: Independent Review link is not displayed");
		}

		if (enhomestep8.isDisplayed()) {
			logPass("Home Page - Step 8: Report Performance is displayed");
			if (enhomestep8.getText().trim().equalsIgnoreCase("Step 8: Report Performance")) {
				logPass("Home Page - Step 8: Report Performance");
			} else {
				logFail("Home Page - Step 8: Report Performance Verification Failed");
			}
		} else {
			logFail("Home Page - Step 8: Report Performance link is not displayed");
		}

		// MENU opening and closing
		if (enmenu.isDisplayed()) {
			logPass("Menu is Displayed");
			enmenu.click();
			Thread.sleep(1000);
			if (enmenuclose.getText().equalsIgnoreCase("Close")) {
				logPass("Menu is opened Successfully");
				enmenuclose.click();
				if (enmenu.getText().equalsIgnoreCase("Menu")) {
					logPass("Menu is closed Successfully");
				} else {
					logFail("Menu is not closed Successfully");
				}
			} else {
				logFail("Menu is not opened Successfully");
			}
		} else {
			logFail("Menu is Not Displayed");
		}

		// Bottom Bar - Bookmarks
		if (enbookmarks.isDisplayed()) {
			logPass("Bookmarks link is displayed");
			if (enbookmarks.getText().trim().equalsIgnoreCase("Bookmarks")) {
				logPass("Bookmarks link Verified");
			} else {
				logFail("Bookmarks Verification Failed");
			}
		} else {
			logFail("Bookmarks link is not displayed");
		}

		// Bottom Bar - Search
		if (ensearch.isDisplayed()) {
			logPass("Search link is displayed");
			if (ensearch.getText().trim().equalsIgnoreCase("Search")) {
				logPass("Search link Verified");
			} else {
				logFail("Search Verification Failed");
			}
		} else {
			logFail("Search link is not displayed");
		}

		// Bottom Bar - Share
		if (enshare.isDisplayed()) {
			logPass("Share link is displayed");
			if (enshare.getText().trim().equalsIgnoreCase("Share")) {
				logPass("Share link Verified");
			} else {
				logFail("Share Verification Failed");
			}
		} else {
			logFail("Share link is not displayed");
		}

		// Bottom Bar - About
		if (enabout.isDisplayed()) {
			logPass("About link is displayed");
			if (enabout.getText().trim().equalsIgnoreCase("About")) {
				logPass("About link Verified");
			} else {
				logFail("About Verification Failed");
			}
		} else {
			logFail("About link is not displayed");
		}
	}

	public void HomePageVerification_ES() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Landing Page
		if (spanish.isDisplayed()) {
			logPass("DOL Comply Chain Landing Page is Displayed");
			spanish.click();
		} else {
			logFail("DOL Comply Chain Landing Page is not Displayed");
		}

		// Comply Chain Logo
		if (ComplyChainLogo.isDisplayed()) {
			logPass("Comply Chain Logo is Displayed");
		} else {
			logFail("Comply Chain Logo is Not Displayed");
		}

		// Header ILAB
		if (ILAB.isDisplayed()) {
			logPass("ILAB is displayed");
		} else {
			logFail("ILAB is Not Displayed");
		}

		// MENU opening and closing
		if (esmenu.isDisplayed()) {
			logPass("Menú is Displayed");
			esmenu.click();
			Thread.sleep(1000);
			if (esmenuclose.getText().equalsIgnoreCase("Cerrar")) {
				logPass("Menú is opened Successfully");
				esmenuclose.click();
				if (esmenu.getText().equalsIgnoreCase("Menú")) {
					logPass("Menú is closed Successfully");
				} else {
					logFail("Menú is not closed Successfully");
				}
			} else {
				logFail("Menú is not opened Successfully");
			}
		} else {
			logFail("Menú is Not Displayed");
		}

		// Bottom Bar - Bookmarks
		if (esbookmarks.isDisplayed()) {
			logPass("Bookmarks link is displayed");
			if (esbookmarks.getText().trim().equalsIgnoreCase("Bookmarks")) {
				logPass("Bookmarks link Verified");
			} else {
				logFail("Bookmarks Verification Failed");
			}
		} else {
			logFail("Bookmarks link is not displayed");
		}

		// Bottom Bar - Buscar
		if (essearch.isDisplayed()) {
			logPass("Buscar link is displayed");
			if (essearch.getText().trim().equalsIgnoreCase("Buscar")) {
				logPass("Buscar link Verified");
			} else {
				logFail("Buscar Verification Failed");
			}
		} else {
			logFail("Buscar link is not displayed");
		}

		// Bottom Bar - Share
		if (esshare.isDisplayed()) {
			logPass("Share link is displayed");
			if (esshare.getText().trim().equalsIgnoreCase("Share")) {
				logPass("Share link Verified");
			} else {
				logFail("Share Verification Failed");
			}
		} else {
			logFail("Share link is not displayed");
		}

		// Bottom Bar - About
		if (esabout.isDisplayed()) {
			logPass("About link is displayed");
			if (esabout.getText().trim().equalsIgnoreCase("About")) {
				logPass("About link Verified");
			} else {
				logFail("About Verification Failed");
			}
		} else {
			logFail("About link is not displayed");
		}

	}

	public void HomePageVerification_FR() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Landing Page
		if (french.isDisplayed()) {
			logPass("DOL Comply Chain Landing Page is Displayed");
			french.click();
		} else {
			logFail("DOL Comply Chain Landing Page is not Displayed");
		}

		// Comply Chain Logo
		if (ComplyChainLogo.isDisplayed()) {
			logPass("Comply Chain Logo is Displayed");
		} else {
			logFail("Comply Chain Logo is Not Displayed");
		}

		// Header ILAB
		if (ILAB.isDisplayed()) {
			logPass("ILAB is displayed");
		} else {
			logFail("ILAB is Not Displayed");
		}

		// MENU opening and closing
		if (frmenu.isDisplayed()) {
			logPass("Menu is Displayed");
			frmenu.click();
			Thread.sleep(1000);
			if (frmenuclose.getText().equalsIgnoreCase("Fermer")) {
				logPass("Menú is opened Successfully");
				frmenuclose.click();
				if (frmenu.getText().equalsIgnoreCase("Menu")) {
					logPass("Menu is closed Successfully");
				} else {
					logFail("Menu is not closed Successfully");
				}
			} else {
				logFail("Menu is not opened Successfully");
			}
		} else {
			logFail("Menú is Not Displayed");
		}

		// Bottom Bar - Bookmarks
		if (frbookmarks.isDisplayed()) {
			logPass("Bookmarks link is displayed");
			if (frbookmarks.getText().trim().equalsIgnoreCase("Bookmarks")) {
				logPass("Bookmarks link Verified");
			} else {
				logFail("Bookmarks Verification Failed");
			}
		} else {
			logFail("Bookmarks link is not displayed");
		}

		// Bottom Bar - Rechercher
		if (frsearch.isDisplayed()) {
			logPass("Rechercher link is displayed");
			if (frsearch.getText().trim().equalsIgnoreCase("Rechercher")) {
				logPass("Rechercher link Verified");
			} else {
				logFail("Rechercher Verification Failed");
			}
		} else {
			logFail("Rechercher link is not displayed");
		}

		// Bottom Bar - Share
		if (frshare.isDisplayed()) {
			logPass("Share link is displayed");
			if (frshare.getText().trim().equalsIgnoreCase("Share")) {
				logPass("Share link Verified");
			} else {
				logFail("Share Verification Failed");
			}
		} else {
			logFail("Share link is not displayed");
		}

		// Bottom Bar - About
		if (frabout.isDisplayed()) {
			logPass("About link is displayed");
			if (frabout.getText().trim().equalsIgnoreCase("About")) {
				logPass("About link Verified");
			} else {
				logFail("About Verification Failed");
			}
		} else {
			logFail("About link is not displayed");
		}
	}

	public void MenuVerification_EN() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Landing Page
		if (english.isDisplayed()) {
			logPass("DOL Comply Chain Landing Page is Displayed");
			english.click();
		} else {
			logFail("DOL Comply Chain Landing Page is not Displayed");
		}

		// Comply Chain Logo
		if (ComplyChainLogo.isDisplayed()) {
			logPass("Comply Chain Logo is Displayed");
		} else {
			logFail("Comply Chain Logo is Not Displayed");
		}

		// Header ILAB
		if (ILAB.isDisplayed()) {
			logPass("ILAB is displayed");
		} else {
			logFail("ILAB is Not Displayed");
		}

		// MENU opening and closing
		if (enmenu.isDisplayed()) {
			logPass("MENU is Displayed");
			enmenu.click();
			Thread.sleep(1000);
			if (enmenuclose.getText().equalsIgnoreCase("Close")) {
				logPass("MENU is opened Successfully");
			} else {
				logFail("MENU is not opened Successfully");
			}
		} else {
			logFail("MENU is Not Displayed");
		}

		// WHAT_ARE
		if (enwhatare.isDisplayed()) {
			logPass("What are Child Labor and Forced Labor? link is displayed");
			if (enwhatare.getText().trim().equalsIgnoreCase("What are Child Labor and Forced Labor?")) {
				logPass("What are Child Labor and Forced Labor? link Verified");
			} else {
				logFail("What are Child Labor and Forced Labor? Verification Failed");
			}
		} else {
			logFail("What are Child Labor and Forced Labor? link is not displayed");
		}

		// WHY_DEVOLOP
		if (enwhydevelop.isDisplayed()) {
			logPass("Why Develop a Social Compliance System? link is displayed");
			if (enwhydevelop.getText().trim().equalsIgnoreCase("Why Develop a Social Compliance System?")) {
				logPass("Why Develop a Social Compliance System? link Verified");
			} else {
				logFail("Why Develop a Social Compliance System? Verification Failed");
			}
		} else {
			logFail("Why Develop a Social Compliance System? link is not displayed");
		}

		// BASICS
		if (enbasics.isDisplayed()) {
			logPass("Basics of a Social Compliance System link is displayed");
			if (enbasics.getText().trim().equalsIgnoreCase("Basics of a Social Compliance System")) {
				logPass("Basics of a Social Compliance System link Verified");
			} else {
				logFail("Basics of a Social Compliance System Verification Failed");
			}
		} else {
			logFail("Basics of a Social Compliance System link is not displayed");
		}

		// Steps Drop Down
		if (enstepsdropdown.isDisplayed()) {
			logPass("Steps to a social compliance system is displayed");
			if (enstepsdropdown.getText().trim().equalsIgnoreCase("Steps to a social compliance system")) {
				logPass("Steps to a social compliance system Verified with Expandable Arrow Mark");
			} else {
				logFail("Steps to a social compliance system Verification Failed");
			}
		} else {
			logFail("Steps to a social compliance system link is not displayed");
		}

		// Language Buttons Verification
		if (english.isDisplayed() && english.getText().trim().equalsIgnoreCase("English")) {
			logPass("English Language Button is displayed and Verfied");
		} else {
			logFail("English Language Button is not displayed");
		}

		if (spanish.isDisplayed() && spanish.getText().trim().equalsIgnoreCase("Español")) {
			logPass("Español Language Button is displayed and Verfied");
		} else {
			logFail("Español Language Button is not displayed");
		}

		if (french.isDisplayed() && french.getText().trim().equalsIgnoreCase("Français")) {
			logPass("Français Language Button is displayed and Verfied");
		} else {
			logFail("Français Language Button is not displayed");
		}

		// Close Menu
		if (enmenuclose.isDisplayed()) {
			enmenuclose.click();
			if (enmenu.getText().equalsIgnoreCase("Menu")) {
				logPass("MENU is closed Successfully");
			} else {
				logFail("MENU is not closed Successfully");
			}
		}
	}

	public void MenuVerification_ES() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Landing Page
		if (spanish.isDisplayed()) {
			logPass("DOL Comply Chain Landing Page is Displayed");
			spanish.click();
		} else {
			logFail("DOL Comply Chain Landing Page is not Displayed");
		}

		// Comply Chain Logo
		if (ComplyChainLogo.isDisplayed()) {
			logPass("Comply Chain Logo is Displayed");
		} else {
			logFail("Comply Chain Logo is Not Displayed");
		}

		// Header ILAB
		if (ILAB.isDisplayed()) {
			logPass("ILAB is displayed");
		} else {
			logFail("ILAB is Not Displayed");
		}

		// MENU opening and closing
		if (esmenu.isDisplayed()) {
			logPass("Menú is Displayed");
			esmenu.click();
			Thread.sleep(1000);
			if (esmenuclose.getText().equalsIgnoreCase("Cerrar")) {
				logPass("Menú is opened Successfully");
			} else {
				logFail("Menú is not opened Successfully");
			}
		} else {
			logFail("Menú is Not Displayed");
		}

		// WHAT_ARE
		if (eswhatare.isDisplayed()) {
			logPass("¿Qué son el trabajo infantil y el trabajo forzoso? link is displayed");
			if (eswhatare.getText().trim().equalsIgnoreCase("¿Qué son el trabajo infantil y el trabajo forzoso?")) {
				logPass("¿Qué son el trabajo infantil y el trabajo forzoso? link Verified");
			} else {
				logFail("¿Qué son el trabajo infantil y el trabajo forzoso?? Verification Failed");
			}
		} else {
			logFail("¿Qué son el trabajo infantil y el trabajo forzoso? link is not displayed");
		}

		// WHY_DEVOLOP
		if (eswhydevelop.isDisplayed()) {
			logPass("¿Por qué crear un sistema de cumplimiento social? link is displayed");
			if (eswhydevelop.getText().trim().equalsIgnoreCase("¿Por qué crear un sistema de cumplimiento social?")) {
				logPass("¿Por qué crear un sistema de cumplimiento social? link Verified");
			} else {
				logFail("¿Por qué crear un sistema de cumplimiento social? Verification Failed");
			}
		} else {
			logFail("¿Por qué crear un sistema de cumplimiento social? link is not displayed");
		}

		// BASICS
		if (esbasics.isDisplayed()) {
			logPass("Aspectos básicos de un sistema de cumplimiento social link is displayed");
			if (esbasics.getText().trim().equalsIgnoreCase("Aspectos básicos de un sistema de cumplimiento social")) {
				logPass("Aspectos básicos de un sistema de cumplimiento social link Verified");
			} else {
				logFail("Aspectos básicos de un sistema de cumplimiento social Verification Failed");
			}
		} else {
			logFail("Aspectos básicos de un sistema de cumplimiento social link is not displayed");
		}

		// Steps Drop Down
		if (esstepsdropdown.isDisplayed()) {
			logPass("Pasos hacia un sistema de cumplimiento social is displayed");
			if (esstepsdropdown.getText().trim().equalsIgnoreCase("Pasos hacia un sistema de cumplimiento social")) {
				logPass("Pasos hacia un sistema de cumplimiento social Verified with Expandable Arrow Mark");
			} else {
				logFail("Pasos hacia un sistema de cumplimiento social Verification Failed");
			}
		} else {
			logFail("Pasos hacia un sistema de cumplimiento social link is not displayed");
		}

		// Language Buttons Verification
		if (english.isDisplayed() && english.getText().trim().equalsIgnoreCase("English")) {
			logPass("English Language Button is displayed and Verfied");
		} else {
			logFail("English Language Button is not displayed");
		}

		if (spanish.isDisplayed() && spanish.getText().trim().equalsIgnoreCase("Español")) {
			logPass("Español Language Button is displayed and Verfied");
		} else {
			logFail("Español Language Button is not displayed");
		}

		if (french.isDisplayed() && french.getText().trim().equalsIgnoreCase("Français")) {
			logPass("Français Language Button is displayed and Verfied");
		} else {
			logFail("Français Language Button is not displayed");
		}

		// Close Menu
		if (esmenuclose.isDisplayed()) {
			esmenuclose.click();
			if (esmenu.getText().equalsIgnoreCase("Menú")) {
				logPass("Menú is closed Successfully");
			} else {
				logFail("Menú is not closed Successfully");
			}
		}

	}

	public void MenuVerification_FR() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Landing Page
		if (french.isDisplayed()) {
			logPass("DOL Comply Chain Landing Page is Displayed");
			french.click();
		} else {
			logFail("DOL Comply Chain Landing Page is not Displayed");
		}

		// Comply Chain Logo
		if (ComplyChainLogo.isDisplayed()) {
			logPass("Comply Chain Logo is Displayed");
		} else {
			logFail("Comply Chain Logo is Not Displayed");
		}

		// Header ILAB
		if (ILAB.isDisplayed()) {
			logPass("ILAB is displayed");
		} else {
			logFail("ILAB is Not Displayed");
		}

		// MENU opening and closing
		if (frmenu.isDisplayed()) {
			logPass("Menu is Displayed");
			frmenu.click();
			Thread.sleep(1000);
			if (frmenuclose.getText().equalsIgnoreCase("Fermer")) {
				logPass("Menú is opened Successfully");
			} else {
				logFail("Menu is not opened Successfully");
			}
		} else {
			logFail("Menú is Not Displayed");
		}

		// WHAT_ARE
		if (frwhatare.isDisplayed()) {
			logPass("Qu'est-ce que le travail des enfants et le travail forcé ? link is displayed");
			if (frwhatare.getText().trim()
					.equalsIgnoreCase("Qu'est-ce que le travail des enfants et le travail forcé ?")) {
				logPass("Qu'est-ce que le travail des enfants et le travail forcé ? link Verified");
			} else {
				logFail("Qu'est-ce que le travail des enfants et le travail forcé ? Verification Failed");
			}
		} else {
			logFail("Qu'est-ce que le travail des enfants et le travail forcé ? link is not displayed");
		}

		// WHY_DEVOLOP
		if (frwhydevelop.isDisplayed()) {
			logPass("Pourquoi élaborer un système de conformité sociale ? link is displayed");
			if (frwhydevelop.getText().trim()
					.equalsIgnoreCase("Pourquoi élaborer un système de conformité sociale ?")) {
				logPass("Pourquoi élaborer un système de conformité sociale ? link Verified");
			} else {
				logFail("Pourquoi élaborer un système de conformité sociale ? Verification Failed");
			}
		} else {
			logFail("Pourquoi élaborer un système de conformité sociale ? link is not displayed");
		}

		// BASICS
		if (frbasics.isDisplayed()) {
			logPass("Fondements d’un système de conformité sociale link is displayed");
			if (frbasics.getText().trim().equalsIgnoreCase("Fondements d’un système de conformité sociale")) {
				logPass("Fondements d’un système de conformité sociale link Verified");
			} else {
				logFail("Fondements d’un système de conformité sociale Verification Failed");
			}
		} else {
			logFail("Fondements d’un système de conformité sociale link is not displayed");
		}

		// Steps Drop Down
		if (frstepsdropdown.isDisplayed()) {
			logPass("Étapes vers un système de conformité sociale is displayed");
			if (frstepsdropdown.getText().trim().equalsIgnoreCase("Étapes vers un système de conformité sociale")) {
				logPass("Étapes vers un système de conformité sociale Verified with Expandable Arrow Mark");
			} else {
				logFail("Étapes vers un système de conformité sociale Verification Failed");
			}
		} else {
			logFail("Étapes vers un système de conformité sociale link is not displayed");
		}

		// Language Buttons Verification
		if (english.isDisplayed() && english.getText().trim().equalsIgnoreCase("English")) {
			logPass("English Language Button is displayed and Verfied");
		} else {
			logFail("English Language Button is not displayed");
		}

		if (spanish.isDisplayed() && spanish.getText().trim().equalsIgnoreCase("Español")) {
			logPass("Español Language Button is displayed and Verfied");
		} else {
			logFail("Español Language Button is not displayed");
		}

		if (french.isDisplayed() && french.getText().trim().equalsIgnoreCase("Français")) {
			logPass("Français Language Button is displayed and Verfied");
		} else {
			logFail("Français Language Button is not displayed");
		}

		// Close Menu
		if (frmenuclose.isDisplayed()) {
			frmenuclose.click();
			if (frmenu.getText().equalsIgnoreCase("Menu")) {
				logPass("Menu is closed Successfully");
			} else {
				logFail("Menu is not closed Successfully");
			}
		}

	}

	public void StepsVerification_EN() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Landing Page
		if (english.isDisplayed()) {
			logPass("DOL Comply Chain Landing Page is Displayed");
			english.click();
		} else {
			logFail("DOL Comply Chain Landing Page is not Displayed");
		}

		// Comply Chain Logo
		if (ComplyChainLogo.isDisplayed()) {
			logPass("Comply Chain Logo is Displayed");
		} else {
			logFail("Comply Chain Logo is Not Displayed");
		}

		// Header ILAB
		if (ILAB.isDisplayed()) {
			logPass("ILAB is displayed");
		} else {
			logFail("ILAB is Not Displayed");
		}

		// MENU opening and closing
		if (enmenu.isDisplayed()) {
			logPass("MENU is Displayed");
			enmenu.click();
			Thread.sleep(1000);
			if (enmenuclose.getText().equalsIgnoreCase("Close")) {
				logPass("MENU is opened Successfully");
			} else {
				logFail("MENU is not opened Successfully");
			}
		} else {
			logFail("MENU is Not Displayed");
		}

		// WHAT_ARE
		if (enwhatare.isDisplayed()) {
			logPass("What are Child Labor and Forced Labor? link is displayed");
			if (enwhatare.getText().trim().equalsIgnoreCase("What are Child Labor and Forced Labor?")) {
				logPass("What are Child Labor and Forced Labor? link Verified");
			} else {
				logFail("What are Child Labor and Forced Labor? Verification Failed");
			}
		} else {
			logFail("What are Child Labor and Forced Labor? link is not displayed");
		}

		// WHY_DEVOLOP
		if (enwhydevelop.isDisplayed()) {
			logPass("Why Develop a Social Compliance System? link is displayed");
			if (enwhydevelop.getText().trim().equalsIgnoreCase("Why Develop a Social Compliance System?")) {
				logPass("Why Develop a Social Compliance System? link Verified");
			} else {
				logFail("Why Develop a Social Compliance System? Verification Failed");
			}
		} else {
			logFail("Why Develop a Social Compliance System? link is not displayed");
		}

		// BASICS
		if (enbasics.isDisplayed()) {
			logPass("Basics of a Social Compliance System link is displayed");
			if (enbasics.getText().trim().equalsIgnoreCase("Basics of a Social Compliance System")) {
				logPass("Basics of a Social Compliance System link Verified");
			} else {
				logFail("Basics of a Social Compliance System Verification Failed");
			}
		} else {
			logFail("Basics of a Social Compliance System link is not displayed");
		}

		// Steps Drop Down
		if (enstepsdropdown.isDisplayed()) {
			logPass("Steps to a social compliance system is displayed");
			if (enstepsdropdown.getText().trim().equalsIgnoreCase("Steps to a social compliance system")) {
				logPass("Steps to a social compliance system Verified with Expandable Arrow Mark");
			} else {
				logFail("Steps to a social compliance system Verification Failed");
			}
		} else {
			logFail("Steps to a social compliance system link is not displayed");
		}

		// Steps Expanded
		if (enstepsdropdown.isDisplayed()) {
			enstepsdropdown.click();
			logPass("Steps to a social compliance system Expanded");
		}

		// Step 1 Verification
		if (enstep1.isDisplayed()) {
			logPass("Step 1: Engage Stakeholders and Partners is displayed");
			if (enstep1.getText().trim().equalsIgnoreCase("Step 1: Engage Stakeholders and Partners")) {
				logPass("Step 1: Engage Stakeholders and Partners is Verified");
			} else {
				logFail("Step 1: Engage Stakeholders and Partners Verification Failed");
			}
		} else {
			logFail("Step 1: Engage Stakeholders and Partners link is not displayed");
		}

		// Step 2 Verification
		if (enstep2.isDisplayed()) {
			logPass("Step 2: Assess Risks And Impacts is displayed");
			if (enstep2.getText().trim().equalsIgnoreCase("Step 2: Assess Risks And Impacts")) {
				logPass("Step 2: Assess Risks And Impacts is Verified");
			} else {
				logFail("Step 2: Assess Risks And Impacts Verification Failed");
			}
		} else {
			logFail("Step 2: Assess Risks And Impacts link is not displayed");
		}

		// Step 3 Verification
		if (enstep3.isDisplayed()) {
			logPass("Step 3: Develop a Code of Conduct displayed");
			if (enstep3.getText().trim().equalsIgnoreCase("Step 3: Develop a Code of Conduct")) {
				logPass("Step 3: Develop a Code of Conduct Verified");
			} else {
				logFail("Step 3: Develop a Code of Conduct Verification Failed");
			}
		} else {
			logFail("Step 3:  Develop a Code of Conduct link is not displayed");
		}

		// Step 4 Verification
		if (enstep4.isDisplayed()) {
			logPass("Step 4: Communicate and Train across your Supply Chain displayed");
			if (enstep4.getText().trim().equalsIgnoreCase("Step 4: Communicate and Train across your Supply Chain")) {
				logPass("Step 4: Communicate and Train across your Supply Chain Verified");
			} else {
				logFail("Step 4: Communicate and Train across your Supply Chain Verification Failed");
			}
		} else {
			logFail("Step 4: Communicate and Train across your Supply Chain link is not displayed");
		}

		// Step 5 Verification
		if (enstep5.isDisplayed()) {
			logPass("Step 5: Monitor Compliance is displayed");
			if (enstep5.getText().trim().equalsIgnoreCase("Step 5: Monitor Compliance")) {
				logPass("Step 5: Monitor Compliance Verified");
			} else {
				logFail("Step 5: Monitor Compliance Verification Failed");
			}
		} else {
			logFail("Step 5: Monitor Compliance link is not displayed");
		}

		// Step 6 Verification
		if (enstep6.isDisplayed()) {
			logPass("Step 6: Remediate Violations displayed");
			if (enstep6.getText().trim().equalsIgnoreCase("Step 6: Remediate Violations")) {
				logPass("Step 6: Remediate Violations Verified");
			} else {
				logFail("Step 6: Remediate Violations Verification Failed");
			}
		} else {
			logFail("Step 6: Remediate Violations link is not displayed");
		}

		// Step 7 Verification
		if (enstep7.isDisplayed()) {
			logPass("Step 7: Independent Review displayed");
			if (enstep7.getText().trim().equalsIgnoreCase("Step 7: Independent Review")) {
				logPass("Step 7: Independent Review Verified");
			} else {
				logFail("Step 7: Independent Review Verification Failed");
			}
		} else {
			logFail("Step 7: Independent Review link is not displayed");
		}

		// Step 8 Verification
		if (enstep8.isDisplayed()) {
			logPass("Step 8: Report Performance displayed");
			if (enstep8.getText().trim().equalsIgnoreCase("Step 8: Report Performance")) {
				logPass("Step 8: Report Performance Verified");
			} else {
				logFail("Step 8: Report Performance Verification Failed");
			}
		} else {
			logFail("Step 8: Report Performance link is not displayed");
		}

		// Steps Collapsed
		if (enstepsdropdown.isDisplayed()) {
			enstepsdropdown.click();
			logPass("Steps to a social compliance system Collapsed");
		}

		// Close Menu
		if (enmenuclose.isDisplayed()) {
			enmenuclose.click();
			if (enmenu.getText().equalsIgnoreCase("Menu")) {
				logPass("MENU is closed Successfully");
			} else {
				logFail("MENU is not closed Successfully");
			}
		}
	}

	public void StepsVerification_ES() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Landing Page
		if (spanish.isDisplayed()) {
			logPass("DOL Comply Chain Landing Page is Displayed");
			spanish.click();
		} else {
			logFail("DOL Comply Chain Landing Page is not Displayed");
		}

		// Comply Chain Logo
		if (ComplyChainLogo.isDisplayed()) {
			logPass("Comply Chain Logo is Displayed");
		} else {
			logFail("Comply Chain Logo is Not Displayed");
		}

		// Header ILAB
		if (ILAB.isDisplayed()) {
			logPass("ILAB is displayed");
		} else {
			logFail("ILAB is Not Displayed");
		}

		// MENU opening and closing
		if (esmenu.isDisplayed()) {
			logPass("Menú is Displayed");
			esmenu.click();
			Thread.sleep(1000);
			if (esmenuclose.getText().equalsIgnoreCase("Cerrar")) {
				logPass("Menú is opened Successfully");
			} else {
				logFail("Menú is not opened Successfully");
			}
		} else {
			logFail("Menú is Not Displayed");
		}

		// WHAT_ARE
		if (frwhatare.isDisplayed()) {
			logPass("¿Qué son el trabajo infantil y el trabajo forzoso? link is displayed");
			if (frwhatare.getText().trim().equalsIgnoreCase("¿Qué son el trabajo infantil y el trabajo forzoso?")) {
				logPass("¿Qué son el trabajo infantil y el trabajo forzoso? link Verified");
			} else {
				logFail("¿Qué son el trabajo infantil y el trabajo forzoso?? Verification Failed");
			}
		} else {
			logFail("¿Qué son el trabajo infantil y el trabajo forzoso? link is not displayed");
		}

		// WHY_DEVOLOP
		if (eswhydevelop.isDisplayed()) {
			logPass("¿Por qué crear un sistema de cumplimiento social? link is displayed");
			if (eswhydevelop.getText().trim().equalsIgnoreCase("¿Por qué crear un sistema de cumplimiento social?")) {
				logPass("¿Por qué crear un sistema de cumplimiento social? link Verified");
			} else {
				logFail("¿Por qué crear un sistema de cumplimiento social? Verification Failed");
			}
		} else {
			logFail("¿Por qué crear un sistema de cumplimiento social? link is not displayed");
		}

		// BASICS
		if (esbasics.isDisplayed()) {
			logPass("Aspectos básicos de un sistema de cumplimiento social link is displayed");
			if (esbasics.getText().trim().equalsIgnoreCase("Aspectos básicos de un sistema de cumplimiento social")) {
				logPass("Aspectos básicos de un sistema de cumplimiento social link Verified");
			} else {
				logFail("Aspectos básicos de un sistema de cumplimiento social Verification Failed");
			}
		} else {
			logFail("Aspectos básicos de un sistema de cumplimiento social link is not displayed");
		}

		// Steps Drop Down
		if (esstepsdropdown.isDisplayed()) {
			logPass("Pasos hacia un sistema de cumplimiento social is displayed");
			if (esstepsdropdown.getText().trim().equalsIgnoreCase("Pasos hacia un sistema de cumplimiento social")) {
				logPass("Pasos hacia un sistema de cumplimiento social Verified with Expandable Arrow Mark");
			} else {
				logFail("Pasos hacia un sistema de cumplimiento social Verification Failed");
			}
		} else {
			logFail("Pasos hacia un sistema de cumplimiento social link is not displayed");
		}

		// Steps Expanded
		if (esstepsdropdown.isDisplayed()) {
			esstepsdropdown.click();
			logPass("Steps to a social compliance system Expanded");
		}

		// Step 1 Verification
		if (esstep1.isDisplayed()) {
			logPass("Primer paso: Participación de las partes interesadas y los socios is displayed");
			if (esstep1.getText().trim()
					.equalsIgnoreCase("Primer paso: Participación de las partes interesadas y los socios")) {
				logPass("Primer paso: Participación de las partes interesadas y los socios is Verified");
			} else {
				logFail("Primer paso: Participación de las partes interesadas y los socios Verification Failed");
			}
		} else {
			logFail("Primer paso: Participación de las partes interesadas y los socios link is not displayed");
		}

		// Step 2 Verification
		if (esstep2.isDisplayed()) {
			logPass("Segundo paso: Evaluación de riesgos e impacto is displayed");
			if (esstep2.getText().trim().equalsIgnoreCase("Segundo paso: Evaluación de riesgos e impacto")) {
				logPass("Segundo paso: Evaluación de riesgos e impacto is Verified");
			} else {
				logFail("Segundo paso: Evaluación de riesgos e impacto Verification Failed");
			}
		} else {
			logFail("Segundo paso: Evaluación de riesgos e impacto link is not displayed");
		}

		// Step 3 Verification
		if (esstep3.isDisplayed()) {
			logPass("Tercer paso: Formulación de un código de conducta is displayed");
			if (esstep3.getText().trim().equalsIgnoreCase("Tercer paso: Formulación de un código de conducta")) {
				logPass("Tercer paso: Formulación de un código de conducta Verified");
			} else {
				logFail("Tercer paso: Formulación de un código de conducta Verification Failed");
			}
		} else {
			logFail("Tercer paso: Formulación de un código de conducta link is not displayed");
		}

		// Step 4 Verification
		if (esstep4.isDisplayed()) {
			logPass("Cuarto paso: Comunicación y capacitación en la cadena de suministro is displayed");
			if (esstep4.getText().trim()
					.equalsIgnoreCase("Cuarto paso: Comunicación y capacitación en la cadena de suministro")) {
				logPass("Cuarto paso: Comunicación y capacitación en la cadena de suministro Verified");
			} else {
				logFail("Cuarto paso: Comunicación y capacitación en la cadena de suministro Verification Failed");
			}
		} else {
			logFail("Cuarto paso: Comunicación y capacitación en la cadena de suministro link is not displayed");
		}

		// Step 5 Verification
		if (esstep5.isDisplayed()) {
			logPass("Quinto paso: Vigilancia y seguimiento del cumplimiento is displayed");
			if (esstep5.getText().trim().equalsIgnoreCase("Quinto paso: Vigilancia y seguimiento del cumplimiento")
					&& esstep5.getAttribute("href").trim().contains("/steps/5")) {
				logPass("Quinto paso: Vigilancia y seguimiento del cumplimiento Verified");
			} else {
				logFail("Quinto paso: Vigilancia y seguimiento del cumplimiento Verification Failed");
			}
		} else {
			logFail("Quinto paso: Vigilancia y seguimiento del cumplimiento link is not displayed");
		}

		// Step 6 Verification
		if (esstep6.isDisplayed()) {
			logPass("Sexto paso: Remediación de infracciones is displayed");
			if (esstep6.getText().trim().equalsIgnoreCase("Sexto paso: Remediación de infracciones")
					&& esstep6.getAttribute("href").trim().contains("/steps/6")) {
				logPass("Sexto paso: Remediación de infracciones Verified");
			} else {
				logFail("Sexto paso: Remediación de infracciones Verification Failed");
			}
		} else {
			logFail("Sexto paso: Remediación de infracciones link is not displayed");
		}

		// Step 7 Verification
		if (esstep7.isDisplayed()) {
			logPass("Séptimo paso: Examen independiente displayed");
			if (esstep7.getText().trim().equalsIgnoreCase("Séptimo paso: Examen independiente")) {
				logPass("Séptimo paso: Examen independiente Verified");
			} else {
				logFail("Séptimo paso: Examen independiente Verification Failed");
			}
		} else {
			logFail("Séptimo paso: Examen independiente link is not displayed");
		}

		// Step 8 Verification
		if (esstep8.isDisplayed()) {
			logPass("Octavo paso: Notificación del desempeño is displayed");
			if (esstep8.getText().trim().equalsIgnoreCase("Octavo paso: Notificación del desempeño")) {
				logPass("Octavo paso: Notificación del desempeño Verified");
			} else {
				logFail("Octavo paso: Notificación del desempeño Verification Failed");
			}
		} else {
			logFail("Octavo paso: Notificación del desempeño link is not displayed");
		}

		// Steps Collapsed
		if (esstepsdropdown.isDisplayed()) {
			esstepsdropdown.click();
			logPass("Steps to a social compliance system Collapsed");
		}

		// Close Menu
		if (esmenuclose.isDisplayed()) {
			esmenuclose.click();
			if (esmenu.getText().equalsIgnoreCase("Menú")) {
				logPass("Menú is closed Successfully");
			} else {
				logFail("Menú is not closed Successfully");
			}
		}

	}

	public void StepsVerification_FR() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

		// Landing Page
		if (french.isDisplayed()) {
			logPass("DOL Comply Chain Landing Page is Displayed");
			french.click();
		} else {
			logFail("DOL Comply Chain Landing Page is not Displayed");
		}

		// Comply Chain Logo
		if (ComplyChainLogo.isDisplayed()) {
			logPass("Comply Chain Logo is Displayed");
		} else {
			logFail("Comply Chain Logo is Not Displayed");
		}

		// Header ILAB
		if (ILAB.isDisplayed()) {
			logPass("ILAB is displayed");
		} else {
			logFail("ILAB is Not Displayed");
		}

		// MENU opening and closing
		if (frmenu.isDisplayed()) {
			logPass("Menu is Displayed");
			frmenu.click();
			Thread.sleep(1000);
			if (frmenuclose.getText().equalsIgnoreCase("Fermer")) {
				logPass("Menu is opened Successfully");
			} else {
				logFail("Menu is not opened Successfully");
			}
		} else {
			logFail("Menu is Not Displayed");
		}

		// WHAT_ARE
		if (frwhatare.isDisplayed()) {
			logPass("Qu'est-ce que le travail des enfants et le travail forcé ? link is displayed");
			if (frwhatare.getText().trim()
					.equalsIgnoreCase("Qu'est-ce que le travail des enfants et le travail forcé ?")) {
				logPass("Qu'est-ce que le travail des enfants et le travail forcé ? link Verified");
			} else {
				logFail("Qu'est-ce que le travail des enfants et le travail forcé ? Verification Failed");
			}
		} else {
			logFail("Qu'est-ce que le travail des enfants et le travail forcé ? link is not displayed");
		}

		// WHY_DEVOLOP
		if (frwhydevelop.isDisplayed()) {
			logPass("Pourquoi élaborer un système de conformité sociale ? link is displayed");
			if (frwhydevelop.getText().trim()
					.equalsIgnoreCase("Pourquoi élaborer un système de conformité sociale ?")) {
				logPass("Pourquoi élaborer un système de conformité sociale ? link Verified");
			} else {
				logFail("Pourquoi élaborer un système de conformité sociale ? Verification Failed");
			}
		} else {
			logFail("Pourquoi élaborer un système de conformité sociale ? link is not displayed");
		}

		// BASICS
		if (frbasics.isDisplayed()) {
			logPass("Fondements d’un système de conformité sociale link is displayed");
			if (frbasics.getText().trim().equalsIgnoreCase("Fondements d’un système de conformité sociale")) {
				logPass("Fondements d’un système de conformité sociale link Verified");
			} else {
				logFail("Fondements d’un système de conformité sociale Verification Failed");
			}
		} else {
			logFail("Fondements d’un système de conformité sociale link is not displayed");
		}

		// Steps Drop Down
		if (frstepsdropdown.isDisplayed()) {
			logPass("Étapes vers un système de conformité sociale is displayed");
			if (frstepsdropdown.getText().trim().equalsIgnoreCase("Étapes vers un système de conformité sociale")) {
				logPass("Étapes vers un système de conformité sociale Verified with Expandable Arrow Mark");
			} else {
				logFail("Étapes vers un système de conformité sociale Verification Failed");
			}
		} else {
			logFail("Étapes vers un système de conformité sociale link is not displayed");
		}

		// Steps Expanded
		if (frstepsdropdown.isDisplayed()) {
			frstepsdropdown.click();
			logPass("Steps to a social compliance system Expanded");
		}

		// Step 1 Verification
		if (frstep1.isDisplayed()) {
			logPass("Première étape: faire participer les parties prenantes et les partenaires is displayed");
			if (frstep1.getText().trim()
					.equalsIgnoreCase("Première étape: faire participer les parties prenantes et les partenaires")) {
				logPass("Première étape: faire participer les parties prenantes et les partenaires is Verified");
			} else {
				logFail("Première étape: faire participer les parties prenantes et les partenaires Verification Failed");
			}
		} else {
			logFail("Première étape: faire participer les parties prenantes et les partenaires link is not displayed");
		}

		// Step 2 Verification
		if (frstep2.isDisplayed()) {
			logPass("Deuxième étape: Évaluer les risques et les incidences is displayed");
			if (frstep2.getText().trim().equalsIgnoreCase("Deuxième étape: Évaluer les risques et les incidences")) {
				logPass("Deuxième étape: Évaluer les risques et les incidences is Verified");
			} else {
				logFail("Deuxième étape: Évaluer les risques et les incidences Verification Failed");
			}
		} else {
			logFail("Deuxième étape: Évaluer les risques et les incidences link is not displayed");
		}

		// Step 3 Verification
		if (frstep3.isDisplayed()) {
			logPass("Troisième étape: élaborer un code de conduite is displayed");
			if (frstep3.getText().trim().equalsIgnoreCase("Troisième étape: élaborer un code de conduite")) {
				logPass("Troisième étape: élaborer un code de conduite Verified");
			} else {
				logFail("Troisième étape: élaborer un code de conduite Verification Failed");
			}
		} else {
			logFail("Troisième étape: élaborer un code de conduite link is not displayed");
		}

		// Step 4 Verification
		if (frstep4.isDisplayed()) {
			logPass("Step 4: Quatrième étape: communiquer et former dans l'ensemble de votre chaîne d'approvisionnement is displayed");
			if (frstep4.getText().trim().equalsIgnoreCase(
					"Quatrième étape: communiquer et former dans l'ensemble de votre chaîne d'approvisionnement")) {
				logPass("Quatrième étape: communiquer et former dans l'ensemble de votre chaîne d'approvisionnement Verified");
			} else {
				logFail("Quatrième étape: communiquer et former dans l'ensemble de votre chaîne d'approvisionnement Verification Failed");
			}
		} else {
			logFail("Quatrième étape: communiquer et former dans l'ensemble de votre chaîne d'approvisionnement link is not displayed");
		}

		// Step 5 Verification
		if (frstep5.isDisplayed()) {
			logPass("Cinquième étape: Surveiller la conformité is displayed");
			if (frstep5.getText().trim().equalsIgnoreCase("Cinquième étape: Surveiller la conformité")) {
				logPass("Cinquième étape:  Surveiller la conformité Verified");
			} else {
				logFail("Cinquième étape: Surveiller la conformité Verification Failed");
			}
		} else {
			logFail("Cinquième étape: Surveiller la conformité link is not displayed");
		}

		// Step 6 Verification
		if (frstep6.isDisplayed()) {
			logPass("Sixième étape: Réparer les infractions is displayed");
			if (frstep6.getText().trim().equalsIgnoreCase("Sixième étape: Réparer les infractions")) {
				logPass("Sixième étape: Réparer les infractions");
			} else {
				logFail("Sixième étape: Réparer les infractions Verification Failed");
			}
		} else {
			logFail("Sixième étape: Réparer les infractions link is not displayed");
		}

		// Step 7 Verification
		if (frstep7.isDisplayed()) {
			logPass("Septième étape: Examen indépendant is displayed");
			if (frstep7.getText().trim().equalsIgnoreCase("Septième étape: Examen indépendant")) {
				logPass("Septième étape: Examen indépendant Verified");
			} else {
				logFail("Septième étape: Examen indépendant Verification Failed");
			}
		} else {
			logFail("Septième étape: Examen indépendant link is not displayed");
		}

		// Step 8 Verification
		if (frstep8.isDisplayed()) {
			logPass("Huitième étape: Rendre compte des résultats is displayed");
			if (frstep8.getText().trim().equalsIgnoreCase("Huitième étape: Rendre compte des résultats")) {
				logPass("Huitième étape: Rendre compte des résultats Verified");
			} else {
				logFail("Huitième étape: Rendre compte des résultats Verification Failed");
			}
		} else {
			logFail("Huitième étape: Rendre compte des résultats link is not displayed");
		}

		// Steps Collapsed
		if (frstepsdropdown.isDisplayed()) {
			frstepsdropdown.click();
			logPass("Steps to a social compliance system Collapsed");
		}

		// Close Menu
		if (frmenuclose.isDisplayed()) {
			frmenuclose.click();
			if (frmenu.getText().equalsIgnoreCase("Menu")) {
				logPass("Menu is closed Successfully");
			} else {
				logFail("Menu is not closed Successfully");
			}
		}

	}

}

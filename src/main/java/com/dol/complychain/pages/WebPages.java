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
import com.dol.complychain.util.PropUtils;

public class WebPages extends BasePage {

	@FindBy(how = How.ID, using = Locator.COMPLYCHAIN_LOGO_IMG)
	public WebElement ComplyChainLogo;

	@FindBy(how = How.ID, using = Locator.ILAB)
	public WebElement ILAB;

	@FindBy(how = How.ID, using = Locator.MENU)
	public WebElement menu;

	@FindBy(how = How.ID, using = Locator.ENGLISH_BUTTON)
	public WebElement english;

	@FindBy(how = How.ID, using = Locator.SPANISH_BUTTON)
	public WebElement spanish;

	@FindBy(how = How.ID, using = Locator.FRENCH_BUTTON)
	public WebElement french;

	@FindBy(how = How.ID, using = Locator.WHAT_ARE)
	public WebElement whatare;

	@FindBy(how = How.ID, using = Locator.WHY_DEVOLOP)
	public WebElement whydevelop;

	@FindBy(how = How.ID, using = Locator.BASICS)
	public WebElement basics;

	@FindBy(how = How.ID, using = Locator.STEPS_DROPDOWN)
	public WebElement stepsdropdown;

	@FindBy(how = How.XPATH, using = Locator.HOMEPAGE_HEADER)
	public WebElement homepageHeader;

	@FindBy(how = How.ID, using = Locator.BOOKMARKS)
	public WebElement bookmarks;

	@FindBy(how = How.ID, using = Locator.SEARCH)
	public WebElement search;

	@FindBy(how = How.ID, using = Locator.SHARE)
	public WebElement share;

	@FindBy(how = How.ID, using = Locator.ABOUT)
	public WebElement about;

	@FindBy(how = How.ID, using = Locator.STEP1)
	public WebElement step1;

	@FindBy(how = How.ID, using = Locator.STEP2)
	public WebElement step2;

	@FindBy(how = How.ID, using = Locator.STEP3)
	public WebElement step3;

	@FindBy(how = How.ID, using = Locator.STEP4)
	public WebElement step4;

	@FindBy(how = How.ID, using = Locator.STEP5)
	public WebElement step5;

	@FindBy(how = How.ID, using = Locator.STEP6)
	public WebElement step6;

	@FindBy(how = How.ID, using = Locator.STEP7)
	public WebElement step7;

	@FindBy(how = How.ID, using = Locator.STEP8)
	public WebElement step8;

	public WebPages(WebDriver driver, ExtentTest test) {
		super(DRIVER_LOCAL.get(), test);
	}

	public void HomePageVerification_EN() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

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

		// Home Page Header
		if (homepageHeader.isDisplayed()) {
			logPass("Home Page Header is displayed");
		} else {
			logFail("Home Page Header is Not Displayed");
		}

		// MENU opening and closing
		if (menu.isDisplayed()) {
			logPass("MENU is Displayed");
			menu.click();
			Thread.sleep(1000);
			if (menu.getText().equalsIgnoreCase("Close")) {
				logPass("MENU is opened Successfully");
				menu.click();
				if (menu.getText().equalsIgnoreCase("Menu")) {
					logPass("MENU is closed Successfully");
				} else {
					logFail("MENU is not closed Successfully");
				}
			} else {
				logFail("MENU is not opened Successfully");
			}
		} else {
			logFail("MENU is Not Displayed");
		}

		// Bottom Bar - Bookmarks
		if (bookmarks.isDisplayed()) {
			logPass("Bookmarks link is displayed");
			if (bookmarks.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("Bookmarks")
					&& bookmarks.getAttribute("href").trim().contains("/bookmarks")) {
				logPass("Bookmarks link Verified");
			} else {
				logFail("Bookmarks Verification Failed");
			}
		} else {
			logFail("Bookmarks link is not displayed");
		}

		// Bottom Bar - Search
		if (search.isDisplayed()) {
			logPass("Search link is displayed");
			if (search.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("Search")
					&& search.getAttribute("href").trim().contains("/search")) {
				logPass("Search link Verified");
			} else {
				logFail("Search Verification Failed");
			}
		} else {
			logFail("Search link is not displayed");
		}

		// Bottom Bar - Share
		if (share.isDisplayed()) {
			logPass("Share link is displayed");
			if (share.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("Share")) {
				logPass("Share link Verified");
			} else {
				logFail("Share Verification Failed");
			}
		} else {
			logFail("Share link is not displayed");
		}

		// Bottom Bar - About
		if (about.isDisplayed()) {
			logPass("About link is displayed");
			if (about.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("About")
					&& about.getAttribute("href").trim().contains("/about")) {
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

		// Home Page Header
		if (homepageHeader.isDisplayed()) {
			logPass("Home Page Header is displayed");
		} else {
			logFail("Home Page Header is Not Displayed");
		}

		// MENU opening and closing
		if (menu.isDisplayed()) {
			logPass("Menú is Displayed");
			menu.click();
			Thread.sleep(1000);
			spanish.click();
			Thread.sleep(1000);
			if (menu.getText().equalsIgnoreCase("Cerrar")) {
				logPass("Menú is opened Successfully");
				menu.click();
				if (menu.getText().equalsIgnoreCase("Menú")) {
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
		if (bookmarks.isDisplayed()) {
			logPass("Bookmarks link is displayed");
			if (bookmarks.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("Bookmarks")
					&& bookmarks.getAttribute("href").trim().contains("/bookmarks")) {
				logPass("Bookmarks link Verified");
			} else {
				logFail("Bookmarks Verification Failed");
			}
		} else {
			logFail("Bookmarks link is not displayed");
		}

		// Bottom Bar - Buscar
		if (search.isDisplayed()) {
			logPass("Buscar link is displayed");
			if (search.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("Buscar")) {
				logPass("Buscar link Verified");
			} else {
				logFail("Buscar Verification Failed");
			}
		} else {
			logFail("Buscar link is not displayed");
		}

		// Bottom Bar - Share
		if (share.isDisplayed()) {
			logPass("Share link is displayed");
			if (share.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("Share")) {
				logPass("Share link Verified");
			} else {
				logFail("Share Verification Failed");
			}
		} else {
			logFail("Share link is not displayed");
		}

		// Bottom Bar - About
		if (about.isDisplayed()) {
			logPass("About link is displayed");
			if (about.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("About")
					&& about.getAttribute("href").trim().contains("/about")) {
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

		// Home Page Header
		if (homepageHeader.isDisplayed()) {
			logPass("Home Page Header is displayed");
		} else {
			logFail("Home Page Header is Not Displayed");
		}

		// MENU opening and closing
		if (menu.isDisplayed()) {
			logPass("Menu is Displayed");
			menu.click();
			Thread.sleep(1000);
			french.click();
			Thread.sleep(1000);
			if (menu.getText().equalsIgnoreCase("Fermer")) {
				logPass("Menú is opened Successfully");
				menu.click();
				if (menu.getText().equalsIgnoreCase("Menu")) {
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
		if (bookmarks.isDisplayed()) {
			logPass("Bookmarks link is displayed");
			if (bookmarks.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("Bookmarks")
					&& bookmarks.getAttribute("href").trim().contains("/bookmarks")) {
				logPass("Bookmarks link Verified");
			} else {
				logFail("Bookmarks Verification Failed");
			}
		} else {
			logFail("Bookmarks link is not displayed");
		}

		// Bottom Bar - Rechercher
		if (search.isDisplayed()) {
			logPass("Rechercher link is displayed");
			if (search.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("Rechercher")
					&& search.getAttribute("href").trim().contains("/search")) {
				logPass("Rechercher link Verified");
			} else {
				logFail("Rechercher Verification Failed");
			}
		} else {
			logFail("Rechercher link is not displayed");
		}

		// Bottom Bar - Share
		if (share.isDisplayed()) {
			logPass("Share link is displayed");
			if (share.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("Share")) {
				logPass("Share link Verified");
			} else {
				logFail("Share Verification Failed");
			}
		} else {
			logFail("Share link is not displayed");
		}

		// Bottom Bar - About
		if (about.isDisplayed()) {
			logPass("About link is displayed");
			if (about.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("About")
					&& about.getAttribute("href").trim().contains("/about")) {
				logPass("About link Verified");
			} else {
				logFail("About Verification Failed");
			}
		} else {
			logFail("About link is not displayed");
		}

		/*
		 * 
		 * // WHAT_ARE if (whatare.isDisplayed()) {
		 * logPass("Qu'est-ce que le travail des enfants et le travail forcé ? link is displayed"
		 * ); if (whatare.getText().trim().
		 * equalsIgnoreCase("Qu'est-ce que le travail des enfants et le travail forcé ?"
		 * ) && whatare.getAttribute("href").trim().contains("/what-are")) {
		 * logPass("Qu'est-ce que le travail des enfants et le travail forcé ? link Verified"
		 * ); } else {
		 * logFail("Qu'est-ce que le travail des enfants et le travail forcé ? Verification Failed"
		 * ); } } else {
		 * logFail("Qu'est-ce que le travail des enfants et le travail forcé ? link is not displayed"
		 * ); }
		 * 
		 * // WHY_DEVOLOP if (whydevelop.isDisplayed()) {
		 * logPass("Pourquoi élaborer un système de conformité sociale ? link is displayed"
		 * ); if (whydevelop.getText().trim().
		 * equalsIgnoreCase("Pourquoi élaborer un système de conformité sociale ?") &&
		 * whydevelop.getAttribute("href").trim().contains("/why-develop")) {
		 * logPass("Pourquoi élaborer un système de conformité sociale ? link Verified"
		 * ); } else {
		 * logFail("Pourquoi élaborer un système de conformité sociale ? Verification Failed"
		 * ); } } else {
		 * logFail("Pourquoi élaborer un système de conformité sociale ? link is not displayed"
		 * ); }
		 * 
		 * // BASICS if (basics.isDisplayed()) {
		 * logPass("Fondements d’un système de conformité sociale link is displayed");
		 * if (basics.getText().trim().
		 * equalsIgnoreCase("Fondements d’un système de conformité sociale") &&
		 * basics.getAttribute("href").trim().contains("/basics")) {
		 * logPass("Fondements d’un système de conformité sociale link Verified"); }
		 * else {
		 * logFail("Fondements d’un système de conformité sociale Verification Failed");
		 * } } else {
		 * logFail("Fondements d’un système de conformité sociale link is not displayed"
		 * ); }
		 * 
		 * // Steps Drop Down if (stepsdropdown.isDisplayed()) {
		 * logPass("Étapes vers un système de conformité sociale is displayed"); if
		 * (stepsdropdown.getText().trim().
		 * equalsIgnoreCase("Étapes vers un système de conformité sociale")) {
		 * logPass("Étapes vers un système de conformité sociale Verified"); } else {
		 * logFail("Étapes vers un système de conformité sociale Verification Failed");
		 * } } else {
		 * logFail("Étapes vers un système de conformité sociale link is not displayed"
		 * ); }
		 */
	}

	public void MenuVerification_EN() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

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
		if (menu.isDisplayed()) {
			logPass("MENU is Displayed");
			menu.click();
			Thread.sleep(1000);
			if (menu.getText().equalsIgnoreCase("Close")) {
				logPass("MENU is opened Successfully");
			} else {
				logFail("MENU is not opened Successfully");
			}
		} else {
			logFail("MENU is Not Displayed");
		}

		// WHAT_ARE
		if (whatare.isDisplayed()) {
			logPass("What are Child Labor and Forced Labor? link is displayed");
			if (whatare.getText().trim().equalsIgnoreCase("What are Child Labor and Forced Labor?")
					&& whatare.getAttribute("href").trim().contains("/what-are")) {
				logPass("What are Child Labor and Forced Labor? link Verified");
			} else {
				logFail("What are Child Labor and Forced Labor? Verification Failed");
			}
		} else {
			logFail("What are Child Labor and Forced Labor? link is not displayed");
		}

		// WHY_DEVOLOP
		if (whydevelop.isDisplayed()) {
			logPass("Why Develop a Social Compliance System? link is displayed");
			if (whydevelop.getText().trim().equalsIgnoreCase("Why Develop a Social Compliance System?")
					&& whydevelop.getAttribute("href").trim().contains("/why-develop")) {
				logPass("Why Develop a Social Compliance System? link Verified");
			} else {
				logFail("Why Develop a Social Compliance System? Verification Failed");
			}
		} else {
			logFail("Why Develop a Social Compliance System? link is not displayed");
		}

		// BASICS
		if (basics.isDisplayed()) {
			logPass("Basics of a Social Compliance System link is displayed");
			if (basics.getText().trim().equalsIgnoreCase("Basics of a Social Compliance System")
					&& basics.getAttribute("href").trim().contains("/basics")) {
				logPass("Basics of a Social Compliance System link Verified");
			} else {
				logFail("Basics of a Social Compliance System Verification Failed");
			}
		} else {
			logFail("Basics of a Social Compliance System link is not displayed");
		}

		// Steps Drop Down
		if (stepsdropdown.isDisplayed()) {
			logPass("Steps to a social compliance system is displayed");
			if (stepsdropdown.getText().trim().equalsIgnoreCase("Steps to a social compliance system")) {
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
		if (menu.isDisplayed()) {
			menu.click();
			if (menu.getText().equalsIgnoreCase("Menu")) {
				logPass("MENU is closed Successfully");
			} else {
				logFail("MENU is not closed Successfully");
			}
		}
	}

	public void MenuVerification_ES() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

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
		if (menu.isDisplayed()) {
			logPass("Menú is Displayed");
			menu.click();
			Thread.sleep(1000);
			spanish.click();
			Thread.sleep(1000);
			if (menu.getText().equalsIgnoreCase("Cerrar")) {
				logPass("Menú is opened Successfully");
			} else {
				logFail("Menú is not opened Successfully");
			}
		} else {
			logFail("Menú is Not Displayed");
		}

		// WHAT_ARE
		if (whatare.isDisplayed()) {
			logPass("¿Qué son el trabajo infantil y el trabajo forzoso? link is displayed");
			if (whatare.getText().trim().equalsIgnoreCase("¿Qué son el trabajo infantil y el trabajo forzoso?")
					&& whatare.getAttribute("href").trim().contains("/what-are")) {
				logPass("¿Qué son el trabajo infantil y el trabajo forzoso? link Verified");
			} else {
				logFail("¿Qué son el trabajo infantil y el trabajo forzoso?? Verification Failed");
			}
		} else {
			logFail("¿Qué son el trabajo infantil y el trabajo forzoso? link is not displayed");
		}

		// WHY_DEVOLOP
		if (whydevelop.isDisplayed()) {
			logPass("¿Por qué crear un sistema de cumplimiento social? link is displayed");
			if (whydevelop.getText().trim().equalsIgnoreCase("¿Por qué crear un sistema de cumplimiento social?")
					&& whydevelop.getAttribute("href").trim().contains("/why-develop")) {
				logPass("¿Por qué crear un sistema de cumplimiento social? link Verified");
			} else {
				logFail("¿Por qué crear un sistema de cumplimiento social? Verification Failed");
			}
		} else {
			logFail("¿Por qué crear un sistema de cumplimiento social? link is not displayed");
		}

		// BASICS
		if (basics.isDisplayed()) {
			logPass("Aspectos básicos de un sistema de cumplimiento social link is displayed");
			if (basics.getText().trim().equalsIgnoreCase("Aspectos básicos de un sistema de cumplimiento social")
					&& basics.getAttribute("href").trim().contains("/basics")) {
				logPass("Aspectos básicos de un sistema de cumplimiento social link Verified");
			} else {
				logFail("Aspectos básicos de un sistema de cumplimiento social Verification Failed");
			}
		} else {
			logFail("Aspectos básicos de un sistema de cumplimiento social link is not displayed");
		}

		// Steps Drop Down
		if (stepsdropdown.isDisplayed()) {
			logPass("Pasos hacia un sistema de cumplimiento social is displayed");
			if (stepsdropdown.getText().trim().equalsIgnoreCase("Pasos hacia un sistema de cumplimiento social")) {
				logPass("Pasos hacia un sistema de cumplimiento social Verified with Expandable Arrow Mark");
			} else {
				logFail("Pasos hacia un sistema de cumplimiento social Verification Failed");
			}
		} else {
			logFail("Pasos hacia un sistema de cumplimiento social link is not displayed");
		}

		// Language Buttons Verification
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
		if (menu.isDisplayed()) {
			menu.click();
			if (menu.getText().equalsIgnoreCase("Menú")) {
				logPass("Menú is closed Successfully");
			} else {
				logFail("Menú is not closed Successfully");
			}
		}

	}

	public void MenuVerification_FR() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

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
		if (menu.isDisplayed()) {
			logPass("Menu is Displayed");
			menu.click();
			Thread.sleep(1000);
			french.click();
			Thread.sleep(1000);
			if (menu.getText().equalsIgnoreCase("Fermer")) {
				logPass("Menú is opened Successfully");
			} else {
				logFail("Menu is not opened Successfully");
			}
		} else {
			logFail("Menú is Not Displayed");
		}

		// WHAT_ARE
		if (whatare.isDisplayed()) {
			logPass("Qu'est-ce que le travail des enfants et le travail forcé ? link is displayed");
			if (whatare.getText().trim().equalsIgnoreCase("Qu'est-ce que le travail des enfants et le travail forcé ?")
					&& whatare.getAttribute("href").trim().contains("/what-are")) {
				logPass("Qu'est-ce que le travail des enfants et le travail forcé ? link Verified");
			} else {
				logFail("Qu'est-ce que le travail des enfants et le travail forcé ? Verification Failed");
			}
		} else {
			logFail("Qu'est-ce que le travail des enfants et le travail forcé ? link is not displayed");
		}

		// WHY_DEVOLOP
		if (whydevelop.isDisplayed()) {
			logPass("Pourquoi élaborer un système de conformité sociale ? link is displayed");
			if (whydevelop.getText().trim().equalsIgnoreCase("Pourquoi élaborer un système de conformité sociale ?")
					&& whydevelop.getAttribute("href").trim().contains("/why-develop")) {
				logPass("Pourquoi élaborer un système de conformité sociale ? link Verified");
			} else {
				logFail("Pourquoi élaborer un système de conformité sociale ? Verification Failed");
			}
		} else {
			logFail("Pourquoi élaborer un système de conformité sociale ? link is not displayed");
		}

		// BASICS
		if (basics.isDisplayed()) {
			logPass("Fondements d’un système de conformité sociale link is displayed");
			if (basics.getText().trim().equalsIgnoreCase("Fondements d’un système de conformité sociale")
					&& basics.getAttribute("href").trim().contains("/basics")) {
				logPass("Fondements d’un système de conformité sociale link Verified");
			} else {
				logFail("Fondements d’un système de conformité sociale Verification Failed");
			}
		} else {
			logFail("Fondements d’un système de conformité sociale link is not displayed");
		}

		// Steps Drop Down
		if (stepsdropdown.isDisplayed()) {
			logPass("Étapes vers un système de conformité sociale is displayed");
			if (stepsdropdown.getText().trim().equalsIgnoreCase("Étapes vers un système de conformité sociale")) {
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
		if (menu.isDisplayed()) {
			menu.click();
			if (menu.getText().equalsIgnoreCase("Menu")) {
				logPass("Menu is closed Successfully");
			} else {
				logFail("Menu is not closed Successfully");
			}
		}

	}

	public void StepsVerification_EN() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

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
		if (menu.isDisplayed()) {
			logPass("MENU is Displayed");
			menu.click();
			Thread.sleep(1000);
			if (menu.getText().equalsIgnoreCase("Close")) {
				logPass("MENU is opened Successfully");
			} else {
				logFail("MENU is not opened Successfully");
			}
		} else {
			logFail("MENU is Not Displayed");
		}

		// WHAT_ARE
		if (whatare.isDisplayed()) {
			logPass("What are Child Labor and Forced Labor? link is displayed");
			if (whatare.getText().trim().equalsIgnoreCase("What are Child Labor and Forced Labor?")
					&& whatare.getAttribute("href").trim().contains("/what-are")) {
				logPass("What are Child Labor and Forced Labor? link Verified");
			} else {
				logFail("What are Child Labor and Forced Labor? Verification Failed");
			}
		} else {
			logFail("What are Child Labor and Forced Labor? link is not displayed");
		}

		// WHY_DEVOLOP
		if (whydevelop.isDisplayed()) {
			logPass("Why Develop a Social Compliance System? link is displayed");
			if (whydevelop.getText().trim().equalsIgnoreCase("Why Develop a Social Compliance System?")
					&& whydevelop.getAttribute("href").trim().contains("/why-develop")) {
				logPass("Why Develop a Social Compliance System? link Verified");
			} else {
				logFail("Why Develop a Social Compliance System? Verification Failed");
			}
		} else {
			logFail("Why Develop a Social Compliance System? link is not displayed");
		}

		// BASICS
		if (basics.isDisplayed()) {
			logPass("Basics of a Social Compliance System link is displayed");
			if (basics.getText().trim().equalsIgnoreCase("Basics of a Social Compliance System")
					&& basics.getAttribute("href").trim().contains("/basics")) {
				logPass("Basics of a Social Compliance System link Verified");
			} else {
				logFail("Basics of a Social Compliance System Verification Failed");
			}
		} else {
			logFail("Basics of a Social Compliance System link is not displayed");
		}

		// Steps Drop Down
		if (stepsdropdown.isDisplayed()) {
			logPass("Steps to a social compliance system is displayed");
			if (stepsdropdown.getText().trim().equalsIgnoreCase("Steps to a social compliance system")) {
				logPass("Steps to a social compliance system Verified with Expandable Arrow Mark");
			} else {
				logFail("Steps to a social compliance system Verification Failed");
			}
		} else {
			logFail("Steps to a social compliance system link is not displayed");
		}

		// Steps Expanded
		if (stepsdropdown.isDisplayed()) {
			stepsdropdown.click();
			logPass("Steps to a social compliance system Expanded");
		}

		// Step 1 Verification
		if (step1.isDisplayed()) {
			logPass("Step 1: Engage Stakeholders and Partners is displayed");
			if (step1.getText().trim().equalsIgnoreCase("Step 1: Engage Stakeholders and Partners")
					&& step1.getAttribute("href").trim().contains("/steps/1")) {
				logPass("Step 1: Engage Stakeholders and Partners is Verified");
			} else {
				logFail("Step 1: Engage Stakeholders and Partners Verification Failed");
			}
		} else {
			logFail("Step 1: Engage Stakeholders and Partners link is not displayed");
		}

		// Step 2 Verification
		if (step2.isDisplayed()) {
			logPass("Step 2: Assess Risks And Impacts is displayed");
			if (step2.getText().trim().equalsIgnoreCase("Step 2: Assess Risks And Impacts")
					&& step2.getAttribute("href").trim().contains("/steps/2")) {
				logPass("Step 2: Assess Risks And Impacts is Verified");
			} else {
				logFail("Step 2: Assess Risks And Impacts Verification Failed");
			}
		} else {
			logFail("Step 2: Assess Risks And Impacts link is not displayed");
		}

		// Step 3 Verification
		if (step3.isDisplayed()) {
			logPass("Step 3: Develop a Code of Conduct displayed");
			if (step3.getText().trim().equalsIgnoreCase("Step 3: Develop a Code of Conduct")
					&& step3.getAttribute("href").trim().contains("/steps/3")) {
				logPass("Step 3: Develop a Code of Conduct Verified");
			} else {
				logFail("Step 3: Develop a Code of Conduct Verification Failed");
			}
		} else {
			logFail("Step 3:  Develop a Code of Conduct link is not displayed");
		}

		// Step 4 Verification
		if (step4.isDisplayed()) {
			logPass("Step 4: Communicate and Train across your Supply Chain displayed");
			if (step4.getText().trim().equalsIgnoreCase("Step 4: Communicate and Train across your Supply Chain")
					&& step4.getAttribute("href").trim().contains("/steps/4")) {
				logPass("Step 4: Communicate and Train across your Supply Chain Verified");
			} else {
				logFail("Step 4: Communicate and Train across your Supply Chain Verification Failed");
			}
		} else {
			logFail("Step 4: Communicate and Train across your Supply Chain link is not displayed");
		}

		// Step 5 Verification
		if (step5.isDisplayed()) {
			logPass("Step 5: Monitor Compliance is displayed");
			if (step5.getText().trim().equalsIgnoreCase("Step 5: Monitor Compliance")
					&& step5.getAttribute("href").trim().contains("/steps/5")) {
				logPass("Step 5: Monitor Compliance Verified");
			} else {
				logFail("Step 5: Monitor Compliance Verification Failed");
			}
		} else {
			logFail("Step 5: Monitor Compliance link is not displayed");
		}

		// Step 6 Verification
		if (step6.isDisplayed()) {
			logPass("Step 6: Remediate Violations displayed");
			if (step6.getText().trim().equalsIgnoreCase("Step 6: Remediate Violations")
					&& step6.getAttribute("href").trim().contains("/steps/6")) {
				logPass("Step 6: Remediate Violations Verified");
			} else {
				logFail("Step 6: Remediate Violations Verification Failed");
			}
		} else {
			logFail("Step 6: Remediate Violations link is not displayed");
		}

		// Step 7 Verification
		if (step7.isDisplayed()) {
			logPass("Step 7: Independent Review displayed");
			if (step7.getText().trim().equalsIgnoreCase("Step 7: Independent Review")
					&& step7.getAttribute("href").trim().contains("/steps/7")) {
				logPass("Step 7: Independent Review Verified");
			} else {
				logFail("Step 7: Independent Review Verification Failed");
			}
		} else {
			logFail("Step 7: Independent Review link is not displayed");
		}

		// Step 8 Verification
		if (step8.isDisplayed()) {
			logPass("Step 8: Report Performance displayed");
			if (step8.getText().trim().equalsIgnoreCase("Step 8: Report Performance")
					&& step8.getAttribute("href").trim().contains("/steps/8")) {
				logPass("Step 8: Report Performance Verified");
			} else {
				logFail("Step 8: Report Performance Verification Failed");
			}
		} else {
			logFail("Step 8: Report Performance link is not displayed");
		}

		// Steps Collapsed
		if (stepsdropdown.isDisplayed()) {
			stepsdropdown.click();
			logPass("Steps to a social compliance system Collapsed");
		}

		// Close Menu
		if (menu.isDisplayed()) {
			menu.click();
			if (menu.getText().equalsIgnoreCase("Menu")) {
				logPass("MENU is closed Successfully");
			} else {
				logFail("MENU is not closed Successfully");
			}
		}
	}

	public void StepsVerification_ES() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

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
		if (menu.isDisplayed()) {
			logPass("Menú is Displayed");
			menu.click();
			Thread.sleep(1000);
			spanish.click();
			Thread.sleep(1000);
			if (menu.getText().equalsIgnoreCase("Cerrar")) {
				logPass("Menú is opened Successfully");
			} else {
				logFail("Menú is not opened Successfully");
			}
		} else {
			logFail("Menú is Not Displayed");
		}

		// WHAT_ARE
		if (whatare.isDisplayed()) {
			logPass("¿Qué son el trabajo infantil y el trabajo forzoso? link is displayed");
			if (whatare.getText().trim().equalsIgnoreCase("¿Qué son el trabajo infantil y el trabajo forzoso?")
					&& whatare.getAttribute("href").trim().contains("/what-are")) {
				logPass("¿Qué son el trabajo infantil y el trabajo forzoso? link Verified");
			} else {
				logFail("¿Qué son el trabajo infantil y el trabajo forzoso?? Verification Failed");
			}
		} else {
			logFail("¿Qué son el trabajo infantil y el trabajo forzoso? link is not displayed");
		}

		// WHY_DEVOLOP
		if (whydevelop.isDisplayed()) {
			logPass("¿Por qué crear un sistema de cumplimiento social? link is displayed");
			if (whydevelop.getText().trim().equalsIgnoreCase("¿Por qué crear un sistema de cumplimiento social?")
					&& whydevelop.getAttribute("href").trim().contains("/why-develop")) {
				logPass("¿Por qué crear un sistema de cumplimiento social? link Verified");
			} else {
				logFail("¿Por qué crear un sistema de cumplimiento social? Verification Failed");
			}
		} else {
			logFail("¿Por qué crear un sistema de cumplimiento social? link is not displayed");
		}

		// BASICS
		if (basics.isDisplayed()) {
			logPass("Aspectos básicos de un sistema de cumplimiento social link is displayed");
			if (basics.getText().trim().equalsIgnoreCase("Aspectos básicos de un sistema de cumplimiento social")
					&& basics.getAttribute("href").trim().contains("/basics")) {
				logPass("Aspectos básicos de un sistema de cumplimiento social link Verified");
			} else {
				logFail("Aspectos básicos de un sistema de cumplimiento social Verification Failed");
			}
		} else {
			logFail("Aspectos básicos de un sistema de cumplimiento social link is not displayed");
		}

		// Steps Drop Down
		if (stepsdropdown.isDisplayed()) {
			logPass("Pasos hacia un sistema de cumplimiento social is displayed");
			if (stepsdropdown.getText().trim().equalsIgnoreCase("Pasos hacia un sistema de cumplimiento social")) {
				logPass("Pasos hacia un sistema de cumplimiento social Verified with Expandable Arrow Mark");
			} else {
				logFail("Pasos hacia un sistema de cumplimiento social Verification Failed");
			}
		} else {
			logFail("Pasos hacia un sistema de cumplimiento social link is not displayed");
		}

		// Steps Expanded
		if (stepsdropdown.isDisplayed()) {
			stepsdropdown.click();
			logPass("Steps to a social compliance system Expanded");
		}

		// Step 1 Verification
		if (step1.isDisplayed()) {
			logPass("Primer paso: Participación de las partes interesadas y los socios is displayed");
			if (step1.getText().trim()
					.equalsIgnoreCase("Primer paso: Participación de las partes interesadas y los socios")
					&& step1.getAttribute("href").trim().contains("/steps/1")) {
				logPass("Primer paso: Participación de las partes interesadas y los socios is Verified");
			} else {
				logFail("Primer paso: Participación de las partes interesadas y los socios Verification Failed");
			}
		} else {
			logFail("Primer paso: Participación de las partes interesadas y los socios link is not displayed");
		}

		// Step 2 Verification
		if (step2.isDisplayed()) {
			logPass("Segundo paso: Evaluación de riesgos e impacto is displayed");
			if (step2.getText().trim().equalsIgnoreCase("Segundo paso: Evaluación de riesgos e impacto")
					&& step2.getAttribute("href").trim().contains("/steps/2")) {
				logPass("Segundo paso: Evaluación de riesgos e impacto is Verified");
			} else {
				logFail("Segundo paso: Evaluación de riesgos e impacto Verification Failed");
			}
		} else {
			logFail("Segundo paso: Evaluación de riesgos e impacto link is not displayed");
		}

		// Step 3 Verification
		if (step3.isDisplayed()) {
			logPass("Tercer paso: Formulación de un código de conducta is displayed");
			if (step3.getText().trim().equalsIgnoreCase("Tercer paso: Formulación de un código de conducta")
					&& step3.getAttribute("href").trim().contains("/steps/3")) {
				logPass("Tercer paso: Formulación de un código de conducta Verified");
			} else {
				logFail("Tercer paso: Formulación de un código de conducta Verification Failed");
			}
		} else {
			logFail("Tercer paso: Formulación de un código de conducta link is not displayed");
		}

		// Step 4 Verification
		if (step4.isDisplayed()) {
			logPass("Cuarto paso: Comunicación y capacitación en la cadena de suministro is displayed");
			if (step4.getText().trim()
					.equalsIgnoreCase("Cuarto paso: Comunicación y capacitación en la cadena de suministro")
					&& step4.getAttribute("href").trim().contains("/steps/4")) {
				logPass("Cuarto paso: Comunicación y capacitación en la cadena de suministro Verified");
			} else {
				logFail("Cuarto paso: Comunicación y capacitación en la cadena de suministro Verification Failed");
			}
		} else {
			logFail("Cuarto paso: Comunicación y capacitación en la cadena de suministro link is not displayed");
		}

		// Step 5 Verification
		if (step5.isDisplayed()) {
			logPass("Quinto paso: Vigilancia y seguimiento del cumplimiento is displayed");
			if (step5.getText().trim().equalsIgnoreCase("Quinto paso: Vigilancia y seguimiento del cumplimiento")
					&& step5.getAttribute("href").trim().contains("/steps/5")) {
				logPass("Quinto paso: Vigilancia y seguimiento del cumplimiento Verified");
			} else {
				logFail("Quinto paso: Vigilancia y seguimiento del cumplimiento Verification Failed");
			}
		} else {
			logFail("Quinto paso: Vigilancia y seguimiento del cumplimiento link is not displayed");
		}

		// Step 6 Verification
		if (step6.isDisplayed()) {
			logPass("Sexto paso: Remediación de infracciones is displayed");
			if (step6.getText().trim().equalsIgnoreCase("Sexto paso: Remediación de infracciones")
					&& step6.getAttribute("href").trim().contains("/steps/6")) {
				logPass("Sexto paso: Remediación de infracciones Verified");
			} else {
				logFail("Sexto paso: Remediación de infracciones Verification Failed");
			}
		} else {
			logFail("Sexto paso: Remediación de infracciones link is not displayed");
		}

		// Step 7 Verification
		if (step7.isDisplayed()) {
			logPass("Séptimo paso: Examen independiente displayed");
			if (step7.getText().trim().equalsIgnoreCase("Séptimo paso: Examen independiente")
					&& step7.getAttribute("href").trim().contains("/steps/7")) {
				logPass("Séptimo paso: Examen independiente Verified");
			} else {
				logFail("Séptimo paso: Examen independiente Verification Failed");
			}
		} else {
			logFail("Séptimo paso: Examen independiente link is not displayed");
		}

		// Step 8 Verification
		if (step8.isDisplayed()) {
			logPass("Octavo paso: Notificación del desempeño is displayed");
			if (step8.getText().trim().equalsIgnoreCase("Octavo paso: Notificación del desempeño")
					&& step8.getAttribute("href").trim().contains("/steps/8")) {
				logPass("Octavo paso: Notificación del desempeño Verified");
			} else {
				logFail("Octavo paso: Notificación del desempeño Verification Failed");
			}
		} else {
			logFail("Octavo paso: Notificación del desempeño link is not displayed");
		}

		// Steps Collapsed
		if (stepsdropdown.isDisplayed()) {
			stepsdropdown.click();
			logPass("Steps to a social compliance system Collapsed");
		}

		// Close Menu
		if (menu.isDisplayed()) {
			menu.click();
			if (menu.getText().equalsIgnoreCase("Menú")) {
				logPass("Menú is closed Successfully");
			} else {
				logFail("Menú is not closed Successfully");
			}
		}

	}

	public void StepsVerification_FR() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

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
		if (menu.isDisplayed()) {
			logPass("Menu is Displayed");
			menu.click();
			Thread.sleep(1000);
			french.click();
			Thread.sleep(1000);
			if (menu.getText().equalsIgnoreCase("Fermer")) {
				logPass("Menú is opened Successfully");
			} else {
				logFail("Menu is not opened Successfully");
			}
		} else {
			logFail("Menú is Not Displayed");
		}

		// WHAT_ARE
		if (whatare.isDisplayed()) {
			logPass("Qu'est-ce que le travail des enfants et le travail forcé ? link is displayed");
			if (whatare.getText().trim().equalsIgnoreCase("Qu'est-ce que le travail des enfants et le travail forcé ?")
					&& whatare.getAttribute("href").trim().contains("/what-are")) {
				logPass("Qu'est-ce que le travail des enfants et le travail forcé ? link Verified");
			} else {
				logFail("Qu'est-ce que le travail des enfants et le travail forcé ? Verification Failed");
			}
		} else {
			logFail("Qu'est-ce que le travail des enfants et le travail forcé ? link is not displayed");
		}

		// WHY_DEVOLOP
		if (whydevelop.isDisplayed()) {
			logPass("Pourquoi élaborer un système de conformité sociale ? link is displayed");
			if (whydevelop.getText().trim().equalsIgnoreCase("Pourquoi élaborer un système de conformité sociale ?")
					&& whydevelop.getAttribute("href").trim().contains("/why-develop")) {
				logPass("Pourquoi élaborer un système de conformité sociale ? link Verified");
			} else {
				logFail("Pourquoi élaborer un système de conformité sociale ? Verification Failed");
			}
		} else {
			logFail("Pourquoi élaborer un système de conformité sociale ? link is not displayed");
		}

		// BASICS
		if (basics.isDisplayed()) {
			logPass("Fondements d’un système de conformité sociale link is displayed");
			if (basics.getText().trim().equalsIgnoreCase("Fondements d’un système de conformité sociale")
					&& basics.getAttribute("href").trim().contains("/basics")) {
				logPass("Fondements d’un système de conformité sociale link Verified");
			} else {
				logFail("Fondements d’un système de conformité sociale Verification Failed");
			}
		} else {
			logFail("Fondements d’un système de conformité sociale link is not displayed");
		}

		// Steps Drop Down
		if (stepsdropdown.isDisplayed()) {
			logPass("Étapes vers un système de conformité sociale is displayed");
			if (stepsdropdown.getText().trim().equalsIgnoreCase("Étapes vers un système de conformité sociale")) {
				logPass("Étapes vers un système de conformité sociale Verified with Expandable Arrow Mark");
			} else {
				logFail("Étapes vers un système de conformité sociale Verification Failed");
			}
		} else {
			logFail("Étapes vers un système de conformité sociale link is not displayed");
		}

		// Steps Expanded
		if (stepsdropdown.isDisplayed()) {
			stepsdropdown.click();
			logPass("Steps to a social compliance system Expanded");
		}

		// Step 1 Verification
		if (step1.isDisplayed()) {
			logPass("Première étape: faire participer les parties prenantes et les partenaires is displayed");
			if (step1.getText().trim()
					.equalsIgnoreCase("Première étape: faire participer les parties prenantes et les partenaires")
					&& step1.getAttribute("href").trim().contains("/steps/1")) {
				logPass("Première étape: faire participer les parties prenantes et les partenaires is Verified");
			} else {
				logFail("Première étape: faire participer les parties prenantes et les partenaires Verification Failed");
			}
		} else {
			logFail("Première étape: faire participer les parties prenantes et les partenaires link is not displayed");
		}

		// Step 2 Verification
		if (step2.isDisplayed()) {
			logPass("Deuxième étape: Évaluer les risques et les incidences is displayed");
			if (step2.getText().trim().equalsIgnoreCase("Deuxième étape: Évaluer les risques et les incidences")
					&& step2.getAttribute("href").trim().contains("/steps/2")) {
				logPass("Deuxième étape: Évaluer les risques et les incidences is Verified");
			} else {
				logFail("Deuxième étape: Évaluer les risques et les incidences Verification Failed");
			}
		} else {
			logFail("Deuxième étape: Évaluer les risques et les incidences link is not displayed");
		}

		// Step 3 Verification
		if (step3.isDisplayed()) {
			logPass("Troisième étape: élaborer un code de conduite is displayed");
			if (step3.getText().trim().equalsIgnoreCase("Troisième étape: élaborer un code de conduite")
					&& step3.getAttribute("href").trim().contains("/steps/3")) {
				logPass("Troisième étape: élaborer un code de conduite Verified");
			} else {
				logFail("Troisième étape: élaborer un code de conduite Verification Failed");
			}
		} else {
			logFail("Troisième étape: élaborer un code de conduite link is not displayed");
		}

		// Step 4 Verification
		if (step4.isDisplayed()) {
			logPass("Step 4: Quatrième étape: communiquer et former dans l'ensemble de votre chaîne d'approvisionnement is displayed");
			if (step4.getText().trim().equalsIgnoreCase(
					"Quatrième étape: communiquer et former dans l'ensemble de votre chaîne d'approvisionnement")
					&& step4.getAttribute("href").trim().contains("/steps/4")) {
				logPass("Quatrième étape: communiquer et former dans l'ensemble de votre chaîne d'approvisionnement Verified");
			} else {
				logFail("Quatrième étape: communiquer et former dans l'ensemble de votre chaîne d'approvisionnement Verification Failed");
			}
		} else {
			logFail("Quatrième étape: communiquer et former dans l'ensemble de votre chaîne d'approvisionnement link is not displayed");
		}

		// Step 5 Verification
		if (step5.isDisplayed()) {
			logPass("Cinquième étape: Surveiller la conformité is displayed");
			if (step5.getText().trim().equalsIgnoreCase("Cinquième étape: Surveiller la conformité")
					&& step5.getAttribute("href").trim().contains("/steps/5")) {
				logPass("Cinquième étape:  Surveiller la conformité Verified");
			} else {
				logFail("Cinquième étape: Surveiller la conformité Verification Failed");
			}
		} else {
			logFail("Cinquième étape: Surveiller la conformité link is not displayed");
		}

		// Step 6 Verification
		if (step6.isDisplayed()) {
			logPass("Sixième étape: Réparer les infractions is displayed");
			if (step6.getText().trim().equalsIgnoreCase("Sixième étape: Réparer les infractions")
					&& step6.getAttribute("href").trim().contains("/steps/6")) {
				logPass("Sixième étape: Réparer les infractions");
			} else {
				logFail("Sixième étape: Réparer les infractions Verification Failed");
			}
		} else {
			logFail("Sixième étape: Réparer les infractions link is not displayed");
		}

		// Step 7 Verification
		if (step7.isDisplayed()) {
			logPass("Septième étape: Examen indépendant is displayed");
			if (step7.getText().trim().equalsIgnoreCase("Septième étape: Examen indépendant")
					&& step7.getAttribute("href").trim().contains("/steps/7")) {
				logPass("Septième étape: Examen indépendant Verified");
			} else {
				logFail("Septième étape: Examen indépendant Verification Failed");
			}
		} else {
			logFail("Septième étape: Examen indépendant link is not displayed");
		}

		// Step 8 Verification
		if (step8.isDisplayed()) {
			logPass("Huitième étape: Rendre compte des résultats is displayed");
			if (step8.getText().trim().equalsIgnoreCase("Huitième étape: Rendre compte des résultats")
					&& step8.getAttribute("href").trim().contains("/steps/8")) {
				logPass("Huitième étape: Rendre compte des résultats Verified");
			} else {
				logFail("Huitième étape: Rendre compte des résultats Verification Failed");
			}
		} else {
			logFail("Huitième étape: Rendre compte des résultats link is not displayed");
		}

		// Steps Collapsed
		if (stepsdropdown.isDisplayed()) {
			stepsdropdown.click();
			logPass("Steps to a social compliance system Collapsed");
		}

		// Close Menu
		if (menu.isDisplayed()) {
			menu.click();
			if (menu.getText().equalsIgnoreCase("Menu")) {
				logPass("Menu is closed Successfully");
			} else {
				logFail("Menu is not closed Successfully");
			}
		}

	}

	public void LanguageVerification() throws Exception {
		// Initialize Elements
		PageFactory.initElements(DRIVER_LOCAL.get(), this);

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
		if (menu.isDisplayed()) {
			logPass("MENU is Displayed");
			menu.click();
			Thread.sleep(1000);
			if (menu.getText().equalsIgnoreCase("Close")) {
				logPass("MENU is opened Successfully");
			} else {
				logFail("MENU is not opened Successfully");
			}
		} else {
			logFail("MENU is Not Displayed");
		}

		// Language Buttons Verification
		if (english.isDisplayed() && english.getText().trim().equalsIgnoreCase("English")) {
			logPass("English Language Button is displayed");
			english.click();
			if (DRIVER_LOCAL.get().getCurrentUrl().contains("lang=en")) {
				logPass("English Language is Selected and Validated from URL");
			} else {
				logFail("English Language Selection and Validation Failed");
			}
		} else {
			logFail("English Language Button is not displayed");
		}

		if (spanish.isDisplayed() && spanish.getText().trim().equalsIgnoreCase("Español")) {
			logPass("Español Language Button is displayed");
			spanish.click();
			if (DRIVER_LOCAL.get().getCurrentUrl().contains("lang=es")) {
				logPass("Español Language is Selected and Validated from URL");
			} else {
				logFail("Español Language Selection and Validation Failed");
			}
		} else {
			logFail("Español Language Button is not displayed");
		}

		if (french.isDisplayed() && french.getText().trim().equalsIgnoreCase("Français")) {
			logPass("Français Language Button is displayed");
			french.click();
			if (DRIVER_LOCAL.get().getCurrentUrl().contains("lang=fr")) {
				logPass("Français Language is Selected and Validated from URL");
			} else {
				logFail("Français Language Selection and Validation Failed");
			}
		} else {
			logFail("Français Language Button is not displayed");
		}

		// Close Menu
		if (menu.isDisplayed()) {
			menu.click();
			if (menu.getText().equalsIgnoreCase("Menu")) {
				logPass("MENU is closed Successfully");
			} else {
				logFail("MENU is not closed Successfully");
			}
		}
	}

}

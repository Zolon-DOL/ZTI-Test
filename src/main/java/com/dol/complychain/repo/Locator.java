package com.dol.complychain.repo;

public class Locator {

	// Objects

	public static final String COMPLYCHAIN_LOGO_IMG = "brand-logo";
	public static final String ILAB = "brand-name";
	public static final String MENU = "menu-btn";
	public static final String ENGLISH_BUTTON = "en-btn";
	public static final String SPANISH_BUTTON = "es-btn";
	public static final String FRENCH_BUTTON = "fr-btn";
	public static final String WHAT_ARE = "what-are-link";
	public static final String WHY_DEVOLOP = "why-develop-link";
	public static final String BASICS = "basics-link";
	public static final String STEPS_DROPDOWN = "steps-dropdown";
	public static final String HOMEPAGE_HEADER = "//div[@id='container']/div";

	public static final String STEP1 = "step-1-link";
	public static final String STEP2 = "step-2-link";
	public static final String STEP3 = "step-3-link";
	public static final String STEP4 = "step-4-link";
	public static final String STEP5 = "step-5-link";
	public static final String STEP6 = "step-6-link";
	public static final String STEP7 = "step-7-link";
	public static final String STEP8 = "step-8-link";
	public static final String STEPACCORDIONS = "//*[@id='step-accordions']/div";
	public static final String PREVIOUSSTEP = "prev-step";
	public static final String NEXTSTEP = "next-step";
	public static final String STEPHEADER = "//*[@id='container']//h3";

	public static final String BOOKMARKS = "bookmarks-link";
	public static final String SEARCH = "search-link";
	public static final String SEARCHBAR = "search-input";
	public static final String SHARE = "share-link";
	public static final String ABOUT = "about-link";
	public static final String SEARCHRESULTHEADER = "//*[@id='container']//h4";
	public static final String SEARCHRESULTSLIST = "//*[@id='container']/div/div";

	// Android Objects
	public static final String A_SHARE = "//*[@id='share-link']//*[2]";
	public static final String A_HOMEPAGE_HEADER = "//*[@id='container']/*";

	// IOS Objects
	public static final String I_COMPLYCHAIN_LOGO_IMG = "//*[@text='Brand Strip Logo']";
	public static final String I_ILAB = "//*[@class='UIAView' and ./*[@text='ILAB']]";
	public static final String I_EN_MENU = "//*[@text='Menu' and @class='UIAButton']";
	public static final String I_ES_MENU = "//*[contains(@text,'Men') and @class='UIAButton']";
	public static final String I_FR_MENU = "//*[@text='Menu' and @class='UIAButton']";
	public static final String I_EN_MENUCLOSE = "//*[@text='Close' and @class='UIAButton']";
	public static final String I_ES_MENUCLOSE = "//*[@text='Cerrar' and @class='UIAButton']";
	public static final String I_FR_MENUCLOSE = "//*[@text='Fermer' and @class='UIAButton']";
	public static final String I_ENGLISH_BUTTON = "English";
	public static final String I_SPANISH_BUTTON = "Español";
	public static final String I_FRENCH_BUTTON = "Français";
	public static final String I_HOMEPAGE_HEADER = "//*[@text='Homepage' and @class='UIAImage']";

	public static final String I_EN_WHAT_ARE = "//*[contains(@text,'What are') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_EN_WHY_DEVOLOP = "//*[contains(@text,'Why Develop') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_EN_BASICS = "//*[contains(@text,'Basics') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_EN_STEPS_DROPDOWN = "//*[contains(@text,'Steps to') and @class='UIAStaticText']";

	public static final String I_ES_WHAT_ARE = "//*[contains(@text,'trabajo infantil') and @class='UIAImage'  and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_WHY_DEVOLOP = "//*[contains(@text,'crear un sistema') and @class='UIAImage'  and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_BASICS = "//*[contains(@text,'Aspectos') and @class='UIAImage'  and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_STEPS_DROPDOWN = "//*[contains(@text,'Pasos hacia') and @class='UIAStaticText']";

	public static final String I_FR_WHAT_ARE = "//*[contains(@text,'est-ce que') and @class='UIAImage'  and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_WHY_DEVOLOP = "//*[contains(@text,'Pourquoi') and @class='UIAImage'  and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_BASICS = "//*[contains(@text,'Fondements') and @class='UIAImage'  and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_STEPS_DROPDOWN = "//*[contains(@text,'tapes') and @class='UIAStaticText']";

	public static final String I_EN_STEP1 = "//*[contains(@text,'Step 1') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_EN_STEP2 = "//*[contains(@text,'Step 2') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_EN_STEP3 = "//*[contains(@text,'Step 3') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_EN_STEP4 = "//*[contains(@text,'Step 4') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_EN_STEP5 = "//*[contains(@text,'Step 5') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_EN_STEP6 = "//*[contains(@text,'Step 6') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_EN_STEP7 = "//*[contains(@text,'Step 7') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_EN_STEP8 = "//*[contains(@text,'Step 8') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_STEP1 = "//*[contains(@text,'Primer') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_STEP2 = "//*[contains(@text,'Segundo') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_STEP3 = "//*[contains(@text,'Tercer') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_STEP4 = "//*[contains(@text,'Cuarto') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_STEP5 = "//*[contains(@text,'Quinto') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_STEP6 = "//*[contains(@text,'Sexto') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_STEP7 = "//*[contains(@text,'ptimo') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_ES_STEP8 = "//*[contains(@text,'Octavo') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_STEP1 = "//*[contains(@text,'Premi') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_STEP2 = "//*[contains(@text,'Deuxi') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_STEP3 = "//*[contains(@text,'Troisi') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_STEP4 = "//*[contains(@text,'Quatri') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_STEP5 = "//*[contains(@text,'Cinqui') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_STEP6 = "//*[contains(@text,'Sixi') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_STEP7 = "//*[contains(@text,'Septi') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";
	public static final String I_FR_STEP8 = "//*[contains(@text,'Huiti') and @class='UIAImage' and ./parent::*[@text='Comply Chain']]";

	public static final String I_EN_BOOKMARKS = "//*[@text='Bookmarks' and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_SEARCH = "//*[@text='Search' and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_SHARE = "//*[@text='Share' and @class='UIAStaticText']";
	public static final String I_EN_ABOUT = "//*[@text='About' and @class='UIAImage' and ./*[@class='UIAImage']]";

	public static final String I_ES_BOOKMARKS = "//*[@text='Bookmarks' and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_SEARCH = "//*[@text='Buscar' and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_SHARE = "//*[@text='Share' and @class='UIAStaticText']";
	public static final String I_ES_ABOUT = "//*[@text='About' and @class='UIAImage' and ./*[@class='UIAImage']]";

	public static final String I_FR_BOOKMARKS = "//*[@text='Bookmarks' and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_SEARCH = "//*[@text='Rechercher' and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_SHARE = "//*[@text='Share' and @class='UIAStaticText']";
	public static final String I_FR_ABOUT = "//*[@text='About' and @class='UIAImage' and ./*[@class='UIAImage']]";

	public static final String I_STEPACCORDIONS = "//*[@id='step-accordions']/div";
	public static final String I_PREVIOUSSTEP = "prev-step";
	public static final String I_NEXTSTEP = "next-step";
	public static final String I_STEPHEADER = "//*[@id='container']//h3";
	public static final String I_SEARCHRESULTHEADER = "//*[@id='container']//h4";
	public static final String I_SEARCHRESULTSLIST = "//*[@id='container']/div/div";
	public static final String I_SEARCHBAR = "search-input";

}

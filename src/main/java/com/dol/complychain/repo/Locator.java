package com.dol.complychain.repo;

public class Locator {

	// Objects

	public static final String COMPLYCHAIN_LOGO_IMG = "brand-logo";
	public static final String ILAB = "brand-name";
	public static final String COMPLYCHAINHEADER = "//*[@id='breadcrumbs']/a";
	public static final String MENU = "menu-btn";
	public static final String ENGLISH_BUTTON = "en-btn";
	public static final String SPANISH_BUTTON = "es-btn";
	public static final String FRENCH_BUTTON = "fr-btn";
	public static final String WHAT_ARE = "what-are-link";
	public static final String WHY_DEVOLOP = "why-develop-link";
	public static final String BASICS = "basics-link";
	public static final String STEPS_DROPDOWN = "steps-dropdown";
	public static final String HOMEPAGE_LINK = "//span[@id='breadcrumbs']//a";

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
	public static final String STEPTOPICS = "//*[@id='topics']/div[1]";
	public static final String STEPTOPICSLIST = "//*[@id='topics']/div[2]//li";
	public static final String STEPTOPICHEADER = "//*[@id='container']//h1";
	public static final String PREVIOUSTOPIC = "prev-topic";
	public static final String NEXTTOPIC = "next-topic";
	public static final String BOOKMARKS = "bookmarks-link";
	public static final String SEARCH = "search-link";
	public static final String SEARCHBAR = "search-input";
	public static final String SHARE = "share-link";
	public static final String ABOUT = "about-link";
	public static final String SEARCHRESULTHEADER = "//*[@id='container']//h4";
	public static final String SEARCHRESULTSLIST = "//*[@id='container']/div/div";
	public static final String SHARECOPYLINK = "//*[@id='share-link']/div[2]/div[3]";
	public static final String SHAREEMAILLINK = "//*[@id='share-link']/div[2]/div[2]";
	public static final String SHAREPOCKETLINK = "//*[@id='share-link']/div[2]/div[1]//iframe";
	public static final String ABOUTHEADER = "//*[@id='container']//h1";
	public static final String ABOUTACCORDIONS = "//*[@id='container']//div/strong";
	public static final String WHATAREHEADER = "//*[@id='container']//h1//strong";
	public static final String WHATAREACCORDIONS = "//*[@id='container']/div/div/div/div[1]";
	public static final String WHYDEVELOPHEADER = "//*[@id='container']//h1";
	public static final String WHYDEVELOPACCORDIONS = "//*[@id='container']//div/strong";
	public static final String BASICSHEADER = "//*[@id='container']//h1//strong";
	public static final String BASICSACCORDIONS = "//*[@id='container']/div/div/div/div[1]";
	
	public static final String HOME_WHY_DEVOLOP = "home_whydeveloper";
	public static final String HOME_BASICS = "home_basics";
	public static final String HOME_STEP1 = "home_step_1";
	public static final String HOME_STEP2 = "home_step_2";
	public static final String HOME_STEP3 = "home_step_3";
	public static final String HOME_STEP4 = "home_step_4";
	public static final String HOME_STEP5 = "home_step_5";
	public static final String HOME_STEP6 = "home_step_6";
	public static final String HOME_STEP7 = "home_step_7";
	public static final String HOME_STEP8 = "home_step_8";

	// Android Objects
	public static final String A_SHARE = "//*[@id='share-link']//*[2]";
	public static final String A_COMPLYCHAINHEADER = "//*[@id='breadcrumbs']/*";
	public static final String A_HOMEPAGE_HEADER = "//*[@id='container']/*";
	public static final String A_SEARCHRESULTHEADER = "//*[@id='container']/*[1]";
	public static final String A_SEARCHRESULTSLIST = "//*[@id='container']//*[@width='924' and @top='true']";
	public static final String A_ABOUTHEADER = "//*[@id='container']/*[1]";
	public static final String A_ABOUTACCORDIONS = "//*[@id='container']//*[@text='+']//preceding-sibling::*";
	public static final String A_WHATAREHEADER = "//*[@id='container']/*[1]";
	public static final String A_WHATAREACCORDIONS = "//*[@id='container']//*[@text='+']//preceding-sibling::*";
	public static final String A_WHYDEVELOPHEADER = "//*[@id='container']/*[1]";
	public static final String A_WHYDEVELOPACCORDIONS = "//*[@id='container']//*[@text='+']//preceding-sibling::*";
	public static final String A_BASICSHEADER = "//*[@id='container']/*[1]";
	public static final String A_BASICSACCORDIONS = "//*[@id='container']//*[@text='+']//preceding-sibling::*";
	public static final String A_STEPHEADER = "//*[@id='container']/android.view.View[1]";
	public static final String A_STEPACCORDIONS = "//*[@id='container']//*[@text='+']//preceding-sibling::*";
	public static final String A_STEPTOPICHEADER = "//*[@id='container']/*[2]";
	public static final String A_STEPTOPICS = "//*[@id='topics']//*[@text='+']//preceding-sibling::*";
	public static final String A_STEPTOPICSLIST = "//*[@id='topics']//android.widget.ListView/*";
	public static final String A_COPYLINK = "//*[@id='select_dialog_listview']//*[2]";
	public static final String A_CREATEPDF = "//*[@id='select_dialog_listview']//*[3]";
	public static final String A_SHARETO = "//*[@id='select_dialog_listview']//*[1]";
	public static final String A_COPIEDTOCLIPBOARD = "//*[@text='Copied to clipboard.']";
	public static final String A_MESSAGES = "//*[@text='Messages']";
	public static final String A_DISCARD = "//*[@text='DISCARD']";
	
	// IOS Objects
	public static final String I_COMPLYCHAIN_LOGO_IMG = "//*[@text='Brand Strip Logo']";
	public static final String I_ILAB = "//*[@class='UIAView' and ./*[@text='ILAB']]";
	public static final String I_COMPLYCHAINHEADER = "//*[@text='Comply Chain' and @class='UIAImage']";
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

	public static final String I_ES_BOOKMARKS = "//*[@text='Marcadores' and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_SEARCH = "//*[@text='Buscar' and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_SHARE = "//*[@text='Compartir' and @class='UIAStaticText']";
	public static final String I_ES_ABOUT = "//*[@text='Sobre' and @class='UIAImage' and ./*[@class='UIAImage']]";

	public static final String I_FR_BOOKMARKS = "//*[@text='Signet' and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_SEARCH = "//*[@text='Rechercher' and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_SHARE = "//*[@text='Partager' and @class='UIAStaticText']";
	public static final String I_FR_ABOUT = "//*[@text='Sur' and @class='UIAImage' and ./*[@class='UIAImage']]";

	public static final String I_PREVIOUSSTEP = "Previous Step";
	public static final String I_NEXTSTEP = "Next Step";
	public static final String I_STEPHEADER = "(//*[@text='Bookmark']/../following-sibling::UIAView/UIAStaticText)[1]";
	public static final String I_SEARCHRESULTHEADER = "(//*[@class='UIAView'])[17]";
	public static final String I_SEARCHRESULTSLIST = "(//*[@class='UIAView'])[17]//following-sibling::UIAImage";
	public static final String I_SEARCHBAR = "//*[@placeholder='Search' and @class='UIATextField']";

	public static final String I_EN_HOME_WHY_DEVOLOP = "//*[contains(@text,'Why Develop') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_HOME_BASICS = "//*[contains(@text,'Basics of a') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_HOME_STEP1 = "//*[contains(@text,'Step 1') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_HOME_STEP2 = "//*[contains(@text,'Step 2') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_HOME_STEP3 = "//*[contains(@text,'Step 3') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_HOME_STEP4 = "//*[contains(@text,'Step 4') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_HOME_STEP5 = "//*[contains(@text,'Step 5') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_HOME_STEP6 = "//*[contains(@text,'Step 6') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_HOME_STEP7 = "//*[contains(@text,'Step 7') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_EN_HOME_STEP8 = "//*[contains(@text,'Step 8') and @class='UIAImage' and ./*[@class='UIAImage']]";

	public static final String I_ES_HOME_WHY_DEVOLOP = "//*[contains(@text,'crear un sistema') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_HOME_BASICS = "//*[contains(@text,'Aspectos') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_HOME_STEP1 = "//*[contains(@text,'Primer') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_HOME_STEP2 = "//*[contains(@text,'Segundo') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_HOME_STEP3 = "//*[contains(@text,'Tercer') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_HOME_STEP4 = "//*[contains(@text,'Cuarto') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_HOME_STEP5 = "//*[contains(@text,'Quinto') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_HOME_STEP6 = "//*[contains(@text,'Sexto') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_HOME_STEP7 = "//*[contains(@text,'ptimo') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_ES_HOME_STEP8 = "//*[contains(@text,'Octavo') and @class='UIAImage' and ./*[@class='UIAImage']]";

	public static final String I_FR_HOME_WHY_DEVOLOP = "//*[contains(@text,'Pourquoi') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_HOME_BASICS = "//*[contains(@text,'Fondements') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_HOME_STEP1 = "//*[contains(@text,'Premi') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_HOME_STEP2 = "//*[contains(@text,'Deuxi') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_HOME_STEP3 = "//*[contains(@text,'Troisi') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_HOME_STEP4 = "//*[contains(@text,'Quatri') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_HOME_STEP5 = "//*[contains(@text,'Cinqui') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_HOME_STEP6 = "//*[contains(@text,'Sixi') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_HOME_STEP7 = "//*[contains(@text,'Septi') and @class='UIAImage' and ./*[@class='UIAImage']]";
	public static final String I_FR_HOME_STEP8 = "//*[contains(@text,'Huiti') and @class='UIAImage' and ./*[@class='UIAImage']]";

	public static final String I_COPYLINK = "//*[@id='Copy Link']";
	public static final String I_CREATEPDF = "//*[@id='Create PDF']";
	public static final String I_SHARETO = "//*[@id='Share to...']";
	public static final String I_COPIEDTOCLIPBOARD = "//*[@text='Copied to clipboard.']";
	public static final String I_MESSAGES = "//*[@text='Message']";
	public static final String I_CANCEL = "//*[@text='Cancel']";
	
	public static final String I_STEPTOPICHEADER = "(//*[@text='Bookmark']/../following-sibling::UIAView/UIAStaticText)[1]";
	public static final String I_STEPTOPICS = "//*[@id='Topics']//following-sibling::*/*[@text='+']";
	public static final String I_STEPTOPICSLIST = "//*[@text='Topics']/../following-sibling::UIAView/UIAView/UIAView/following-sibling::UIAImage";
	
	public static final String I_PREVIOUSTOPIC = "Prev Topic";
	public static final String I_NEXTTOPIC = "Next Topic";
	
	public static final String I_STEPACCORDIONS = "//*[@id='step-accordions']/DIV";
	

}

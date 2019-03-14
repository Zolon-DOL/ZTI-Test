package com.dol.complychain.util;

/*******************************************************************************
 * Name : FileUtils Description : Maintains the Project Resources names and
 * paths
 *******************************************************************************/
public interface Constants {

	public static final String NEW_LINE = System.getProperty("line.separator");
	public static final String FILE_SEPARATOR = System.getProperty("file.separator");

	// Getting the current Project Directory
	public static final String USER_DIR = System.getProperty("user.dir");

	// Folders names
	public static final String RESOURCES_FOLDER_NAME = "Resources";
	public static final String CONFIG_FOLDER_NAME = "Configuration";
	public static final String RESULTS_FOLDER_NAME = "Reports";
	public static final String LOG_FOLDER_NAME = "Logs";

	// Directories absolute paths
	public static final String RESOURCES_DIR = USER_DIR + FILE_SEPARATOR + RESOURCES_FOLDER_NAME + FILE_SEPARATOR;
	public static final String CONFIG_DIR = RESOURCES_DIR + CONFIG_FOLDER_NAME + FILE_SEPARATOR;
	public static final String REPORTS_DIR = RESOURCES_DIR + RESULTS_FOLDER_NAME + FILE_SEPARATOR;
	public static final String LOG_DIR = RESOURCES_DIR + LOG_FOLDER_NAME + FILE_SEPARATOR;

	// Files names of Configuration
	public static final String CONFIG_FILE_NAME = "config.properties";
}
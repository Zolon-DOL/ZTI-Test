package com.dol.complychain.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.dol.complychain.basetest.BaseTest;

public class ReportUtils {

	/********************************************************************************************************************
	 * Name : createResultsFolder | Description : Creates folder to hold the test
	 * Reports | Input Content : Folder path
	 ********************************************************************************************************************/
	public static void createResultsFolder(String folderPath) {
		File dirInfo = new File(folderPath);

		// creating the folder which is holding the test reports
		if (!dirInfo.exists()) {
			dirInfo.mkdir();
		}
	}

	/********************************************************************************************************************
	 * Name : createIndexFile Description : Creates index file and copies
	 ********************************************************************************************************************/
	public static void createIndexFile() {
		// Creating Index file
		File source = new File(BaseTest.resultFile);
		File destination = new File(BaseTest.indexFile);
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
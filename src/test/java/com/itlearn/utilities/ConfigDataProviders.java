package com.itlearn.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProviders {
Properties pro;
	
	// Constructor to initialize the configuration properties
	public ConfigDataProviders() {
	    
		// Load the configuration properties from the config.properties file
	    File src = new File("./Configuration/config.properties");
	    
	    try {
	        FileInputStream fis = new FileInputStream(src);
	        pro = new Properties();
	        pro.load(fis);
	    } catch (Exception e) {
	        System.out.println("Not able to load config file " + e.getMessage());
	    }
	}
	
	// Method to retrieve the browser value from configuration
	public String getBrowser() {
	    return pro.getProperty("browser");
	}
	
	// Method to retrieve the staging URL value from configuration
	public String getStagingUrl() {
	    return pro.getProperty("testurl");
	}
}
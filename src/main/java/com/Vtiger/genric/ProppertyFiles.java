package com.Vtiger.genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProppertyFiles 
{
	public String readDatafrompropertyfile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Selenium\\SDET6-master\\SDET6.PROPERTIES");

		Properties prop = new Properties();
		prop.load(fis);

		return	prop.getProperty(key);

	}


}

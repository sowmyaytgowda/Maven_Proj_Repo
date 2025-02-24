package com.qsp.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author SOWMYA Y T
 */
public class FileUtility {
	/**
	 * this method will read data from property file and return value
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getdatafromproperty(String key) throws IOException
{
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
	Properties prop=new Properties();
	prop.load(fis);
	return prop.getProperty(key);
	
}
}

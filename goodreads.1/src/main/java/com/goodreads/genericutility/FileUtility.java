package com.goodreads.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This class will be used to manage the property file/ file handling
 * @author Basava Reddy T
 *
 */
public class FileUtility {
/**
 * 	This will will bring the value from the property file upon supplying the key as an input
 * @param key
 * @return value
 * @author Basava Reddy T
 * @throws IOException
 */
	public String readCommonData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/goodreadsdata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}

}

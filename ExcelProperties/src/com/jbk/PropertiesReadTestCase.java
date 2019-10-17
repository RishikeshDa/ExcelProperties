package com.jbk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReadTestCase {
	public static void main(String[] args) throws IOException {
	 FileInputStream fis=new FileInputStream("config.properties");
	 Properties ptr=new Properties();
	 ptr.load(fis);
	 System.out.println(ptr.getProperty("URL"));
	 System.out.println(ptr.getProperty("Password"));
	 System.out.println(ptr.getProperty("email"));
	}
}

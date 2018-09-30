package com.zkr.fqz.until;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	
	Properties pro;
	public ReadProperties(){
		// TODO Auto-generated constructor stub
		getProperties();
	}
	
	public void getProperties() {
		pro = new Properties();
		File file = new File("E:\\WorkSpace\\mylession\\src\\main\\resources\\fqzBasic.properties");
		FileInputStream in;
		try {
			in = new FileInputStream(file);
			pro.load(in);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public String getValue(String key) {
		String value=pro.getProperty(key);
		return value;
	}
	public static void main(String[] args) {
		ReadProperties re=new ReadProperties();
		String value=re.getValue("url");
		System.out.println(value);
	}
	

}

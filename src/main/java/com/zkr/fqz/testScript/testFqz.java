package com.zkr.fqz.testScript;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zkr.fqz.pageFactory.loginPageFactory;
import com.zkr.fqz.until.readProperties;
import com.zkr.fqz.until.broswers.SwitchExplore;
import com.zkr.fqz.until.broswers.SwitchExploreEnum;

public class testFqz {
	WebDriver driver;
	SwitchExplore se;
	readProperties readproperties;
	loginPageFactory loginpage;
	Logger logger ;
	@BeforeTest
	public void reday() {
		PropertyConfigurator.configure("E:\\WorkSpace\\mylession\\src\\main\\resources\\log4j.properties");
		logger =  Logger.getLogger(testFqz.class);
		se=new SwitchExplore(SwitchExploreEnum.chrome);
		driver=se.driver;
		readproperties=new readProperties();
	}
	@BeforeClass
	public void redayClass() {
		loginpage=new loginPageFactory(driver);
	}
	
	@Test
	public void loginTest() {
		loginpage.loginurl(readproperties.getValue("url"));
		assertTrue(driver.getCurrentUrl().equals("http://106.39.94.231:9080/sinoiaaf/"));
		logger.info("µ«¬º≤‚ ‘µÿ÷∑"+readproperties.getValue("url"));
	}

}

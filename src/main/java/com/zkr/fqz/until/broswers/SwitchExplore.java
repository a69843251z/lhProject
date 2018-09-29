package com.zkr.fqz.until.broswers;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SwitchExplore {
	public WebDriver driver;

	public SwitchExplore(SwitchExploreEnum change) {
		// TODO Auto-generated constructor stub
		switch (change) {
		case ie:
			DesiredCapabilities caps=null;
			System.setProperty("webdriver.ie.driver", "E:\\WorkSpace\\mylession\\src\\main\\resources\\IEDriverServer.exe");
			caps= DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
			caps.setCapability("ignoreZoomSstting", true);
			driver=new InternetExplorerDriver(caps);
			break;
			
		case firefox:
			System.setProperty("webdriver.firefox.bin", "D:\\ä¯ÀÀÆ÷\\firefox\\firefox.exe");
			driver=new FirefoxDriver();
			break;
			
		case chrome:
			System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\mylession\\src\\main\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
			break;

		default:
			break;
		}
	}

}

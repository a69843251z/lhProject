package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class firefox {
	@Test
	public void firefox() {
	System.setProperty("webdriver.firefox.bin", "D:\\ä¯ÀÀÆ÷\\firefox\\firefox.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.baidu.com");
	}

}

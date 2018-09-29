package com.zkr.fqz.until;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class getWindowHandle {
	WebDriver driver=null;
	public getWindowHandle(WebDriver dirver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	//获得默认窗口
	public void getNewWInodow(String Title) {
		Set<String> windows=driver.getWindowHandles();
		for (String string : windows) {
			String newtitle=driver.switchTo().window(string).getTitle();
			if(newtitle.contains(Title)) {
				break;
			}
		}
	}

}

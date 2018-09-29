package com.zkr.fqz.until;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
public class Wait {
	WebDriver driver=null;
	int timeout=10;
	public Wait(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	//线程等待
	public void threadWait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//隐形等待
	public void implycitlyWait(int implicitlyWait) {
		driver.manage().timeouts().implicitlyWait(implicitlyWait,TimeUnit.SECONDS);
	}
	//等待元素出来
	public void WaitForElementPrsent(String locater) {
		(new WebDriverWait(driver, timeout)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locater)));
	}
	//等待元素有效
	public void WaitForElementIsEnale(String locater) {
		(new WebDriverWait(driver, timeout)).until(ExpectedConditions.elementToBeClickable(By.xpath(locater)));
	}
	

}

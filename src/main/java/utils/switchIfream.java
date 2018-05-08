package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class switchIfream {
	WebDriver driver=null;
	public switchIfream(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	//进入指定Ifreame
	public void switchIfreame(String locater) {
		driver.switchTo().frame(driver.findElement(By.xpath(locater)));
	}
	//返回默认Ifreame
	public void switchDef() {
		driver.switchTo().defaultContent();
	}

}

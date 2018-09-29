package com.zkr.fqz.until;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

@Test
public class SeleniumAPI {
	WebDriver driver;
	Wait waitTime;
	String url="http://www.baidu.com";
	@BeforeSuite
	public void openExplore() {
		System.setProperty("webdriver.firefox.bin","D:\\浏览器\\firefox\\firefox.exe");
		driver=new FirefoxDriver();
	}
	//navigate用法
	public void navigate() {
		driver.navigate().to("http://www.sougou.com");
		driver.navigate().to("http://www.baidu.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();	
	}
	//操作浏览器窗口
	public void getPoint() {
		driver.navigate().to("http://www.baidu.com");
		//声明一个坐标
		Point point=new Point(150, 150);
		//表示浏览器的长宽为500 ，500
		Dimension dimension=new Dimension(500, 500);
		driver.manage().window().setPosition(point);
		driver.manage().window().setSize(dimension);
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		//driver.manage().window().maximize();
	}
	//获取页面Titile属性
	public void getTitle() {
		driver.navigate().to("http://www.baidu.com");
		String title=driver.getTitle();
		System.out.println(title);
	}
	//获取页面源代码
	public void getPageSource() {
		driver.navigate().to("http://www.baidu.com");
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		assertTrue(PageSource.contains("百度"));
	}
	//获取页面url
	public void getCurrentURL() {
		driver.navigate().to("https://www.baidu.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		assertEquals("https://www.baidu.com/", url);
	}
	//输出文本并清除(wrong)
	public void sendkeysAndClear() {
		driver.navigate().to("https://download.csdn.net/");
		WebElement search=driver.findElement(By.id("toolber-keyword"));
		search.sendKeys("selenium");
		driver.findElement(By.xpath("//use[@href='#sousuo']")).click();
		search.clear();
	}
	
	
	//双击某个元素
	public void doubleClick() {
		driver.navigate().to("http://www.baidu.com");
		driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("selenium");
		WebElement cl=driver.findElement(By.xpath(".//*[@id='su']"));
		Actions ac=new Actions(driver);
		ac.doubleClick(cl).build().perform();
	}
	
	//操作单选框(wrong)
	public void select() {
		driver.navigate().to("http://www.17sucai.com/pins/demo-show?id=28862");
		driver.switchTo().frame(0);
		WebElement selectElement=driver.findElement(By.xpath("//select[@id='single']"));
		System.out.println(selectElement.getLocation());
		Select select=new Select(selectElement);
		select.deselectAll();
		select.selectByVisibleText("Option One");
		}
	
	//杀掉浏览器进程
	public void kill() {
		//关闭所有Firefox浏览器
		WindowsUtils.tryToKillByName("firefox.exe");
		WindowsUtils.tryToKillByName("iexplore.exe");
		WindowsUtils.tryToKillByName("chrome.exe");
	}
	
	//模拟键盘操作
	public void key() {
		driver.navigate().to("www.sougou.com");
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.SHIFT);//按下shift键
		ac.keyDown(Keys.BACK_SPACE);//按下删除键
		ac.keyUp(Keys.SHIFT);//抬起shift键
		ac.keyUp(Keys.BACK_SPACE);//抬起删除键
	}
	
	//模拟右键操作
	public void rightClickMouse() {
		driver.get(url);
		Actions ac=new Actions(driver);
		ac.contextClick(driver.findElement(By.xpath("xpath"))).build().perform();
	}
	//常用显式等待
	public void testExplicitWait() {
		//判断标题是否含有百度
		driver.navigate().to(url);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("百度"));
		System.out.println("网页标题出现了百度的关键字");
		
		//判断下拉页面元素是否被选中
		WebElement select=driver.findElement(By.xpath("xpath"));
		wait.until(ExpectedConditions.elementToBeSelected(select));
		
		//判断复选框是否出现，是否可以点击
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));
		
		//判断p标签对象是否在页面中
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p")));
		
		//判断p标签对象中是否含有相应的字段
		wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//p"), "刘浩最帅"));
	}
	//使用title操作浏览器窗口
	public void getWindow() {
		driver.navigate().to(url);
		String windowName=driver.getWindowHandle();
		
	}
	
	
	

	


}

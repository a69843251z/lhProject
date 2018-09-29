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
		System.setProperty("webdriver.firefox.bin","D:\\�����\\firefox\\firefox.exe");
		driver=new FirefoxDriver();
	}
	//navigate�÷�
	public void navigate() {
		driver.navigate().to("http://www.sougou.com");
		driver.navigate().to("http://www.baidu.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();	
	}
	//�������������
	public void getPoint() {
		driver.navigate().to("http://www.baidu.com");
		//����һ������
		Point point=new Point(150, 150);
		//��ʾ������ĳ���Ϊ500 ��500
		Dimension dimension=new Dimension(500, 500);
		driver.manage().window().setPosition(point);
		driver.manage().window().setSize(dimension);
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		//driver.manage().window().maximize();
	}
	//��ȡҳ��Titile����
	public void getTitle() {
		driver.navigate().to("http://www.baidu.com");
		String title=driver.getTitle();
		System.out.println(title);
	}
	//��ȡҳ��Դ����
	public void getPageSource() {
		driver.navigate().to("http://www.baidu.com");
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		assertTrue(PageSource.contains("�ٶ�"));
	}
	//��ȡҳ��url
	public void getCurrentURL() {
		driver.navigate().to("https://www.baidu.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		assertEquals("https://www.baidu.com/", url);
	}
	//����ı������(wrong)
	public void sendkeysAndClear() {
		driver.navigate().to("https://download.csdn.net/");
		WebElement search=driver.findElement(By.id("toolber-keyword"));
		search.sendKeys("selenium");
		driver.findElement(By.xpath("//use[@href='#sousuo']")).click();
		search.clear();
	}
	
	
	//˫��ĳ��Ԫ��
	public void doubleClick() {
		driver.navigate().to("http://www.baidu.com");
		driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("selenium");
		WebElement cl=driver.findElement(By.xpath(".//*[@id='su']"));
		Actions ac=new Actions(driver);
		ac.doubleClick(cl).build().perform();
	}
	
	//������ѡ��(wrong)
	public void select() {
		driver.navigate().to("http://www.17sucai.com/pins/demo-show?id=28862");
		driver.switchTo().frame(0);
		WebElement selectElement=driver.findElement(By.xpath("//select[@id='single']"));
		System.out.println(selectElement.getLocation());
		Select select=new Select(selectElement);
		select.deselectAll();
		select.selectByVisibleText("Option One");
		}
	
	//ɱ�����������
	public void kill() {
		//�ر�����Firefox�����
		WindowsUtils.tryToKillByName("firefox.exe");
		WindowsUtils.tryToKillByName("iexplore.exe");
		WindowsUtils.tryToKillByName("chrome.exe");
	}
	
	//ģ����̲���
	public void key() {
		driver.navigate().to("www.sougou.com");
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.SHIFT);//����shift��
		ac.keyDown(Keys.BACK_SPACE);//����ɾ����
		ac.keyUp(Keys.SHIFT);//̧��shift��
		ac.keyUp(Keys.BACK_SPACE);//̧��ɾ����
	}
	
	//ģ���Ҽ�����
	public void rightClickMouse() {
		driver.get(url);
		Actions ac=new Actions(driver);
		ac.contextClick(driver.findElement(By.xpath("xpath"))).build().perform();
	}
	//������ʽ�ȴ�
	public void testExplicitWait() {
		//�жϱ����Ƿ��аٶ�
		driver.navigate().to(url);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("�ٶ�"));
		System.out.println("��ҳ��������˰ٶȵĹؼ���");
		
		//�ж�����ҳ��Ԫ���Ƿ�ѡ��
		WebElement select=driver.findElement(By.xpath("xpath"));
		wait.until(ExpectedConditions.elementToBeSelected(select));
		
		//�жϸ�ѡ���Ƿ���֣��Ƿ���Ե��
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));
		
		//�ж�p��ǩ�����Ƿ���ҳ����
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p")));
		
		//�ж�p��ǩ�������Ƿ�����Ӧ���ֶ�
		wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//p"), "������˧"));
	}
	//ʹ��title�������������
	public void getWindow() {
		driver.navigate().to(url);
		String windowName=driver.getWindowHandle();
		
	}
	
	
	

	


}

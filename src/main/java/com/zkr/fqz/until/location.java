package com.zkr.fqz.until;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class location {
	WebDriver driver= new FirefoxDriver();
	public void getLocationWay() {
		driver.findElement(By.id("IDֵ"));
		driver.findElement(By.name("nameֵ"));
		driver.findElement(By.linkText("���ӵ�ȫ����������"));
		driver.findElement(By.partialLinkText("���ӵĲ�����������"));
		driver.findElement(By.xpath("Xpath��λ���ʽ"));
		/*
		 * ����xpath���ʽ       /html/body/div/input[@value="��ѯ"]
		 * ʹ�����·����λԪ��  //input[@value="��ѯ"]
		 * ʹ���������ж�λ         //input[2]
		 * ʹ��ҳ��Ԫ�����Խ��ж�λ  //img[@alt='div1-img1']
		 *                 //img[@href="http://www.baidu.com"]
		 *                 //div[@name='div2']/input[@name='div2input']
		 *                 //div[@id='div1']/a[@href='http://www.baidu.com']
		 *                 //input[@type='button']
		 *ģ����λ
		 *����ͼƬalt���Կ�ʼλ�ð���div�ؼ��ֵ�ҳ��Ԫ��  //img[start-with(@alt,'div')]
		 *����ͼƬalt���԰���gl�ؼ��ֵ�ҳ��Ԫ�� //img[contains(@alt,'gl')]
		 *
		 * ʹ��xpath�����Ԫ�ض�λ
		 *  //img[@alt='div2-img2']parent::div ѡ��ǰ�ڵ���ϲ㸸�ڵ�
		 *  //div[@id='div1']/child::img  ѡ��ǰ�ڵ���²��ӽڵ�
		 *  //img[@alt='div2-img2']/ancestor::div ѡ��ǰ�ڵ�������ϲ�ڵ�
		 *  //div[@name='div2']/descendant:img ѡ��ǰ�ڵ�������²�ڵ�
		 *  //div[@id='div']/following::img ѡ��ǰ�ڵ�֮���������нڵ�
		 *  //a[@href="http://www.sougou.com"]/follpwing-sibling:input ѡ��ǰ�ڵ������ƽ���ڵ�
		 *  //img[@alt='div2-img2']/preceding::div ѡ��ǰ�ڵ�ǰ������нڵ�
		 *  //img[@alt='div2-img2']/preceding-sibling::[a1]ѡ��ǰ�ڵ�ǰ�������ͬ���ڵ�
		 *  
		 *  ʹ��ҳ��Ԫ���ı���λԪ��
		 *  //a[text{}='�ٶ�����']
		 *  //a[contains{text(),'�ٶ�'}]
		 * */
		driver.findElement(By.cssSelector("CSS��λ���ʽ"));
		driver.findElement(By.className("ҳ��Ԫ�ص�Class����"));
		driver.findElement(By.tagName("ҳ����HTML��ǩ����"));
		
	}

}

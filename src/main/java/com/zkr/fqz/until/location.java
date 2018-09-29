package com.zkr.fqz.until;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class location {
	WebDriver driver= new FirefoxDriver();
	public void getLocationWay() {
		driver.findElement(By.id("ID值"));
		driver.findElement(By.name("name值"));
		driver.findElement(By.linkText("链接的全部文字内容"));
		driver.findElement(By.partialLinkText("链接的部分文字内容"));
		driver.findElement(By.xpath("Xpath定位表达式"));
		/*
		 * 基本xpath表达式       /html/body/div/input[@value="查询"]
		 * 使用相对路径定位元素  //input[@value="查询"]
		 * 使用索引进行定位         //input[2]
		 * 使用页面元素属性进行定位  //img[@alt='div1-img1']
		 *                 //img[@href="http://www.baidu.com"]
		 *                 //div[@name='div2']/input[@name='div2input']
		 *                 //div[@id='div1']/a[@href='http://www.baidu.com']
		 *                 //input[@type='button']
		 *模糊定位
		 *查找图片alt属性开始位置包含div关键字的页面元素  //img[start-with(@alt,'div')]
		 *查找图片alt属性包含gl关键字的页面元素 //img[contains(@alt,'gl')]
		 *
		 * 使用xpath轴进行元素定位
		 *  //img[@alt='div2-img2']parent::div 选择当前节点的上层父节点
		 *  //div[@id='div1']/child::img  选择当前节点的下层子节点
		 *  //img[@alt='div2-img2']/ancestor::div 选择当前节点的所有上层节点
		 *  //div[@name='div2']/descendant:img 选择当前节点的所有下层节点
		 *  //div[@id='div']/following::img 选择当前节点之后跟随的所有节点
		 *  //a[@href="http://www.sougou.com"]/follpwing-sibling:input 选择当前节点的所有平级节点
		 *  //img[@alt='div2-img2']/preceding::div 选择当前节点前面的所有节点
		 *  //img[@alt='div2-img2']/preceding-sibling::[a1]选择当前节点前面的所有同级节点
		 *  
		 *  使用页面元素文本定位元素
		 *  //a[text{}='百度搜索']
		 *  //a[contains{text(),'百度'}]
		 * */
		driver.findElement(By.cssSelector("CSS定位表达式"));
		driver.findElement(By.className("页面元素的Class属性"));
		driver.findElement(By.tagName("页面中HTML标签名称"));
		
	}

}

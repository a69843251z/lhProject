package mylession;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.SwitchExplore;
import utils.SwitchExploreEnum;
import utils.switchIfream;

public class testCase {
	WebDriver driver=null;
	@BeforeTest
	public void pre() {
		SwitchExplore sw=new SwitchExplore(SwitchExploreEnum.chrome);
		driver=sw.driver;
		driver.manage().window().maximize();
	}
	//@Test
	public void switchiframe() {
		driver.get("http://jqueryui.com/slider/");
		switchIfream ifream=new switchIfream(driver);
		ifream.switchIfreame(".//*[@id='content']/iframe");
		WebElement point=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		Point po = point.getLocation();
		System.out.println(po);
		Actions ac=new Actions(driver);
		ac.dragAndDropBy(point, po.getX()+500, po.getY()).build().perform();
		System.out.println(po);
		ifream.switchDef();
		driver.findElement(By.xpath(".//*[@id='main']/form/label/input")).sendKeys("New Case");
	}
	@Test
	public void selects() {
		driver.get("https://www.jd.com/");
		driver.findElement(By.xpath(".//*[@id='ttbar-login']/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div/div[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='loginname']")).sendKeys("390589484@qq.com");
		driver.findElement(By.xpath(".//*[@id='nloginpwd']")).sendKeys("hz51512242whd");
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
	}
	public void getnewWindow() {
		
	}

}

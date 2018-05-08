package mylession;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.SwitchExplore;
import utils.SwitchExploreEnum;
import utils.getWindowHandle;

public class TEST {
	WebDriver driver=null;
	@BeforeTest
	public void pre() {
		SwitchExplore sw=new SwitchExplore(SwitchExploreEnum.chrome);
		this.driver=sw.driver;
		//driver.manage().window().maximize();
	}
	@Test
	public void changeEX() {
		driver.get("http://www.gamersky.com/");
		String window=driver.getWindowHandle();
		System.out.println(window);
	}

}

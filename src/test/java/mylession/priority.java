package mylession;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test(priority=1)
	public void test() {
		System.out.println("打开浏览器");
		Reporter.log("调用打开浏览器方法");
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("登录");
		Reporter.log("调用登录方法");
	}
	@Test(priority=3)
	public void test3() {
		System.out.println("退出");
		Reporter.log("调用退出方法");
	}



}

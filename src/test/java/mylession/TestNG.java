package mylession;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	@Test
	public void Test1() {
		System.out.println("++++++++++++++");
		System.out.println("this is test 1");
		System.out.println("++++++++++++++");
	}
	@Test
	public void Test2() {
		System.out.println("++++++++++++++");
		System.out.println("this is test 2");
		System.out.println("++++++++++++++");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}

}

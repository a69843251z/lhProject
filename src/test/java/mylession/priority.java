package mylession;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test(priority=1)
	public void test() {
		System.out.println("�������");
		Reporter.log("���ô����������");
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("��¼");
		Reporter.log("���õ�¼����");
	}
	@Test(priority=3)
	public void test3() {
		System.out.println("�˳�");
		Reporter.log("�����˳�����");
	}



}

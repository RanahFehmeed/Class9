package Framework.Testng;

import org.testng.annotations.Test;

public class New1 {

	@Test(groups="group1")

	public void test1() {
		System.out.println("1st test case");
	}

    @Test
	public void test2() {
		System.out.println("2nd test case");
	}
	@Test
	public void test3() {
		System.out.println("3rd test case");
	}
	@Test(groups="group1")

	public void test4() {
		System.out.println("4th test case");
	}
}

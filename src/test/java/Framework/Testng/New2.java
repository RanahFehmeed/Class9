package Framework.Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class New2 {
	
	@Test
	public void test5() {
		System.out.println("5th test case");
	}
	@Test
	@Parameters({"url"})
	public void test6(String URL) {
		System.out.println("6th test case");
		System.out.println(URL);
	}

}

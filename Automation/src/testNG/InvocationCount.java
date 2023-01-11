package testNG;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 5)
	public void demoTest() {
		System.out.println("Test");
	}
}

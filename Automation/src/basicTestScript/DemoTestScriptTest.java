package basicTestScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class DemoTestScriptTest extends BaseClass {
	
	@Test
	public void verifyHomePage() {
		System.out.println("Homepage has been verified");
	}
	@Test
	public void createCustomer() {
		System.out.println("Customer has been created");
	}
	

}

package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
	@Test
	public void demo() {
		boolean expectedData = true;
		boolean actualData = false;
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualData, expectedData);
		System.out.println("pass");
		s.assertAll();
	}

}

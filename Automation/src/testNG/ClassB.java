package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassB {
	
	@Test
	public void demo1() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		new ChromeDriver();
	}

}

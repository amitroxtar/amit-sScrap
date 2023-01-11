package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassC {
	
	@Test
	public void demo2() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		new ChromeDriver();

	}}

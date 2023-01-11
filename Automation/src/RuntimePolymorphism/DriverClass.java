package RuntimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		ClassA.test(new ChromeDriver(), "https://www.google.co.in/", "Google");
		ClassA.test(new EdgeDriver(), "https://www.google.co.in/", "Google");
	
	}

}

package amitsWorkspace;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	}

}

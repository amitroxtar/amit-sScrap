package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		String  windowID =driver.getWindowHandle();
		System.out.println(windowID);
		
		driver.navigate().to("https://www.facebook.com/");
		String winID2=driver.getWindowHandle();
		System.out.println(winID2);
	}

}

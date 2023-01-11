package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateWindowIDUniquely {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String winIDForGoogle =driver.getWindowHandle();
		System.out.println("ID for Google : " +winIDForGoogle);
		WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		String winIDForFB = driver1.getWindowHandle();
		System.out.println("ID for FB :"+winIDForFB);
	}

}

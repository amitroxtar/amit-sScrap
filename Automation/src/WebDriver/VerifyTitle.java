package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyTitle {
	
	public static void main(String[] args) {
		
		
		String expectedTitle = "Google";

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in/");
		
		String actualTitle=driver.getTitle();
		System.out.println("The actual title:" +actualTitle);
		System.out.println("The expected title :"+expectedTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: The title has been verified");
		}
		else
			System.out.println("Fail: The Title has not been verified");
		}



	}


package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg = "Username or Password is invalid. please try again.";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		String actualErrorMsg = driver.findElement(By.className("errormsg")).getText();
		 
		if(actualErrorMsg.equals(expectedErrorMsg)) {
			System.out.println("pass: The error msg is Verified");
		}
		else
			System.out.println("Fail: The error msg is not Verified");
		driver.quit();
		
	}

}

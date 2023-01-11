package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
	String parentWindowID =driver.getWindowHandle();
	
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	
	Set<String> allWindowIDs =driver.getWindowHandles();
	
	for(String id:allWindowIDs) {
		driver.switchTo().window(id);
		if(!id.equals(parentWindowID)) {
			Thread.sleep(10000);
			driver.close();
		driver.close();
		break;
			
		}
	}
	}

}

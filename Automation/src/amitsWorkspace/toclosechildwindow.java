package amitsWorkspace;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class toclosechildwindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String parentwindowId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String Id:allwindowIds) {
			driver.switchTo().window(Id);
			if(!Id.equals(parentwindowId)) {
				Thread.sleep(5000);
				driver.close();
				break;
			}
		}
	}

}

package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.PAGE_DOWN).perform();
		 Thread.sleep(2000);
		 action.sendKeys(Keys.PAGE_UP).perform();
		 Thread.sleep(2000);
		 action.sendKeys(Keys.PAGE_DOWN).perform();
		 Thread.sleep(2000);
		 action.sendKeys(Keys.PAGE_UP).perform();
	}

}

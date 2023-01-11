package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		String sysDatetime = date.toString().replace(" ", "_").replace(":", "_");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='desktop-logoContainer']"));
		File source = logo.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/myntraLogo"+sysDatetime+".png");
		Files.copy(source, destination);
	}

}

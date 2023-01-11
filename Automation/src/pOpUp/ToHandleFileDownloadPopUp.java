package pOpUp;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileDownloadPopUp {

	public static void main(String[] args) throws AWTException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.xpath("(//a[text()='Download'])[1]")).click();
		
		Actions action = new Actions(driver);
		action.moveByOffset(1300, 0).click().perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}

}

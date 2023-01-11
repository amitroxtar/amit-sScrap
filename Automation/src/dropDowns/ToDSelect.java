package dropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select select = new Select(dropdown);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByVisibleText("Volvo");
		Thread.sleep(3000);
		select.selectByValue("saab");
		Thread.sleep(2000);
		
		List<WebElement> allselected = select.getAllSelectedOptions();
		for(WebElement option:allselected) {
			System.out.println(option.getText());
		}
		WebElement firstoptions = select.getFirstSelectedOption();
		System.out.println("First Option : "+firstoptions.getText());
		
	}

}

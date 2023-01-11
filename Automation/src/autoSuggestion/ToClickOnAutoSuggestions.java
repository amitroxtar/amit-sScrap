package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("johnny depp");
		Thread.sleep(3000);
		
		
		 List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[contains(text(),'johnny')]"));
		 for(WebElement suggestions:autosuggestions) {
			 if(suggestions.getText().equals("johnny depp wife")) {
				 suggestions.click();
				 break;
			 }
		 }
	}

}

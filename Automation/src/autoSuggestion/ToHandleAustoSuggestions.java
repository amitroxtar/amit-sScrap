package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAustoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("elon");
		Thread.sleep(3000);
		
		
		 List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[contains(text(),'lon')]"));
		  int noOfAutoSuggestions = autosuggestions.size();
		  System.out.println("Number of AutoSuggestions is : "+noOfAutoSuggestions);
		  
		  for(WebElement suggestion:autosuggestions) {
			  System.out.println(suggestion.getText());
		  }
	}

}

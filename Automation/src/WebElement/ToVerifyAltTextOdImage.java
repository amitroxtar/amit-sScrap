package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOdImage {

	public static void main(String[] args) {
		String expectedAltText = "Flipkart";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String actualAltText = driver.findElement(By.id("//img[@class='_2xm1JU']")).getAttribute("alt");
		
		System.out.println(actualAltText);
		
		if(actualAltText.equals(expectedAltText)) {
			System.out.println("Pass: The Alt Text is Verified");
			
		}
		else
			System.out.println("Fail: The Alt Text is Not Verified");
		
		driver.quit();
	}

}

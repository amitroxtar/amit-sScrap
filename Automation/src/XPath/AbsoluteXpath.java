package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sony/OneDrive/Documents/selenium1.html");
		
		driver.findElement(By.cssSelector("input[placeholder= 'Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name= 'pwd']")).sendKeys("manager");

	}

}

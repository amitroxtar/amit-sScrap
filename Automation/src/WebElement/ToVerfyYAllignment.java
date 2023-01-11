package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerfyYAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sony/OneDrive/Documents/selenium1.html");
		Point usernameLoc =driver.findElement(By.id("123")).getLocation();
		System.out.println(usernameLoc);
		
		int usernameStartY = usernameLoc.getY();
		
		Point passwordLoc = driver.findElement(By.id("345")).getLocation();
		int passwordStartY = passwordLoc.getY();
		
		
		System.out.println("The start Y of Username is : "+usernameStartY);
		System.out.println("The start Y of Password is : "+passwordStartY);
		
		if(usernameStartY == passwordStartY) {
			System.out.println("Pass: The allignment is verified");
		}
		else
			System.out.println("Fail: The allignment is not verified");
	}

}

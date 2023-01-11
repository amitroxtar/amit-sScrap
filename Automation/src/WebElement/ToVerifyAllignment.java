package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sony/OneDrive/Documents/selenium1.html");
		Point usernameLoc =driver.findElement(By.id("123")).getLocation();
		System.out.println(usernameLoc);
		
		int usernameStartX = usernameLoc.getX();
		
		Point passwordLoc = driver.findElement(By.id("345")).getLocation();
		int passwordStartX = passwordLoc.getX();
		
		
		System.out.println("The start X of Username is : "+usernameStartX);
		System.out.println("The start X of Password is : "+passwordStartX);
		
		if(usernameStartX == passwordStartX) {
			System.out.println("Pass: The allignment is verified");
		}
		else
			System.out.println("Fail: The allignment is not verified");
	}

}

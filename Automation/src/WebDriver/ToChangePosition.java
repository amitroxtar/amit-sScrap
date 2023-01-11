package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChangePosition {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point pos =new Point(500, 500);
		
		driver.manage().window().setPosition(pos);
		
		Point pos1 =new Point(-450, -450);
		driver.manage().window().setPosition(pos1);
	}

}

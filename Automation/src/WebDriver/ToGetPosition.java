package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		Point position=driver.manage().window().getPosition();
		System.out.println(position);
		int startX=position.getX();
		int startY=position.getY();
		System.out.println("The Start X is :"+startX);
		System.out.println("The Start Y is :"+startY);
		
	}

}

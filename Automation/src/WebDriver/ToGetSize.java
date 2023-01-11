package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSize {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension dim=driver.manage().window().getSize();
		System.out.println(dim);
		int width =dim.getWidth();
		int height = dim.getHeight();
		System.out.println("The Width is : "+width);
		System.out.println("The Height is :"+height);
	}

}

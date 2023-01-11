package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIndependentAndDpendentXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/OnePlus-Forest-Green-Storage-SuperVOOC/dp/B09WRKHWP7/ref=sr_1_2?keywords=oneplus+10r&qid=1669887539&qu=eyJxc2MiOiIzLjE5IiwicXNhIjoiMi43OSIsInFzcCI6IjIuNTIifQ%3D%3D&sr=8-2");
		
		 WebElement price = driver.findElement(By.xpath("//span[text()=' OnePlus 10R 5G (Forest Green, 12GB RAM, 256GB Storage, 80W SuperVOOC)']//..//..//..//..//span[text()='38,999']"));
		 String actualprice =price.getText();
		 System.out.println(actualprice);
		
	}

}

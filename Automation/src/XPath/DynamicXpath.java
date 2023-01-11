package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {


	public static void main(String[] args) {
		String productPrice="₹1,25,199";
		String productName="APPLE iPhone 13 Pro Max (Alpine Green, 256 GB)";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone+13+pro+max&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_ps&as-pos=1&as-type=RECENT&suggestionId=iphone+13+pro+max%7CMobiles&requestId=c8d556f0-0944-467b-9c9c-01593eff78da&as-searchtext=ip");
		
		 WebElement price = driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='"+productPrice+"']"));
		 String actualprice =price.getText();
		 System.out.println(actualprice);
	}

}

package basicTestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebDriverUtility;

public class ToVerifyHomePage extends BaseClass {
    @Test
	public void toVerifyHomePage() throws IOException {

     
     
    
         
        String expectedTitle = eUtils.fetchStringDataFromExcelSheets("Sheet2", 1, 0);
		
		//Test Script
		
		
		
		
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.toWaitForTitle(driver, "Enter");
		
		HomePage home = new HomePage(driver);
		String actualTitle = home.verifyHomepageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass: The title is verified");
		
		home.logoutAction();
		
		
		
	}

}

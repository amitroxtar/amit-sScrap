package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     //constructor find by load
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	    //Identify Element
		@FindBy(id="username")
		private WebElement usernameTextField;
		
		@FindBy(name="pwd")
		private WebElement PasswordTextField;
		
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement LoginButton;
		
         //private member access
		public WebElement getUsernameTextField() {
			return usernameTextField;
		}

		public WebElement getPasswordTextField() {
			return PasswordTextField;
		}

		public WebElement getLoginButton() {
			return LoginButton;
		}
		
		//Business Logic - Repetitive task in a page
		public void LoginAction(String username,String password) {
			usernameTextField.sendKeys(username);
			PasswordTextField.sendKeys(password);
			LoginButton.click();
		}
	}

	
		



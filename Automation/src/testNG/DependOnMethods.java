package testNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethods {
	
	@Test(priority = 1)
	public void login() {
		System.out.println("Logged in Successfully");
	}
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("Product Found");
	}
	@Test(dependsOnMethods = "search")
	public void select() {
		//Assert.fail();
		System.out.println("Product has been selected");
	}
	@Test(dependsOnMethods = "select")
	public void addToCart() {
		System.out.println("Product Added To Cart");
	}
	@Test(dependsOnMethods = "addToCart")
	public void payment() {
		System.out.println("Payment made Sucessfully");
	}
	@Test(dependsOnMethods = "payment")
	public void logout() {
		System.out.println("Logout Sucessfully");
	}
	
	

}

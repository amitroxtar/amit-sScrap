package testNG;

import org.testng.annotations.Test;

public class ClassA {
	
	@Test(groups ="smoke" )
	public void login() {
		System.out.println("Logged in Successfully");
	}
	@Test(groups ="regression")
	public void search() {
		System.out.println("Product Found");
	}
	@Test(groups ="regression")
	public void select() {
		//Assert.fail();
		System.out.println("Product has been selected");
	}
	@Test(groups ="regression")
	public void addToCart() {
		System.out.println("Product Added To Cart");
	}
	@Test(groups ="regression")
	public void payment() {
		System.out.println("Payment made Sucessfully");
	}
	@Test(groups ="smoke")
	public void logout() {
		System.out.println("Logout Sucessfully");

}}

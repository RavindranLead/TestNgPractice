package swag_Test_Cases;

import org.testng.annotations.Test;

public class ListnersPractice {
	@Test
	public void launchBrowser() {
		System.out.println("Browser launched successfully");

	}
	@Test
	public void signIn() {
		System.out.println("User sign in to the application");

	}
	@Test
	public void addProductInCart() {

		System.out.println("User added product in the cart");
	}
	@Test
	public void payment() {

		System.out.println("User done payment through Google Pay");
	}


}

package swag_Test_Cases;

import org.testng.annotations.Test;

public class OrderCreationTC {
	@Test(groups = "Apple")
	private void apple1() {
		System.out.println("Apple Iphone 15");

	}
	@Test(groups = "Apple")
	private void apple2() {
		System.out.println("Apple Iphone 15 Pro");


	}
	@Test(dependsOnGroups = "Apple")
	private void onePlus1() {
		System.out.println("Oneplus 11");

	}
	@Test
	private void onePlus2() {
		System.out.println("Oneplus Nord");


	}
	@Test
	private void samsung1() {
		System.out.println("Samsung S23");

	}
	@Test
	private void samsung2() {
		System.out.println("Samsung S23 Ultra");


	}



}

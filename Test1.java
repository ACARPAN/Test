package testNG;

import org.testng.annotations.Test;

public class Test1 {

	@Test(priority = 1)
	public void loginTest() {
		System.out.println("Login successful");
	}

	@Test(priority = 2)
	public void logoutTest() {
		System.out.println("Logoutsuccessful");
	}

}

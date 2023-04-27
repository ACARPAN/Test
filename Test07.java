package testNG;

import org.testng.annotations.Test;

public class Test07 {

	@Test(priority = 3)
	public void loginTest() {
		System.out.println("Login successful");
	}

	@Test(priority = 2)
	public void passwordIn() {
		System.out.println("Passwordinsuccessful");
	}

}

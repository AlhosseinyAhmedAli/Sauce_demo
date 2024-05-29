package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAddItem extends TestBase{
	@Test
	public void Login() {
		page.LoginPage().Login();
		page.homePage().AddToCart(System.getProperty("SauceLabsBackpack"));
		page.homePage().OpenCart();



	}
}

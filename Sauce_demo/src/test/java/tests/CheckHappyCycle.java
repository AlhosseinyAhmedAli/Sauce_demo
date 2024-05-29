package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckHappyCycle extends TestBase{
	@Test
	public void Login() {
		page.LoginPage().Login();
		page.homePage().AddToCart(System.getProperty("SauceLabsBackpack"));
		page.homePage().OpenCart();
		page.cartPage().Checkout();
		page.InfoPage().Enter_info();
		page.OverviewPage().ClickFinsh();

		Assert.assertTrue(page.ThanksPage().IsOrderFinished(), "There order not Finished , Plz try again");

	}
}

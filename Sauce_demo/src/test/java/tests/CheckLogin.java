package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CheckLogin extends TestBase{
	@Test
	public void Login()
	{
		page.LoginPage().Login();

		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(System.getProperty("HomeUrl"), currentUrl);

	}
}

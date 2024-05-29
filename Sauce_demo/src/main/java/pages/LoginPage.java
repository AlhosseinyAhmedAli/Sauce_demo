package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor) driver;
	}
	@FindBy(id = "user-name")
	WebElement UserName_txt;
	@FindBy(id = "password")
	WebElement Password_txt;
	@FindBy(id = "login-button")
	WebElement Login_btn;


	public void Login()
	{
		fluentWaitForElement(UserName_txt);
		UserName_txt.sendKeys(System.getProperty("User1"));
		fluentWaitForElement(Password_txt);
		Password_txt.sendKeys(System.getProperty("Pass"));
		fluentWaitForElement(Login_btn);
		Login_btn.click();
    }



	}
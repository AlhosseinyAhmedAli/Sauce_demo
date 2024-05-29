package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfoPage extends PageBase{

	public InfoPage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor) driver;
	}
	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement CONTINUE_btn;
	@FindBy(xpath = "//a[normalize-space()='CANCEL']")
	WebElement CANCEL_btn;
	@FindBy(id = "first-name")
	WebElement First_txt;
	@FindBy(id = "last-name")
	WebElement Last_txt;
	@FindBy(id = "postal-code")
	WebElement Zipcode_txt;


	public void Enter_info(){
		fluentWaitForElement(First_txt);
		First_txt.sendKeys(System.getProperty("First"));
		fluentWaitForElement(Last_txt);
		Last_txt.sendKeys(System.getProperty("Last"));
		fluentWaitForElement(Zipcode_txt);
		Zipcode_txt.sendKeys(System.getProperty("code"));
		fluentWaitForElement(CONTINUE_btn);
		CONTINUE_btn.click();
	}







	}
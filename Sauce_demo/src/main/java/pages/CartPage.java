package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor) driver;
	}
	@FindBy(xpath = "//button[normalize-space()='REMOVE']")
	WebElement Remove_btn;
	@FindBy(xpath = "//a[normalize-space()='CHECKOUT']")
	WebElement checkout_btn;
	@FindBy(xpath = "//a[normalize-space()='Continue Shopping']")
	WebElement ContinueShopping_btn;


	public void RemoveFromCart() {
		fluentWaitForElement(Remove_btn);
		Remove_btn.click();
	}
	public void Checkout() {
		fluentWaitForElement(checkout_btn);
		checkout_btn.click();
	}
	public void ContinueShopping() {
		fluentWaitForElement(ContinueShopping_btn);
		ContinueShopping_btn.click();
	}
}



package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends PageBase{

	public OverviewPage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor) driver;
	}
	@FindBy(xpath = "//a[normalize-space()='FINISH']")
	WebElement Finsh_btn;
	@FindBy(xpath = "//a[normalize-space()='CANCEL']")
	WebElement CANCEL_btn;



	public void ClickFinsh()
	{
		fluentWaitForElement(Finsh_btn);
		Finsh_btn.click();
	}
	public void ClickCANCEL(){
		fluentWaitForElement(CANCEL_btn);
		CANCEL_btn.click();
	}
}
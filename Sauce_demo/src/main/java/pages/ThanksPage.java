package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThanksPage extends PageBase{

	public ThanksPage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor) driver;
	}
	@FindBy(xpath = "//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")
	WebElement Thanks_lbl;

	public boolean IsOrderFinished()
	{
		fluentWaitForElement(Thanks_lbl);

		try
		{
			if (Thanks_lbl.isDisplayed())
			{
				return true;
			}
		}
		catch (NoSuchElementException e) {return false;}
		return false;
	}


	}
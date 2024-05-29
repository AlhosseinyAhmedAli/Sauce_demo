package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor) driver;
	}
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement Sort_menu;
	@FindBy(xpath = "//*[name()='path' and contains(@fill,'currentCol')]")
	public WebElement cart_icon;


	public void AddToCart(String ProductNumber)
	{
		WebElement AddItemtocart = driver.findElement(By.xpath(String.format("(//button[@class='btn_primary btn_inventory'][normalize-space()='ADD TO CART'])[%s]", ProductNumber)));
		fluentWaitForElement(AddItemtocart);
		AddItemtocart.click();
	}

	public void RemovefromCart(String ProductNumber)
	{
		WebElement AddItemtocart = driver.findElement(By.xpath(String.format("(//button[normalize-space()='REMOVE'])[%s]", ProductNumber)));
		fluentWaitForElement(AddItemtocart);
		AddItemtocart.click();
	}

	public void OpenCart() {
		fluentWaitForElement(cart_icon);
		cart_icon.click();
	}






	}
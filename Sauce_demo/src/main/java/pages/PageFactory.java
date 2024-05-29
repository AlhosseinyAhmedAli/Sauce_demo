package pages;

import org.openqa.selenium.WebDriver;
public class PageFactory {
    private final WebDriver driver;
    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage LoginPage() {return new LoginPage(driver);}
    public HomePage homePage() {return new HomePage(driver);}
    public CartPage cartPage() {return new CartPage(driver);}
    public InfoPage InfoPage() {return new InfoPage(driver);}
    public OverviewPage OverviewPage() {return new OverviewPage(driver);}
    public ThanksPage ThanksPage() {return new ThanksPage(driver);}
}

package PageObjects;

import Utils.WebActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    WebActions wa = new WebActions(driver);


    @FindBy(xpath = "//a[normalize-space()='Terms and Conditions']")
    private WebElement lnkTermsAndConditions;
    @FindBy(xpath = "//a[normalize-space()='Privacy']")
    private WebElement lnkPrivacy;



    public static String expectedPrivacyURL = "https://qainterview.pythonanywhere.com/privacy";
    public static String expectedTermsURL = "https://qainterview.pythonanywhere.com/terms";


    public void clickTermsLink() {
        wa.click(lnkTermsAndConditions);
    }
    public void clickPrivacyLink() {
        wa.click(lnkPrivacy);
    }


}

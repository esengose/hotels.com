package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[text()='Türkçe']")
    public WebElement turkce;

    @FindBy (xpath = "//*[@id='site-selector']")
    public WebElement bolge;

    @FindBy (xpath = "//button[text()='Kaydet']")
    public WebElement kaydet;

    @FindBy (xpath = "//*[text()='English']")
    public WebElement english;

    @FindBy (xpath = "//button[text()='Sign in']")
    public WebElement signIn;

    @FindBy (xpath = "(//a[text()='Sign in'])[1]")
    public WebElement sigInLink;









 //40=50 zeynep
 @FindBy(xpath = "//select[@id='language-selector']")   public WebElement languageDropDown;







}

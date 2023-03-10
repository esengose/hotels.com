package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SigninPage {
    public SigninPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (id = "loginFormEmailInput")
    public WebElement loginEmail;

    @FindBy (id = "loginFormPasswordInput")
    public WebElement loginPassword;

    @FindBy (id = "loginFormSubmitButton")
    public WebElement loginSignInButton;




}

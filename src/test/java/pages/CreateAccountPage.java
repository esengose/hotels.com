package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateAccountPage {
    public CreateAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign up, it’s free']")
    public WebElement singUp;

    @FindBy (id = "signupFormEmailInput")
    public WebElement singUpEmail;

    @FindBy (id = "signupFormFirstNameInput")
    public WebElement firstNameBox;

    @FindBy (id = "signupFormLastNameInput")
    public WebElement lastNameBox;

    @FindBy (id="signupFormPasswordInput")
    public WebElement signUpPassword;

    @FindBy (id = "signupFormSubmitButton")
    public WebElement continueButton;

    @FindBy (xpath="(//div[@aria-hidden='true'])[6]")
    public WebElement passwordStrengthText;

    @FindBy(xpath = "//div[@class='uitk-progress-bar-container']")
    public WebElement getPasswordStrengthContainer;

    @FindBy (xpath = "//h3[@class='uitk-error-summary-heading']")
    public WebElement alert;



}

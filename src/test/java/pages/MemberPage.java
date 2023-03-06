package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MemberPage {
    public MemberPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='More travel']")
    public WebElement moreTravelDropdown;

    @FindBy (xpath = "(//*[text()='Going to'])[3]")
    public WebElement goingToButton;

    @FindBy (id = "date_form_field-btn")
    public WebElement datesButton;

    @FindBy (xpath= "//button[@data-stid='open-room-picker']")
    public WebElement travelersButton;

    @FindBy (xpath= "(//span[@class='uitk-step-input-button'])[1]")
    public WebElement decreaseButtonToAdults;

    @FindBy (xpath= "(//span[@class='uitk-step-input-button'])[2]")
    public WebElement increaseButtonToAdults;

    @FindBy (xpath= "(//span[@class='uitk-step-input-button'])[3]")
    public WebElement decreaseButtonToChildren;

    @FindBy (xpath= "(//span[@class='uitk-step-input-button'])[4]")
    public WebElement increaseButtonToChildren;

    @FindBy (xpath= "//*[@id='age-traveler_selector_children_age_selector-0-0']")
    public WebElement child_1_age;

    @FindBy (xpath= "//*[@id='age-traveler_selector_children_age_selector-0-1']")
    public WebElement child_2_age;

    @FindBy (id = "traveler_selector_done_button")
    public WebElement doneButton;

    @FindBy (id = "search_button")
    public WebElement searchButton;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement memberName;

}

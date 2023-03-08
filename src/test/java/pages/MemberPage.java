package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MemberPage {
    public MemberPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "gc-custom-header-tool-bar-shop-menu")
    public WebElement more_travel_2;

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

    //Zeynep(51-60)









    //Esen(61-70)









  //Rabia(71-80)
  @FindBy (xpath = "//a[@href='/lp/b/deals']")
  public WebElement deals_link;

    @FindBy (xpath = "//a[@href='/vacation-rental']")
    public WebElement vacation_rentals_link;

    @FindBy (linkText = "https://cars.hotels.com/en-us/?clientID=541572#/searchcars")
    public WebElement car_rental_link;

    @FindBy (linkText = "https://www.hotels.com/lp/b/deals")
    public WebElement groups_meetings_link;

    @FindBy (linkText = "https://www.hotels.com/lp/b/deals")
    public WebElement gift_cards_link;

    @FindBy (linkText = "https://www.hotels.com/lp/b/deals")
    public WebElement rewards_link;

    @FindBy (linkText = "https://www.hotels.com/lp/b/deals")
    public WebElement credit_card_link;




}

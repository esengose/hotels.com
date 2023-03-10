package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;

public class ZeyPage {

@FindBy(xpath = "(//a[@class='uitk-button uitk-button-medium uitk-button-fullWidth uitk-button-has-text uitk-button-as-link uitk-button-primary'])[1]")
    public WebElement signIn2;
@FindBy(xpath = "//button[@id='loginFormSubmitButton']")
    public WebElement signIn3;
@FindBy(xpath = "//div[@class='uitk-menu-container uitk-menu-open uitk-menu-pos-left uitk-menu-container-autoposition uitk-menu-container-has-intersection-root-el']")
public WebElement moreTravel;
@FindBy(xpath = "//input[@id='destination_form_field']")
    public WebElement goingTo;
@FindBy(xpath = "//button[@aria-label='Apr 28, 2023 selected, current check in date.']")
    public WebElement dateSelect;
@FindBy(xpath = "//button[normalize-space()='Done']")
    public WebElement doneButton;
@FindBy(xpath = "//div[@class='uitk-menu-container uitk-menu-open uitk-menu-pos-right uitk-menu-container-autoposition uitk-menu-container-over-trigger']//div[2]//div[1]//div[1]//button[2]//span[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")
public WebElement childAdd;
@FindBy(xpath ="//button[@id='traveler_selector_done_button']")
public WebElement doneButton2;
@FindBy(xpath = "//button[@id='search_button']")
    public WebElement searchButton;
//filtreler
    @FindBy(xpath = "//label[@for='mealPlan-ALL_INCLUSIVE-pps']//span[@class='uitk-checkbox-label-content'][normalize-space()='All inclusive']")
public WebElement allInclusiveFilter;
    @FindBy(xpath = "(//input[@id='guestRating-35-0id'])[1]")
    public WebElement goodFilter;
    @FindBy(xpath = "//input[@id='paymentType-FREE_CANCELLATION-kpe']")
public WebElement fullypayFilter;
    @FindBy(xpath = "(//input[@id='lodging-HOTEL_RESORT-1yl'])[1]")
    public WebElement hotelFilter;
@FindBy(xpath = "//h3[@class='uitk-error-summary-heading']")
    public WebElement errorMessage;












}

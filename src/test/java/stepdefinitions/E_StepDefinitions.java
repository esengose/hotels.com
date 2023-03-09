package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.MemberPage;
import pages.SigninPage;
import utilities.ConfigReader;
import utilities.Driver;


public class E_StepDefinitions {
    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();
    MemberPage memberPage = new MemberPage();
    @Given("User goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get(string);
      //  Driver.clickWithJS(homePage.Turkce2);
        Driver.wait(5);
        Select select = new Select(homePage.bolge);
        select.selectByValue("300000001");
        Select select1 = new Select(homePage.english);
        select1.selectByValue("en_US");
        homePage.kaydet.click();
        Driver.wait(5);
    }
    @When("User enters correct credentials")
    public void user_enters_correct_credentials() {
       homePage.signIn.click();
       Driver.wait(2);
    }
    @Then("user should login successfully")
    public void user_should_login_successfully() {
        signinPage.loginEmail.sendKeys(ConfigReader.getProperty("valid_mail"));
        signinPage.loginPassword.sendKeys(ConfigReader.getProperty("valid_password"));
        signinPage.loginSignInButton.click();
        Assert.assertTrue(memberPage.memberName.isDisplayed());

    }
    @Then("close driver")
    public void close_driver() {
        Driver.closeDriver();
    }
}

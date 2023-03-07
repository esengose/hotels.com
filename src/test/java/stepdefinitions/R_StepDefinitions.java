package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.MemberPage;
import pages.SigninPage;
import utilities.ConfigReader;
import utilities.Driver;


public class R_StepDefinitions {

    HomePage homePage = new HomePage();
    CreateAccountPage createAccountPage = new CreateAccountPage();
    MemberPage memberPage = new MemberPage();
    SigninPage signinPage = new SigninPage();

    @Given("Kullanici url e gider")
    public void kullanici_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        try {
            Assert.assertTrue(homePage.turkce.isDisplayed());
            homePage.turkce.click();
            Driver.wait(3);
            Select select = new Select(homePage.bolge);
            select.selectByIndex(2);
            Driver.wait(3);
            homePage.kaydet.click();
            Driver.wait(3);

        }catch (Exception e){

        }

    }

    @When("Kullanici {string} butonuna tıklar")
    public void kullanici_butonuna_tıklar(String string) {
        homePage.signIn.click();
        Driver.wait(1);
    }

    @Then("Kullanici {string} linkine tıklar")
    public void kullanici_linkine_tıklar(String string) {
    createAccountPage.singUp.click();
    }

    @Then("Kullanici email kutusuna {string} değerini girer")
    public void kullanici_email_kutusuna_değerini_girer(String string) {
        createAccountPage.singUpEmail.sendKeys(ConfigReader.getProperty("signIn_email"));
    }

    @Then("Kullanici first name kutusuna {string} değerini girer")
    public void kullanici_first_name_kutusuna_değerini_girer(String string) {
        createAccountPage.firstNameBox.sendKeys("good");
    }

    @Then("Kullanici last name kutusuna {string} değerini girer")
    public void kullanici_last_name_kutusuna_değerini_girer(String string) {
       createAccountPage.lastNameBox.sendKeys("vendor");
    }

    @Then("Kullanici password kutusuna  {string} değerini girer")
    public void kullanici_password_kutusuna_değerini_girer(String string) {
      createAccountPage.signUpPassword.sendKeys(ConfigReader.getProperty("signIn_password"));
    }

    @Then("Kullanici {string} butonuna tiklar")
    public void kullanici_butonuna_tiklar(String string) {
     createAccountPage.continueButton.click();
    }

    @Then("Kullanici uyarı mesajını görür")
    public void kullanici_uyarı_mesajını_görür() {
       createAccountPage.alert.isDisplayed();

    }


//****************************************************************************



    @Then("Kullanici Sign in linkine tıklar")
    public void kullanici_sign_in_linkine_tıklar() {
        homePage.sigInLink.click();
    }

    @Then("Kullanici email kutusuna loginEmail değerini girer")
    public void kullanici_email_kutusuna_login_email_değerini_girer() {
      signinPage.loginEmail.sendKeys(ConfigReader.getProperty("signIn_email"));
    }
    @Then("Kullanici password kutusuna  loginPassword değerini girer")
    public void kullanici_password_kutusuna_login_password_değerini_girer() {
        signinPage.loginPassword.sendKeys(ConfigReader.getProperty("signIn_password"));
    }

    @Then("Kullanici Login Sign in butonuna tıklar")
    public void kullanici_login_sign_in_butonuna_tıklar() {
        signinPage.loginSignInButton.click();
        Driver.wait(2);
    }

    @Then("Kullanici more travel butonuna tıklar")
    public void kullanici_more_travel_butonuna_tıklar() {
     memberPage.more_travel_2.click();
    }

    @Then("Kullanici {string} linkinin gorundugunu dogrular")
    public void kullanici_linkinin_gorundugunu_dogrular(String string) {
        Assert.assertTrue(memberPage.deals_link.isDisplayed());
    }
}
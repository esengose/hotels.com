package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateAccountPage;
import pages.HomePage;
import utilities.ConfigReader;

public class R2_StepDefinitions {

    HomePage homePage = new HomePage();
    CreateAccountPage createAccountPage = new CreateAccountPage();
    @When("Kullanici create an account sayfasına erişir")
    public void kullanici_create_an_account_sayfasına_erişir() {
      //  homePage.signIn.click();
        createAccountPage.singUp.click();

    }
    @Then("Kullanici  {string} girer")
    public void kullanici_girer(String string) {
        createAccountPage.singUpEmail.sendKeys(ConfigReader.getProperty("signIn_email"));
    }
    @Then("Kullanici diğer bilgileri girer ve continue butonuna tiklar")
    public void kullanici_diğer_bilgileri_girer_ve_continue_butonuna_tiklar() {
        createAccountPage.firstNameBox.sendKeys("good");
        createAccountPage.lastNameBox.sendKeys("vendor");
        createAccountPage.signUpPassword.sendKeys(ConfigReader.getProperty("signIn_password"));
        createAccountPage.continueButton.click();
    }
    @Then("Kullanici alert mesajını görür")
    public void kullanici_alert_mesajını_görür() {
        createAccountPage.alert.isDisplayed();
    }

///*********************************************************************************************



}

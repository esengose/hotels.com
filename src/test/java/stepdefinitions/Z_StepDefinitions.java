package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SigninPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Z_StepDefinitions {
    HomePage homePage;
    SigninPage signinPage;

    @Given("Kullanici {string} gider")
    public void kullanici_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @When("Ulke secenegi {string} ise {string} olarak degistirir.")
    public void ulke_secenegi_ise_olarak_degistirir(String string, String string2) {
        homePage=new HomePage();
        signinPage=new SigninPage();
        if (homePage.turkce.isDisplayed()){
            homePage.english.click();
        }

    }
    @When("Valid bir email ve password girerek login olur")
    public void valid_bir_email_ve_password_girerek_login_olur() {

    }
    @Then("Basariliyla login yapildigini dogrular")
    public void basariliyla_login_yapildigini_dogrular() {

    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {

    }

}

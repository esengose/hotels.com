package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.SigninPage;
import pages.ZeyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Z_StepDefinitions {
    HomePage homePage;
    SigninPage signinPage;
  ZeyPage zeyPage;



    @Given("Kullanici {string} gider")
    public void kullanici_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @When("Ulke secenegi {string} ise {string} olarak degistirir.")
    public void ulke_secenegi_ise_olarak_degistirir(String string, String string2) {
        homePage=new HomePage();
        signinPage=new SigninPage();

        try {
             if( homePage.turkce.isDisplayed()){
            homePage.turkce.click();
           Driver.selectFromDropdown(homePage.bolge,"Amerika Birleşik Devletleri · USD $");
           Driver.wait(1);
           Driver.selectFromDropdown(homePage.languageDropDown,"English (United States)");
           homePage.kaydet.click();}
        }catch ( Exception exception){};

    }
    @When("Valid bir email ve password girerek login olur")
    public void valid_bir_email_ve_password_girerek_login_olur() {
homePage=new HomePage();
signinPage=new SigninPage();
zeyPage=new ZeyPage();
homePage.signIn.click();
Driver.wait(2);
Driver.clickWithJS(zeyPage.signIn2);
signinPage.loginEmail.sendKeys(ConfigReader.getProperty("signIn_zeymail"));
signinPage.loginPassword.sendKeys(ConfigReader.getProperty("signIn_zeypassword"));



    }
    @Then("Basariliyla login yapildigini dogrular")
    public void basariliyla_login_yapildigini_dogrular() {


    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {


    }
    @When("Invalid bir email ve valid bir password girerek login olmaya calisir")
    public void ınvalid_bir_email_ve_valid_bir_password_girerek_login_olmaya_calisir() {


    }
    @When("Invalid maille login olunamadigini dogrular")
    public void ınvalid_maille_login_olunamadigini_dogrular() {


    }

    @When("Valid bir email ve invalid password girerek login olmaya calisir")
    public void valid_bir_email_ve_invalid_password_girerek_login_olmaya_calisir() {

    }
    @When("Invalid passwordla giris yapilamdigini dogrular")
    public void ınvalid_passwordla_giris_yapilamdigini_dogrular() {

    }














}

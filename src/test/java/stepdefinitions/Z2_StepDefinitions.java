package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.MemberPage;
import pages.ZeyPage;
import utilities.Driver;

public class Z2_StepDefinitions {
MemberPage memberPage;
HomePage homePage;
ZeyPage zeyPage;

    @When("more travelda dropdownunda    Deals seceneginin gorundugunu dogrular")
    public void more_travelda_dropdownunda_deals_seceneginin_gorundugunu_dogrular() {
        memberPage=new MemberPage();
        zeyPage=new ZeyPage();
        homePage=new HomePage();
       memberPage.more_travel_2.click();
       Driver.wait(3);
        String moreTravelDropDown=memberPage.deals_link.getText();
        System.out.println(moreTravelDropDown);
    }


    @When("more travelda Vacation Rentals seceneginin gorundugunu dogrular")
    public void more_travelda_vacation_rentals_seceneginin_gorundugunu_dogrular() {

    }
    @When("more travelda Groups&Meetings seceneginin gorundugunu dogrular.")
    public void more_travelda_groups_meetings_seceneginin_gorundugunu_dogrular() {

    }
    @When("more travelda Gift Cards seceneginin gorundugunu dogrular")
    public void more_travelda_gift_cards_seceneginin_gorundugunu_dogrular() {

    }
    @When("more travelda F Hotels.com Rewards seceneginin gorundugunu dogrular.")
    public void more_travelda_f_hotels_com_rewards_seceneginin_gorundugunu_dogrular() {

    }
    @When("more travelda  Credit Card seceneklerinin gorundugunu dogrular")
    public void more_travelda_credit_card_seceneklerinin_gorundugunu_dogrular() {

    }

    @When("Kullanici oda ve kisi sayisini secer")
    public void kullanici_oda_ve_kisi_sayisini_secer() {

    }
    @Then("Search butonuna basarak uygun arama sonuclarinin goruntulendigini dogrular")
    public void search_butonuna_basarak_uygun_arama_sonuclarinin_goruntulendigini_dogrular() {

    }

    @When("kullanici arama yapilcak sehri secer")
    public void kullanici_arama_yapilcak_sehri_secer() {

    }
    @When("kullanici search yapilcak tarihleri secer")
    public void kullanici_search_yapilcak_tarihleri_secer() {

    }
    @When("Kullanici oda ve kisi sayisini secer  ve search butonuna basar")
    public void kullanici_oda_ve_kisi_sayisini_secer_ve_search_butonuna_basar() {

    }
    @When("Kullanici  acilan yeni sayfada filtrelere gelip hepsi icin en azindan bir tanesini tiklar")
    public void kullanici_acilan_yeni_sayfada_filtrelere_gelip_hepsi_icin_en_azindan_bir_tanesini_tiklar() {

    }
    @When("Kullanici T??m filtrelerin uygun ??ekilde uyguland??????n?? do??rular")
    public void kullanici_t??m_filtrelerin_uygun_??ekilde_uyguland??????n??_do??rular() {

    }
    @When("Kullanici cikan sonuclardan ilkine ardindan reserve linkine tiklar")
    public void kullanici_cikan_sonuclardan_ilkine_ardindan_reserve_linkine_tiklar() {

    }
    @When("Kullanici oda fiyatlandirmasinin goruldugunu dogrular")
    public void kullanici_oda_fiyatlandirmasinin_goruldugunu_dogrular() {

    }
    @Then("First name,last name, odeme bilgilerinin girilebildigini dogrular")
    public void first_name_last_name_odeme_bilgilerinin_girilebildigini_dogrular() {

    }


}

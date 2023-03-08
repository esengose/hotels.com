  @hotelscom_login
  Feature:hotels.com testi

    Background: hotels.com adresine git
      Given Kullanici url e gider
      When Kullanici "sign in" butonuna tıklar
      @uzun_yol_testi
      Scenario: kayitli_mail_ile_giris_testi

        Then Kullanici "Sign up, it's free" linkine tıklar
        Then Kullanici email kutusuna "signIn_email" değerini girer
        Then Kullanici first name kutusuna "good" değerini girer
        Then Kullanici last name kutusuna "vendor" değerini girer
        Then Kullanici password kutusuna  "signIn_password" değerini girer
        Then Kullanici "continue" butonuna tiklar
        Then Kullanici uyarı mesajını görür

        @kisa_yol_testi
        Scenario: kayitli_mail_ile_giris_testi_kisayol
          When Kullanici create an account sayfasına erişir
          Then Kullanici  "email adresi" girer
          Then Kullanici diğer bilgileri girer ve continue butonuna tiklar
          Then Kullanici alert mesajını görür

          @more_travel_testi
          Scenario: more_travel_dropdown_testi
            Then Kullanici Sign in linkine tıklar
            Then Kullanici email kutusuna loginEmail değerini girer
            Then Kullanici password kutusuna  loginPassword değerini girer
            Then Kullanici Login Sign in butonuna tıklar
            Then Kullanici more travel butonuna tıklar
            And Kullanici "Deals" linkinin gorundugunu dogrular
            And Kullanici "Vacation rentals" linkinin gorundugunu dogrular
            And Kullanici "Car Rental" linkinin gorundugunu dogrular
            And Kullanici "Groups Meetings" linkinin gorundugunu dogrular
            And Kullanici "Gift Cards" linkinin gorundugunu dogrular
            And Kullanici "Rewards" linkinin gorundugunu dogrular
            And Kullanici "Credit Card" linkinin gorundugunu dogrular

            @search_testi
            Scenario:
              Then Kullanici Sign in linkine tıklar
              Then Kullanici email kutusuna loginEmail değerini girer
              Then Kullanici password kutusuna  loginPassword değerini girer
              Then Kullanici Login Sign in butonuna tıklar
              Then Kullanici hedef sehri secer
              Then Kullanici gidis_donus tarihlerini secer
              Then Kullanici yolcu sayisini secer
              Then kullanici search butonuna tiklar


Feature: Search
  Scenario:
Given Kullanici "hotels.coma" gider
When Ulke secenegi "Turkiye" ise "Abd" olarak degistirir.
And more travelda dropdownunda    Deals seceneginin gorundugunu dogrular
And more travelda Vacation Rentals seceneginin gorundugunu dogrular
And more travelda Groups&Meetings seceneginin gorundugunu dogrular.
And more travelda Gift Cards seceneginin gorundugunu dogrular
And more travelda F Hotels.com Rewards seceneginin gorundugunu dogrular.
  And more travelda  Credit Card seceneklerinin gorundugunu dogrulayinz

    Scenario:

      Given Kullanici "hotels.coma" gider
      When Ulke secenegi "Turkiye" ise "Abd" olarak degistirir.
      When Valid bir email ve password girerek login olur
      And  kullanici arama yapilcak sehri secer
      And kullanici search yapilcak tarihleri secer
      And Kullanici oda ve kisi sayisini secer


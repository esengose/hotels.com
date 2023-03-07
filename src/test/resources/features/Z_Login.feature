@smokezey
Feature:login
    Background:
      Given Kullanici "hotels.coma" gider
    When Ulke secenegi "Turkiye" ise "Abd" olarak degistirir.

  Scenario: TC01 Valid degerle login olma
     When Valid bir email ve password girerek login olur
    Then Basariliyla login yapildigini dogrular
    Then Sayfayi kapatir

Scenario: TC02 Invalid maille login olma
When Invalid bir email ve valid bir password girerek login olmaya calisir
  When Invalid maille login olunamadigini dogrular
  Then Sayfayi kapatir

  Scenario: TC03 Invalid passwordla login olma
    When Valid bir email ve invalid password girerek login olmaya calisir
    When Invalid passwordla giris yapilamdigini dogrular
    Then Sayfayi kapatir


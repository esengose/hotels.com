Feature:login
@smokezey
  Scenario: TC01 Valid degerle login olma
    Given Kullanici "hotels.coma" gider
    When Ulke secenegi "Turkiye" ise "Abd" olarak degistirir.
    When Valid bir email ve password girerek login olur
    Then Basariliyla login yapildigini dogrular
    Then Sayfayi kapatir


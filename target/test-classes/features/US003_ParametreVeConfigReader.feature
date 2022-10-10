Feature: Parametre Kullanimi
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "amazonUrl" anasayfasina gider
    Then kullanici 3 saniye bekler
    When Url in "amazon" icerdigini test edelim
    And sayfayi kapatir


Feature: US004 Parametre Kullanimi
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://www.hepsiburada.com" anasayfasinda
    Then kullanici 3 saniye bekler
    When Url in "hepsi" icerdigini test edelim
    And sayfayi kapatir
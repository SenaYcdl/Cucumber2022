Feature: US0013 Parametre Kullanimi
  @gp6
  Scenario:TC01 Parametre Kullanimi
    Given kullanici "https://www.trendyol.com" ana sayfasinda
    Then kullanici 3 saniye bekler
    When url'nin "amazon" icerdigini test edelim
    And sayfayi kapatir
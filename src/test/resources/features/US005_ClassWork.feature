Feature: US005 BlueRentaCar Login

  Scenario: TC01 kullanici gecerli bilgilerle giris yapar
    Given kullanici "brcUrl" ana sayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kulllanici sayfayi kapatir
#// http://tutorialsninja.com/demo/index.php?route=common/home sayfasına gidiniz
#// Phones & PDAs'a tıklayınız
#// Telefonların markalarını alınız
#// Tüm öğeleri sepete ekleyiniz
#// Sepete tıklayınız
#// Sepetteki isimleri alınız
#// Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırınız

  Feature: US001 tutorial

    @tut
    Scenario: TC01 kullanici phones a tiklamali


      Given kullanici tutorial sayfasinda
      Then user Phones & PDAs'a tıklayınız
      And telefonlarin markalarini alir
      And Tum ogeleri sepete ekler
      And sepete tiklar
      And sepetteki isimleri alir
      And sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastirir
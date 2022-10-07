package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@Background",
        dryRun = false

)

public class Runner {

    /*
 Bir framework'de bir tek Runner class'i yeterli olabilir
 Runner class'inda class body'sinde hic bir sey olmaz
 Runner class'imizi onemli yapan 2 adet annotaion vardir
 @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
 Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz
 features : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
 glue : step definitions dosyalarini nerede bulacagimizi gosterir
 tags : o an hangi tag'i calistirmak istiyorsak onu belli eder
dryRun : iki secenek var
dryRun=true yazdigimizda Testimizi calistirmadan sadece eksik adimlari bize verir
deyRun=false yazdigimizda testlerimizi calistirir
  */


    /*
     Runner Class'ı TestNG'deki XMl mantığı ile çalışır. Çalıştırmak istediğimiz senartolara tag belirtiriz
    ve belirttiğimiz tag'ları çalıştırır. XMl deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    Runner class body'si boştur ve runner class'ını ekleyeceğimiz notasyonlar aktive eder.
     Bu class'da kullanacağımız 2 adet notasyon vardır
    -@RunWith(Cucumber.class)  notasyonu Runner class'ına çalışma özelliği ekler.
    Bu notasyon olduğu için Cucumber frameworkumuzde Junit kullanmayı tercih ederiz
    -@CucumberOptions notasyonu içinde
    features : Runeer dosyasının feature dosyasını nereden bulacağını tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : Hangi tag'i çalıştırmak istiyorsak onu belli eder

    dryRun : iki seçenek vardır
    dryRun = true; dersek testimizi çalıştırmadan eksik adımları bize verir
    dryRun = false; testlerimizi driver ile çalıştırır.
     */
}

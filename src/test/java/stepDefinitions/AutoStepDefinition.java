package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutoStepDefinition {

    AutoPage auto=new AutoPage();


    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String url) {

        Driver.getDriver().get(" http://automationpractice.com/index.php");
    }

    @And("kullanici sign in linkine tiklar")
    public void kullaniciSignInLinkineTiklar() {

        auto.login.click();
    }

    @And("kullanici Create and account bolumune email adresi girer")
    public void kullaniciCreateAndAccountBolumuneEmailAdresiGirer() {
    }

    @And("kullanici Create an Account butonuna basar")
    public void kullaniciCreateAnAccountButonunaBasar() {
    }

    @And("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullaniciKisiselBilgileriniVeIletisimBilgileriniGirer() {
    }

    @And("kullanici Register butonuna basar")
    public void kullaniciRegisterButonunaBasar() {
    }

    @Then("kullanicinin hesap olusturuldugunu dogrulayin")
    public void kullanicininHesapOlusturuldugunuDogrulayin() {
    }
}

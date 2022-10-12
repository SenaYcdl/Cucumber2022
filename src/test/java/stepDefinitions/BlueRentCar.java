package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentCar {

    BrcPage brcPage=new BrcPage();
    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {


        brcPage.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {

       brcPage.email.sendKeys(ConfigReader.getProperty("brcWrongEmail"));


    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {

        brcPage.password.sendKeys(ConfigReader.getProperty("brcWrongPassword"));

    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {

        brcPage.ikinciLogin.click();

    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {

        Assert.assertTrue(brcPage.sayfayaGirisYapilamadi.isDisplayed());

    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {

        Driver.closeDriver();

    }
}

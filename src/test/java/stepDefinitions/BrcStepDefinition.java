package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcHomeworkPage;

public class BrcStepDefinition {

    BrcHomeworkPage brcHomeworkPage=new BrcHomeworkPage();


    @And("{string} username girer")
    public void usernameGirer(String gecersizEmail) {

        brcHomeworkPage.email.sendKeys(gecersizEmail);

    }

    @And("{string} password girer")
    public void passwordGirer(String gecersizPass) {

        brcHomeworkPage.password.sendKeys(gecersizPass);


    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {

        brcHomeworkPage.ikinciLogin.click();


    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {

        Assert.assertTrue(brcHomeworkPage.ikinciLogin.isDisplayed());
    }
}

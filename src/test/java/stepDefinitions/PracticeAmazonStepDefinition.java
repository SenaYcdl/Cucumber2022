package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PracticeAmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PracticeAmazonStepDefinition {


    PracticeAmazonPage practiceAmazonPage = new PracticeAmazonPage();
    Faker faker = new Faker();

    @Given("kullanici Amazon web sitesine gider")
    public void kullaniciAmazonWebSitesineGider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @When("sign in butonuna tiklar")
    public void signInButonunaTiklar() {


        practiceAmazonPage.signInButton.click();


    }

    @And("faker kullanarak e-posta gonderir")
    public void fakerKullanarakEPostaGonderir() {

        practiceAmazonPage.email.sendKeys(faker.internet().emailAddress());

    }

    @And("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() {

        try {
            ReusableMethods.getScreenshot("ScreenShots");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @And("continiue'a tiklar")
    public void continiueATiklar() {

        practiceAmazonPage.continueButton.click();
    }

    @Then("There was a problem mesajini dogrular")
    public void thereWasAProblemMesajiniDogrular() {

        Assert.assertTrue(practiceAmazonPage.thereWasProblem.isDisplayed());

    }

    @And("Need help e tiklar")
    public void needHelpETiklar() {

        practiceAmazonPage.needHelp.click();
    }

    @And("forgot your password e tiklar")
    public void forgotYourPasswordETiklar() {

        practiceAmazonPage.forgotYourPassword.click();

    }

    @And("Password assistance metnini dogrular")
    public void passwordAssistanceMetniniDogrular() {

        Assert.assertTrue(practiceAmazonPage.passwordAssistance.isDisplayed());

    }

    @And("Geri gider")
    public void geriGider() {

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().refresh();

    }

    @And("Create your account butonuna tiklar")
    public void createYourAccountButonunaTiklar() {


        practiceAmazonPage.createAccountSubmit.click();


    }

    @Then("Create account metnini dogrular")
    public void createAccountMetniniDogrular() {

        Assert.assertTrue(practiceAmazonPage.createAccountMessage.isDisplayed());

    }

    @And("websayfasini kapatir")
    public void websayfasiniKapatir() {

        Driver.closeDriver();

    }
}

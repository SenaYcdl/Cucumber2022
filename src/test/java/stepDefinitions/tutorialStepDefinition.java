package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TutorialPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class tutorialStepDefinition {
    TutorialPage tutorialPage = new TutorialPage();
    List<String> list = new ArrayList<>();
    List<String> phones = new ArrayList<>();

    @Given("kullanici tutorial sayfasinda")
    public void kullaniciTutorialSayfasinda() {
        Driver.getDriver().get(" http://tutorialsninja.com/demo/index.php?route=common/home");

    }

    @Then("user Phones & PDAs'a tıklayınız")
    public void userPhonesPDAsATıklayınız() {

        tutorialPage.phone.click();


    }

    @And("telefonlarin markalarini alir")
    public void telefonlarinMarkalariniAlir() throws InterruptedException {


        for (WebElement w : tutorialPage.phones) {
            System.out.println("Tum telefon markalari: " + w.getText());
            phones.add(w.getText());
        }


        Thread.sleep(1000);
    }

    @And("Tum ogeleri sepete ekler")
    public void tumOgeleriSepeteEkler() throws InterruptedException {


        //for (int i = 0; i < tutorialPage.addToCart.size(); i++) {
           // tutorialPage.addToCart.get(i).click();

        //}

        tutorialPage.addToCart.forEach(WebElement::click);
    }

    @And("sepete tiklar")
    public void sepeteTiklar() throws InterruptedException {

        tutorialPage.viewCart.click();


        Thread.sleep(2000);

    }

    @And("sepetteki isimleri alir")
    public void sepettekiIsimleriAlir() {


        for (WebElement w : tutorialPage.urunler) {
            list.add(w.getText());
        }


    }



    @And("sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastirir")
    public void sepettekiVeSayfadakiUrunlerinDogruOldugunuKarsilastirir() {


        Collections.sort(phones);
        Collections.sort(list);
        Assert.assertEquals(phones, list);

    }
}

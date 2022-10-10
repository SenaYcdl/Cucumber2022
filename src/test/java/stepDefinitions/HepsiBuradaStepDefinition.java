package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class HepsiBuradaStepDefinition {

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {

        Driver.getDriver().get(istenenUrl);
    }
}

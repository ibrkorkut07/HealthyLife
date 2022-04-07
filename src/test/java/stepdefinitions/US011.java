package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class US011 {
    @Given("kullanici\\(doktor){string} sayfasına gider")
    public void kullaniciDoktorSayfasnaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }

    @And("kullanici\\(doktor)giris ikonunu tiklar")
    public void kullaniciDoktorGirisIkonunuTiklar() {
    }

    @Then("kullanici\\(doktor) Sign in i secer")
    public void kullaniciDoktorSignInISecer() {
    }

    @And("kullanici\\(doktor){string} textbox'a  geçerli bir username girer")
    public void kullaniciDoktorTextboxAGecerliBirUsernameGirer(String arg0) {
    }

    @And("kullanici\\(doktor){string} textbox'a geçerli bir password girer")
    public void kullaniciDoktorTextboxAGecerliBirPasswordGirer(String arg0) {
    }

    @Then("kullanici\\(doktor)My Pages menu butonuna tıklar")
    public void kullaniciDoktorMyPagesMenuButonunaTiklar() {
    }

    @And("kullanici\\(doktor)My Appoinment secenegini seçer")
    public void kullaniciDoktorMyAppoinmentSeceneginiSecer() {
    }

    @Then("kullanici\\(doktor)Edit butonunu tıklar")
    public void kullaniciDoktorEditButonunuTıklar() {
    }

    @And("kullanici\\(doktor)Create or Edit an Appointment sayfasına gider")
    public void kullaniciDoktorCreateOrEditAnAppointmentSayfasınaGider() {
    }


}

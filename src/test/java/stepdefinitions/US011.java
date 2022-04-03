package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DoctorPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US011 {
    LoginPage loginPage = new LoginPage();
    DoctorPage doctorPage = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;

    @Given("kullanici\\(doktor){string} sayfasına gider")
    public void kullaniciDoktorSayfasnaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }

    @And("kullanici\\(doktor)giris ikonunu tiklar")
    public void kullaniciDoktorGirisIkonunuTiklar() {
        Driver.wait(1);
        loginPage.anaSayfaGirisIkonu.click();
    }

    @Then("kullanici\\(doktor) Sign in i secer")
    public void kullaniciDoktorSignInISecer() {
        Driver.wait(1);
        loginPage.anaSayfaSignIn.click();
    }

    @And("kullanici\\(doktor){string} textbox'a  geçerli bir username girer")
    public void kullaniciDoktorTextboxAGecerliBirUsernameGirer(String arg0) {
        Driver.wait(1);
        loginPage.UserNameBox.sendKeys(ConfigReader.getProperty(arg0));
    }

    @And("kullanici\\(doktor){string} textbox'a geçerli bir password girer")
    public void kullaniciDoktorTextboxAGecerliBirPasswordGirer(String arg0) {
        Driver.wait(1);
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty(arg0));
    }

    @Then("kullanici\\(doktor)My Pages menu butonuna tıklar")
    public void kullaniciDoktorMyPagesMenuButonunaTiklar() {
        Driver.wait(1);
        doctorPage.myPagesButton.click();
    }

    @And("kullanici\\(doktor)My Appoinment secenegini seçer")
    public void kullaniciDoktorMyAppoinmentSeceneginiSecer() {
        Driver.wait(1);
        doctorPage.myAppointmentButton.click();
    }

    @Then("kullanici\\(doktor)Edit butonunu tiklar")
    public void kullaniciDoktorEditButonunuTiklar() {
        Driver.wait(1);
        doctorPage.myAppointmentEditButton.click();
    }


    @And("kullanici\\(doktor) sign in butonunu tiklar")
    public void kullaniciDoktorSignInButonunuTiklar() {
        Driver.wait(1);
        loginPage.signIn.click();
    }

    @And("kullanici\\(doktor) {string} sayfasına gider")
    public void kullaniciDoktorSayfasınaGider(String arg0) {
        Driver.wait(1);
        String expectedText=arg0;
        String actualText=doctorPage.createOrEditAnAppointmentText.getText();
        Assert.assertEquals(expectedText,actualText);

    }

    @Given("Kullanıcı\\(Doktor)hastanın id bilgilerini görür")
    public void kullanıcıDoktorHastanınIdBilgileriniGörür() {
        doctorPage.createAppointmentIdBox.isDisplayed();
    }

    @And("Kullanıcı\\(Doktor)hastanın start and end date bilgilerini görür")
    public void kullanıcıDoktorHastanınStartAndEndDateBilgileriniGörür() {
        doctorPage.createAppointmentStartDateTime.isDisplayed();
        doctorPage.createAppointmentEndDateTime.isDisplayed();
    }

    @And("Kullanıcı\\(Doktor)hastanın Status bilgilerini görür")
    public void kullanıcıDoktorHastanınStatusBilgileriniGörür() {
        doctorPage.createAppointmentStatus.isDisplayed();
    }

    @And("Kullanıcı\\(Doktor)hastanın physician and patient bilgilerini görür")
    public void kullanıcıDoktorHastanınPhysicianAndPatientBilgileriniGörür() {
        actions.sendKeys(Keys.END).perform();
        Driver.wait(1);
        doctorPage.createAppointmentPhysician.isDisplayed();

    }

    @Given("Kullanıcı\\(Doktor) Status dropdown elementini PENDING, COMPLETED veya CANCELLED seklinde secer")
    public void kullanıcıDoktorStatusDropdownElementiniPENDINGCOMPLETEDVeyaCANCELLEDSeklindeSecer() {
         select=new Select(doctorPage.statusDropDownElementi);
          select.selectByValue("COMPLETED");
          Driver.wait(1);
          select.selectByValue("PENDING");
          Driver.wait(1);
          select.selectByValue("CANCELLED");
    }

    @And("kullanici oturumu kapatir")
    public void kullaniciOturumuKapatir() {
        Driver.wait(1);
        loginPage.cikisIconu.click();
        Driver.wait(1);
        loginPage.signOutButton.click();


    }
}

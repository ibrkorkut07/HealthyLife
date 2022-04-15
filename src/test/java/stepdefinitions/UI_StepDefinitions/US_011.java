package stepdefinitions.UI_StepDefinitions;

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

public class US_011 {
    LoginPage loginPage = new LoginPage();
    DoctorPage doctorPage = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;


    @Given("kullanici\\(doktor){string} sayfasina gider")
    public void kullaniciDoktorSayfasinaGider(String arg0) {
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
        if(Driver.getDriver().getCurrentUrl().equals("https://www.medunna.com/logout")) {
            Driver.wait(1);
            Driver.getDriver().get("https://www.medunna.com/login");
        }else {
            Driver.wait(1);
            Driver.getDriver().get("https://www.medunna.com/logout");
            Driver.wait(1);
            Driver.getDriver().get("https://www.medunna.com/login");

        }
    }

    @And("kullanici\\(doktor){string} textbox'a  gecerli bir username girer")
    public void kullaniciDoktorTextboxAGecerliBirUsernameGirer(String arg0) {
        Driver.wait(1);
        loginPage.UserNameBox.sendKeys(ConfigReader.getProperty(arg0));
    }

    @And("kullanici\\(doktor){string} textbox'a gecerli bir password girer")
    public void kullaniciDoktorTextboxAGecerliBirPasswordGirer(String arg0) {
        Driver.wait(1);
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty(arg0));
    }

    @Then("kullanici\\(doktor)My Pages menu butonuna tiklar")
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

    @Given("kullanici\\(Doktor)hastanin id bilgilerini gorur")
    public void kullaniciDoktorHastaninIdBilgileriniGorur() {

        Assert.assertTrue(doctorPage.createAppointmentIdBox.isDisplayed());

    }

    @And("kullanici\\(Doktor)hastanin start and end date bilgilerini gorur")
    public void kullaniciDoktorHastanınStartAndEndDateBilgileriniGorur() {
        Assert.assertTrue(doctorPage.createAppointmentStartDateTime.isDisplayed());
        Assert.assertTrue(doctorPage.createAppointmentEndDateTime.isDisplayed());
    }

    @And("kullanici\\(Doktor)hastanin Status bilgilerini gorur")
    public void kullaniciDoktorHastanınStatusBilgileriniGorur() {

        Assert.assertTrue(doctorPage.createAppointmentStatus.isDisplayed());
    }

    @And("kullanici\\(Doktor)hastanin physician and patient bilgilerini gorur")
    public void kullaniciDoktorHastanınPhysicianAndPatientBilgileriniGorur() {
        actions.sendKeys(Keys.END).perform();
        Driver.wait(1);
        Assert.assertTrue(doctorPage.createAppointmentPhysician.isDisplayed());

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


    @Given("kullanici \\(Doktor)Anamnesis textbox a tiklar")
    public void kullaniciDoktorAnamnesisTextboxATiklar() {
        doctorPage.createAppointmentAnamnesisBox.click();
        Driver.wait(1);

    }

    @Then("kullanici \\(Doktor)Anamnesis  textbox a bilgi girer")
    public void kullaniciDoktorAnamnesisTextboxABilgiGirer() {
        doctorPage.createAppointmentAnamnesisBox.clear();
        doctorPage.createAppointmentAnamnesisBox.sendKeys("Alerjik reaksiyon");
        Assert.assertTrue(doctorPage.createAppointmentAnamnesisBox.isEnabled());
        Driver.wait(1);
    }



    @Then("kullanici Treatment  textbox a bilgi girer")
    public void kullaniciTreatmentTextboxABilgiGirer() {
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        doctorPage.createAppointmentTreatmentBox.clear();
        doctorPage.createAppointmentTreatmentBox.sendKeys("Güneş kremi sürmeli");
        Assert.assertTrue(doctorPage.createAppointmentTreatmentBox.isEnabled());
        Driver.wait(1);

    }



    @Then("kullanici Diagnosis  textbox a bilgi girer")
    public void kullaniciDiagnosisTextboxABilgiGirer() {

        doctorPage.createAppointmentDiagnosisBox.clear();
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        doctorPage.createAppointmentDiagnosisBox.sendKeys("Güneş alerjisi");
        Assert.assertTrue(doctorPage.createAppointmentDiagnosisBox.isEnabled());
        Driver.wait(1);
    }


    @And("kullanici\\(Doktor) Prescription texbox daki bilgileri siler")
    public void kullaniciDoktorPrescriptionTexboxDakiBilgileriSiler() {
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        doctorPage.createAppointmentPrescriptionBox.sendKeys("Test");
        Assert.assertTrue(doctorPage.createAppointmentPrescriptionBox.isEnabled());
        Driver.wait(1);
        doctorPage.createAppointmentPrescriptionBox.clear();
        Driver.wait(1);

    }


    @And("kullanici\\(Doktor) Desscription texbox daki bilgileri siler")
    public void kullaniciDoktorDesscriptionTexboxDakiBilgileriSiler() {
        doctorPage.createAppointmentDescription.sendKeys("Test ");
Driver.wait(1);
        Assert.assertTrue(doctorPage.createAppointmentDescription.isEnabled());
        doctorPage.createAppointmentDescription.clear();
        Driver.wait(1);

    }

    @And("kullanci\\(Doktor) hastanin bilgilerini kaydeder")
    public void kullanciDoktorHastaninBilgileriniKaydeder() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        doctorPage.createAppointmentSave.click();
        Driver.wait(1);


    }
    LoginPage login = new LoginPage();

    @And("giris icin giris ikonuna tiklar")
    public void girisIcinGirisIkonunaTiklar() {
        login.anaSayfaGirisIkonu.click();
    }


    @And("ana sayfa Sign In butonuna tiklar")
    public void anaSayfaSignInButonunaTiklar() {
        Driver.wait(1);
        if(Driver.getDriver().getCurrentUrl().equals("https://www.medunna.com/logout") | Driver.getDriver().getCurrentUrl().equals("https://www.medunna.com/")) {
            Driver.wait(1);
            Driver.getDriver().get("https://www.medunna.com/login");
        }else {
            Driver.wait(1);
            Driver.getDriver().get("https://www.medunna.com/logout");
            Driver.wait(1);
            Driver.getDriver().get("https://www.medunna.com/login");

        }
    }

    @And("username olarak {string} girer")
    public void usernameOlarakGirer(String username) {
        Driver.wait(1);
        login.UserNameBox.sendKeys(ConfigReader.getProperty(username));
    }


    @And("password olarak {string} girer")
    public void passwordOlarakGirer(String password) {
        Driver.wait(1);

        login.passwordBox.sendKeys(ConfigReader.getProperty(password));
    }


    @And("Sign In butonuna tiklar")
    public void signInButonunaTiklar() {
        login.signIn.click();
    }
}



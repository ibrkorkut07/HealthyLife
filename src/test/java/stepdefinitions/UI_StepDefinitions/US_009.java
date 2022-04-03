package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_009 {


    StaffPage staffPage=new StaffPage();



    @Given("Kullanici {string} adresine gider.")
    public void kullanici_adresine_gider(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));
    }

   @Then("insan Figurune tiklar")
    public void insan_figurune_tiklar() {
        staffPage.insanFiguru.click();
    }

    @Then("Sig in secenegini secer")
    public void sig_in_secenegini_secer() {
        staffPage.IlkSigIn.click();
    }

    @Then("Username olarak {string} girer")
    public void username_olarak_girer(String name) throws InterruptedException {
        staffPage.wait(500);
        staffPage.UsernameBox.sendKeys(name);
    }

    @Then("Password olarak {string} girer")
    public void password_olarak_girer(String lastname) throws InterruptedException {
        staffPage.wait(500);
        staffPage.PasswordBox.sendKeys(lastname);
    }

    @Then("Sigin  tiklar")
    public void sigin_tiklar() {
        staffPage.SigIn.click();
    }

    @Then("My PAGES sekmesine tiklar")
    public void my_pages_sekmesine_tiklar() {
        staffPage.myPagesButonu.click();
    }

    @Then("Search Patient secenegini secer")
    public void search_patient_secenegini_secer() {
        staffPage.searchPatientButonu.click();
    }

    @Then("Patients yazisini görür")
    public void patients_yazisini_görür() throws InterruptedException {
         staffPage.wait(500);
        String actuelTitle=staffPage.patientsYazisi.getText();
        String expectedTitle="Patients";
        Assert.assertEquals(expectedTitle,actuelTitle);
    }








   //TC02
    @And("{string} girer")
    public void girer(String ssn) {

     staffPage.patentSsnBox.sendKeys(ssn);
    }


    @Then("Edit butonuna tiklar")
    public void edit_butonuna_tiklar() {
     staffPage.editBox.click();
    }


    @Then("Create or edit a Patient formunu görür")
    public void create_or_edit_a_patient_formunu_görür() {
     Assert.assertTrue(staffPage.createPatientFormYazisi.isDisplayed());
    }



    @Then("id degistirir")
    public void id_degistirir() {
    staffPage.idBox.clear();
    staffPage.idBox.sendKeys("2406");

    }

    @Then("firstname degistirir")
    public void firstname_degistirir() {


    }

    @Then("lastname degistirir")
    public void lastname_degistirir() {

    }

    @Then("Birthdate degistirir")
    public void birthdate_degistirir() {

    }

    @Then("Email degistirir")
    public void email_degistirir() {

    }

    @Then("phone degistirir")
    public void phone_degistirir() {

    }

    @Then("gender degistirir")
    public void gender_degistirir() {

    }

    @Then("blood group degistirir")
    public void blood_group_degistirir() {

    }

    @Then("address degistirir")
    public void address_degistirir() {

    }

    @Then("description degistirir")
    public void description_degistirir() {

    }

    @Then("user degistirir")
    public void user_degistirir() {

    }

    @Then("country degistirir")
    public void country_degistirir() {

    }

    @And("state\\/city degistirir")
    public void stateCityDegistirir() {
    }

    @Then("save tiklar")
    public void save_tiklar() {

    }

    @Then("\"A Patient is updated with identifier \\{patientid}\"yazisini görür")
    public void a_patient_is_updated_with_identifier_yazisini_görür() {

    }



}

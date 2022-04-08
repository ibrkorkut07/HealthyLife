package stepdefinitions.UI_StepDefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DoctorPage;
import utilities.Driver;

public class US_014 {
    DoctorPage doctorPage = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;



    @And("kullanici\\(Doktor)InPaients secenegini tiklar")
    public void kullaniciDoktorInPaientsSeceneginiTiklar() {
        Driver.wait(1);
        doctorPage.myInpatientsSeceneği.click();

    }
    @And("kullanici\\(Doktor) {string} sayfasına gelir")
    public void kullaniciDoktorSayfasınaGelir(String arg0) {
        Driver.wait(1);
        String expectedText=arg0;
        String actualText=doctorPage.InPatientsYazisi.getText();
        Assert.assertEquals(expectedText,actualText);
    }


    @Then("kullanici\\(Doktor) hastanin edit butonuna tiklar")
    public void kullaniciDoktorHastaninEditButonunaTiklar() {

        doctorPage.InPatientEditbutonu.click();
    }

    @Given("kullanici\\(doktor) {string} bilgilerini goruntuler")
    public void kullaniciDoktorBilgileriniGoruntuler(String arg0) {
        Assert.assertTrue(doctorPage.inPatientsIdBox.isDisplayed());
        Assert.assertTrue(doctorPage.inPatientStartDateBox.isDisplayed());
        Assert.assertTrue(doctorPage.inPatientEndDateBox.isDisplayed());
        Assert.assertTrue(doctorPage.inPatientDescriptionBox.isDisplayed());
        Assert.assertTrue(doctorPage.inPatientCreatedDateBox.isDisplayed());
        Assert.assertTrue(doctorPage.inPatientAppointmentBox.isDisplayed());
        Assert.assertTrue(doctorPage.inPatientStatusBox.isDisplayed());
        Assert.assertTrue(doctorPage.inPatientRoomBox.isDisplayed());
        Assert.assertTrue(doctorPage.inPatientPatientBox.isDisplayed());

    }

    @Given("kullanici\\(doktor) {string} bilgilerini gunceller")
    public void kullaniciDoktorBilgileriniGunceller(String arg0) {
         Assert.assertTrue(doctorPage.inPatientsIdBox.isSelected());
         Assert.assertTrue(doctorPage.inPatientStartDateBox.isSelected());
        Assert.assertTrue(doctorPage.inPatientEndDateBox.isSelected());
        Assert.assertTrue(doctorPage.inPatientDescriptionBox.isSelected());
        Assert.assertTrue(doctorPage.inPatientCreatedDateBox.isSelected());
        Assert.assertTrue(doctorPage.inPatientAppointmentBox.isSelected());
        Assert.assertTrue(doctorPage.inPatientStatusBox.isSelected());
        Assert.assertTrue(doctorPage.inPatientRoomBox.isSelected());
        Assert.assertTrue(doctorPage.inPatientPatientBox.isSelected());

    }

    @Given("status doktor tarafından {string} olarak gunceller")
    public void statusDoktorTarafındanOlarakGunceller(String arg0) {
        select= new Select(doctorPage.inPatientStatusBox);
       // select.selectByIndex(0);
       // select.selectByIndex(1);
        //select.selectByIndex(2);
       // select.selectByIndex(3);
        doctorPage.inPatientStatusBox.click();
        Driver.wait(1);
        select.selectByValue("STAYING");
        Driver.wait(1);
        select.selectByValue("DISCHARGED");
        Driver.wait(1);
        select.selectByValue("CANCELLED");
        Driver.wait(1);
        select.selectByValue("UNAPPROVED");
        Driver.wait(1);





    }

    @Given("kullanici\\(doktor) rezerve edilmiş odayı gunceller")
    public void kullaniciDoktorRezerveEdilmişOdayıGunceller() {
        select= new Select(doctorPage.inPatientRoomBox);
        doctorPage.inPatientRoomBox.click();
        select.selectByIndex(4);
        Driver.wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        doctorPage.inPatientSaveButton.click();
        Driver.wait(2);

    }








}
package stepdefinitions.UI_StepDefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DoctorPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_014 {
    DoctorPage doctorPage = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;



    @And("kullanici\\(Doktor)InPaients secenegini tiklar")
    public void kullaniciDoktorInPaientsSeceneginiTiklar() {
        Driver.wait(1);
        doctorPage.myInpatientsSeceneği.click();

    }
    @And("kullanici\\(Doktor) {string} sayfasina gelir")
    public void kullaniciDoktorSayfasinaGelir(String arg0) {
        Driver.wait(1);
        String expectedText=arg0;
        String actualText=doctorPage.InPatientsYazisi.getText();
        Assert.assertEquals(expectedText,actualText);
    }


    @Then("kullanici\\(Doktor) hastanin edit butonuna tiklar")
    public void kullaniciDoktorHastaninEditButonunaTiklar() {

        doctorPage.InPatientEditbutonu.click();
    }



    @Given("kullanici\\(doktor) rezerve edilmis odayi gunceller")
    public void kullaniciDoktorRezerveEdilmisOdayiGunceller() {
        select= new Select(doctorPage.inPatientRoomBox);
        //doctorPage.inPatientRoomBox.click();
        select.selectByIndex(4);
        Driver.wait(1);
      actions.sendKeys(Keys.END).sendKeys(Keys.END).perform();
        Driver.wait(2);
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", doctorPage.inPatientSaveButton);

        jsexecutor.executeScript("arguments[0].click();", doctorPage.inPatientSaveButton);


      //  doctorPage.inPatientSaveButton.click();

    }


    @Given("kullanici\\(doktor) Id bilgilerini goruntuler")
    public void kullaniciDoktorIdBilgileriniGoruntuler() {
        Assert.assertTrue(doctorPage.inPatientsIdBox.isDisplayed());

    }

    @Then("kullanici\\(doktor) Start date bilgilerini goruntuler")
    public void kullaniciDoktorStartDateBilgileriniGoruntuler() {
                Assert.assertTrue(doctorPage.inPatientStartDateBox.isDisplayed());

    }

    @And("kullanici\\(doktor) End date bilgilerini goruntuler")
    public void kullaniciDoktorEndDateBilgileriniGoruntuler() {
                Assert.assertTrue(doctorPage.inPatientEndDateBox.isDisplayed());

    }

    @And("kullanici\\(doktor) Description bilgilerini goruntuler")
    public void kullaniciDoktorDescriptionBilgileriniGoruntuler() {
               Assert.assertTrue(doctorPage.inPatientDescriptionBox.isDisplayed());


    }

    @And("kullanici\\(doktor) Created Date bilgilerini goruntuler")
    public void kullaniciDoktorCreatedDateBilgileriniGoruntuler() {
               Assert.assertTrue(doctorPage.inPatientCreatedDateBox.isDisplayed());
    }

    @Given("kullanici\\(doktor) Appointment bilgilerini goruntuler")
    public void kullaniciDoktorAppointmentBilgileriniGoruntuler() {
               Assert.assertTrue(doctorPage.inPatientAppointmentBox.isDisplayed());


    }

    @Then("kullanici\\(doktor) Status bilgilerini goruntuler")
    public void kullaniciDoktorStatusBilgileriniGoruntuler() {
               Assert.assertTrue(doctorPage.inPatientStatusBox.isDisplayed());

    }

    @And("kullanici\\(doktor) Room bilgilerini goruntuler")
    public void kullaniciDoktorRoomBilgileriniGoruntuler() {
                Assert.assertTrue(doctorPage.inPatientRoomBox.isDisplayed());
    }

    @And("kullanici\\(doktor) Patient bilgilerini goruntuler")
    public void kullaniciDoktorPatientBilgileriniGoruntuler() {
                Assert.assertTrue(doctorPage.inPatientPatientBox.isDisplayed());

    }
        //***************************************************************************
    @Given("kullanici\\(doktor) Id bilgilerini gunceller")
    public void kullaniciDoktorIdBilgileriniGunceller() {

        //String text=doctorPage.inPatientsIdBox.getAttribute("value");
        //doctorPage.inPatientsIdBox.clear();
        //doctorPage.inPatientsIdBox.sendKeys(text);
        Assert.assertTrue(doctorPage.inPatientsIdBox.isEnabled());


    }

    @Then("kullanici\\(doktor) Start date bilgilerini gunceller")
    public void kullaniciDoktorStartDateBilgileriniGunceller() {

        //String text=doctorPage.inPatientStartDateBox.getAttribute("value");
       // doctorPage.inPatientStartDateBox.clear();

        //doctorPage.inPatientStartDateBox.sendKeys(text);

        Assert.assertTrue(doctorPage.inPatientStartDateBox.isEnabled());

    }

    @And("kullanici\\(doktor) End date bilgilerini gunceller")
    public void kullaniciDoktorEndDateBilgileriniGunceller() {
        Assert.assertTrue(doctorPage.inPatientEndDateBox.isEnabled());

    }
        //*********************************************************************************
    @And("kullanici\\(doktor) Appoinment bilgilerini gunceller")
    public void kullaniciDoktorAppoinmentBilgileriniGunceller() {
        Assert.assertFalse(doctorPage.inPatientAppointmentBox.isEnabled());


    }

    @And("kullanici\\(doktor) Patient bilgilerini gunceller")
    public void kullaniciDoktorPatientBilgileriniGunceller() {
        Assert.assertFalse(doctorPage.inPatientPatientBox.isEnabled());

//**********************************************************************************************************
    }

    @Given("kullanici\\(doktor) Description bilgilerini gunceller")
    public void kullaniciDoktorDescriptionBilgileriniGunceller() {
        String text=doctorPage.inPatientDescriptionBox.getAttribute("value");
        doctorPage.inPatientDescriptionBox.clear();
        Driver.wait(1);
        doctorPage.inPatientDescriptionBox.sendKeys(text);
        Assert.assertTrue(doctorPage.inPatientDescriptionBox.isEnabled());


    }

    @Then("kullanici\\(doktor) Created date bilgilerini gunceller")
    public void kullaniciDoktorCreatedDateBilgileriniGunceller() {
        Assert.assertTrue(doctorPage.inPatientCreatedDateBox.isEnabled());


    }

    @And("kullanici\\(doktor) Status bilgilerini gunceller")
    public void kullaniciDoktorStatusBilgileriniGunceller() {
        Assert.assertTrue(doctorPage.inPatientStatusBox.isEnabled());

    }

    @And("kullanici\\(doktor) Room bilgilerini gunceller")
    public void kullaniciDoktorRoomBilgileriniGunceller() {
        Assert.assertTrue(doctorPage.inPatientRoomBox.isEnabled());

    }

    @Given("status doktor tarafindan UNAPPROVED olarak gunceller")
    public void statusDoktorTarafindanUNAPPROVEDOlarakGunceller() {
        select= new Select(doctorPage.inPatientStatusBox);
        select.selectByValue("UNAPPROVED");
        Driver.wait(1);

    }

    @And("status doktor tarafindan DISCHARGED olarak gunceller")
    public void statusDoktorTarafindanDISCHARGEDOlarakGunceller() {
        select= new Select(doctorPage.inPatientStatusBox);


        Driver.wait(1);
        select.selectByValue("DISCHARGED");

    }

    @And("status doktor tarafindan STAYING olarak gunceller")
    public void statusDoktorTarafindanSTAYINGOlarakGunceller() {
        select= new Select(doctorPage.inPatientStatusBox);

        Driver.wait(1);
        select.selectByValue("STAYING");



    }

    @And("status doktor tarafindan CANCELLED olarak gunceller")
    public void statusDoktorTarafindanCANCELLEDOlarakGunceller() {
        select= new Select(doctorPage.inPatientStatusBox);


        Driver.wait(1);
        select.selectByValue("CANCELLED");
    }
}
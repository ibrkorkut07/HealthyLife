package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AppointmentPage;
import utilities.Driver;

public class US_007 {
    AppointmentPage us07=new AppointmentPage();
    @Then("makeAppointmentButton a tiklar")
    public void make_appointment_button_a_tiklar() {
        us07.myPageButton.click();
        Driver.wait(1);
        us07.makeAppintmentclickbutonu.click();
    }

    @And("kulanici tel  {string} girer")
    public void kulaniciTelGirer(String phone) {
        us07.phoneBox.sendKeys(phone);
    }

    @And("kullanici  {string} eski tarihi girer")
    public void kullaniciEskiTarihiGirer(String appointmentdatetime) {
        us07.appointmentDateBox.sendKeys(appointmentdatetime);
    }

    @Then("kullanici Appointment date can not be past date! yazisini gorur")
    public void kullaniciAppointmentDateCanNotBePastDateYazisiniGorur() {
        Assert.assertTrue(us07.hataliTarihUyariYazisiElementi.isDisplayed());
    }

    @And("kullanici  {string} tarihi girer")
    public void kullaniciTarihiGirer(String appointmentdatetime) {
        us07.appointmentDateBox.sendKeys(appointmentdatetime);
    }

    @Then("sendAnAppointmentRequestButton a tiklar")
    public void sendanappointmentrequestbuttonATiklar() {
        us07.sendAnAppointmentRequestButton.click();
    }

    @And("randevunun basari ile kaydedildigini gorur")
    public void randevununBasariIleKaydedildiginiGorur() {
        Assert.assertTrue(us07.registerOnayMesaji.isDisplayed());
    }
}

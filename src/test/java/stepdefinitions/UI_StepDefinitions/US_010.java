package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DoctorPage;

public class US_010 {

    DoctorPage us10=new DoctorPage();
    @Then("{string} und {string} tarihlerini secer")
    public void und_tarihlerini_secer(String fromDate, String toDate) {
        us10.fromDate.sendKeys(fromDate);
        us10.todate.sendKeys(toDate);
    }


    @And("My inpatient butonunu tiklar")
    public void myInpatientButonunuTiklar() {
        us10.myInpatientsDropdown.click();
    }

    @Then("hasta id kismi gorunur")
    public void hastaIdKismiGorunur() {
        Assert.assertEquals("ID",us10.appointmentIdBox.getText());
    }

    @And("hastanın Status bilgilerini görür")
    public void hastaninStatusBilgileriniGorur() {
        Assert.assertTrue(us10.appointmentStatusBox.isDisplayed());
    }

    @And("randevu listesini görür")
    public void randevuListesiniGorur() {
        Assert.assertFalse(us10.appoinmentList.isEmpty());
    }
}

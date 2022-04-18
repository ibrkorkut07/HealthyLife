package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.InvoicePage;
import utilities.Driver;

public class US_024_HastaTestSonuclari {

    InvoicePage invoicePage = new InvoicePage();
    // Actions actions = new Actions(Driver.getDriver());

    @And("kullanici giris ikonuna tiklar")
    public void kullaniciGirisIkonunaTiklar() {
        Driver.wait(3);
        invoicePage.HastaSignInbutonu.click();
    }

    @Then("Username olarak {string} ve  password olarak {string} girip Hasta Sign In butonuna tiklar")
    public void usernameOlarakVePasswordOlarakGiripSignInButonunaTiklar(String arg0, String arg1) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", invoicePage.UsernameBox);
        invoicePage.UsernameBox.sendKeys("hastaayse");
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", invoicePage.PasswordBox);
        invoicePage.PasswordBox.sendKeys("ayse");
        invoicePage.HastaSignInbutonu.click();
    }

    @And("MyPagesPatient sekmesinde My Appointments linkine tiklar")
    public void mypagesSekmesindeMyAppointmentsLinkineTiklar() {
        invoicePage.MyPagesPatientButton.click();
        Driver.wait(2);
        invoicePage.MyAppointmentsDropDownItem.click();
    }

    @Then("Show Tests ve View Results sekmelerine tiklar")
    public void showTestsVeViewResultsSekmelerineTiklar() {
        invoicePage.ShowTestsbutonu.click();
        Driver.wait(2);
        invoicePage.ViewResultsButton.click();
        Driver.wait(2);
     }

    @And("Test id, name, default max and min value, test date, description Date ini gorur")
    public void testIdNameDefaultMaxAndMinValueTestDateAndDescriptionIniGorur() {
        Assert.assertTrue("Test Results Id is NOT displayed: ", invoicePage.TestResultsId.isDisplayed());
        Assert.assertTrue("Test Results Name is NOT displayed: ", invoicePage.TestResultsName.isDisplayed());
        Assert.assertTrue("Test Results Result is NOT displayed: ", invoicePage.TestResultsResult.isDisplayed());
        Assert.assertTrue("Test Results Default Min Value is NOT displayed: ", invoicePage.TestResultsDefaultMinValue.isDisplayed());
        Assert.assertTrue("Test Results Default Max Value is NOT displayed: ", invoicePage.TestResultsDefaultMinValue.isDisplayed());
        Assert.assertTrue("Test Results Test is NOT displayed: ", invoicePage.TestResultsTest.isDisplayed());
        Assert.assertTrue("Test Results Description is NOT displayed: ", invoicePage.TestResultsDescription.isDisplayed());
        Assert.assertTrue("Test Results Date is NOT displayed: ", invoicePage.TestResultsDate.isDisplayed());
    }

    @Then("Show Invoice sekmesine tiklar")
    public void showInvoiceSekmesineTiklar() {
        invoicePage.AppointmentsShowInvoiceButton.click();
    }

    @And("Hasta Invoice sayfasini gorur")
    public void hastaInvoiceSayfasiniGorur() {
        Assert.assertTrue("Appointments Invoice Title Text is NOT displayed: ", invoicePage.AppointmentsShowInvoiceButton.isDisplayed());
    }
}
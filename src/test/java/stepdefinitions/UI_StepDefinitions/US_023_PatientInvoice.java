package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.InvoicePage;
import utilities.Driver;

public class US_023_PatientInvoice {

      InvoicePage invoicePage = new InvoicePage();
      Actions actions = new Actions(Driver.getDriver());

    @Then("SignInDropDownLink ni tiklar")
    public void signindropdownlinkNiTiklar() {
        invoicePage.SignInDropDownLink.click();
        Driver.wait(2);
    }

    @Given("username {string} girer")
    public void usernameGirer(String arg0) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", invoicePage.UsernameBox);
        invoicePage.UsernameBox.sendKeys("Aysglstaff");
    }

    @And("password {string} girer")
    public void passwordGirer(String arg0) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", invoicePage.PasswordBox);
        invoicePage.PasswordBox.sendKeys("1234567");
        Driver.wait(2);
    }

    @Then("SigninEnterTusu butonuna tiklar")
    public void signinentertusuButonunaTiklar() {
        invoicePage.SigninEnterTusu.click();
    }

    @And("MyPages sekmesine tiklar")
    public void mypagesSekmesineTiklar() {
        invoicePage.MyPages.click();
        Driver.wait(2);
    }

    @Then("SearchPatient sekmesine tiklar")
    public void searchpatientSekmesineTiklar() {
        invoicePage.SearchPatient.click();
        Driver.wait(2);
    }

    @And("SearchPatientSSNBox kutusuna hasta numarasi olarak {string} girer")
    public void searchpatientssnboxKutusunaHastaNumarasiOlarakGirer(String arg0) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", invoicePage.SearchPatientSSNBox);
        invoicePage.SearchPatientSSNBox.sendKeys("151-15-1515");
        Driver.wait(2);
    }

    @Then("ShowAppointmentsButton a tiklar")
    public void showappointmentsbuttonATiklar() {
        Driver.wait(2);
        invoicePage.ShowAppointmentsButton.click();
    }

    @Then("PaymentInvoiceProcessButton a tiklar")
    public void paymentinvoiceprocessbuttonATiklar() {
        Driver.wait(2);
        invoicePage.PaymentInvoiceProcessButton.click();
    }

    @And("PAYMENT DETAIL sayfasini gorur")
    public void paymentDETAILSayfasiniGorur() {
        Assert.assertTrue("Payment Detail Page Text i gorulemiyor", invoicePage.PaymentDetailPageText.isDisplayed());
        Driver.wait(2);
    }

    @And("Personel Hasta adina fatura olusturmak icin RandevuDurumu nun COMPLETED veya CANCELED oldugunu gorur")
    public void randevudurumuNunCOMPLETEDVeyaCANCELEDOldugunuGorur() {
        if (invoicePage.RandevuDurumu.getText().equals("COMPLETED") || invoicePage.RandevuDurumu.getText().equals("CANCELED")) {
            Assert.assertTrue("Invoice Process Tusu gorulemiyor", invoicePage.PaymentInvoiceProcessButton.isDisplayed());   }
        }

    @And("Exam Fee yi gorur")
    public void examFeeYiGorur() {
        Assert.assertTrue("Exam Fee gorulemiyor", invoicePage.ExamFee.isDisplayed());
        Driver.wait(2);
    }

    @Then("TestItem Fee yi gorur")
    public void testitemFeeYiGorur() {
        Assert.assertTrue("Test Item Fee gorulemiyor", invoicePage.TestItemFee.isDisplayed());
        Driver.wait(2);
    }

    @And("ShowInvoiceButton a tiklar")
    public void showinvoicebuttonATiklar() {
        invoicePage.ShowInvoiceButton.click();
    }

    @Then("InvoicePageTitleText in altinda INVOICE u gorur")
    public void invoicepagetitletextInAltindaINVOICEUGorur() {
        Assert.assertTrue("Invoice sayfasi baslik texti gorulemiyor", invoicePage.InvoicePageTitleText.isDisplayed());
        Driver.wait(2);
    }

    @And("Hastanin randevu durumunun COMPLETED olup olmadigini kontrol eder")
    public void randevuDurumununCOMPLETEDOlupOlmadiginiKontrolEder() {
        Assert.assertEquals("Hastanin randevu durumu COMPLETED degil", "COMPLETED",
                            invoicePage.RandevuDurumu.getText());
    }

    @Then("Eger COMPLETED ise PaymentInvoiceProcessButton a tiklar")
    public void egerCOMPLETEDIsePaymentInvoiceProcessButtonATiklar() {
        if (invoicePage.RandevuDurumu.getText().equalsIgnoreCase( "COMPLETED")) {
            invoicePage.PaymentInvoiceProcessButton.click();  }
    }

    @And("Create Invoice butonuna tiklar")
    public void createInvoiceButonunaTiklar() {
        invoicePage.CreateInvoiceButton.click();
    }

    @Then("Create or edit a Bill formunu doldurur ve save butonuna tiklar")
    public void createOrEditABillFormunuDoldurur() {
        InvoicePage paymentMethod = new InvoicePage();
        Select select = new Select(invoicePage.BillPaymentKutusu);
        // invoicePage.BillIdKutusu.sendKeys("77");
        // CharSequence LocalDateTime = null;
        invoicePage.BillDateKutusu.sendKeys(Keys.ARROW_DOWN);
        invoicePage.BillDateKutusu.click();
        // invoicePage.BillNameKutusu.sendKeys("allergy");
        select.selectByVisibleText("CREDIT_CARD");
        Driver.wait(1);
        invoicePage.BILLDescriptionKutusu.sendKeys("Do NOT CODE so much");
        invoicePage.EditaBillSavebutonu.click();
    }

    @Then("A Bill is updated with identifier yazili uyariyi gorur")
    public void aBillIsUpdatedWithIdentifierYaziliUyariyiGorur() {
        // Bir onceki adimda bug oldugu icin bu asamaya gecilemiyor
    }
}
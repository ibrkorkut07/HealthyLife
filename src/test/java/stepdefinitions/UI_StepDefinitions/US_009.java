package stepdefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_009 {


    StaffPage staffPage = new StaffPage();
    Select select;
    Actions actions = new Actions(Driver.getDriver());
    Faker faker;

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

    @And("Staff olarak username ve password girer")
    public void staffOlarakUsernameVePasswordGirer() {

        staffPage.UsernameBox.sendKeys(ConfigReader.getProperty("StaffValidUsername"));
        staffPage.PasswordBox.sendKeys(ConfigReader.getProperty("StaffValidPassword"));
    }

    @Then("Sigin  tiklar")
    public void sigin_tiklar() {
        staffPage.SigInButton.click();
    }

    @Then("My PAGES sekmesine tiklar")
    public void my_pages_sekmesine_tiklar() {
        staffPage.myPagesButonu.click();
    }

    @Then("Search Patient secenegini secer")
    public void search_patient_secenegini_secer() {
        staffPage.searchPatientButonu.click();
    }


    @And("Patients yazisini ile listenin gorunurlulugunu test eder")
    public void patientsYazisiniIleListeninGorunurlulugunuTestEder() {
        Assert.assertTrue(staffPage.patientsYazisi.isDisplayed());
    }

    @And("Patientssn kutusuna {string} girer")
    public void patientssnKutusunaGirer(String ssn) {
        staffPage.patentSsnBox.sendKeys(ssn);

    }


    @And("Edit butonuna tiklar")
    public void editButonunaTiklar() {
        staffPage.editBox.click();


    }

    @And("Staff hasta bilgilerinde duzenleme yapar")
    public void staffHastaBilgilerindeDuzenlemeYapar() throws InterruptedException {
       /* actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        staffPage.firstnameTextbox.clear();
        staffPage.firstnameTextbox.sendKeys("martin");
        staffPage.lastnameTextbox.clear();
        staffPage.lastnameTextbox.sendKeys("lutz");
        actions.sendKeys(Keys.TAB).perform();
        staffPage.emailTextbox.clear();
        staffPage.emailTextbox.sendKeys("asl@gmail.com");
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        staffPage.phoneTextbox.clear();
        staffPage.phoneTextbox.sendKeys("1234567890");
        actions.sendKeys(Keys.PAGE_DOWN).perform(); */
        Thread.sleep(2000);

        staffPage.firstnameTextbox.click();
        staffPage.firstnameTextbox.clear();
        //staffPage.firstnameTextbox.click();
        actions.sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys("01.04.2020"+Keys.TAB).sendKeys("12:00").sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys("123-999-9999"+Keys.TAB).perform();
        Thread.sleep(1000);




        select=new Select(staffPage.genderTextBox);
        staffPage.genderTextBox.click();
        select.selectByVisibleText("FEMALE");
        Driver.wait(1);
        staffPage.genderTextBox.click();

        select=new Select(staffPage.bloodGroupDropdownElement);
        staffPage.bloodGroupDropdownElement.click();
        select.selectByIndex(0);
        Driver.wait(1);
        staffPage.bloodGroupDropdownElement.click();

        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

        //actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @And("Save tiklar")
    public void saveTiklar() {
        Driver.waitAndClick(staffPage.saveButton);
    }


    @Then("Dogrulama gozlemlenir")
    public void dogrulamaGozlemlenir() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(staffPage.saveToastify.isDisplayed());
    }


    //TC03


    @And("ilgili hastanin  bilgilerinin dolduruldugunu dogrular")
    public void ilgiliHastaninBilgilerininDolduruldugunuDogrular() {
        Assert.assertTrue(staffPage.firstnameTextbox.isDisplayed());
        Assert.assertTrue(staffPage.lastnameTextbox.isDisplayed());
        Assert.assertTrue(staffPage.emailTextbox.isDisplayed());


    }

    //TC04

    @And("firstname siler ve silindigini test eder")
    public void firstnameSilerVeSilindiginiTestEder() {
        Driver.wait(1);
        staffPage.firstnameTextbox.clear();
        Assert.assertTrue(staffPage.firstnameTextbox.isDisplayed());
        Driver.wait(1);

    }


    //TC05

    @And("staff olarak hastaları silemedigini dogrular")
    public void staffOlarakHastalarıSilemediginiDogrular() {
        Assert.assertFalse(staffPage.adminDeleteButton.isDisplayed());
    }


    //Tc06

    @Given("kullanici Admin olarak giris yapar")
    public void kullaniciAdminOlarakGirisYapar() {
     staffPage.UsernameBox.sendKeys("adminUsername");
     staffPage.PasswordBox.sendKeys("adminPassword");
    }



    @And("Admin hastalari SSN kimlik numaralarina gore arama yapamadigini dogrular")
    public void adminHastalariSSNKimlikNumaralarinaGoreAramaYapamadiginiDogrular() {
        Assert.assertTrue(staffPage.ssnStaff.isDisplayed());

    }
}










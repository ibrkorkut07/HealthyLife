package stepdefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
import java.util.List;

public class US_009 {


    StaffPage staffPage = new StaffPage();
    Select select;
    Actions actions = new Actions(Driver.getDriver());
    LoginPage loginPage = new LoginPage();
    WebElement ssnDinamik;
    Faker faker = new Faker();
    String ssnx;


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

    @And("Staff olarak username ve password girer")
    public void staffOlarakUsernameVePasswordGirer() {
        Driver.wait(1);
        staffPage.UsernameBox.sendKeys(ConfigReader.getProperty("StaffValidUsername"));
        Driver.wait(1);
        staffPage.PasswordBox.sendKeys(ConfigReader.getProperty("StaffValidPassword"));
        Driver.wait(1);

    }

    @Then("Sigin  tiklar")
    public void sigin_tiklar() {
        staffPage.SigInButton.click();
    }

    @Then("My PAGES sekmesine tiklar")
    public void my_pages_sekmesine_tiklar() {
        Driver.wait(1);

        staffPage.myPagesButonu.click();
    }

    @Then("Search Patient secenegini secer")
    public void search_patient_secenegini_secer() {
        Driver.wait(1);

        staffPage.searchPatientButonu.click();
    }


    @And("Patients yazisini ile listenin gorunurlulugunu test eder")
    public void patientsYazisiniIleListeninGorunurlulugunuTestEder() {
        Assert.assertTrue(staffPage.patientsYazisi.isDisplayed());
        try {
            ReusableMethods.getScreenshot("Patient_US009");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @And("Patientssn kutusuna {string} girer")
    public void patientssnKutusunaGirer(String ssn) {
        int random = faker.random().nextInt(2,19);
         ssnDinamik = Driver.getDriver().findElement(By.xpath("//tbody/tr["+random+"]/td[2]"));

          ssnx = ssnDinamik.getText();

        staffPage.patentSsnBox.sendKeys(ssnx);
        Driver.wait(1);

    }


    @And("Edit butonuna tiklar")
    public void editButonunaTiklar() {
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        Driver.wait(1);
        staffPage.editBox.click();


    }

    @And("Staff hasta bilgilerinde duzenleme yapar")
    public void staffHastaBilgilerindeDuzenlemeYapar() throws InterruptedException {


        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
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
        actions.sendKeys(Keys.PAGE_DOWN).perform();



        select=new Select(staffPage.genderDropdownElement);
       // staffPage.genderDropdownElement.click();
        Driver.wait(1);
        select.selectByVisibleText("FEMALE");
        //staffPage.genderDropdownElement.click();

        select=new Select(staffPage.bloodGroupDropdownElement);
      //  staffPage.bloodGroupDropdownElement.click();
        select.selectByIndex(0);
        Driver.wait(1);
        //staffPage.bloodGroupDropdownElement.click();

        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();


    }

    @And("Save tiklar")
    public void saveTiklar() {
       // Driver .waitAndClick(staffPage.saveButton);
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", staffPage.saveButton);

        jsexecutor.executeScript("arguments[0].click();", staffPage.saveButton);
    }


    @Then("Dogrulama gozlemlenir")
    public void dogrulamaGozlemlenir() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(staffPage.saveToastify.isDisplayed());
    }


    //TC03


    @And("ilgili hastanin  bilgilerinin dolduruldugunu dogrular")
    public void ilgiliHastaninBilgilerininDolduruldugunuDogrular() {
        //System.out.println("staffPage.firstnameTextbox.getAttribute(value) = " + staffPage.firstnameTextbox.getAttribute("value"));
        Assert.assertFalse(staffPage.firstnameTextbox.getAttribute("value").length()==0);
    Assert.assertFalse(staffPage.lastnameTextbox.getAttribute("value").length()==0);
    Assert.assertFalse(staffPage.birthdateTextbox.getAttribute("value").length()==0);
    Assert.assertFalse(staffPage.emailTextbox.getAttribute("value").length()==0);
    actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
    Assert.assertFalse(staffPage.phoneTextbox.getAttribute("value").length()==0);
    Assert.assertFalse(staffPage.genderDropdownElement.getAttribute("value").length()==0);
    Assert.assertFalse(staffPage.bloodGroupDropdownElement.getAttribute("value").length()==0);
    Assert.assertFalse(staffPage.addressTextbox.getAttribute("value").length()==0);
    Assert.assertFalse(staffPage.descriptionTextbox.getAttribute("value").length()==0);
    Assert.assertFalse(staffPage.userBox.getAttribute("value").length()==0);
    Assert.assertFalse(staffPage.countryDropdownElement.getAttribute("value").length()==0);
    Assert.assertFalse("State box bos",staffPage.stateButton.getAttribute("value").length()==0);

    }

    //TC04

    @And("firstname siler ve silindigini test eder")
    public void firstnameSilerVeSilindiginiTestEder() throws InterruptedException {
        Driver.wait(1);
        staffPage.firstnameTextbox.clear();
        Driver.wait(1);
        staffPage.firstnameTextbox.sendKeys(Keys.TAB);
        staffPage.lastnameTextbox.sendKeys(Keys.TAB);
        staffPage.birthdateTextbox.sendKeys(Keys.TAB);
        staffPage.emailTextbox.sendKeys(Keys.TAB);
        staffPage.phoneTextbox.sendKeys(Keys.TAB);
        staffPage.genderDropdownElement.sendKeys(Keys.TAB);
        staffPage.bloodGroupDropdownElement.sendKeys(Keys.TAB);
        staffPage.descriptionTextbox.sendKeys(Keys.TAB);
        staffPage.userBox.sendKeys(Keys.TAB);
        staffPage.countryDropdownElement.sendKeys(Keys.TAB);
        staffPage.stateButton.sendKeys(Keys.TAB);
        staffPage.backButton.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        staffPage.saveButton.click();
        String expectedText="";
        String actualText= staffPage.deleteHataYazisi.getText();
        Assert.assertEquals(expectedText,actualText);

        System.out.println(actualText);

    }


    //TC05
    @And("Hasta bilgisinde Delete butonunun olmadigi dogrulanir")
    public void hastaBilgisindeDeleteButonununOlmadigiDogrulanir() {
        //System.out.println(staffPage.deleteButton.getText());
        Assert.assertFalse(staffPage.deleteButton.getText().contains("Delete"));
    }




    //Tc06


    @And("Staff hastalari SSN kimlik numaralarina gore arama yaptigini dogrular")
    public void staffHastalariSSNKimlikNumaralarinaGoreAramaYaptiginiDogrular() {


        Driver.wait(2);
        List<WebElement> hastaDegerleri=staffPage.hastaBilgileri();
        Assert.assertTrue(hastaDegerleri.get(1).getText().equals(ssnx));

        System.out.println(hastaDegerleri.get(1).getText());
        System.out.println(hastaDegerleri.get(2).getText());
        System.out.println(hastaDegerleri.get(3).getText());


    }


  

}


//db_credentials_url=jdbc:postgresql://medunna.com:5432/medunna_db
//db_username=medunnadb_user
//db_password=Medunnadb_@129
//https://app.swaggerhub.com/apis/MuratTANC/medunna-api/0.0.1  api icin





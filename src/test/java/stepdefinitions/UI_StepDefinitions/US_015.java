package stepdefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US015Admin;
import utilities.ConfigReader;
import utilities.Driver;

public class US_015 {
    US015Admin us015Admin=new US015Admin();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    public String firstname=faker.name().firstName();
    public String lastname=faker.name().lastName();

    @When("Yonetici url gider")
    public void yonetici_url_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("MDNUrl"));
    }
    @When("Sign in ikonuna tiklar")
    public void sign_in_ikonuna_tiklar() {
        us015Admin.accountWebElement.click();
        us015Admin.singInWebElement.click();
    }
    @When("Yonetici username ve password bilgileri girer")
    public void yonetici_username_ve_password_bilgileri_girer() {
        us015Admin.usernameTextBox.click();
        us015Admin.usernameTextBox.sendKeys("Team94Admin");
        us015Admin.passwordTextBox.click();
        us015Admin.passwordTextBox.sendKeys("Batch44+");
    }
    @When("Sign in buttonuna tiklar")
    public void sign_in_buttonuna_tiklar() {
        us015Admin.singInButton.click();
    }
    @When("Items&Titles sekmesini tiklar")
    public void items_titles_sekmesini_tiklar() {
        us015Admin.itemsTitlesButtonu.click();
    }
    @Then("Patient secenegini secer ve tiklar")
    public void patient_secenegini_secer_ve_tiklar() {
        Driver.wait(1);
        us015Admin.itemsAltindakiPatientButtonu.click();
    }
    @Then("Create a new Patient buttonuna tiklar")
    public void create_a_new_patient_buttonuna_tiklar() {
        Driver.wait(1);
        us015Admin.createanewPatient.click();
    }
    @Then("First Name buttonunu tiklar ve bilgileri girer")
    public void first_name_buttonunu_tiklar_ve_bilgileri_girer() {
        Driver.wait(1);
        us015Admin.firstName.sendKeys(firstname);
    }
    @Then("Last Name buttonunu tiklar ve bilgileri girer")
    public void last_name_buttonunu_tiklar_ve_bilgileri_girer() {
        Driver.wait(1);
        us015Admin.patientLastName.sendKeys(lastname);
    }
    @Then("Birth Date buttonuna tiklar ve bilgileri girer")
    public void birth_date_buttonuna_tiklar_ve_bilgileri_girer() {
        Driver.wait(1);
        us015Admin.birthDate.sendKeys(faker.date().birthday(21,35).toString());
    }
    @When("Email buttonuna tiklar ve bilgileri girer")
    public void email_buttonuna_tiklar_ve_bilgileri_girer() {
        Driver.wait(1);
        us015Admin.patientEmail.sendKeys(faker.internet().emailAddress());
    }
    @When("Phone buttonuna tiklar ve bilgileri girer")
    public void phone_buttonuna_tiklar_ve_bilgileri_girer() {
        Driver.wait(1);
        us015Admin.patientPhone.click();
        us015Admin.patientPhone.sendKeys("8888888888");
    }
    @When("Gender sekmesini tiklar ve FEMALE secer")
    public void gender_sekmesini_tiklar_ve_female_secer() {
        Driver.wait(1);
        us015Admin.gender.sendKeys("FEMALE");
    }
    @When("Bloud Group sekmesini tiklar ve kan grubunu secer")
    public void bloud_group_sekmesini_tiklar_ve_kan_grubunu_secer() {
        Driver.wait(1);
        us015Admin.patientBloodGroup.sendKeys("A+");
    }
    @When("Description buttonuna tiklar ve hasta tanimini yazar")
    public void description_buttonuna_tiklar_ve_hasta_tanimini_yazar() {
        Driver.wait(1);
        us015Admin.patientDescription.click();
        us015Admin.patientDescription.sendKeys("Ektopik Gebelik");
    }
    @Then("User sekmesini tiklar ve system secenegini secer")
    public void user_sekmesini_tiklar_ve_system_secenegini_secer() {
        Driver.wait(3);
        us015Admin.userid.sendKeys("system");
    }
    @Then("Country sekmesini tiklar ve US secenegini secer")
    public void country_sekmesini_tiklar_ve_us_secenegini_secer() {
        Driver.wait(4);
        us015Admin.patientCountry.click();
        us015Admin.patientCountry.sendKeys("US" + Keys.ENTER);
    }
    @Then("State City sekmesini tiklar ve Alaska secenegini secer")
    public void state_city_sekmesini_tiklar_ve_alaska_secenegini_secer() {
        Driver.wait(6);
        us015Admin.state.click();
        us015Admin.state.sendKeys("Alabama" + Keys.ENTER);
    }
    @Then("Save buttonuna tiklar ve hastayi kayit eder")
    public void save_buttonuna_tiklar_ve_hastayi_kayit_eder() {
        Driver.wait(5);
        us015Admin.savebuttonu.click();
    }
    @Then("A new Patient is created alert yazisini dogrular")
    public void a_new_patient_is_created_alert_yazisini_dogrular() {
        Driver.wait(1);
        Driver.waitForVisibility(us015Admin.successCreatedMessage,1);
        Assert.assertTrue(us015Admin.successCreatedMessage.isEnabled());
    }

    @And("Ilk satirdaki hastanin View buttonuna tiklar")
    public void ilkSatirdakiHastaninViewButtonunaTiklar() {
        Driver.wait(1);
        us015Admin.viewHastaIlkSatirButtonu.click();
    }

    @Then("Patient yazisi altindaki bilgiler dogrulanir")
    public void patientYazisiAltindakiBilgilerDogrulanir() {
        Driver.wait(1);
        Assert.assertTrue(us015Admin.ssnView.isEnabled());
        Assert.assertTrue(us015Admin.firstNameView.isEnabled());
        Assert.assertTrue(us015Admin.lastNameView.isEnabled());
        Assert.assertTrue(us015Admin.birthDateView.isEnabled());
        Assert.assertTrue(us015Admin.phoneView.isEnabled());
        Assert.assertTrue(us015Admin.genderView.isEnabled());
        Assert.assertTrue(us015Admin.bloodGroupView.isEnabled());
        Assert.assertTrue(us015Admin.descriptionView.isEnabled());
        Assert.assertTrue(us015Admin.userView.isEnabled());
        Assert.assertTrue(us015Admin.countryView.isEnabled());
        Assert.assertTrue(us015Admin.stateCityView.isEnabled());
    }

    @And("Ilk satirdaki hastanin Edit buttonuna tiklar")
    public void ilkSatirdakiHastaninEditButtonunaTiklar() {
        
    }

    @Then("Hastanin id boxunu dogurular")
    public void hastaninIdBoxunuDogurular() {
    }

    @Given("Appointment secenegini secer ve tiklar")
    public void appointmentSeceneginiSecerVeTiklar() {
    }
}

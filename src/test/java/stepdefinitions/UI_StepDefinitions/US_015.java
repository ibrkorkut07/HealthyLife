package stepdefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US015Admin;
import utilities.ConfigReader;
import utilities.Driver;

public class US_015 {
    US015Admin us015Admin=new US015Admin();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());

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
        us015Admin.firstName.click();
        us015Admin.firstName.sendKeys("Medine");
    }
    @Then("Last Name buttonunu tiklar ve bilgileri girer")
    public void last_name_buttonunu_tiklar_ve_bilgileri_girer() {
        Driver.wait(1);
        us015Admin.patientLastName.click();
        us015Admin.patientLastName.sendKeys("Anna");
    }
    @Then("Birth Date buttonuna tiklar ve bilgileri girer")
    public void birth_date_buttonuna_tiklar_ve_bilgileri_girer() {
        Driver.wait(1);
        us015Admin.birthDate.click();
        us015Admin.birthDate.clear();
        us015Admin.birthDate.sendKeys("04.04.1996 09:44");
    }
    @When("Email buttonuna tiklar ve bilgileri girer")
    public void email_buttonuna_tiklar_ve_bilgileri_girer() {
        Driver.wait(1);
        us015Admin.patientEmail.click();
        us015Admin.patientEmail.sendKeys("medin.an@medunna.com");
    }
    @When("Phone buttonuna tiklar ve bilgileri girer")
    public void phone_buttonuna_tiklar_ve_bilgileri_girer() {
        Driver.wait(1);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", us015Admin.patientDescription);
        us015Admin.patientPhone.click();
        us015Admin.patientPhone.sendKeys("8888888888");
    }
    @When("Gender sekmesini tiklar ve FEMALE secer")
    public void gender_sekmesini_tiklar_ve_female_secer() {
        Driver.wait(1);
        us015Admin.gender.click();
        Select select1=new Select(us015Admin.gender);
        select1.selectByIndex(1);
    }
    @When("Bloud Group sekmesini tiklar ve kan grubunu secer")
    public void bloud_group_sekmesini_tiklar_ve_kan_grubunu_secer() {
        Driver.wait(1);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", us015Admin.savebuttonu);
        us015Admin.patientBloodGroup.click();
        Select select2=new Select(us015Admin.patientBloodGroup);
        select2.selectByIndex(0);
    }
    @When("Description buttonuna tiklar ve hasta tanimini yazar")
    public void description_buttonuna_tiklar_ve_hasta_tanimini_yazar() {
        Driver.wait(1);
        us015Admin.patientDescription.click();
        us015Admin.patientDescription.sendKeys("Ektopik Gebelik");

    }
    @Then("User sekmesini tiklar ve system secenegini secer")
    public void user_sekmesini_tiklar_ve_system_secenegini_secer() {
        Driver.wait(1);
        us015Admin.userid.click();
        Select select3=new Select(us015Admin.userid);
        select3.selectByIndex(0);
    }
    @Then("Country sekmesini tiklar ve US secenegini secer")
    public void country_sekmesini_tiklar_ve_us_secenegini_secer() {
        Driver.wait(1);
        us015Admin.patientCountry.click();
        Select select4=new Select(us015Admin.patientCountry);
        select4.selectByIndex(0);
    }
    @Then("State City sekmesini tiklar ve Alaska secenegini secer")
    public void state_city_sekmesini_tiklar_ve_alaska_secenegini_secer() {
        Driver.wait(1);
        us015Admin.state.click();
        Select select5=new Select(us015Admin.state);
        select5.selectByIndex(0);
    }
    @Then("Save buttonuna tiklar ve hastayi kayit eder")
    public void save_buttonuna_tiklar_ve_hastayi_kayit_eder() {
        Driver.wait(1);
        us015Admin.savebuttonu.click();
    }
    @Then("A new Patient is created alert yazisini dogrular")
    public void a_new_patient_is_created_alert_yazisini_dogrular() {

    }
    @Then("Log in ikonuna tiklar")
    public void log_in_ikonuna_tiklar() {

    }
    @Then("Sign out sekmesini tiklar")
    public void sign_out_sekmesini_tiklar() {

    }

}

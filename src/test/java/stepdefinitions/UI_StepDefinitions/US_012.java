package stepdefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US012MedinePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_012 {
    US012MedinePage us012MedinePage=new US012MedinePage();

    @Given("doktor {string} gider")
    public void doktorMedunnaUrlGider(String url) {
        Driver.wait(1);
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Given("Login ikonuna tklar")
    public void loginIkonuTikla() {
        Driver.wait(1);
        us012MedinePage.loginButton.click();
    }
    @Given("Sign in sekmesine tiklar")
    public void signInButtonuTikla() {
        Driver.wait(1);
        us012MedinePage.anaSayfadakiSignInButtonu.click();

    }
    @Then("{string} ve {string} bilgileri girilerek, Sign in buttonuna tiklar")
    public void signInBilgileriGirilir(String username, String password) {
        Driver.wait(1);
        us012MedinePage.signInUsernameBox.sendKeys(ConfigReader.getProperty(username));
        us012MedinePage.signInPasswordBox.sendKeys(ConfigReader.getProperty(password));
        us012MedinePage.kisiBilgileriGirildiktenSonraSignInButton.click();
    }
    @Then("My Pages sekmesine tiklar")
    public void myPagesSekmesiTikla() {
        Driver.wait(1);
        us012MedinePage.anasayfadakiMyPagesSekmesi.click();
    }
    @Then("My Appointments secenegini secer ve tiklar")
    public void myAppointmentsSecenegiSec() {
        Driver.wait(1);
        us012MedinePage.myPagesSekmesindekiMyAppointmentsButtonu.click();
    }
    @Given("Test isteyebilmek icin, hastanin satirindaki Edit buttonuna tiklar")
    public void hastaSatirindakiEditButtonuTiklar() {
        Driver.wait(1);
        us012MedinePage.hastaSatirindakiEditButtonu.click();
    }
    @Given("Yeni sayfada acilan Request A Test buttonuna tiklar")
    public void yeniSayfadaAcilanRequestTestTikla() {
        Driver.wait(1);
        us012MedinePage.testIstemeRequestATestButtonu.click();
    }
    @When("Test Items texti gorunur oldugunu dogrular")
    public void textiGorunurluguTestEtr() {
        Driver.wait(1);
        Assert.assertTrue(us012MedinePage.testIstemsTextYazisi.isDisplayed());
       /* System.out.println(Driver.getDriver().switchTo().alert().getText());
        String alertYazisi=Driver.getDriver().switchTo().alert().getText();
        System.out.println(alertYazisi);
        Assert.assertEquals(istenilecekTestYazi,alertYazisi);*/
    }

    @And("Test Item texti altinda, Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin testlerin sagindaki check boxu tiklar")
    public void testItemTextiAltindaTestlerinSagindakiCheckBoxuTiklar() {
        Driver.wait(1);
        Faker faker=new Faker();
        int random=faker.number().numberBetween(1,9);
        switch (random){
            case 1:
                Driver.waitAndClick(us012MedinePage.hemoglobinCheck);
                break;
            case 2:
                Driver.waitAndClick(us012MedinePage.albuminCheck);
                break;
            case 3:
                Driver.waitAndClick(us012MedinePage.totalProteinCheck);
                break;
            case 4:
                Driver.waitAndClick(us012MedinePage.sodiumCheck);
                break;
            case 5:
                Driver.waitAndClick(us012MedinePage.potassiumCheck);
                break;
            case 6:
                Driver.waitAndClick(us012MedinePage.ureaCheck);
                break;
            case 7:
                Driver.waitAndClick(us012MedinePage.creatinineCheck);
                break;
            case 8:
                Driver.waitAndClick(us012MedinePage.glucoseCheck);
                break;
            case 9:
                Driver.waitAndClick(us012MedinePage.albimoCheck);
                break;
        }
    }
    @Then("Save buttonu gorunene kadar asagiya inilir ve tiklar")
    public void buttonu_gorunene_kadar_asagiya_inilir_ve_tiklar() {
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
       // us012MedinePage
    }
    @And("A new is created yazisi test edilir")
    public void aNewIsCreatedYazisiTestEdilir() {

    }

    @When("Sign out sekmesine tiklar")
    public void signOutSekmesineTiklar() {
    }
}

package stepdefinitions.UI_StepDefinitions;

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

    @Given("doktor medunnaUrl gider")
    public void doktorMedunnaUrlGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("Login ikonuna tklar")
    public void loginIkonuTikla() {

        us012MedinePage.loginButton.click();
    }
    @Given("Sign in sekmesine tiklar")
    public void signInButtonuTikla() {
        us012MedinePage.anaSayfadakiSignInButtonu.click();

    }
    @Then("{string} ve {string} bilgileri girilerek, Sign in buttonuna tiklar")
    public void signInBilgileriGirilir(String username, String password) {
        us012MedinePage.signInUsernameBox.sendKeys(ConfigReader.getProperty(username));
        us012MedinePage.signInPasswordBox.sendKeys(ConfigReader.getProperty(password));
        us012MedinePage.kisiBilgileriGirildiktenSonraSignInButton.click();
    }
    @Then("My Pages sekmesine tiklar")
    public void myPagesSekmesiTikla() {
        us012MedinePage.anaSayfadakiSignInButtonu.click();
    }
    @Then("My Appointments secenegini secer ve tiklar")
    public void myAppointmentsSecenegiSec() {
        us012MedinePage.myPagesSekmesindekiMyAppointmentsButtonu.click();
    }
    @Given("Test isteyebilmek icin, hastanin satirindaki Edit buttonuna tiklar")
    public void hastaSatirindakiEditButtonuTiklar() {
        us012MedinePage.hastaSatirindakiEditButtonu.click();
    }
    @Given("Yeni sayfada acilan Request A Test buttonuna tiklar")
    public void yeniSayfadaAcilanRequestTestTikla() {
        us012MedinePage.testIstemeRequestATestButtonu.click();
    }
    @When("{string} texti gorunur oldugunu dogrular")
    public void textiGorunurluguTestEtr(String istenilecekTestYazi) {
        System.out.println(Driver.getDriver().switchTo().alert().getText());
        String alertYazisi=Driver.getDriver().switchTo().alert().getText();
        System.out.println(alertYazisi);
        Assert.assertEquals(istenilecekTestYazi,alertYazisi);
    }

    @And("Test Item texti altinda, {string} testlerin sagindaki check boxu tiklar")
    public void testItemTextiAltindaTestlerinSagindakiCheckBoxuTiklar(String istenilecekTest) {

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

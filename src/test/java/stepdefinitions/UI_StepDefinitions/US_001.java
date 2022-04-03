package stepdefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_001 {

    HomePage homePage=new HomePage();
    RegistrationPage register=new RegistrationPage();
    Faker faker=new Faker();

    @When("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String medunna) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("sayfada kullanici ikonu altinda yer alan register butonuna tiklar")
    public void sayfada_kullanici_ikonu_altinda_yer_alan_register_butonuna_tiklar() {
        homePage.accountButton.click();
        homePage.registerButton.click();
    }

    @Then("SSN kutucuğuna tıklar ardından boş bırakır ve {string} uyarı mesajını görüntüler")
    public void ssn_kutucuğuna_tıklar_ardından_boş_bırakır_ve_uyarı_mesajını_görüntüler(String uyari) {
        register.ssnTextBox.click();
        register.firstNameTextBox.click();
        Assert.assertTrue(register.ssnRequiredMessage.isDisplayed());

    }

    @Then("kullanici SSN kutucuğuna sadece {string} girilebilmeli, {string} ve {string} kabul edilmemeli, {string} uyarı mesajı görüntülenmeli")
    public void kullanici_ssn_kutucuğuna_sadece_girilebilmeli_ve_kabul_edilmemeli_uyarı_mesajı_görüntülenmeli(String rakam, String harf, String ozelKarakter, String uyari) {
        register.ssnTextBox.sendKeys(rakam+ Keys.TAB);
        Assert.assertTrue(register.ssnInvalidMessage.isDisplayed());
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);

        register.ssnTextBox.sendKeys(harf+Keys.TAB);
        Assert.assertTrue(register.ssnInvalidMessage.isDisplayed());
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);

        register.ssnTextBox.sendKeys(ozelKarakter+Keys.TAB);
        Assert.assertTrue(register.ssnInvalidMessage.isDisplayed());
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici geçerli SSN için {int}. ve {int}. rakamdan sonra {string} karakteri eklemeli ve herhangi bir uyarı yazısı alınmamalıdır")
    public void kullanici_geçerli_ssn_için_ve_rakamdan_sonra_karakteri_eklemeli_ve_herhangi_bir_uyarı_yazısı_alınmamalıdır(Integer ucuncu, Integer besinci, String tire) {
        String validSSNPart1=
                faker.number().digits(3);
        String validSSNPart2=
                tire+
                faker.number().numberBetween(0,9)+
                faker.number().numberBetween(0,9)+
                tire+
                faker.number().numberBetween(0,9)+
                faker.number().numberBetween(0,9)+
                faker.number().numberBetween(0,9)+
                faker.number().numberBetween(0,9);
        String validSSN=validSSNPart1+validSSNPart2;
        register.ssnTextBox.sendKeys(validSSN+ Keys.TAB);
        Assert.assertTrue(register.ssnValidConfirm.isDisplayed());




    }

}

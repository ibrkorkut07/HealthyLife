package stepdefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.DoctorPage;
import pages.LoginPage;
import utilities.Driver;

public class US_018 {
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    Actions actions;
    String ssn = "";
    Faker faker;
    String view = "";
    String actualLink = "";
    DoctorPage doctor = new DoctorPage();
    Select select;


    @And("Yonetici Items&Titles secenegini tiklar ve Physician i secer")
    public void yoneticiItemsTitlesSeceneginiTiklarVePhysicianISecer() {

        adminPage.ItemsTitles.click();
        Driver.wait(1);
        adminPage.Physician.click();
    }

    @And("Yonetici +Create a new Phycician butonuna tiklar")
    public void yoneticiCreateANewPhycicianButonunaTiklar() {
        Driver.wait(1);
        adminPage.CreateanewPhysicianButon.click();

    }

    @And("Yonetici Create or edit a Physician sayfasina gelir")
    public void yoneticiCreateOrEditAPhysicianSayfasinaGelir() {
        Assert.assertTrue(adminPage.CreateoreditaPhysisicanSayfasi.isDisplayed());
    }

    @And("Yonetici Use Search kutusunu tikler")
    public void yoneticiUseSearchKutusunuTikler() {
        Driver.wait(1);
        adminPage.UseSearchBox.click();
    }

    @And("Yonetici sistemdeki doktoru bulabilmek icin SSN bilgisi girer")
    public void yoneticiSistemdekiDoktoruBulabilmekIcinSSNBilgisiGirer() {
        adminPage.SSNBox.sendKeys(ssn);
    }

    @And("Yonetici Search User butonuna basar")
    public void yoneticiSearchUserButonunaBasar() {
        adminPage.SearchUserButon.click();
    }

    @Given("Yonetici listeden rastgele SSN secer")
    public void yoneticiListedenRastgeleSSNSecer() {
        faker = new Faker();
        int random = faker.random().nextInt(1, 20);
        ssn = Driver.getDriver().findElement(By.xpath("//tbody/tr[" + random + "]/td[2]")).getText();


    }

    @Given("Doktor listesinden rastgele bir doktor secip edit butonuna basar")
    public void doktorListesindenRastgeleBirDoktorSecipEditButonunaBasar() {
        actions = new Actions(Driver.getDriver());
        faker = new Faker();
        Driver.wait(1);
        WebElement clk = Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[11]"));
        actions.click(clk).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).perform();
        int satir = faker.random().nextInt(1, 20);

        WebElement edit = Driver.getDriver().findElement(By.xpath("//tbody/tr[" + satir + "]/td[18]/div[1]/a[2]"));
        view = "//tbody/tr[" + satir + "]/td[18]/div[1]/a[1]";
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", edit);
        Driver.wait(1);
        jsexecutor.executeScript("arguments[0].click();", edit);
    }

    @And("Admin First Name,Last Name,Birth Date,Phone,Gender,Blood Group,Address,Description,Created Date,User,Country ve State-City kisimlarini doldurur.")
    public void adminFirstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDateUserCountryVeStateCityKisimlariniDoldurur() {
        // actualLink=Driver.getDriver().getCurrentUrl();
        actualLink = "https://medunna.com/physician/" + doctor.idBox.getAttribute("value");
        faker = new Faker();
//firstname
        if (doctor.firstName.getAttribute("value").isEmpty()) {
            doctor.firstName.sendKeys(faker.name().firstName());
        } else {
            String text = doctor.firstName.getAttribute("value");
            doctor.firstName.clear();
            Driver.wait(1);
            doctor.firstName.sendKeys(text);
        }
//lastname
        if (doctor.lastName.getAttribute("value").isEmpty()) {
            doctor.lastName.sendKeys(faker.name().lastName());
        } else {
            String text = doctor.lastName.getAttribute("value");
            doctor.lastName.clear();
            Driver.wait(1);
            doctor.lastName.sendKeys(text);
        }
//date
        doctor.birthDayBox.sendKeys("15.06.1980");


//phone
        if (doctor.phonebox.getAttribute("value").isEmpty()) {
            doctor.phonebox.sendKeys("365-360-2599");
        } else {
            String text = doctor.phonebox.getAttribute("value");
            doctor.phonebox.clear();
            Driver.wait(1);
            doctor.phonebox.sendKeys(text);
        }
//adres
        if (doctor.adressBox.getAttribute("value").isEmpty()) {
            doctor.adressBox.sendKeys(faker.address().fullAddress());
        } else {
            String text = doctor.adressBox.getAttribute("value");
            doctor.adressBox.clear();
            Driver.wait(1);
            doctor.adressBox.sendKeys(text);
        }
//Description
        if (doctor.descriptionBox.getAttribute("value").isEmpty()) {
            doctor.descriptionBox.sendKeys(faker.name().title());
        } else {
            String text = doctor.descriptionBox.getAttribute("value");
            doctor.descriptionBox.clear();
            Driver.wait(1);
            doctor.descriptionBox.sendKeys(text);
        }

//fotochange
        Driver.wait(1);
        doctor.fotoUpload.sendKeys("C:\\doktor.png");


//country

        select = new Select(doctor.countryDropDown);
        select.selectByVisibleText("US");
        Driver.wait(1);
        select.selectByVisibleText("Turkey");

//state
        Driver.wait(1);
        select = new Select(doctor.stateDropDown);
        Driver.wait(1);
        int city = faker.random().nextInt(1, 15);
        select.selectByIndex(city);

    }

    @And("Admin Bilgilerin kaydedildigini dogrular")
    public void adminBilgilerinKaydedildiginiDogrular() {
        Driver.wait(1);
        WebElement tikla = Driver.getDriver().findElement(By.xpath(view));
        Driver.clickWithJS(tikla);
        WebElement value;

        for (int i = 1; i < 12; i++) {
            value = Driver.getDriver().findElement(By.xpath("//dd[" + i + "]"));
            Assert.assertFalse("Bos alanlar var",value.getText().toString().isEmpty());
        }
        for (int i = 13; i < 16; i++) {
            value = Driver.getDriver().findElement(By.xpath("//dd[" + i + "]"));
            Assert.assertFalse("Bos alanlar var",value.getText().toString().isEmpty());
        }

    }

    @And("Admin Doktorun uzmanlik alanini secer")
    public void adminDoktorunUzmanlikAlaniniSecer() {
        doctor.birthDayBox.sendKeys("15.06.1980");
       // ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", doctor.uzmanlikDropDown);
        actions=new Actions(Driver.getDriver());
actions.sendKeys(Keys.PAGE_DOWN).perform();
        select=new Select(doctor.uzmanlikDropDown);
        faker=new Faker();

        for (int i = 0; i < 4; i++) {
            int random = faker.random().nextInt(1,15);
            Driver.wait(1);
            select.selectByIndex(random);

        }


    }

    @And("Admin doktorun profil fotografini degistirebilir")
    public void adminDoktorunProfilFotografiniDegistirebilir() {
        actions=new Actions(Driver.getDriver());
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", doctor.fotoUpload);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(2);
        doctor.fotoUpload.sendKeys("C:\\doktor.png");
    }

    @And("Admin doktorun muayene ucretini girer")
    public void adminDoktorunMuayeneUcretiniGirer() {
        doctor.ExamFreeBox.clear();
        Driver.wait(2);
        doctor.ExamFreeBox.sendKeys("500");
        Driver.wait(2);
    }
}
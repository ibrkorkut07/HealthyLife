package stepdefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminStaff;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_019 {

    AdminStaff staff = new AdminStaff();
    String randomSSN;
    Faker faker;
    Actions actions;
    Select select;
    String actualLink="";
    String view;




    @Given("kullanici item-titles menuye tiklar")
    public void kullaniciItemTitlesMenuyeTiklar() {
        Driver.wait(1);

        staff.itemTitleMenuButton.click();
    }

    @And("Staff menusune tiklar")
    public void staffMenusuneTiklar() {
        Driver.wait(1);

        staff.itemTitleStaffMenuButton.click();
    }

    @And("Listeden herhangibir SSN secer")
    public void listedenHerhangibirSSNSecer() {

        Driver.wait(1);
        randomSSN=staff.ssnGetir();
    }

    @And("Create a New Staff Butonuna tiklar")
    public void createANewStaffButonunaTiklar() {
        Driver.wait(1);
        Assert.assertTrue("Create a New Staff Button Sayfada Yok.",staff.createNewStaffButton.isDisplayed());
        staff.createNewStaffButton.click();
    }

    @And("Use search check box'i isaretler")
    public void useSearchCheckBoxIIsaretler() {
        Driver.wait(1);
        staff.useSearchCheckBox.click();
    }

    @And("Sectigi kayitli SSN numarasini SSN Box'a girer")
    public void sectigiKayitliSSNNumarasiniSSNBoxAGirer() {
        Driver.wait(1);
        staff.inputSsnBox.sendKeys(randomSSN);
    }

    @Then("Search User butonuna tiklar")
    public void searchUserButonunaTiklar() {

        Driver.wait(1);
        staff.searchUserButton.click();
    }

    @And("User found with search SSN mesajini gorur")
    public void userFoundWithSearchSSNMesajiniGorur() {
        Driver.wait(1);
        String expectedText="User found with search SSN";
        Assert.assertEquals("User found with search SSN yazisi gorulemedi",expectedText,staff.onayKutusu.getText());
    }

    @And("kayitli personelin {string} SSN numarasini SSN Box'a girer")
    public void kayitliPersonelinSSNNumarasiniSSNBoxAGirer(String ssn) {
        Driver.wait(1);
        staff.inputSsnBox.sendKeys(ssn);
    }



    @And("First Name,Last Name,Birth Date,Phone,Gender,Blood Group,Address,Description,Created Date,User,Country ve State-City kisimlarini doldurur.")
    public void firstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDateUserCountryVeStateCityKisimlariniDoldurur() throws Throwable {

       // actualLink=Driver.getDriver().getCurrentUrl();
        actualLink="https://medunna.com/staff/"+staff.idBox.getAttribute("value");
        faker = new Faker();
//firstname
        if (staff.firstName.getAttribute("value").isEmpty()) {
            staff.firstName.sendKeys(faker.name().firstName());
        } else {
            String text = staff.firstName.getAttribute("value");
            staff.firstName.clear();
            Driver.wait(1);
            staff.firstName.sendKeys(text);
        }
//lastname
        if (staff.lastName.getAttribute("value").isEmpty()) {
            staff.lastName.sendKeys(faker.name().lastName());
        } else {
            String text = staff.lastName.getAttribute("value");
            staff.lastName.clear();
            Driver.wait(1);
            staff.lastName.sendKeys(text);
        }
//phone
        if (staff.phonebox.getAttribute("value").isEmpty()) {
            staff.phonebox.sendKeys("365-360-2599");
        } else {
            String text = staff.phonebox.getAttribute("value");
            staff.phonebox.clear();
            Driver.wait(1);
            staff.phonebox.sendKeys(text);
        }
//adres
        if (staff.adressBox.getAttribute("value").isEmpty()) {
            staff.adressBox.sendKeys(faker.address().fullAddress());
        } else {
            String text = staff.adressBox.getAttribute("value");
            staff.adressBox.clear();
            Driver.wait(1);
            staff.adressBox.sendKeys(text);
        }
//Description
        if (staff.descriptionBox.getAttribute("value").isEmpty()) {
            staff.descriptionBox.sendKeys(faker.name().title());
        } else {
            String text = staff.descriptionBox.getAttribute("value");
            staff.descriptionBox.clear();
            Driver.wait(1);
            staff.descriptionBox.sendKeys(text);
        }
//country

        select = new Select(staff.countryDropDown);
        select.selectByVisibleText("US");
        Driver.wait(2);
        select.selectByVisibleText("Turkey");

//state
        select = new Select(staff.stateDropDown);
        Driver.wait(1);
        int city=faker.random().nextInt(1,15);
        select.selectByIndex(city);


    }

    @And("Staff listesinden rastgele bir tanesinin Edit butonuna tiklar")
    public void staffListesindenRastgeleBirTanesininEditButonunaTiklar() {

        Faker faker = new Faker();
        Driver.wait(1);
        int satir=faker.random().nextInt(1,20);

        WebElement edit = Driver.getDriver().findElement(By.xpath("//tbody/tr["+satir+"]/td[15]/div[1]/a[2]"));
        view="//tbody/tr["+satir+"]/td[15]/div[1]/a[1]";

        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", edit);
        Driver.wait(1);
        jsexecutor.executeScript("arguments[0].click();", edit);

    }

    @And("{string} yazisini gorur")
    public void yazisiniGorur(String text) {
        String expectedtext=text;
        Driver.waitForVisibility(staff.onayKutusu,4);
        String actualText = staff.onayKutusu.getText();
        Assert.assertTrue(actualText.contains(expectedtext));

    }

    @And("Bilgilerin kaydedildigini dogrular")
    public void bilgilerinKaydedildiginiDogrular() {
        Driver.wait(1);
        WebElement tikla = Driver.getDriver().findElement(By.xpath(view));
        Driver.clickWithJS(tikla);
        WebElement value;


        for (int i = 1; i <14 ; i++) {
            value=Driver.getDriver().findElement(By.xpath("//dd["+i+"]"));
            Assert.assertFalse(value.getText().isEmpty());
        }



    }

    @And("Staff listesinden rastgele bir tanesinin View butonuna tiklar")
    public void staffListesindenRastgeleBirTanesininViewButonunaTiklar() {
        faker=new Faker();
        int satir = faker.random().nextInt(1,20);
        Driver.wait(1);
        WebElement view = Driver.getDriver().findElement(By.xpath("//tbody/tr["+satir+"]/td[15]/div[1]/a[1]"));
        Driver.clickWithJS(view);
    }

    @And("kullanici bilgilerinin goruntulandigini test eder")
    public void kullaniciBilgilerininGoruntulandiginiTestEder() {
    }

    @And("Bilgilerin silindigini kontrol eder")
    public void bilgilerinSilindiginiKontrolEder() {
        actions=new Actions(Driver.getDriver());
        Driver.wait(1);
        WebElement tikla = Driver.getDriver().findElement(By.xpath(view));
        Driver.clickWithJS(tikla);
        WebElement value;


        for (int i = 8; i <10 ; i++) {
            value=Driver.getDriver().findElement(By.xpath("//dd["+i+"]"));
            Assert.assertTrue("Adres veya description silinmemis",value.getText().isEmpty());
        }
        WebElement adr=Driver.getDriver().findElement(By.xpath("//span[@id='adress']//span"));
        WebElement dsc=Driver.getDriver().findElement(By.xpath("//span[@id='description']//span"));
        for (int i = 0; i < 10; i++) {
            actions.doubleClick(adr).perform();
            actions.doubleClick(dsc).perform();
        }


    }

    @Then("kullanici bilgilerinden adres ve description bilgilerini siler")
    public void kullaniciBilgilerindenAdresVeDescriptionBilgileriniSiler() {
        Driver.wait(1);
        staff.adressBox.clear();
        Driver.wait(1);
        staff.descriptionBox.clear();
    }
}

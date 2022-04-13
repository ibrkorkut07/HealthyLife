package stepdefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminStaff;
import utilities.Driver;

public class US_019 {

    AdminStaff staff = new AdminStaff();
    String randomSSN;
    Faker faker;




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

        faker = new Faker();
        staff.firstName.sendKeys(faker.name().firstName());
        staff.lastName.sendKeys(faker.name().lastName());
     //   staff.birthDayBox.sendKeys(faker.date().birthday());
        staff.phonebox.sendKeys("256-365-3255");
        staff.firstName.sendKeys(faker.name().firstName());






       }
}

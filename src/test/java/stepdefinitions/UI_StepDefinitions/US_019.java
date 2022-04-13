package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminStaff;
import utilities.Driver;

public class US_019 {

    AdminStaff staff = new AdminStaff();
    String randomSSN;




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
}

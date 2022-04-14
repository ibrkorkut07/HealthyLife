package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_018 {
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage=new AdminPage();


    @And("Yonetici Items&Titles secenegini tiklar ve Physician i secer")
    public void yoneticiItemsTitlesSeceneginiTiklarVePhysicianISecer() {

        adminPage.ItemsTitles.click();
        adminPage.Physician.click();
    }

    @And("Yonetici +Create a new Phycician butonuna tiklar")
    public void yoneticiCreateANewPhycicianButonunaTiklar() {
        adminPage.CreateanewPhysicianButon.click();

    }

    @And("Yonetici Create or edit a Physician sayfasina gelir")
    public void yoneticiCreateOrEditAPhysicianSayfasinaGelir() {
        Assert.assertTrue(adminPage.CreateoreditaPhysisicanSayfasi.isDisplayed());
    }

    @And("Yonetici Use Search kutusunu tikler")
    public void yoneticiUseSearchKutusunuTikler() {
        adminPage.UseSearchBox.click();
    }

    @And("Yonetici sistemdeki doktoru bulabilmek icin SSN bilgisi girer")
    public void yoneticiSistemdekiDoktoruBulabilmekIcinSSNBilgisiGirer() {
        adminPage.SSNBox.sendKeys("256-36-4752");
    }

    @And("Yonetici Search User butonuna basar")
    public void yoneticiSearchUserButonunaBasar() {
        adminPage.SearchUserButon.click();
    }
}

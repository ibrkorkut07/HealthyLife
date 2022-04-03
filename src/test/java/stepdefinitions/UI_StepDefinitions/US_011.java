package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_011 {

    LoginPage login = new LoginPage();

    @And("giris icin giris ikonuna tiklar")
    public void girisIcinGirisIkonunaTiklar() {
        login.anaSayfaGirisIkonu.click();
    }

    @And("ana sayfa Sign In butonuna tiklar")
    public void anaSayfaSignInButonunaTiklar() {
        login.anaSayfaSignIn.click();
    }

    @And("username olarak {string} girer")
    public void usernameOlarakGirer(String username) {
        Driver.wait(1);
        login.UserNameBox.sendKeys(ConfigReader.getProperty(username));
    }

    @And("password olarak {string} girer")
    public void passwordOlarakGirer(String password) {
        Driver.wait(1);

        login.passwordBox.sendKeys(ConfigReader.getProperty(password));
    }

    @And("Sign In butonuna tiklar")
    public void signInButonunaTiklar() {
        login.signIn.click();
    }
}

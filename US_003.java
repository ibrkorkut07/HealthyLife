package stepdefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.ConfigReader;

    public class US_003 {

        RegistrationPage registrationPage = new RegistrationPage();

        @Given("Signin Obje linkine tiklar")
        public void SigninObje_linkine_tiklar() {
            registrationPage.SigninObjeLinki.click();
        }

        @When("Register linkine tiklar")
        public void Register_linkine_tiklar() {
            registrationPage.RegisterLinki.click();
        }

        @Then("New password kutusuna tiklar")
        public void Newpassword_kutusuna_tiklar() {
            registrationPage.NewPasswordKutusu.click();
        }

/*
    A password is said to be strong if it satisfies the following criteria:

    It contains at least one lowercase English character.
    It contains at least one uppercase English character.
    It contains at least one special character. The special characters are: !@#$%^&*()-+
    Its length is at least 8.
    It contains at least one digit.
    Given a string, find its strength. Let a strong password is one that satisfies all above conditions.
    A moderate password is one that satisfies first three conditions and has length at least 6.
    Otherwise password is week.

import java.io.*;
import java.util.*;

class GFG {


    public static void printStrongNess(String input)
    {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
            Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                          '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        // Strength of password
        System.out.print("Strength of password:- ");
        if (hasDigit && hasLower && hasUpper && specialChar
            && (n >= 8))
            System.out.print(" Strong");
        else if ((hasLower || hasUpper || specialChar)
                 && (n >= 6))
            System.out.print(" Moderate");
        else
            System.out.print(" Weak");
    }

    // Driver Code
    public static void main(String[] args)
    {
        String input = "GeeksforGeeks!@12";
        printStrongNess(input);
    }


}


 */

    /*
    @Then("Office olarak {string} yazar")
    public void office_olarak_yazar(String office) {
    editorPage.officeBox.sendKeys(office);
    }
     */
    /*
    And I enter "tester" in the "password" field
    And I press the "login" button
  Then I should see the "welcome" page
     */
    }

/*

    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullaniciTipi) {
        hmcPage.usernameTextBox.sendKeys(ConfigReader.getProperty(kullaniciTipi));

    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
        hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty(passwordTuru));

    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
    hmcPage.loginButonu.click();

    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {

        Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isDisplayed());

    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

        Assert.assertTrue(hmcPage.girisYapilamadiYaziElementi.isDisplayed());

    }


    @Then("scenario outline'dan kullanici adi olarak {string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hmcPage.usernameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan password olarak {string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {
        hmcPage.passwordTextBox.sendKeys(password);
    }
}

 */


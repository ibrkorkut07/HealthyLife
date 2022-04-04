package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.WatchEvent;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement anaSayfaGirisIkonu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement anaSayfaSignIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement UserNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;

    @FindBy(xpath = "//span[normalize-space()='Remember me']")
    public WebElement rememberMe;

    @FindBy(xpath = "//span[normalize-space()='Did you forget your password?']")
    public WebElement forgetYourPassword;

    @FindBy(xpath = "//div[@role='dialog']//div[4]")
    public WebElement registeraNewAccount;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButton;
@FindBy(xpath = "//li[@id='account-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
public WebElement kullaniciMenusu;

@FindBy(xpath = "//span[normalize-space()='Settings']")
    public WebElement kullaniciSettingsButton;













}

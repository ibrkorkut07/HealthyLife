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
    public WebElement loginButton;


@FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButton;



@FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement loginButton;


@FindBy(xpath = "//a[@id='login-item']")
    public WebElement signIn;

@FindBy(xpath = "//input[@id='username']")
    public WebElement userNamebox;

@FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

@FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

















}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {


    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //input[@name='ssn']
    //div[text()='Your SSN is required.']
    //div[text()='Your SSN is invalid']
    //input[@class='is-touched is-dirty av-valid form-control']

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnRequiredMessage;

    @FindBy(xpath = "//div[text()='Your SSN is invalid']")
    public WebElement ssnInvalidMessage;

    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement ssnValidConfirm;

    //input[@name='firstName']
    //div[text()='Your FirstName is required.']

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameRequiredMessage;

    //input[@name='lastName']
    //div[text()='Your LastName is required.']

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameRequiredMessage;

    //input[@name='username']
    //div[text()='Your username is required.']
    //div[text()='Your username is invalid.']

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//div[text()='Your username is required.']")
    public WebElement userNameRequiredMessage;

    @FindBy(xpath = "//div[text()='Your username is invalid.']")
    public WebElement usernameInvalidMessage;

    //input[@name='email']
    //div[text()='Your email is required.']
    //div[text()='Your email is required to be at least 5 characters.']
    //div[text()='This field is invalid']

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement emailRequiredMessage;

    @FindBy(xpath = "//div[text()='Your email is required to be at least 5 characters.']")
    public WebElement emailCharacterMessage;

    @FindBy(xpath = "//div[text()='This field is invalid']")
    public WebElement emailInvalidMessage;
















}
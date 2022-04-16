package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US015Admin {
    public US015Admin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "account-menu")
    public WebElement accountWebElement;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement singInWebElement;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement singInButton;

    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement itemsTitlesButtonu;

    @FindBy(xpath = "//span[.='Patient']")
    public WebElement itemsAltindakiPatientButtonu;

    @FindBy(xpath = "//span[.='Create a new Patient']")
    public WebElement createanewPatient;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement patientLastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement patientEmail;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement patientPhone;

    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement birthDate;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement patientBloodGroup;

    @FindBy(css = "select[name='gender']")
    public WebElement gender;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement patientDescription;

    @FindBy(css = "input[name='adress']")
    public WebElement adress;

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement patientCountry;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement userid;

    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement state;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement savebuttonu;
}

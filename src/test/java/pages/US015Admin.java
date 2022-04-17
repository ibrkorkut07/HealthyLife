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

    @FindBy(xpath = "//div[contains(text(),'A new Patient is created')]")
    public WebElement successCreatedMessage;

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

    @FindBy(xpath = " (//span[@class='d-none d-md-inline'])[1]")
    public WebElement viewHastaIlkSatirButtonu;

    @FindBy(xpath = "//span[@id='ssn']")
    public WebElement ssnView;

    @FindBy(xpath = "//span[@id='firstName']")
    public WebElement firstNameView;

    @FindBy(xpath = "//span[@id='lastName']")
    public WebElement lastNameView;

    @FindBy(xpath = "//span[@id='birthDate']")
    public WebElement birthDateView;

    @FindBy(xpath = "//span[@id='phone']")
    public WebElement phoneView;

    @FindBy(xpath = "//span[@id='gender']")
    public WebElement genderView;

    @FindBy(xpath = "//span[@id='bloodGroup']")
    public WebElement bloodGroupView;

    @FindBy(xpath = "//span[@id='adress']")
    public WebElement adressView;

    @FindBy(xpath = "//span[@id='description']")
    public WebElement descriptionView;

    @FindBy(xpath = "//span[@id='createdDate']")
    public WebElement createdDateView;

    @FindBy(xpath = "(//span[contains(text(),'User')])[2]")
    public WebElement userView;

    @FindBy(xpath = "(//span[contains(text(),'Country')])[2]")
    public WebElement countryView;

    @FindBy(xpath = "(//span[contains(text(),' State/City')])")
    public WebElement stateCityView;
}

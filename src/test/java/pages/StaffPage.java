package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StaffPage {



    public StaffPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement insanFiguru;

    @FindBy(id="login-item")
    public WebElement IlkSigIn;

    @FindBy(xpath = "//input[@id='username']")
    public  WebElement UsernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public  WebElement PasswordBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement SigIn;

    @FindBy(id = "entity-menu")
    public WebElement myPagesButonu;

    @FindBy(name = "Search Patient")
    public WebElement searchPatientButonu;

    @FindBy(xpath ="//span[text()='Patients']")
    public WebElement patientsYazisi;

    @FindBy(xpath = "//input[@class='form-control']")
    public  WebElement patentSsnBox;

    @FindBy(xpath ="//a[@class='btn btn-primary btn-sm']")
    public WebElement editBox;

    @FindBy(tagName = "h2")
    public WebElement createPatientFormYazisi;

    @FindBy(xpath = "//input[@name='id']")
    public WebElement idBox;

    @FindBy(name="patient-firstName")
    public  WebElement firstnameBox;

    @FindBy(name="lastName")
    public WebElement lastnameBox;

    @FindBy(name = "birthDate")
    public  WebElement birthDateBox;

    @FindBy(name="email")
    public  WebElement emailBox;

    @FindBy(id="patient-phone")
    public  WebElement phoneBox;

    @FindBy(id="patient-gender")
    public WebElement genderBox;

    @FindBy(id="patient-bloodGroup")
    public WebElement bllodGroupBox;

    @FindBy(id="patient-adress")
    public WebElement adressBox;

    @FindBy(id="patient-description")
    public WebElement descriptionBox;

    @FindBy(className = "user.id")
    public WebElement patientUserBox;

    @FindBy(className = "country.id")
    public WebElement countryBox;

    @FindBy(id="patient-cstate")
    public WebElement patientCstateBox;

    @FindBy(id="save-entity")
    public WebElement patientSaveBox;

    @FindBy(xpath = "//*[contains(text(), 'Registration Saved')]")
    public WebElement toastContainerMassage;








}

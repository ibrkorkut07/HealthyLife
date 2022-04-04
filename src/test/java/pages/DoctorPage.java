package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorPage {

    public DoctorPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }












    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement settingsFirstNameBox;

    @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement myAppointments;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement settingsLastNameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement settingsEmailBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement settingsSaveButton;

    @FindBy(xpath = "//strong[normalize-space()='Settings saved!']")
    public WebElement settingsSaveSavedText;




}

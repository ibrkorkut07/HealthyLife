package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class DoctorPage {

    public DoctorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPagesButton;

    @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement myAppointmentButton;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement myAppointmentEditButton;

    @FindBy(xpath = "//span[normalize-space()='Create or Edit an Appointment']")
    public WebElement createOrEditAnAppointmentText;

    @FindBy(xpath = "//input[@id='appointment-id']")
    public WebElement createAppointmentIdBox;

    @FindBy(xpath = "//input[@id='appointment-startDate']")
    public WebElement createAppointmentStartDateTime;

    @FindBy(xpath = "//input[@id='appointment-endDate']")
    public WebElement createAppointmentEndDateTime;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement createAppointmentStatus;

    @FindBy(xpath = "//select[@id='appointment-physician']")
    public WebElement createAppointmentPhysician;

    @FindBy(xpath = "//textarea[@id='appointment-anamnesis']")
    public WebElement createAppointmentAnamnesisBox;

    @FindBy(xpath = "//textarea[@id='appointment-treatment']")
    public WebElement createAppointmentTreatmentBox;

    @FindBy(xpath = "//textarea[@id='appointment-diagnosis']")
    public WebElement createAppointmentDiagnosisBox;

    @FindBy(xpath = "//textarea[@id='appointment-prescription']")
    public WebElement createAppointmentPrescriptionBox;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement createAppointmentSaveButton;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement statusDropDownElementi;



}

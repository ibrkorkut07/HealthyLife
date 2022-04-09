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



    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement settingsFirstNameBox;

    @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement myAppointments;

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
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement settingsLastNameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement settingsEmailBox;
    @FindBy(xpath = "//textarea[@id='appointment-anamnesis']")
    public WebElement createAppointmentAnamnesisBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement settingsSaveButton;
    @FindBy(xpath = "//textarea[@id='appointment-treatment']")
    public WebElement createAppointmentTreatmentBox;

    @FindBy(xpath = "//strong[normalize-space()='Settings saved!']")
    public WebElement settingsSaveSavedText;
    @FindBy(xpath = "//textarea[@id='appointment-diagnosis']")
    public WebElement createAppointmentDiagnosisBox;

    @FindBy(xpath = "//textarea[@id='appointment-prescription']")
    public WebElement createAppointmentPrescriptionBox;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement createAppointmentSaveButton;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement statusDropDownElementi;

    @FindBy(xpath = "//textarea[@id='appointment-description']")
    public WebElement createAppointmentDescription;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement createAppointmentSave;

    @FindBy(xpath = "//span[normalize-space()='My Inpatients']")
    public WebElement myInpatientsSeceneği;

    @FindBy(xpath = " //span[normalize-space()='In Patients']")
    public WebElement InPatientsYazisi;

    @FindBy(xpath = "//tbody/tr[1]/td[10]/div[1]/a[1]")
    public WebElement InPatientEditbutonu;


    //@FindBy(xpath = "//*[text()='ID']")
    //public WebElement DoctorID;
    @FindBy(xpath = "//*[text()='42862']")
    public WebElement DoctorId;

    //   @FindBy(xpath = "//*[text()='Start Date']")
    //   public WebElement StartDate;
    @FindBy(xpath = "//span[.='01/04/22 16:56']")
    public WebElement StartDate;
    @FindBy(xpath = "//input[@id='in-patient-id']")
    public WebElement inPatientsIdBox;

    @FindBy(xpath = "//input[@id='in-patient-startDate']")
    public WebElement inPatientStartDateBox;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement saveButtonAlertYazisi;

    @FindBy(xpath = "//input[@id='in-patient-endDate']")
    public WebElement inPatientEndDateBox;

    @FindBy(xpath = "//input[@id='in-patient-description']")
    public WebElement inPatientDescriptionBox;

    @FindBy(xpath = "//input[@id='in-patient-createdDate']")
    public WebElement inPatientCreatedDateBox;

    @FindBy(xpath = "//select[@id='in-patient-appointment']")
    public WebElement inPatientAppointmentBox;

    @FindBy(xpath = "//select[@id='in-patient-status']")
    public WebElement inPatientStatusBox;

    @FindBy(xpath = "//select[@id='in-patient-room']")
    public WebElement inPatientRoomBox;

    @FindBy(xpath = "//select[@id='in-patient-patient']")
    public WebElement inPatientPatientBox;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement inPatientSaveButton;























}

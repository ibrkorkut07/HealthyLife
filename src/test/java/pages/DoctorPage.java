package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

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



















    @FindBy(xpath = "//input[@id='fromDate']")
    public WebElement fromDate;

    @FindBy(id = "toDate")
    public WebElement todate;

    @FindBy(xpath = "//*[span='My Inpatients']" )
    public WebElement myInpatientsDropdown;

    @FindBy(xpath="//th[1]")
    public WebElement appointmentIdBox;

    @FindBy(id = "//th[4]")
    public WebElement appointmentStatusBox;

    @FindBy(xpath = "//tr//td[8]")
    public List <WebElement> appoinmentList ;


    /**   US018/
     *
     */


    @FindBy(xpath = "//input[@id='physician-id']")
    public WebElement idBox;

    @FindBy(id = "physician-firstName")
    public WebElement firstName;

    @FindBy(id = "physician-lastName")
    public WebElement lastName;

    @FindBy(id = "physician1-birthDate")
    public WebElement birthDayBox;

    @FindBy(id = "physician-phone")
    public WebElement phonebox;

    @FindBy(id = "physician-gender")
    public WebElement genderDropDown;

    @FindBy(id = "physician-bloodGroup")
    public WebElement bloodGroupDropDown;

    @FindBy(id = "physician-adress")
    public WebElement adressBox;

    @FindBy(id = "physician-description")
    public WebElement descriptionBox;

    @FindBy(id = "physician-createdDate" )
    public WebElement createddate;

    @FindBy(id = "physician-user" )
    public WebElement staffUserdropDown;

    @FindBy(id = "physician-country")
    public WebElement countryDropDown;

    @FindBy(id = "physician-cstate")
    public WebElement stateDropDown;

    @FindBy(id = "cancel-save")
    public WebElement backButton;

    @FindBy(id ="save-entity" )
    public WebElement saveButton;

    @FindBy(xpath = "//select[@id='physician-speciality']")
    public WebElement uzmanlikDropDown;

    @FindBy(xpath = "//input[@id='file_image']")
    public WebElement fotoUpload;

    @FindBy(xpath = "//input[@id='physician-examFee']")
    public WebElement ExamFreeBox;

























}

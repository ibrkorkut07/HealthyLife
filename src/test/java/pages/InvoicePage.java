package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InvoicePage {

    public InvoicePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement MyPages;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement SignInIcon;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement SignInDropDownLink;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement UsernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement PasswordBox;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement SigninEnterTusu;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement MyAppointmentsDropDownItem;

    @FindBy(xpath = "//span[text()='Show Invoice']")
    public WebElement ShowInvoiceBox;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement SearchPatient;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement SearchPatientSSNBox;

    @FindBy(xpath = "//span[text()='Show Appointments']")
    public WebElement ShowAppointmentsButton;

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement PaymentInvoiceProcessButton;

    @FindBy(xpath = "//th[text()='PAYMENT DETAIL']")
    public WebElement PaymentDetailPageText;

    @FindBy(xpath = "//span[text()='COMPLETED']")
    public WebElement RandevuDurumu;

    @FindBy(xpath = "//th[text()='450']")
    public WebElement ExamFee;

    @FindBy(xpath = "//td[@style='font-size: 15px;'][2]")
    public WebElement TestItemFee;

    @FindBy(xpath = "(//a[text()=' Show Invoice'])[1]")
    public WebElement ShowInvoiceButton;

    @FindBy(xpath = "//th[text()='INVOICE']")
    public WebElement InvoicePageTitleText;

    @FindBy(xpath = "(//a[text()=' Create Invoice'])[1]")
    public WebElement CreateInvoiceButton;

    @FindBy(xpath = "//input[@id='bill-id']")
    public WebElement BillIdKutusu;

    @FindBy(xpath = "//input[@name='date']")
    public WebElement BillDateKutusu;

    @FindBy(xpath = "//input[@name='billName']")
    public WebElement BillNameKutusu;

    @FindBy(xpath = "//input[@name='paymentMethod']")
    public WebElement BillPaymentKutusu;

    @FindBy(xpath = "//input[@ID='bill-description']")
    public WebElement BILLDescriptionKutusu;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement EditaBillSavebutonu;





    //  Create Invoice

//    @FindBy(xpath = "//span[text()='COMPLETED']")
//    public static WebElement AppointmentStatusText;


//    @FindBy(xpath = "//li[@id='account-menu']")
//    public WebElement insanFiguru;
//
//    @FindBy(xpath = "//a[@id='login-item']")
//    public WebElement IlkSigIn;
//
//    @FindBy(xpath = "//input[@id='username']")
//    public WebElement UsernameBox;
//
//    @FindBy(xpath = "//input[@id='password']")
//    public WebElement PasswordBox;
//
//    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
//    public WebElement SigInButton;
//
//    @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
//    public WebElement myPagesButonu;
//
//    @FindBy(xpath = "//span[normalize-space()='Search Patient']")
//    public WebElement searchPatientButonu;
//
//    @FindBy(xpath = "//span[normalize-space()='Patients']")
//    public WebElement patientsYazisi;
//
//    @FindBy(xpath = "//input[@name='ssn']")
//    public WebElement patentSsnBox;

    //btn btn-success btn-sm
    //  Show Invoice


    // font-size: 15px;


    // COMPLETED



    // PAYMENT DETAIL

    // btn btn-success btn-sm


    // btn btn-warning btn-sm

    // Search Patient
    // @FindBy(xpath = "//div[@class='jh-card card']//li[1]")
    // //span[text()='Search Patient']


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US012MedinePage {
    public US012MedinePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement anaSayfadakiSignInButtonu;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement signInUsernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement signInPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement kisiBilgileriGirildiktenSonraSignInButton;

    @FindBy(xpath = "//span[.='MY PAGES']")
    public WebElement anasayfadakiMyPagesSekmesi;

    @FindBy(xpath = "//span[.='My Appointments']")
    public WebElement myPagesSekmesindekiMyAppointmentsButtonu;

    @FindBy(xpath = "(//div[@class='btn-group flex-btn-group-container'])[1]")
    public WebElement hastaSatirindakiEditButtonu;

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement testIstemeRequestATestButtonu;

    @FindBy(xpath = "//h2[.='Test Items']")
    public WebElement testIstemsTextYazisi;

    @FindBy(xpath = "//input[@id = '1401']")
    public WebElement glucoseCheck;

    @FindBy(id = "1402")
    public WebElement ureaCheck;

    @FindBy(id = "1403")
    public WebElement creatinineCheck;

    @FindBy(id = "1404")
    public WebElement sodiumCheck;

    @FindBy(id = "1405")
    public WebElement potassiumCheck;

    @FindBy(id = "1406")
    public WebElement totalProteinCheck;

    @FindBy(id = "1407")
    public WebElement albuminCheck;

    @FindBy(id = "1408")
    public WebElement hemoglobinCheck;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(className = "Toastify")
    public WebElement toastContainerSuccessMessage;

    @FindBy(xpath = "//span[.='Medine Anna']")
    public WebElement medineAnnaIkonButtonu;


    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOutButtonu;

}
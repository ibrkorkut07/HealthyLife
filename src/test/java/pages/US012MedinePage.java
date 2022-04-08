package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
}

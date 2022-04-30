package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminStaff {
    public AdminStaff() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

public String ssnGetir(){

     Faker faker = new Faker();
     int random=faker.random().nextInt(1,20);
     String randomSsn = Driver.getDriver().findElement(By.xpath("//tbody/tr["+random+"]/td[2]")).getText();
return randomSsn;
}


    @FindBy(xpath = "//span[normalize-space()='Items&Titles']")
    public WebElement itemTitleMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Staff']")
    public WebElement itemTitleStaffMenuButton;

    @FindBy(xpath = "//span[normalize-space()='Create a new Staff']")
    public WebElement createNewStaffButton;

    @FindBy(xpath = "//input[@id='useSSNSearch']")
    public WebElement useSearchCheckBox;

    @FindBy(xpath = "//input[@id='searchSSN']")
    public WebElement inputSsnBox;

    @FindBy(xpath = "//button[normalize-space()='Search User']")
    public WebElement searchUserButton;

    @FindBy(xpath = "//input[@id='staff-id']")
    public WebElement idBox;

    @FindBy(id = "staff-firstName")
    public WebElement firstName;

    @FindBy(id = "staff-lastName")
    public WebElement lastName;

    @FindBy(id = "staff-birthDate")
    public WebElement birthDayBox;

    @FindBy(id = "staff-phone")
    public WebElement phonebox;

    @FindBy(id = "staff-gender")
    public WebElement genderDropDown;

    @FindBy(id = "staff-bloodGroup")
    public WebElement bloodGroupDropDown;

    @FindBy(id = "staff-adress")
    public WebElement adressBox;

    @FindBy(id = "staff-description")
    public WebElement descriptionBox;

    @FindBy(id = "staff-createdDate" )
    public WebElement createddate;

    @FindBy(id = "staff-user" )
    public WebElement staffUserdropDown;

    @FindBy(id = "staff-country")
    public WebElement countryDropDown;

    @FindBy(id = "staff-cstate")
    public WebElement stateDropDown;

    @FindBy(id = "cancel-save")
    public WebElement backButton;

    @FindBy(id ="save-entity" )
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement onayKutusu;






}

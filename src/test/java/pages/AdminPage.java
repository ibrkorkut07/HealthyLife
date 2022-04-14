package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {

    public AdminPage(){
        PageFactory.initElements(Driver.getDriver(), this);

        }
        @FindBy(xpath ="//span[normalize-space()='Items&Titles']" )
        public WebElement ItemsTitles;

        @FindBy(xpath = "//span[normalize-space()='Physician']")
         public WebElement Physician;

        @FindBy(xpath = "//span[normalize-space()='Create a new Physician']")
        public WebElement CreateanewPhysicianButon;

        @FindBy(xpath = "//span[normalize-space()='Create or edit a Physician']")
        public WebElement CreateoreditaPhysisicanSayfasi;

        @FindBy(xpath = "//input[@id='useSSNSearch']")
        public WebElement UseSearchBox;

        @FindBy(xpath = "//input[@id='searchSSN']")
        public WebElement SSNBox;

        @FindBy(xpath = "//button[normalize-space()='Search User']")
        public WebElement SearchUserButon;

        @FindBy(xpath = "//input[@id='physician-firstName']")
        public WebElement FirstNameBox;

        @FindBy(xpath = "//input[@id='physician-lastName']")
         public WebElement LastNameBox;

        @FindBy(xpath = "//input[@id='physician1-birthDate']")
        public WebElement BirthDateBox;

        @FindBy(xpath = "//input[@id='physician-phone']")
        public WebElement PhoneBox;

        @FindBy(xpath = "//input[@id='physician-adress']")
        public WebElement AddressBox;

        @FindBy(xpath = "//select[@id='physician-gender']")
        public WebElement GenderBox;

        @FindBy(xpath = "//select[@id='physician-speciality']")
        public WebElement SpecialityBox;

        @FindBy(xpath = "//select[@id='physician-bloodGroup']")
        public WebElement BloodGroupBox;

        @FindBy(xpath = "//input[@id='physician-description']")
        public WebElement DescriptionBox;

        @FindBy(xpath="//input[@id='file_image']")
        public WebElement ChooseFileBox;

        @FindBy(xpath = "//input[@id='physician-examFee']")
        public WebElement ExamFreeBox;

        @FindBy(xpath = "//select[@id='physician-user']")
        public WebElement UserBox;

        @FindBy(xpath = "//select[@id='physician-country']")
        public WebElement CountryBox;

        @FindBy(xpath = "//select[@id='physician-cstate']")
        public WebElement CityBox;

        @FindBy(xpath = "//span[normalize-space()='Save']")
        public WebElement SaveButon;

}

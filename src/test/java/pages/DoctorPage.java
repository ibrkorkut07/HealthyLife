package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorPage {

    public DoctorPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement myAppointments;

















}

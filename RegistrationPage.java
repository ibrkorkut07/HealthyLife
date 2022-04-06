package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement SigninObjeLinki;

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement RegisterLinki;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement NewPasswordKutusu;

    @FindBy(xpath = "//div[@class='jh-card card']//li[1]")
    public WebElement color1;

    @FindBy(xpath = "//div[@class='jh-card card']//li[2]")
    public WebElement color2;

    @FindBy(xpath = "//div[@class='jh-card card']//li[3]")
    public WebElement color3;

    @FindBy(xpath = "//div[@class='jh-card card']//li[4]")
    public WebElement color4;

    @FindBy(xpath = "//div[@class='jh-card card']//li[5]")
    public WebElement color5;

}

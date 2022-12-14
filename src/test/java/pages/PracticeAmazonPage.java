package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeAmazonPage {

    public PracticeAmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[@id='nav-link-accountList']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()='There was a problem']")
    public WebElement thereWasProblem;

    @FindBy(xpath = "//*[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(xpath = "//*[@class='a-link-normal']")
    public WebElement forgotYourPassword;

    @FindBy(xpath = "//h1")
    public WebElement passwordAssistance;

    @FindBy(xpath = "//*[@        id='createAccountSubmit']")
    public  WebElement createAccountSubmit;

    @FindBy(xpath = "//h1")
    public WebElement createAccountMessage;
}

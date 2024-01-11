package gadgetarium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
    /*
        1. locate all elements from Contacts page
        2. create writeToUs() method
     */

    WebDriver driver;

    public ContactsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "text")
    public WebElement text;

    @FindBy(xpath = "//button[text()='send']")
    public WebElement sendButton;


    public void writeToUs(String nameValue, String surnameValue, String emailValue, String phoneValue, String textValue){
        firstName.sendKeys(nameValue);
        lastName.sendKeys(surnameValue);
        email.sendKeys(emailValue);
        phoneNumber.sendKeys(phoneValue);
        text.sendKeys(textValue);
        sendButton.click();
    }



}

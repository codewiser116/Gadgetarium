package studymate.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static javax.swing.UIManager.put;

public class TeachersPage {

    WebDriver driver;

    public TeachersPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Add teacher']")
    public WebElement addTeacherButton;

    @FindBy(css="div#modal input[name='name']")
    public WebElement inputFirstName;

    @FindBy(css="div#modal input[name='lastName']")
    public WebElement inputLastName;

    @FindBy(css="div#modal input[name='phoneNumber']")
    public WebElement inputPhoneNumber;

    @FindBy(css="div#modal input[name='email']")
    public WebElement inputEmailAddress;

    @FindBy(css="div#modal input[name='specialization']")
    public WebElement inputSpecialization;

    @FindBy(xpath = "//*[@aria-haspopup='listbox']")
    public WebElement chooseCourseDropDwn;

    @FindBy(xpath = "//form[contains(@class, 'form')]//button[@type='submit']")
    public WebElement submitTeacherForm;

    @FindBy(xpath = "//div[@role='presentation']//button[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    @FindBys(@FindBy(xpath = "//div[@role='presentation' and @id='menu-']//li"))
    public List<WebElement> listOfCourses;


    public void createATeacher(String fName, String lName, String phoneNumber,
                               String email, String specialization, String courseName){

        addTeacherButton.click();

        inputFirstName.sendKeys(fName);
        inputLastName.sendKeys(lName);
        inputPhoneNumber.sendKeys(phoneNumber);
        inputEmailAddress.sendKeys(email);
        inputSpecialization.sendKeys(specialization);

        chooseCourseDropDwn.click();

        for (WebElement course : listOfCourses){
            if (course.getText().equals(courseName)){
                course.click();
            }
        }

        inputSpecialization.click();
        addTeacherButton.click();

    }



}

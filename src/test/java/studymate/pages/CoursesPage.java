package studymate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CoursesPage {

    WebDriver driver;

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Create course']")
    public WebElement createCourse;

    @FindBy(xpath = "//*[@name='courseName']")
    public WebElement courseName;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement description;

    @FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
    public WebElement date;

    @FindBy(xpath = "//*[text()='Create']")
    public WebElement createButton;

    @FindBys(@FindBy(xpath = "//div[@class='css-1qf1rpk']/div/div[2]/div/div"))
    public List<WebElement> courseNames;


    /**
     * This method creates a course in studymate using passed parameters
     * @param courseName
     * @param description
     * @param date
     * @author Codewise Academy
     */
    public void createACourse(String courseName, String description, String date){
        createCourse.click();
        this.courseName.sendKeys(courseName);
        this.description.sendKeys(description);

        this.date.click();
        this.date.sendKeys(date);
        createButton.click();
    }


    /**
     * This method checks all the courses from page 1
     * to see if there is a course provided in parameters
     * @param courseName
     * @return true if course is there, else false
     * @author Codewise Academy
     */
    public boolean isCourseCreated(String courseName){

        System.out.println("COURSE NAME: " + courseName);
        for(WebElement course : courseNames){
            System.out.println(course.getText());
            if(course.getText().equals(courseName)){
                return true;
            }
        }
        return false;
    }



}

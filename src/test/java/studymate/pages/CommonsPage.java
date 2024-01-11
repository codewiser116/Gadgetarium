package studymate.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonsPage {

    public CommonsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;

    @FindBy(linkText = "Courses")
    public WebElement coursesTab;

    @FindBy(linkText = "Teachers")
    public WebElement teachersTab;

}

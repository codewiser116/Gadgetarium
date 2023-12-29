package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

public class FAQPage {


    @FindBys(@FindBy(xpath = "//div[@class='accordion-container MuiBox-root css-0']/div"))
    public List<WebElement> questions;


    @FindBy
    @FindAll({
            @FindBy(how = How.XPATH, using = "//p[@class='MuiTypography-root MuiTypography-body2 general-text css-68o8xu']"),
            @FindBy(how = How.CLASS_NAME, using = "MuiTypography-root MuiTypography-body2 general-text css-68o8xu") }
    )
    List<WebElement> elements;

}

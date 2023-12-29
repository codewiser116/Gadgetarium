package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {

    public CommonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Search by shop catalog']")
    public WebElement searchInputBar;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root button MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root button MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium gap capitalize css-xshx5o']")
    public WebElement catalogButton;

    @FindBy(css = "a[href='https://www.facebook.com/']")
    public WebElement facebookIcon;

    @FindBy(css = "a[href='https://www.instagram.com/peaksoft.house/']")
    public WebElement instagramIcon;

    @FindBy(css = "a[href='/cart']")
    public WebElement cart;

    @FindBy(css = "a[href='/favorite']")
    public WebElement favorites;

    @FindBy(linkText = "Main")
    public WebElement mainPageTab;

    @FindBy(linkText = "About Store")
    public WebElement aboutStoreTab;

    @FindBy(linkText = "Delivery")
    public WebElement deliveryTab;

    @FindBy(linkText = "FAQ")
    public WebElement faqTab;

    @FindBy(xpath = "//button[@type='button']/a[@href='/contacts']")
    public WebElement contactsTab;

    //BREAK UNTIL 7:40 PM














}

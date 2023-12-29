package tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import utilities.Driver;
import utilities.UtilWait;

import java.time.Duration;

public class CommonTests {

    static WebDriver driver;
    static CommonPage commonPage;


    @BeforeClass
    public static void initialize(){
        driver = Driver.getDriver();
        driver.get("https://gadgetarium.us/");
        commonPage = new CommonPage(driver);
    }

    /*
        1. go to gadgetarium.us
        2. click on "About Store"
        3. verify URL is https://gadgetarium.us/about
        4. click on "Contacts"
        5. verify URL is https://gadgetarium.us/contacts
     */
    @Test
    public void verifyUrls() {
        commonPage.aboutStoreTab.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("about"));

        commonPage.contactsTab.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("contacts"));
    }

    /*
        1. go to gadgetarium.us
        2. click on "cart"
        3. verify URL contains cart
        4. click on "Contacts"
        5. verify URL is https://gadgetarium.us/contacts
     */
    @Test
    public void cartVerify(){
        commonPage.cart.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));

        commonPage.contactsTab.click();
        Assert.assertEquals("https://gadgetarium.us/contacts",driver.getCurrentUrl());
    }


}

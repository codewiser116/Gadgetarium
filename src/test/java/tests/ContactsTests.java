package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.ContactsPage;
import utilities.Driver;

public class ContactsTests {

    WebDriver driver = Driver.getDriver();
    ContactsPage contactsPage = new ContactsPage(driver);

    @Test
    public void verifyWriteToUs(){
        driver.get("https://gadgetarium.us/contacts");

        contactsPage.writeToUs("Bena", "Codewise",
                "benazirbai@gmail.com", "123456789", "Hello everyone");
    }



}

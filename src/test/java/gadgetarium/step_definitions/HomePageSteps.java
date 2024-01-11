package gadgetarium.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import gadgetarium.pages.CommonPage;
import utilities.Driver;

public class HomePageSteps {

    WebDriver driver = Driver.getDriver();
    CommonPage commonPage = new CommonPage(driver);


    @Given("user is on {string} page")
    public void user_is_on_page(String url) {
        driver.get(url);
    }

    @Then("print webpage title")
    public void print_webpage_title() {
        System.out.println(driver.getTitle());
    }


    @Then("print webpage url")
    public void print_webpage_url() {
        System.out.println(driver.getCurrentUrl());
    }






    @When("user clicks on facebook button")
    public void user_clicks_on_facebook_button() {
        commonPage.facebookIcon.click();
    }

    @Then("verify the url is {string}")
    public void verify_the_url_is(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());
    }

    @When("user clicks on instagram button")
    public void user_clicks_on_instagram_button() {
        commonPage.instagramIcon.click();
    }


    @When("user clicks on {string} page")
    public void user_clicks_on_page(String pageName) throws InterruptedException {
        Thread.sleep(7000);
        driver.findElement(By.linkText(pageName)).click();
    }




}

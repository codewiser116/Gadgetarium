package gadgetarium.step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import gadgetarium.pages.CommonPage;
import utilities.Driver;

import java.util.List;

public class SampleSteps {

    WebDriver driver = Driver.getDriver();
    CommonPage commonPage = new CommonPage(driver);


    @Given("admin is logged in to the system")
    public void admin_is_logged_in_to_the_system() {
        System.out.println("Admin is logged in to the system");
    }


    @When("admin goes to students page")
    public void admin_goes_to_students_page() {
        System.out.println("Admin goes to students page");
    }


    @Then("admin clicks on create new student button")
    public void admin_clicks_on_create_new_student_button() {
        System.out.println("Admin clicks on new student button");
    }


    @Then("admin creates a student")
    public void admin_creates_a_student() {
        System.out.println("Admin creates a student");
    }


    @Then("verify student is created")
    public void verify_student_is_created() {
        System.out.println("Student is successfully created!");
    }

    @When("admin creates {int} students")
    public void admin_creates_students(Integer numberOfStudents) {
        System.out.println("Admin created " + numberOfStudents + " students");
    }

    @Then("verify {int} students are created")
    public void verify_students_are_created(Integer numberOfStudents) {
        System.out.println(numberOfStudents + " students are created");
    }


    @Given("user logs in")
    public void user_logs_in() {
        System.out.println("user logged in");
    }

    @When("user goes to home page")
    public void user_goes_to_home_page() {
        System.out.println("user goes to home page");
    }

    @Then("print number {int}")
    public void print_number(Integer int1) {
        System.out.println("printing: " + int1);
    }

    @Then("print number <numberToPrint>")
    public void print_number_number_to_print(DataTable dataTable) {

        List<Integer> numbers = dataTable.asList(Integer.class);

        for (Integer i : numbers){
            System.out.println(i);
        }

    }


    @Given("user is on homepage")
    public void user_is_on_homepage() throws InterruptedException {
        driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys("flower");
        Select select = new Select(driver.findElement(By.id("gh-cat")));
        select.selectByVisibleText("Baby");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(3000);

        select = new Select(driver.findElement(By.id("gh-cat")));
        select.selectByVisibleText("Crafts");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(3000);

        select = new Select(driver.findElement(By.id("gh-cat")));
        select.selectByVisibleText("Art");
        driver.findElement(By.id("gh-btn")).click();

    }

    @Then("user logs in to system")
    public void user_logs_in_to_system(DataTable dataTable) {
        List<String> users = dataTable.asList(String.class);

        for (String user : users){
            System.out.println(user + " logged in");
        }
    }



}

package studymate.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import studymate.pages.CommonsPage;
import studymate.pages.CoursesPage;
import studymate.pages.LoginPage;
import studymate.pages.TeachersPage;
import utilities.Driver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdminSteps {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    CommonsPage commonsPage = new CommonsPage(driver);
    TeachersPage teachersPage = new TeachersPage(driver);
    CoursesPage coursesPage = new CoursesPage(driver);

    public static String courseName;

    @Given("admin logs in to studymate with {string} and {string}")
    public void admin_logs_in_to_studymate_with_and(String username, String password) {
        driver.get("https://codewiser.studymate.us/login");
        loginPage.login(username, password);
    }


    @When("admin goes to Courses page")
    public void admin_goes_to_courses_page() {
        commonsPage.coursesTab.click();
    }


    @When("admin creates a course")
    public void admin_creates_a_course() throws InterruptedException {

        Faker faker = new Faker();

        courseName = faker.job().field();
        String description = faker.job().keySkills();

        /*
        this will get today's date in MM/dd/yyyy format
         */
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String todaysDate = today.format(formatter);

        coursesPage.createACourse(courseName, description, todaysDate);
        Thread.sleep(3000);
    }

    @Then("verify the course is created")
    public void verify_the_course_is_created() {
        Assert.assertTrue(coursesPage.isCourseCreated(courseName));
    }

    @Then("admin goes to Teachers page")
    public void admin_goes_to_teachers_page() {
        commonsPage.teachersTab.click();
    }

    @Then("creates a teacher")
    public void creates_a_teacher() {
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String phoneNumber = faker.phoneNumber().cellPhone();
        String email = faker.internet().emailAddress();
        String specialization = faker.job().position();


        teachersPage.createATeacher(firstName, lastName, phoneNumber, email, specialization, courseName);


    }

    @Then("verify the teacher is created")
    public void verify_the_teacher_is_created() {

    }

}

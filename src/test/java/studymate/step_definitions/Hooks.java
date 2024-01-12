package studymate.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class Hooks {

    @Before
    public void setup(Scenario scenario) {
        System.out.println("SCENARIO: " + scenario.getName() + " IS STARTING");
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {

        String pathname = "target/cucumber-reports/failedScenario.png";

        if (scenario.isFailed()){
            File src = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File(pathname));
        }else{
            System.out.println("SCENARIO: " + scenario.getName() + " COMPLETED");
        }
    }
}

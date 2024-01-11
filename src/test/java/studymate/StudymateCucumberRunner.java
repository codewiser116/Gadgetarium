package studymate;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberReport.html","json:target/report.json"},
        features = "src/test/resources/features/studymate",
        glue = "studymate/step_definitions",
        tags = "@adminCourse",
        dryRun = true
)
public class StudymateCucumberRunner {
}

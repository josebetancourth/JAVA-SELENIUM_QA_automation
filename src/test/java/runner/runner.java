package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/JOSE/IdeaProjects/javaselenium/src/test/resources/Features"
        ,glue = "steps"
        ,tags = "@Grid"
)

public class runner {
    @AfterClass
    public static void CleanDriver(){
    BasePage.CloseURL();
    }
}


package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/home/mayuk/IdeaProjects/BDD/AmazonFeatures/Login.feature",
        glue = "stepDefinitions",
        dryRun = false,
        tags = "@withoutLogin or @withLogin",
        monochrome = true,
        publish = true,
        plugin = {"pretty",
        "html:target/test-output"}
        )
public class AmazonTest {
}

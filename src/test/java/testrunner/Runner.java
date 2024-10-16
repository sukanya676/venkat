package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = {"C:\\Users\\venka\\IdeaProjects\\cucumber2\\src\\test\\java"},
        dryRun = true,
        glue = "stepFile",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = false,
        plugin = {"pretty","json:Reports1"}
)

public class Runner extends AbstractTestNGCucumberTests {

}

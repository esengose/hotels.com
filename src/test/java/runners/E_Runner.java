package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue="stepdefinitions",
        tags="@login_to_website",
        dryRun=false



)
public class E_Runner {




}

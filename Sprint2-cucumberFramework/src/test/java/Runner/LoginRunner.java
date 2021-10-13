package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/test/java/Features/Deals.feature",
		glue = "StepDef",
		plugin = {"pretty","html:Reports/HTMLReport.html","json:Reports/Jsonreport.json",
				"junit:Reports/JUnitreport.junit"}
		)

public class LoginRunner extends AbstractTestNGCucumberTests{

}
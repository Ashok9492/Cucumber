package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"file:src/main/resources/featurefile/AddToCart.feature:3"},
		
		glue= {"stepDefinitions","hooks"},
		plugin= {"pretty","json:target/MyReports/report.json","junit:target/MyReports/report.xml","rerun:target/rerun.txt"},
		dryRun=false
		
		
		
	
		)

public class RunnerClass {

}

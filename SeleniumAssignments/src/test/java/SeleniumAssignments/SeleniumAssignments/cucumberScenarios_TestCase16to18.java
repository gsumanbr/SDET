package SeleniumAssignments.SeleniumAssignments;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sukhavasis\\workspace\\SeleniumAssignments\\src\\test\\java\\Features\\OrangeHRM.Feature",
		glue="StepDefinations",
		dryRun=false, 
		strict=true, 
		monochrome=true,
		plugin= {"pretty", "html:test-output"},
		tags= {"@SmokeTest"}
		)

public class cucumberScenarios_TestCase16to18 {

	

}

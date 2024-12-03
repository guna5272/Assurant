package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\dev-guna\\dev1\\assurant\\src\\test\\resources\\feature\\assurant.feature",
		glue ="task",
		dryRun =false,
		monochrome = true
		
		
		)

public class Testrun {

}

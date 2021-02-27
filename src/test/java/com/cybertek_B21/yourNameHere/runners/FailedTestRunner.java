package com.cybertek_B21.yourNameHere.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //CHANGING FEATURES TO LOOK AT THE RERUN.TXT FOR THE FAILS
        features = "@target/rerun.txt", //features folder - content root because it is outside the package we are using for this file
        glue = "com/cybertek_B21/yourNameHere/step_Definitions" //step_definitions folder - source root is used because we are in the same package

)


public class FailedTestRunner {
}

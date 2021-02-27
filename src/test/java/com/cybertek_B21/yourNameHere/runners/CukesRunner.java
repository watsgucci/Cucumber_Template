package com.cybertek_B21.yourNameHere.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt" //FOR FAILED TESTS
        },
        features = "src/test/resources/features", //features folder - content root because it is outside the package we are using for this file
        glue = "com/cybertek/step_Definitions", //step_definitions folder - source root is used because we are in the same package
        dryRun = false, // True: allows us to run the feature files to get the snippet files. This is TDD principle, to start with a failed test and make it pass
        // False: allows us to run our actual code that we have in the Step_Definitions File
        tags = ""  // defines which scenarios/features with this tag you want to run

)



public class CukesRunner {}

package com.cybertek_B21.yourNameHere.step_Definitions;


import com.cybertek_B21.yourNameHere.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After (value = "@takeScreenShot", order = 1) //will only run with the scenarios that have this tag - @@takeScreenShot
    public void takeScreenShot(Scenario scenario){

        if(scenario.isFailed()){

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


    }


    @After (order=2)
    public void tearDownScenario(){
        Driver.closeDriver();
    }




}

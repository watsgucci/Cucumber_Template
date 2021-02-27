package com.cybertek_B21.yourNameHere.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {


    public static List<String> convertElementsToText(List<WebElement> listOfWebElements){

        List<String> listOfText = new ArrayList<>();

        /*listOfWebElements.forEach(p->listOfText.add(p.getText()));*/

        for (WebElement eachWebElement : listOfWebElements) {
            listOfText.add(eachWebElement.getText());
        }

        return listOfText;
    }

    public static void waitForElementVisibility(WebElement webElement1, int timeInSeconds){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement1));


    }







}

package com.cybertek_B21.yourNameHere.pages;

import com.cybertek_B21.yourNameHere.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {


    public Base_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}

package org.example.Selenium.Selenioum_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_Navigation_GET_NAVIGATETO {
    @Test
    public void test_Method() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");//navigate.to() -- same as get()  ... but in navigate forward and refresh extra

        //use navigation Commands
        //driver.get("Url")

        //Use navigation Methods
        driver.navigate().to("https://bing.com");//navigate.to() -- same as get()  ... but in navigate forward and refresh extra
        driver .navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
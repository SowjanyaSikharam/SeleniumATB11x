package org.example.Selenium.Selenioum_Basics;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Basics3 {

    public void test_Selenium01(){

        //selenium 3
        // you need to setup the Driver(browser)
        // system .getProperty("webdriver.gecko.driver"," /path/geckdriver")


    //Selenium 4
    //DSelenium Manager - Utility - which can download the driver Automatically
    //start and Stop Itself

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

    }
}


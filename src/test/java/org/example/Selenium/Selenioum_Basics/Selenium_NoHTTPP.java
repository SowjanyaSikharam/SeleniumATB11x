package org.example.Selenium.Selenioum_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_NoHTTPP {
    public static void main(String args[]) {
        WebDriver driver = new EdgeDriver();
       // driver.get("bing.com");//HTPP is important .so not possible
         driver.get("htpps://bing.com");
        driver.quit();
    }
}

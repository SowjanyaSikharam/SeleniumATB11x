package org.example.Selenium.Selenioum_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_WebDriver {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

    }
}

package org.example.Selenium.Selenioum_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_Maximize_Minimize {
    @Test
    public void test_Method(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        //driver .manage().window().maximize();
        driver.manage().window().minimize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();

    }
}

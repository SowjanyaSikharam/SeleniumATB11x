package org.example.Selenium.Selenioum_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_Close_VS_Quit {

        @Description("open Url")
        @Test
        public void test_Method() throws InterruptedException {

            WebDriver driver = new EdgeDriver();
            driver.get("https://google.com");

            Thread.sleep(5000);
            //driver.close();
            driver.quit();

        }
}

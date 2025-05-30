package org.example.Selenium.Selenioum_Basics;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static  org.assertj.core.api.Assertions.*;
public class Selenium_Mini_Project2_Add_Extension {
    @Test
    public void test_Method() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--Window-size=1920,1080");
        edgeOptions.addExtensions(new File("src/test/java/org/example/Selenium/Selenioum_Basics/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=Y21kE_LHaOY");

        driver.manage().deleteAllCookies();
        driver.quit();

    }
}


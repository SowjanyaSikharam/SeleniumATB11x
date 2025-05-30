package org.example.Selenium.Selenioum_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static  org.assertj.core.api.Assertions.*;


public class Selenium_Assertion_TestNG {
    @Description("open Url")
    @Test
    public void test_Method(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        Assert.assertEquals(driver.getCurrentUrl(), "https://google.com");
        //AssertJ Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://google.com");

        driver.quit();

    }
}

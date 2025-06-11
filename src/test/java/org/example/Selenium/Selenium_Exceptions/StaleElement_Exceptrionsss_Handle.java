package org.example.Selenium.Selenium_Exceptions;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class StaleElement_Exceptrionsss_Handle extends CommonToAll {
    @Test
    public void test_selenium_exceptions() {
        try {

            driver.get("https://google.com");
            System.out.println("Start of program");

            WebElement search_input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

            driver.navigate().refresh();


            search_input_box.sendKeys("the testing academy" + Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException");
        }
    }
}

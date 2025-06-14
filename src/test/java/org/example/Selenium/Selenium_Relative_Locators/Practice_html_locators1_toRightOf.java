package org.example.Selenium.Selenium_Relative_Locators;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Practice_html_locators1_toRightOf extends CommonToAll {
    @Test
    public void test_locators1(){

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement span_Element = driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));
        driver.findElement((with(By.id("exp-1")).toRightOf(span_Element))).click();
        waitForJVM(5000);
        driver.findElement(with(By.id("exp-2")).toRightOf(span_Element)).click();

    }

}


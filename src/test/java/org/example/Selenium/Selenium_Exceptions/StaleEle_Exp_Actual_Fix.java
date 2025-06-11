package org.example.Selenium.Selenium_Exceptions;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaleEle_Exp_Actual_Fix extends CommonToAll {
    @Test
    public void test_selenium_exceptions() {
        try {

            driver.get("https://google.com");
            System.out.println("Start of program");

            WebElement search_input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

            driver.navigate().refresh();
           //if you want to fix the stealEleExp ,you need to refind the element after DOM changes
            search_input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            search_input_box.sendKeys("the testing academy" + Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException");
        }
    }
}

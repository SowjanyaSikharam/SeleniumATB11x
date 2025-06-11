package org.example.Selenium.Selenium_Exceptions;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TiomeOut_Exceptionss  extends CommonToAll {
    @Test
    public void test_selenium_exceptions() {

            driver.get("https://google.com");
            System.out.println("Start of program");
            driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));

            WebElement search_input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            search_input_box.sendKeys("the testing academy" + Keys.ENTER);
    }
}

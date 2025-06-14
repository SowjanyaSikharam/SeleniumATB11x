package org.example.Selenium.Selenium_Relative_Locators;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Virtusa_Interview_task_Locators extends CommonToAll {
    @Test
    public void test_locator(){

        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");

        driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();

        WebElement username_element = driver.findElement(By.xpath("//input[@id='username']"));


        // //small[text()="Username must be at least 3 characters"]
        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));

        String errorText = error_element.getText();
        Assert.assertEquals(errorText,"Username must be at least 3 characters");






    }
}


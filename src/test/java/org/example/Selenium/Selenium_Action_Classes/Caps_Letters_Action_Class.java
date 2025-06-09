package org.example.Selenium.Selenium_Action_Classes;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Caps_Letters_Action_Class   extends CommonToAll {
    @Test
    public void Capts_Letters(){
        WebDriver driver = new EdgeDriver(); // initialize WebDriver
        openBrowser(driver, "https://awesomeqa.com/practice.html");

        //Keys - Action Classes
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.click();

        Actions actions =  new Actions(driver);
//        actions.keyDown(Keys.SHIFT)
//                .sendKeys(firstName,"sowjanya sikharam")
//        .keyUp(Keys.SHIFT).build().perform();
        actions
                .keyDown(Keys.SHIFT).sendKeys(firstName,"s").keyUp(Keys.SHIFT)
                .sendKeys("owjanya")
                .keyDown(Keys.SHIFT).sendKeys(firstName,"s").keyUp(Keys.SHIFT)
                .sendKeys("ikharam").build().perform();

    }
}
package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Capts_Letters_Action_keys_class  extends CommonToAll{
    @Test
        public void Capts_Letters(){
        WebDriver driver = new EdgeDriver(); // initialize WebDriver
        openBrowser(driver, "https://awesomeqa.com/practice.html");

        //Keys - Action Classes
        WebElement firstName = driver.findElement(By.name("firstname"));

        Actions actions =  new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstName,"sowjanya sikharam");
        actions .keyUp(Keys.SHIFT).build().perform();

    }
}

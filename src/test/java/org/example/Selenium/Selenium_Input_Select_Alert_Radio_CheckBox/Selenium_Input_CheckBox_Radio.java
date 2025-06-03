package org.example.Selenium.Selenium_Input_Select_Alert_Radio_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_Input_CheckBox_Radio {
    @Test
    public void Input_Checkbox_Radio(){
        WebDriver driver  =  new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");


        //input
        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        //Radio Button
        driver.findElement(By.id("sex-1")).click();

        //Checkbox
        driver.findElement(By.id("tool-1")).click();

        //WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(500));--not working

        driver.quit();


    }
}

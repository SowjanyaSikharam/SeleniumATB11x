package org.example.Selenium.Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Handle_NoSuchException_Element {
    @Test
    public void Handle_Exception() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        try{
            WebElement element =  driver.findElement(By.id("sowjanay"));

        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());

        }
    }

}

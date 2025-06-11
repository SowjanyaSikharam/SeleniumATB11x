package org.example.Selenium.Selenium_Exceptions;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class NoSuchElementExceptionss extends CommonToAll {

    @Test

    public void NosuchEle_Exp() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--Start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");
        try{
            driver.findElement(By.id("pramod"));
        }
        catch (NoSuchElementException e){
            System.out.println("Element illa");

        }
    }
}

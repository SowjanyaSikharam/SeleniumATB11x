package org.example.Selenium.Selenium_Action_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class spicejet_com_Actions {
    @Test
    public void spicejet_con(){
        WebDriver driver = new EdgeDriver();
        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\\\"to-testID-origin\\\"]/div/div/input\""));
        Actions actions = new Actions(driver);
        //Move to Element
        //click
        //sendKeys

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();
    }
}

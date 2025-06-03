package org.example.Selenium.Selenium_Input_Select_Alert_Radio_CheckBox;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_Static extends CommonToAll {
    @Test
    public void Select_Static(){

       // openBrowser(driver, "https://the-internet.herokuapp.com/dropdown");

        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select =  new Select(element_select);
        //select.selectByIndex(1);
       // select.selectByVisibleText("Option 1");
        select.selectByValue("2");

        driver.quit();

    }

}

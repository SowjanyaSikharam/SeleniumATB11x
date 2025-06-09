package org.example.Selenium.Selenium_Action_Classes;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.image.ColorModel;

public class Actions_PageUp_and_Down extends CommonToAll {
    @Test
    public void Page_up_and_down(){
        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://thetestingacademy.com/");

        Actions actions = new Actions(driver);
        //actions.sendKeys(Keys.PAGE_DOWN).pause(1000).sendKeys(Keys.PAGE_UP).build().perform();
        actions.sendKeys(Keys.END).pause(2000).sendKeys(Keys.HOME).build().perform();
    }
}

package org.example.Selenium.Selenioum_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonToAll {
    public void openBrowser(WebDriver driver, String Url){
        driver.get(Url);
        driver.manage().window().maximize();
    }
    public void closeBrowser(WebDriver driver){
        driver.quit();

    }
}

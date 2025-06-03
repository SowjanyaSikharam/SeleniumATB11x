package org.example.Selenium.Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1_Selenium_ImplicitlyWaits_VWO {
    @Description("wait for particulsr peroid")
    @Test
    public void Implicitly_Wait_Test(){
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://app.vwo.com");

        driver.quit();

    }
}

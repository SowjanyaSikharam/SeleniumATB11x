package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Selenium_Basics2 {

    @Description("open the app.vwo.com and verifyn the title")
    @Test
    public void test_Selenium2() {
    //open URL
        EdgeDriver driver =  new  EdgeDriver();
        // new  EdgeDriver():: POST request and create session

        //Navigate to the URL:
        driver.get("https://app.vwo.com");

        //Assert the URL -- validation -- TestNG Assertions
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        driver.quit();//Close the session
   }
}

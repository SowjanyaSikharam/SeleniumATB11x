package org.example.Selenium.Selenioum_Basics;
import io.qameta.allure.Description;
//import jdk.internal.org.jline.terminal.TerminalBuilder;
import org.example.Selenium.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selemium_Mini_Project extends CommonToAll {
    @Description("open Url")
    @Test
    public void test_Method() throws Exception{

        WebDriver driver =  new EdgeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/" );
        //driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if(driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("test case passed");
            Assert.assertTrue(true);
        }
        else{
            Assert.fail("CURA Healthcare Service text is not visible");
            //throw new Exception("CURA Healthcare Service text is not visible");
        }
        closeBrowser(driver);


    }
}

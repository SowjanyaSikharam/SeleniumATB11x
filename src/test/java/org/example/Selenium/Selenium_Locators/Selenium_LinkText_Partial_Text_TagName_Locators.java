package org.example.Selenium.Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium_LinkText_Partial_Text_TagName_Locators {
    @Description("Verify VWO")
    @Owner("sowjanya Sikharam")
    @Test

    public void test_Login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--Start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        // <a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        //
        //</a>

//        // Link Text - Full Text Match
//        WebElement a_tag_free_trail_full_match = driver.findElement(By.linkText("Start a free trial"));
//        // If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free tria"}
//        a_tag_free_trail_full_match.click();

       // WebElement tag_full_link_match = driver.findElement(By.linkText("Start a free tria"));
       // tag_full_link_match.click();


         WebElement tag_partial_link_match = driver.findElement(By.partialLinkText("Start a tria"));
        // Start a free trial
        // Start a free
        // Start a
        // Start , Trail, free, a, Star...
        tag_partial_link_match.click();

        driver.quit();


    }


    }

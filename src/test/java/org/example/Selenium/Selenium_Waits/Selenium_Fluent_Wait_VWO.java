package org.example.Selenium.Selenium_Waits;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Selenium_Fluent_Wait_VWO {
    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void invalid_Login()  {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--Start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@in.com");


        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("1123456");

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

  //Java Wait

        //        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//Explicit Wait
//        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


      //Fluent Wait
        FluentWait<WebDriver> wait = new  FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

       WebElement error_message = wait.until(new Function<WebDriver,WebElement>() {
         @Override
         public WebElement apply(WebDriver driver){
             return driver.findElement(By.className("notification-box-description"));

         }

    } ) ;
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

        driver.quit();

    }

}

package org.example.Selenium.Selenium_Waits;

import io.qameta.allure.Description;
import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class MiniProject2_MakeMyTrip  extends CommonToAll {
    @Description("Verify the makemytrip with modal")
    @Test

    public void ExplicitWait_Test_MakeMyTrip() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        WaitForVisibility(driver,3,"//span[@data-cy='closeModal']");

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();

       // WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.quit();

    }

}

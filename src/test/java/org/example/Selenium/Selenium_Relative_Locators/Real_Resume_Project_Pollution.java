package org.example.Selenium.Selenium_Relative_Locators;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Real_Resume_Project_Pollution extends CommonToAll {
    @Test
    public void test_real_pollution(){

        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        WebElement searchBox =  driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        searchBox.sendKeys("india" + Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        List<WebElement> Locations_list =  driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]//p"));
        for( WebElement location : Locations_list ){
            String Rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String AQI = driver.findElement(with(By.tagName("span")).toRightOf(location)).getText();

            System.out.println("| +" + Rank + " | " + location.getText() + " | " + AQI + " | ");


        }

    }
}

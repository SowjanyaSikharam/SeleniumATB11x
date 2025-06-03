package org.example.Selenium.Selenium_SVGElements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Flipkard1 {
    @Description("Flipkard SVG.")
    @Test
    public  void test_SVG_Flipcard() throws  InterruptedException{
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();

        Thread.sleep(5000);

        driver.quit();
    }
}

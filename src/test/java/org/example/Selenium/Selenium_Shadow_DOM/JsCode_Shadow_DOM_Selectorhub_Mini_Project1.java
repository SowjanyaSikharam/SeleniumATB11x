package org.example.Selenium.Selenium_Shadow_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class JsCode_Shadow_DOM_Selectorhub_Mini_Project1{
    @Test
    public void test_js() throws  InterruptedException{
        WebDriver driver = new EdgeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //JavascriptExecutor js = (JavascriptExecutor)driver;
        // js.executeScript("alert('hello sowji')");
        // js.executeScript("document.title");

        WebElement div_to_Scroll =  driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);",div_to_Scroll);

        Thread.sleep(3000);

        WebElement inputboxpizza = (WebElement)  js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza')" );

        inputboxpizza.sendKeys("farmhouse");

    }

}

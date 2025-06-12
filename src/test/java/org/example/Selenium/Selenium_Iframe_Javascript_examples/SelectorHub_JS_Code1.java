package org.example.Selenium.Selenium_Iframe_Javascript_examples;

import net.bytebuddy.pool.TypePool;
import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectorHub_JS_Code1 extends CommonToAll {
    @Test
    public void test_js_code(){
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.location = 'https://www.google.com'");


         waitForJVM(5000);

        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        js.executeScript("window.scrollBy(0,500)");

         String URL = js.executeScript("return document.URL;").toString();
         String title = js.executeScript("return document.title;").toString();

        System.out.println(URL);
        System.out.println(title);

    }
}

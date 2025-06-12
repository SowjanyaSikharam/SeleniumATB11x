package org.example.Selenium.Selenium_Windows;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class Windows_Part1 extends CommonToAll {
    @Test
    public void windows_test(){
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();
         String parent = driver.getWindowHandle();
        System.out.println(parent);

        WebElement link_parent = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        link_parent.click();

        Set<String> windowHandles =  driver.getWindowHandles();
        System.out.println(windowHandles);

        for(String handle :windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("new window")){
                System.out.println("test case passed");

            }
            driver.switchTo().window(parent);

        }

    }

}

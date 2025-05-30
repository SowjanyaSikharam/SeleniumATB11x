package org.example.Selenium.Selenioum_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class Selenium_Change_Driver {
    public static  void main (String args[]){
        //it is not possible-- interview question
       // ChromeDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();
       //it is possible --
        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();

    }
}

package org.example.Selenium.Selenium_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class Webtable2 {
    public void webtable_test2(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        //Find the xpath for webtable
        // -> //table[@summary="Sample Table"]

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));

        //rows and columns
        List<WebElement> rows_tables = table.findElements(By.tagName("tr"));

        for(int i=0;i<rows_tables.size();i++ ){
            List<WebElement> col = rows_tables.get(i).findElements(By.tagName("td"));
            for(WebElement c: col){
                System.out.println(c.getText());


            }

        }

      driver.quit();

    }
}

package org.example.Selenium.Selenium_File_Upload;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class File_Upload extends CommonToAll {
    @Test
    public void test_file_upload(){
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_path = System.getProperty("user.dir");// /Users/promode/IdeaProjects/LearnSeleniumATB11x

        String path_file = working_path+"/src/test/java/org/example/Selenium/Data.txt";
        //  /Users/promode/IdeaProjects/LearnSeleniumATB11x/src/test/java/org/example/Selenium/Data.txt

        uploadFileInput.sendKeys(path_file);
        driver.findElement(By.name("submit")).click();

    }


}

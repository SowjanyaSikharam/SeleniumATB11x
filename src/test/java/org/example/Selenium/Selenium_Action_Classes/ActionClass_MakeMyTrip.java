package org.example.Selenium.Selenium_Action_Classes;

import org.example.Selenium.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ActionClass_MakeMyTrip  extends CommonToAll {
    @Test
    public void test_actions(){
        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        // Wait for the popup to come and click the x icon
        //span[@data-cy='closeModal']

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/span[@data-cy=\"closeModal\"]")));

        //This will close the Modal
        WebElement model = driver.findElement(By.xpath("/span[@data-cy=\"closeModal\"]"));
        model.click();

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        waitForJVM(3000);

        List<WebElement> All_li_elements = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
        for(WebElement e : All_li_elements){
            if(e.getText().contains("Chandigarh")){
                e.click();

            }

        }

    }

}

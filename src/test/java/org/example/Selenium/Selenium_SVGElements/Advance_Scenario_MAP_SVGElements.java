package org.example.Selenium.Selenium_SVGElements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Advance_Scenario_MAP_SVGElements {

    @Description("Advance MAP SVG.")
    @Test
    public  void test_Advance_MAP_SVG() throws  InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();
       //states ==  //*[local-name()="svg"]/*[name()="g"][7]/*[name()="g"]/*[name()="g"]/*[name()="path"]
                        // 19                    //7g                       //3           //36 states
        List<WebElement>  states = driver.findElements(By.xpath("//*[local-name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]/*[name()=\"path\"]"));
        for(WebElement state:states){
            System.out.println(state.getDomAttribute("aria-label"));
            if(state.getDomAttribute("aria-label").contains("Andhra Pradesh")){
                state.click();

               // Thread.sleep(3000);
                //driver.quit();
            }


        }
    }
}

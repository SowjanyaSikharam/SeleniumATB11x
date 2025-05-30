package org.example.Selenium.Selenioum_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_Basics1 {

    @Test
    public void test_openVWOLoginPage(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://app.vwo.com");
        edgeDriver.quit();
//

    }

}


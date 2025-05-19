package org.example.Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium {

    @Test
    public void test_openVWOLoginPage(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://app.vwo.com");
        edgeDriver.quit();
//

    }

}


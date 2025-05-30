package org.example.Selenium.Selenioum_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basiscs4 {

    //WebDriver Hiearachy


    //searchContext(I) -> (2)
    // -> WebDriver(I) (10)
    // -> RemoteWebDriver(C) (15)
    // -> ChromiumDriver(C) 25
    // -> EdgeDriver(C) (45)


    //SearchContext - Interfacve - findElementand findElements - GGF
    //WedDriver - Interface - some incomplete functions  -GF
    //RemoteWebDriver  - Class -It also has some functions -F
    // ChromeDriver,FirefoxDriver ,EdgeDriver ,SafariDriver ,InternetExplore

    //SearchContext driver = new ChromeDriver();
    public static void main(String[] args) {
        //SearchContext driver = new EdgeDriver();
        //SearchContext driver1 = new firefoxDriver();
        //SearchContext driver1 = new InternetExploreDriver();

       // WebDriver driver =  new ChromeDriver();
        //RemoteWebDriver driver1 = new ChromeDriver();
        //ChromeDriver driver1 = new ChromeDriver();

        //Real Scenarios
        //1.Do u want to run  on chrome or Edge?
        ChromeDriver driver1 = new ChromeDriver();

        //2. Do u want to run on Chrome then change to Edge?
         WebDriver driver =  new ChromeDriver();
         driver = new EdgeDriver(); //97%
         driver =  new FirefoxDriver();//97%

        //3. Do u want to run on  Multiple browsers,aws machine ? 2%
        //RemoteWebDriver driver (with GRID) - Advance (Last 2 sessions)





    }


    //searchContext(I)
    // -> WebDriver(I)
    // -> RemoteWebDriver(C)
    // -> ChromiumDriver(C)
    // -> EdgeDriver(C)
    // BraveBroswe();
    //firefox -- gecko
    //safari -- AppleKit


}

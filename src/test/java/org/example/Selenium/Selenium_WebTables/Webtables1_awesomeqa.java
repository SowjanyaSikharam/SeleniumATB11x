package org.example.Selenium.Selenium_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Webtables1_awesomeqa {

    //@Description("Test case webtables");
    @Test
    public  void test_web_table_login() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        //xpath --> //table[@id="customers"]/tbody/tr[5]/td[2]

        //xpath - //table[@id="customers"]/tbody/tr[
        //i
        //]/td[
        //j
        //]

        String first_part ="//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();


        for(int i=2;i<=row;i++){
            for(int j=1;j<=col;j++){
                String dynamic_path = first_part+i+second_part+j+third_part;
              //  System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
               // System.out.println(data);
                if(data.contains("Helen Bennett")){
                    String country_path = dynamic_path+ "/following-sibling::td";
                    String company_path = dynamic_path+ "/preceding-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    String company_text = driver.findElement(By.xpath(company_path)).getText();
                    System.out.println("------------");
                    System.out.println("Helen Bennett in --" + country_text);
                    System.out.println("Helen Bennett is Company--" +company_text);


                }

            }

        }

    }


}

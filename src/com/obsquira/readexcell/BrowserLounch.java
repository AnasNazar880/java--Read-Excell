package com.obsquira.readexcell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLounch {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium.obsqurazone.com/index.php");
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);
        String actualSourceCode= driver.getPageSource();
        System.out.println(actualSourceCode);
        driver.close();
    }


}

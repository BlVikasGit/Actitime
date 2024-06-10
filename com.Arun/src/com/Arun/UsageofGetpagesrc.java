package com.Arun;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetpagesrc {

    public static void main(String[] args){
    	WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String pgSrc = driver.getPageSource();
        System.out.println(pgSrc);
        driver.manage().window().minimize();
        driver.quit();
    }
}

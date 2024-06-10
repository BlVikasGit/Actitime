package com.Arun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelectors {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/Arun%20Kumar%20S/Desktop/A.html");
    driver.findElement(By.cssSelector("a[id='d1']")).click();
    driver.navigate().back();
    driver.findElement(By.cssSelector("a[name='n2']")).clear();
    driver.navigate().back();
    driver.findElement(By.cssSelector("a[class='c 1']")).clear();
    driver.navigate().back();
    driver.findElement(By.cssSelector("a[href='https://www.instagram.com']")).click();
    
	}

}

package com.Arun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofErorr {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement ele = driver.findElement(By.name("login"));
ele.click();
String value = driver.findElement(By.linkText("Find your account and log in.")).getCssValue("color");
System.out.println(value);
driver.quit();

}

}

package com.Arun;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BrowserAutomation  { // FaceBook & Instagram 

@Test
	public void facebook_instagram() throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
//        System.out.println("Title of the page: " + title);
        driver.navigate().back();Thread.sleep(1000);
        driver.navigate().forward();Thread.sleep(1000);
        driver.navigate().refresh();Thread.sleep(1000);
        WebElement link=driver.findElement(By.linkText("Sign up"));Thread.sleep(2000);
        Actions a= new Actions(driver);
        a.contextClick(link).perform();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_T);Thread.sleep(2000);
        Set<String>allwid = driver.getWindowHandles();
        for (String wid:allwid){
        	driver.switchTo().window(wid);}
//        System.out.println("Title of the page: " + driver.getTitle());
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Dimension size = new Dimension(800, 400);
        driver.manage().window().setSize(size);
        Point position = new Point(500, 500);
        driver.manage().window().setPosition(position);
        String pgsrc = driver.getPageSource();
        System.out.print("Page Source : " + pgsrc+"\n");Thread.sleep(2000);
        driver.manage().window().minimize(); 
        System.out.println("Title of the page: " + title);
        System.out.println("Title of the page: " + driver.getTitle());
        driver.close();
//        driver.quit();
    }	
}


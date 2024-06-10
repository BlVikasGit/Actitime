package com.Arun;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Child_Window_Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://in.indeed.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
	    Set<String> allWid= driver.getWindowHandles();
	    Iterator<String> it = allWid.iterator();
	    while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			driver.close();
			
		}
	    		

	}

}

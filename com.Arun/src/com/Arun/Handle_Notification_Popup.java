package com.Arun;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle_Notification_Popup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://pib.gov.in/");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Ministry of Textiles")).click();
		driver.switchTo().alert().accept();
		Set<String> allWid = driver.getWindowHandles();
		for(String wid : allWid) {
			driver.switchTo().window(wid);
		}
		System.out.println(driver.getTitle());	
	}

}

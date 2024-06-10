package com.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2&scenario=2");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("aruns@18");Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("uma");
		driver.findElement(By.id("confirm-password")).sendKeys("uma");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("Dinga");
		driver.findElement(By.id("password")).sendKeys("Dingi");

		
//		driver.findElement(By.id("t1")).sendKeys("1");
//		dr iver.switchTo().frame(0);
//		driver.findElement(By.id("t2")).sendKeys("2");
//		driver.switchTo().frame("f2");
//		driver.findElement(By.id("t3")).sendKeys("3");
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("t2")).sendKeys("-4");
//		WebElement ele = driver.findElement(By.id("f2"));
//		driver.switchTo().frame(ele);
//		driver.findElement(By.id("t3")).sendKeys("-5");
//		driver.switchTo().defaultContent();
//		driver.findElement(By.tagName("input")).sendKeys("-6");
	}

}


//Iframe with in an Iframe

		



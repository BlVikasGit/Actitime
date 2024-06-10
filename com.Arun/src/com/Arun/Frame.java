package com.Arun;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("file:///C:/Users/Arun%20Kumar%20S/Desktop/T1.html");
		for(int i=0;i<=10;i++) {
		//driver.findElement(By.id("t1")).sendKeys("1"+Keys.TAB+"2"+Keys.TAB+"3");
		driver.findElement(By.id("t1")).sendKeys(i+" ");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys(i+" ");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t3")).sendKeys(i+" ");
		jse.executeScript("document.getElementById('t3').value="+i);
		driver.switchTo().defaultContent();
		}
		Thread.sleep(1000);
		driver.quit();
		
	}
//}
//		WebDriver driver=new ChromeDriver();
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.navigate().to("file:///C:/Users/Arun%20Kumar%20S/Desktop/T1.html");
//		for(int i=65;i<=90;i++) {
//			char c=(char)i;//convert int to char
//			String s=Character.toString(c);//convert char to string
//			char c1=s.charAt(0);//convert string to char
//			
////		driver.findElement(By.id("t1")).sendKeys("1"+Keys.TAB+"2"+Keys.TAB+"3");
//		driver.findElement(By.id("t1")).sendKeys(c+" ");
////		driver.findElement(By.id("t1")).clear();
//
//		
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("t2")).sendKeys(c+" ");
//		
//		driver.switchTo().frame(0);
////		driver.findElement(By.id("t3")).sendKeys(i+" ");
//		jse.executeScript("document.getElementById('t3').value='"+c1+"'");
//		driver.switchTo().defaultContent();
//		}
//
//		
//		
//		Thread.sleep(1000);
//		driver.quit();
//		
//	}

}

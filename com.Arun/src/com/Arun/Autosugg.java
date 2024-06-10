package com.Arun;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugg {
	//static int j=0;
	public static void main(String[] args) throws Exception {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java");Thread.sleep(2000);
		List<WebElement> lw=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=lw.size();
		System.out.println("Number of Texts:- "+count);
//		for(WebElement w:lw) {
//			j++;
//			String s=w.getText();
//		System.out.println(j+". "+s);
//		}
		for (int i=0;i<count;i++) {
			WebElement w=lw.get(i);
			System.out.println(i+1+". "+w.getText());
			
		}
		driver.findElement(By.xpath("(//span[contains(text(),'java')])[last()]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
	}

package com.Arun;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone14ProMax {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@role='button']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14 Pro max"+Keys.ENTER);
		
		List<WebElement> lw=driver.findElements(By.xpath("//div[contains(text(),'iPhone')]"));
		int count=lw.size();
		
		for (int i=0;i<count;i++) {
			WebElement w=lw.get(i);
			System.out.println((i+1)+". "+w.getText());
			String s=driver.findElement(By.xpath("((//div[contains(text(),'iPhone')])["+(i+1)+"]/../../div[2]/div/div/div)[1]")).getText();
			System.out.println("    "+s);
			System.out.println();
		}
		System.out.println();
		System.out.println("Number of Items are:- "+count);
		Thread.sleep(2000);
		driver.quit();

	}

}

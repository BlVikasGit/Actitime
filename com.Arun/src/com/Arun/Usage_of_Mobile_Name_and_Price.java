package com.Arun;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usage_of_Mobile_Name_and_Price {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("i phone 14 pro max"+ Keys.ENTER);
	List<WebElement> allMob = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro Max')]"));
	List<WebElement> allPrice = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
	int count=allPrice.size();
	for (int i=0;i<allMob.size()&&i<allPrice.size();i++)
	{
		String name=allMob.get(i).getText();
		String price=allPrice.get(i).getText();
		System.out.println((i+1)+"."+ name);
		System.out.println("    "+price);
		
	}
	
	{
		System.out.println("----------------------");
		System.out.println("Total Number of Elements are:- "+count);
	}
	
	 driver.quit();
	}

}


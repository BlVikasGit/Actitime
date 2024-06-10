
package com.Arun;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Appleiphone14ProMax {

	public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone 14 Pro max"+Keys.ENTER);
	List<WebElement> w=driver.findElements(By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]"));
	int count=w.size();
	
	
	for(int i = 0;i<count;i++) {
		WebElement wl=w.get(i);
		String s=wl.getText();
		System.out.println((i+1)+". "+s);
		String s1=driver.findElement(By.xpath("((//div[contains(text(),'iPhone 14 Pro Max')])["+(i+1)+"]/../../div[2]/div/div/div)[1]")).getText();
		System.out.println("    "+s1+"\n");
		
	}
	System.out.println();
	System.out.println("Total Number of Elements are:- "+count);
	Thread.sleep(2000);
	driver.quit();

	}

}

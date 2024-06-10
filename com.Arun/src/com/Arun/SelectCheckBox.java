package com.Arun;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("(//main)[3]")).click();
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = cb.size();
		System.out.println(count);
		Thread.sleep(2000);
		for(WebElement ele : cb)
		{
			boolean b=ele.isSelected();
			if(b) {
				System.out.println("Before check box is selected");
			}else {
				System.out.println("Before check box is not selected");
			}
			
			ele.click();
			
			boolean b1=ele.isSelected();
			if(b1) {
				System.out.println("After check box is selected");
			}else {
				System.out.println("After check box is not selected");
			}
			
		}
		Thread.sleep(2000);
		driver.quit();	
		

	}
	

}

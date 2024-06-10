package com.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement ele1= driver.findElement(By.xpath("//iFrame[@src='MultipleFrames.html']"));
		driver.switchTo().frame(ele1);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		 WebElement textfield = driver.findElement(By.xpath("//input[@type='text']"));
		textfield.sendKeys("Hello World");
		
        String enteredText = textfield.getAttribute("value");
        if (enteredText.equals("Hello World")) {
            System.out.println("The text 'Hello World' is successfully entered into the text field.");
        } else {
            System.out.println("Failed to enter 'Hello World' into the text field.");
        }
        driver.quit();
    }
}


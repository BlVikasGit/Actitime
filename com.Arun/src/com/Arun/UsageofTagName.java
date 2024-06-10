package com.Arun;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofTagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.qspiders.com/");
		Thread.sleep(1000);
		List<WebElement> ats =driver.findElements(By.tagName("a"));
		//int count = ats.size();
		//System.out.println(count);
		//for(WebElement ele : ats)
		//{
		//String at = ele.getAttribute("href");
		//System.out.println(at);
		//}
		//driver.quit();
	//}
//}

        int count = ats.size();
        int i = 0; // Declare and initialize the loop variable i
        for (WebElement ele : ats) {
            i = i + 1;
            String at = ele.getAttribute("href");
            System.out.println(i + "." + at);
        }
        System.out.println("Number of a Tags are: " + count);
        driver.quit();
    }
}

			

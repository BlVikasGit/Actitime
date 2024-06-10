package com.Arun;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class UsageofExplicitWait {

		public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://online.actitime.com/abc14/login.do");
			driver.findElement(By.id("username")).sendKeys("blvikas8@gmail.com");
			driver.findElement(By.name("pwd")).sendKeys("qmQEbjup");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.urlToBe("https://online.actitime.com/abc14/timetrack/enter.do"));
			System.out.println(driver.getCurrentUrl());
			
			driver.quit();

		}

	}

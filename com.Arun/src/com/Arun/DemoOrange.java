package com.Arun;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DemoOrange {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			//WebDriver driver=new EdgeDriver();
					
			driver.manage().window().maximize();Thread.sleep(2000);
			driver.navigate().to("https://www.google.co.in/");
			driver.findElement(By.className("gLFyf")).sendKeys("demoorangehrm"+Keys.ENTER);
			driver.findElement(By.xpath("(//cite[@role='text'])[1]")).click();Thread.sleep(2000);

			driver.findElement(By.name("username")).sendKeys("Admin");
			
			//driver.findElement(By.name("password")).sendKeys("admin123"+Keys.ENTER);Thread.sleep(2000); (or)
			
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).submit();Thread.sleep(2000);
			String url=	driver.getCurrentUrl();Thread.sleep(2000);
			System.out.println(url);Thread.sleep(2000);
			driver.quit();
		}

	}
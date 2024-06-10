package com.Arun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoBrave {
public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.setBinary("C:/Program Files/BraveSoftware/Brave-Browser/Application/brave.exe");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.google.com");
}
}

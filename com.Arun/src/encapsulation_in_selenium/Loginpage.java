package encapsulation_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	private WebElement unTbx;
	private WebElement pwdTbx;
	private WebElement loginBtn;
	public Loginpage(WebDriver driver) {
	unTbx = driver.findElement(By.id("username"));
	pwdTbx = driver.findElement(By.name("pwd"));
	loginBtn = driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	public void login (String un,String pwd){
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);
		loginBtn.click();

	}

}

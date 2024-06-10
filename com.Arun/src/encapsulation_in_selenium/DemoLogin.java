package encapsulation_in_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin {
	static WebDriver driver;
    static Loginpage l;
	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		c();
		l.login("admin1", "manager1");	
		Thread.sleep(2000);
		c();
		l.login("admin","manager");
		Thread.sleep(2000);
		driver.quit();
	}
	
	public static void c() {
		l=new Loginpage(driver);
	}

}

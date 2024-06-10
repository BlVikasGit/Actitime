package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Tapping_Login_Button {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.get("https://www.vtiger.com/");
		//WebElement target =driver.findElement(By.xpath("//a[@id='login']"));
		WebElement target =driver.findElement(By.id("login"));
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
		String s1 = "Login - Vtiger";
		String s2 = driver.getTitle();
		if (s1.equals(s2))
		{
		System.out.println("Login Page Displaying");
		}
		else 
		{
			System.out.println("Login Page is not Displaying");
		}
}
}


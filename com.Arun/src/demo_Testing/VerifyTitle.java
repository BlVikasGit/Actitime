package demo_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//public class VerifyTitle {
//	@Test
//	public void demo() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com");
//		String actualTitle = driver.getTitle();
//		String expectedTitle="Google";
//		if(actualTitle.equals(expectedTitle)) {
//			Reporter.log("Pass: Both Title are Same",true);
//		}
//		else 
//		{
//			Reporter.log("Fail: Both Title are Same",true);
//		}
//		driver.quit();
//	}
//
//}

public class VerifyTitle {
	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		String expectedTitle="Google";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle,expectedTitle);
		driver.quit();
		s.assertAll();
	}
}

package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {

	@Test(groups = {"smoketest", "regressiontest"})
	public void CreateCustomer() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.linkText("USERS")).click();
		String actualTitle = driver.getTitle();
		Reporter.log(actualTitle,true);
		String expectedTitle = "actiTIME - User List";
		assertEquals(actualTitle, expectedTitle);
		Assert.fail();
		Reporter.log("createcustomer",true);
	}@Test(groups = "regressiontest")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
		
	}@Test(groups = "regressiontest",dependsOnMethods = "CreateCustomer")
	public void deleteCustomer() {
		Reporter.log("modifyCustomer",true);	
		
	}
}
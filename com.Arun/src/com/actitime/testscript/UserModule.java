package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class UserModule extends BaseClass {

	@Test
	public void createUser() {
		Reporter.log("createUser",true);		
	}@Test
	public void modifyUser() {
		Reporter.log("modifyUser",true);	
		
	}@Test
	public void deleteUser() {
		Reporter.log("deleteUser",true);		
	}
		
}
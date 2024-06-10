package com.actitime.generic;

import java.io.IOException;

public class DemoA {

	public static void main(String[] args) throws IOException {
		FileLib f = new FileLib();
		String url = f.readDataFromProperty("url");
		String un = f.readDataFromProperty("un");
		String pwd = f.readDataFromProperty("pwd");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		String data = f.readDataFromExcel("Create Customer", 2, 1);
		System.out.println(data);
		String data1 = f.readDataFromExcel("Multiple Data", 2, 0);
		System.out.println(data1);
		String data2 =f.readDataFromExcel("Invalid Login", 4, 1);
		System.out.println(data2);
		f.WriteDataIntoExcel("Create Customer", 2, 1,"Lavanaya");
		f.WriteDataIntoExcel("Multiple Data", 2, 0,"Eve");
		f.WriteDataIntoExcel("Invalid Login", 1, 2,"pass");
	}

}

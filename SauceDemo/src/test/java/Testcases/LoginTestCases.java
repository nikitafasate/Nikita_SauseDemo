package Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Utility.BaseClass;

@Test
public class LoginTestCases extends BaseClass {
	@DataProvider
	
	Object readData() // creating | reading the data and will give the data  to another method 
	{
		Object[][] data = new Object[4][2];  // creating two dim array
		
		data[0][0]= "standard_";    data[0][1]= "Password";   
		
		data[1][0]= "nikita";    data[1][1]= "secret_sauce"; 
		
		data[2][0]= "Nirvik";    data[2][1]= "secret_sauce123"; 
		
		data[3][0]= "standard_user";    data[3][1]= "secret_sauce"; 
		
		return data;

	}
	@Test(dataProvider = "readData")
	void verifyUser(String user, String pass)
	{
		System.out.println(user);
		System.out.println(pass);
		driver.get("https://www.saucedemo.com/");
		log.info("opened home page ");
		LoginPage login  = new LoginPage(driver);
		
		login.setUserName(user);
		log.info("setting  username ");
		
		login.setPassword(pass);
		log.info("setting  password ");
		
		
		login.clickButton(); 
		log.info("clicking button  ");
		
	
	}

}


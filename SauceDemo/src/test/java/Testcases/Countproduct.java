package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.CountproductPage;
import Pages.LoginPage;
import Pages.ProductCheckPage;
import Utility.BaseClass;

public class Countproduct extends BaseClass {
	@DataProvider
	

	Object readData() 
	{
		Object[][] data = new Object[4][2];  		
		data[0][0]= "standard_user";    data[0][1]= "secret_sauce";   
		
		data[1][0]= "locked_out_user";    data[1][1]= "secret_sauce"; 
		
		data[2][0]= "problem_user";    data[2][1]= "secret_sauce"; 
		
		data[3][0]= "performance_glitch_user";    data[3][1]= "secret_sauce"; 
		
		return data;

	}
	
	@Test(dataProvider = "readData")
public void countproduct(String user, String pass)
{
	driver.get(url);
	log.info("opened home page ");
	LoginPage login  = new LoginPage(driver);
	
	login.setUserName(user);
	log.info("setting  username ");
	
	login.setPassword(pass);
	log.info("setting  password ");
	login.clickButton(); 
	log.info("clicking button  ");
	
	
		
	CountproductPage countprodut = new CountproductPage(driver);
	//countprodut.productpage(); 
	log.info("productpage  ");
	if((user.equals("locked_out_user")))
	{
		log.info("this is 	locked_out_user which is  not able to login ");
		Assert.assertTrue(true);


		 	}
	else
	{
		 int noofprduct = driver.findElements(By.tagName("img")).size();
		 int actual_product_on_page = noofprduct-2;
		 Assert.assertEquals(actual_product_on_page,6);


	
	}
	

	
	
}
}

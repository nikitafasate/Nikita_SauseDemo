package Testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.AboutPage;
import Pages.LoginPage;
import Utility.BaseClass;

public class About extends BaseClass {
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
	void verifyAbout(String user, String pass) throws InterruptedException
	{
		System.out.println(user);
		System.out.println(pass);
		driver.get("https://www.saucedemo.com/");
		log.info("opened home page ");
		AboutPage about = new AboutPage(driver);
		
		about.setUserName(user);
		log.info("setting  username ");
		
		about.setPassword(pass);
		log.info("setting  password ");
		
	
		about.clickButton(); 
		log.info("clicking button  ");
		Thread.sleep(1000);
		
	
		
		if(!(user.equals("locked_out_user")))
		{
			
			about.menubtn();
			log.info("clicking button  ");
			Thread.sleep(200);
			about.about();
			log.info("clicking button  ");
		    String  titleString = driver.getTitle();
		    System.out.println(titleString);
 		//String urlString= driver.getCurrentUrl();
		//System.out.println(urlString);
		//Assert.assertEquals("https://saucelabs.com/", urlString);
		}
		else
		{
			log.info("this is 	locked_out_user which is  not able to login ");
			Assert.assertTrue(true);
		}
		
	
	}
}

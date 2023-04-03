package Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.BackToPage;
import Pages.LoginPage;
import Utility.BaseClass;

public class BackToProduct extends BaseClass {
	@Test
	
	 void verifyBackTopage() throws InterruptedException
		{
	    driver.get("https://www.saucedemo.com/");
		log.info("opened home page ");
		LoginPage login  = new LoginPage(driver);
		Thread.sleep(3000);
		login.setUserName("standard_user");
		log.info("setting  username ");
		
		login.setPassword("secret_sauce");
		log.info("setting  password ");
		login.clickButton(); 
		log.info("clicking button  ");
	




	 
	    	BackToPage bpage = new BackToPage(driver);
	    	bpage.Addtocartclick(); 
			log.info("Addtocartclick  ");
			
			//bpage.addtoselecteproduct(); 
			//log.info("addtoselecteproduct  ");
			
			bpage.checkout(); 
			log.info("checkout  ");
			
			bpage.setfirstname("Nikita");
			log.info("setting  username ");
			
			bpage.setlastname("Fasate");
			log.info("setting  lastname ");
			
			bpage.setpincodeno("415693");
			log.info("setting  pincode ");

			bpage.continies(); 
			log.info("continies  ");
			
			System.out.println(driver.findElement(By.xpath("//span[@class='title']")).isDisplayed());
			bpage.finish(); 
			log.info("finish  ");
			
			bpage.Backtohome(); 
			log.info("Backtohome  ");
			
			String  titleString = driver.getTitle();
			System.out.println(titleString);
				String urlString= driver.getCurrentUrl();
			System.out.println(urlString);
			Assert.assertEquals("https://www.saucedemo.com/inventory.html", urlString);
		  
			
	}

}

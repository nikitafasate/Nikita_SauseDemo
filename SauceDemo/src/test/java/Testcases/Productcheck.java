package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.BackToPage;
import Pages.LoginPage;
import Pages.ProductCheckPage;
import Utility.BaseClass;

public class Productcheck extends BaseClass{
	//
	
	
	@Test
	void verifycheck() throws InterruptedException
	{
		System.out.println("----------------");
	    driver.get(url);
		log.info("opened home page ");
		LoginPage login  = new LoginPage(driver);
		
		login.setUserName(global_username);
		log.info("setting  username ");
		System.out.println("========================");
		login.setPassword(global_password);
		log.info("setting  password ");
		login.clickButton(); 
		log.info("clicking button  ");
		System.out.println(2);
		
		
		
		ProductCheckPage productpage = new ProductCheckPage(driver);
		//no product add to cart
		productpage.selectFilter(); 
		log.info("select  ");
		
	//	productpage.selectproduct(); 
	//	log.info("selectproduct  ");
		 
		 productpage.clickadd(); 
		log.info("product added to clickadd  ");
		
		productpage.Findproduct1(); 
		log.info("Findproduct1  ");

		productpage.cartlist(); 
		log.info("cartlist  ");
		 
		productpage.checkout1(); 
		log.info("checkout1  ");
		System.out.println(driver.findElement(By.xpath("//div[@class='header_secondary_container']")).isDisplayed());


		
		//System.out.println(6);
	//	String  titleString = driver.getTitle();
		//System.out.println(titleString);
 		//String urlString= driver.getCurrentUrl();
		//System.out.println(urlString);
		//Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html", urlString);
	
		
	}
	
	
	
		
		
		@Test
		void  verifywitoutProduct() throws InterruptedException
		{
			System.out.println(1);
		    driver.get("https://www.saucedemo.com/");
			log.info("opened home page ");
			LoginPage login  = new LoginPage(driver);
			
			login.setUserName("standard_user");
			log.info("setting  username ");
			
			login.setPassword("secret_sauce");
			log.info("setting  password ");
			login.clickButton(); 
			log.info("clicking button  ");
			System.out.println(2);
			ProductCheckPage productpage = new ProductCheckPage(driver);
		
			
			//no product add to cart
			
			productpage.remove(); 
			log.info("remove product  ");	
			productpage.Findproduct1(); 
	      	log.info("Findproduct1  ");
		   
		   productpage.cartlist(); 
		   log.info("cartlist  ");
		  		  productpage.checkout1(); 
		  log.info("checkout1  ");
		 System.out.println(6);
		 System.out.println(driver.findElement(By.xpath("//div[@class='header_secondary_container']")).isDisplayed());
	//	String  titleString = driver.getTitle();
	//	System.out.println(titleString);
 	//	String urlString= driver.getCurrentUrl();
	//	System.out.println(urlString);
	//	Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html", urlString);
	  
	
	}

}

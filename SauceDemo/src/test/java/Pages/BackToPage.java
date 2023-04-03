package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BackToPage {
	WebDriver ldriver;
	
	  public  BackToPage(WebDriver driver)
		{
		    ldriver= driver;
			PageFactory.initElements(driver, this);
		}
	   
    @FindBy(xpath=("//a[@class='shopping_cart_link']"))
	  WebElement Addtocartclick;
	
    //@FindBy(xpath=("//div[@class='inventory_item_name']\r\n"
    //		+ ""))
	 // WebElement addtoselecteproduct;
	
    @FindBy(xpath=("//button[@id='checkout']"))
	  WebElement checkout;
	

    @FindBy(xpath=("//input[@id='first-name']"))
	  WebElement fname;
 
  
    @FindBy(xpath=("//input[@id='last-name']"))
	  WebElement lname;


    @FindBy(xpath=("//input[@id='postal-code']"))
	  WebElement pincode;
    
    @FindBy(xpath=("//input[@id='continue']")) //input[@id='continue']
	  WebElement continies;
    @FindBy(xpath=("//button[@id='finish']"))
	  WebElement finish;
    
    
    @FindBy(xpath=("//button[@id='back-to-products']"))
	  WebElement Backtohome;
  

    public  void Addtocartclick() throws InterruptedException
	 {
	  Addtocartclick.click();
	  Thread.sleep(2000);
	 }
    
    public  void checkout()
    {
    
	 checkout.click();
	 }

    public  void setfirstname(String firstname)
	{
    	fname.sendKeys(firstname);
	}
	
    public void setlastname(String lastname)
   	{
    	lname.sendKeys(lastname);
   	}
    
    public void setpincodeno(String pincodeno)
   	{
    	pincode.sendKeys(pincodeno);
   	}

    
    
    
    
      //  public  void addtoselecteproduct()
    {

		//  addtoselecteproduct.click();
    }
    
    public  void continies() throws InterruptedException
    {
    	Thread.sleep(3000);
     continies.click();
    }
		 // Remove.click();
		 // continueshopp.click();
    public  void finish()
    {
		  finish.click();
    }
		 // cancel.click();

    public  void Backtohome()  
    {
    	Backtohome.click();
    }
    
		 }

